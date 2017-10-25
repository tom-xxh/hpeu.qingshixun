package online.qsx.dao.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.UserModel;

@Repository
public class AdminDaoImpl {
	@Autowired
	private BaseDao baseDao;
	UserModel userModel;
	//通过id查信息
	public UserModel getAdmin(UserModel userModel) {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd = (Long) session.getAttribute("id");
		System.out.println(baseDao.getHibernateTemplate().get(UserModel.class, idd));
		return baseDao.getHibernateTemplate().get(UserModel.class, idd);
	}
	//通过id查信息
		public UserModel getUser(UserModel userModel) {
			System.out.println(baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId()));
			return baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
		}
	@SuppressWarnings("unchecked")
	public List<UserModel> getUsers() {
		return (List<UserModel>) baseDao.getHibernateTemplate().find("from UserModel");
	}
	//验证管理员密码并修改
	public void checkPwd(String Password, String Password2) {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd = (Long) session.getAttribute("id");
		HttpServletResponse response = null;
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(idd);
		UserModel user = baseDao.getHibernateTemplate().get(UserModel.class, idd);
		if (user.getPassword().equals(Password)) {
			user.setPassword(Password2);
			out.print(
					"<script language='javascript'>alert('密码修改成功！');window.location='adminpages/password-update.jsp';</script>");
			out.flush();
			out.close();
			System.out.println("密码修改成功");
		} else {
			out.print(
					"<script language='javascript'>alert('密码错误！');window.location='adminpages/password-update.jsp';</script>");
			out.flush();
			out.close();
			System.out.println("密码错误");
		}
	}
	//管理员添加用户
	public void addUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().save(userModel);
	}
	//管理员查询用户
	@SuppressWarnings("unchecked")
	public List<UserModel> queryUser(String queryRow, String queryKey){
		String Hql="from UserModel um where um."+queryRow+" like '%"+queryKey+"%' and um.state!=1";
		List<UserModel> qUser=(List<UserModel>) baseDao.getHibernateTemplate().find(Hql);
		System.out.println("信息查询成功！");
		return qUser;
	}
}
