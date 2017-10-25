package online.qsx.dao.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javassist.expr.NewArray;
import online.qsx.action.UserAction;
import online.qsx.common.BaseDao;
import online.qsx.model.BankModel;
import online.qsx.model.TransferModel;
import online.qsx.model.UserModel;

@Repository
public class TransferOutDaoImpl {
	@Autowired
	private BaseDao baseDao;
	
	private UserModel userModel;

	@SuppressWarnings("unchecked")
	public List<TransferModel> getTransferInfos() {
		return (List<TransferModel>) baseDao.getHibernateTemplate().find("from TransferModel");
	}
	public void saveTransferOut(TransferModel transferModel){
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
		Double brankcount=(double) 0;
		UserModel userModel1 = baseDao.getHibernateTemplate().get(UserModel.class,UserAction.index);
		List<BankModel> list=(List<BankModel>) baseDao.getHibernateTemplate().find("from BankModel");
		for (BankModel bankModel : list) {
			if(bankModel.getBankcard().equals(transferModel.getBankcard())){
				i=1;
			}
		}
		if(i==1){
			if(userModel1.getUser_count()>transferModel.getTransfer_Money()){
				for (BankModel bankModel : list) {
					if(bankModel.getBankcard().equals(transferModel.getBankcard())){
						brankcount=bankModel.getBank_count();
						bankModel.setBank_count(brankcount+transferModel.getTransfer_Money());
					}
				}
//				page.RegisterStartupScript("","<script> if (confirm('"+str_Message+"')==true){document.forms(0)."+btn+".click();}</script>");
				userModel1.setUser_count(userModel1.getUser_count()-transferModel.getTransfer_Money());
				baseDao.getHibernateTemplate().save(transferModel);
				out.print(
						"<script language='javascript'>alert('提现成功！');window.location='FindTransferOutAction';</script>");
				out.flush();
				out.close();
			}
			else{
				out.print(
						"<script language='javascript'>alert('账户余额不足，提现失败！');window.location='FinancingInformationPages/expend.jsp';</script>");
				out.flush();
				out.close();
			}
		}
		else{
			out.print(
					"<script language='javascript'>alert('银行卡不存在，提现失败！');window.location='FinancingInformationPages/expend.jsp';</script>");
			out.flush();
			out.close();
		}
	}
	
	
	
public void deleteTransferInfos(TransferModel transferModel) {
		baseDao.getHibernateTemplate().delete(transferModel);
	}
}
