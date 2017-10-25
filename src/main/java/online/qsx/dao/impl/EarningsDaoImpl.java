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
import online.qsx.model.EarningsModel;

@Repository
public class EarningsDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<EarningsModel> getEarningsInfos() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd = (Long) session.getAttribute("id");
		String sql="from EarningsModel ea where ea.userModel.id = ? ";
		return (List<EarningsModel>) baseDao.getHibernateTemplate().find(sql, idd);
	}

	public void deleteEarningsModel(EarningsModel earningsModel) {
		baseDao.getHibernateTemplate().delete(earningsModel);
	}

	public void saveEarningsInfos(EarningsModel earningsModel) {
		HttpServletResponse response = null;
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		baseDao.getHibernateTemplate().save(earningsModel);
		earningsModel = baseDao.getHibernateTemplate().get(EarningsModel.class, earningsModel.getId());
		if (earningsModel.getId() == null) {
			out.print(
					"<script language='javascript'>alert('提交订单失败！');window.location='findOrderAction';</script>");
			out.flush();
			out.close();
			System.out.println("提交订单失败！");
		} else {
			out.print(
					"<script language='javascript'>alert('提交订单成功！');window.location='findOrderAction';</script>");
			out.flush();
			out.close();
			System.out.println("提交订单成功！");
		}
	}

}
