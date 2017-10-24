package online.qsx.dao.impl;

import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javassist.expr.NewArray;
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
	
	public int saveTransferIn(TransferModel transferModel){
		int i=0;
		Double count=(double) 0;
		UserModel userModel1 = baseDao.getHibernateTemplate().get(UserModel.class,UserAction.index);
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
				return 1;
			}
			else{
				return -2;
			}
		}
		else{
			return -1;
		}
		
	}
}
