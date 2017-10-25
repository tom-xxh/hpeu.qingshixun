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

@Repository
public class AddBankDaoImpl {

	@Autowired
	private BaseDao baseDao;
	@SuppressWarnings("unchecked")
	public List<BankModel> getBankInfos() {
		return (List<BankModel>) baseDao.getHibernateTemplate().find("from BankModel");
	}

	public void addBankModel(BankModel bankModel) {
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
		baseDao.getHibernateTemplate().save(bankModel);
		@SuppressWarnings("unchecked")
		List<BankModel> list = (List<BankModel>) baseDao.getHibernateTemplate().find("from BankModel");
		if (list.isEmpty()) {
			out.print("<script language='javascript'>alert('银行卡添加失败！');window.location='PersonalInformationPages/addCard.jsp';</script>");
			out.flush();
			out.close();
			System.out.println("银行卡添加失败！");
		} else {
			out.print("<script language='javascript'>alert('银行卡添加成功！');window.location='PersonalInformationPages/addCard.jsp';</script>");
			out.flush();
			out.close();
			System.out.println("银行卡添加成功！");
		}

	}
}
