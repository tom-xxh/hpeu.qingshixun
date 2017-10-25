package online.qsx.dao.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.BankModel;

@Repository
public class DeleteBankDaoImpl {

	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<BankModel> getBankInfos() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		Long idd = (Long) session.getAttribute("id");
		String sql="from BankModel bm where bm.userModel.id = ? ";
		return (List<BankModel>) baseDao.getHibernateTemplate().find(sql, idd);
		
	}

	public void deletebankModel(BankModel bankModel) {
		baseDao.getHibernateTemplate().delete(bankModel);
	}
}
