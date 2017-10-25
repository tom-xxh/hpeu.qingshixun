package online.qsx.dao.impl;

import java.util.List;


import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;


import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.action.UserAction;
import online.qsx.common.BaseDao;
import online.qsx.model.BankModel;
import online.qsx.model.TransferModel;
import online.qsx.model.UserModel;

@Repository
public class TransferInDaoImpl {
	@Autowired
	private BaseDao baseDao;
	
	@SuppressWarnings("unchecked")
	public List<TransferModel> getTransferInfos() {
		return (List<TransferModel>) baseDao.getHibernateTemplate().find("from TransferModel");
	}
	
	public void saveTransferIn(TransferModel transferModel){
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
		int i=0;
		Double count=(double) 0;
		UserModel userModel1 = baseDao.getHibernateTemplate().get(UserModel.class,UserAction.index);
		@SuppressWarnings("unchecked")
		List<BankModel> list=(List<BankModel>) baseDao.getHibernateTemplate().find("from BankModel");
		for (BankModel bankModel : list) {
			if(bankModel.getBankcard().equals(transferModel.getBankcard())){
				count=bankModel.getBank_count();
				i=1;
			}
		}
		if(i==1){
			if(transferModel.getTransfer_Money()<count){
				for (BankModel bankModel : list) {
					if(bankModel.getBankcard().equals(transferModel.getBankcard())){
						bankModel.setBank_count(bankModel.getBank_count()-transferModel.getTransfer_Money());
					}
				}
				userModel1.setUser_count(userModel1.getUser_count()+transferModel.getTransfer_Money());
				baseDao.getHibernateTemplate().save(transferModel);
				out.print(
						"<script language='javascript'>alert('转入成功！');window.location='FindTransferOutAction';</script>");
				out.flush();
				out.close();
			}
			else{
				out.print(
						"<script language='javascript'>alert('银行卡余额不足，转入失败！');window.location='FinancingInformationPages/earnings.jsp';</script>");
				out.flush();
				out.close();
			}
		}
		else{
			out.print(
					"<script language='javascript'>alert('银行卡不存在，转入失败！');window.location='FinancingInformationPages/earnings.jsp';</script>");
			out.flush();
			out.close();
		}
		
	}
}
