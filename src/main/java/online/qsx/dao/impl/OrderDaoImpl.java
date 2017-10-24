package online.qsx.dao.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.BankModel;
import online.qsx.model.OrderModel;

@Repository
public class OrderDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<OrderModel> getOrderInfos() {
		return (List<OrderModel>) baseDao.getHibernateTemplate().find("from OrderModel");
	}

	public void deleteOrderModel(OrderModel orderModel) {
		baseDao.getHibernateTemplate().delete(orderModel);
	}
	
	public void saveOrderInfos(OrderModel OrderModel) {
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
		baseDao.getHibernateTemplate().save(OrderModel);
		List<OrderModel> list = (List<OrderModel>) baseDao.getHibernateTemplate().find("from OrderModel");
		if (list.isEmpty()) {
			out.print(
					"<script language='javascript'>alert('订单添加失败！');window.location='findProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("订单添加失败！");
		} else {
			out.print(
					"<script language='javascript'>alert('订单添加成功！');window.location='findProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("订单添加成功！");
		}

	}
}
