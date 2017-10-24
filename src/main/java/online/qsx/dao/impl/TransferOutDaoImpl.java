package online.qsx.dao.impl;

import java.sql.Date;
import java.util.List;

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
	public int saveTransferOut(TransferModel transferModel){
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
				userModel1.setUser_count(userModel1.getUser_count()-transferModel.getTransfer_Money());
				baseDao.getHibernateTemplate().save(transferModel);
				return 1;
			}
			else{
				return -1;
			}
		}
		else{
			return -2;
		}
	}
	
	
	
public void deleteTransferInfos(TransferModel transferModel) {
		baseDao.getHibernateTemplate().delete(transferModel);
	}
}
