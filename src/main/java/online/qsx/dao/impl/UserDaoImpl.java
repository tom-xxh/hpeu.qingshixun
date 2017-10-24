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
public class UserDaoImpl {
	@Autowired
	private BaseDao baseDao;
	UserModel userModel;

	@SuppressWarnings("unchecked")
	public List<UserModel> getUsers() {
		return (List<UserModel>) baseDao.getHibernateTemplate().find("from UserModel");
	}

	public void deleteUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().delete(userModel);
	}

	public void updateUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().update(userModel);
	}

	public void edit(UserModel userModel) {
		baseDao.getHibernateTemplate().saveOrUpdate(userModel);
	}

	public UserModel getUser(UserModel userModel) {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd=(Long) session.getAttribute("id");
		return baseDao.getHibernateTemplate().get(UserModel.class,idd);
	}

	//
	public void checkPwd(String Password, String Password2){
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd=(Long) session.getAttribute("id");
	
		HttpServletResponse response=null;
		response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(idd);
		UserModel user=baseDao.getHibernateTemplate().get(UserModel.class, idd);
		if(user.getPassword().equals(Password)){
			user.setPassword(Password2);
			out.print("<script language='javascript'>alert('密码修改成功！');window.location='PersonalInformationPages/passwordUpdate.jsp';</script>");
			out.flush();out.close();
			System.out.println("密码修改成功");
		}else{
			out.print("<script language='javascript'>alert('密码错误！');window.location='PersonalInformationPages/passwordUpdate.jsp';</script>");
			out.flush();out.close();
		    System.out.println("密码错误");
		}
	}

	//登录查询
	@SuppressWarnings("unchecked")

	public List<UserModel> findUserModel(String name, String password) {
		System.out.println("1231");
		Long in = null;
		String hql = "from UserModel UM where UM.name=? and UM.password=?";
		List<UserModel> id = (List<UserModel>) baseDao.getHibernateTemplate().find(hql,
				new String[] { name, password });
		for (UserModel us : id) {
			in=us.getId();
			System.out.println("1231" + id.toString());
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("id", in);
		return id;
	}


	// 增加
	public void addUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().save(userModel);
	}


}
