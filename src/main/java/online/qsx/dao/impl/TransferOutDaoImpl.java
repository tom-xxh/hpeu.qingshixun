package online.qsx.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javassist.expr.NewArray;
import online.qsx.common.BaseDao;
import online.qsx.model.TransferOutModel;
import online.qsx.model.UserModel;

@Repository
public class TransferOutDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<TransferOutModel> getTransferOutInfos() {
		return (List<TransferOutModel>) baseDao.getHibernateTemplate().find("from TransferOutModel");
	}
	
	@SuppressWarnings("unchecked")
	public List<TransferOutModel> findtransferOutInfos(Double transferOutMoney,Long bankcard){
		System.out.println("调用dao");
		
		@SuppressWarnings("unused")
		String  hql="from TransferOutModel UM where UM.bankcard=?";
			
		List<TransferOutModel> transferOut= (List<TransferOutModel>) baseDao.getHibernateTemplate().find(hql,bankcard);
		System.out.println("调用for循环");
		for(TransferOutModel transferOutModel : transferOut) {
			System.out.println("转出" + transferOutModel.toString());
		}
		return transferOut;
	}
	
	public void saveTransferOut(TransferOutModel transferOutModel){
		baseDao.getHibernateTemplate().save(transferOutModel);
	}
}
