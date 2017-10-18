package online.qsx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.TransferInModel;

@Repository
public class TransferInDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<TransferInModel> getTransferInInfos() {
		return (List<TransferInModel>) baseDao.getHibernateTemplate().find("from TransferInModel");
	}
}
