package online.qsx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.TransferOutModel;

@Repository
public class TransferOutDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<TransferOutModel> getTransferOutInfos() {
		return (List<TransferOutModel>) baseDao.getHibernateTemplate().find("from TransferOutModel");
	}
}
