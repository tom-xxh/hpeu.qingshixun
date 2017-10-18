package online.qsx.dao.impl;

import java.util.List;

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
		return (List<EarningsModel>) baseDao.getHibernateTemplate().find("from EarningsModel");
	}
}
