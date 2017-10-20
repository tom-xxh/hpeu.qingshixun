package online.qsx.dao.impl;

import java.util.List;

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
		return (List<BankModel>) baseDao.getHibernateTemplate().find("from BankModel");
	}

	public void deletebankModel(BankModel bankModel) {
		baseDao.getHibernateTemplate().delete(bankModel);
	}
}
