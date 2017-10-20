package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.DeleteBankDaoImpl;
import online.qsx.model.BankModel;

@Service
public class DeleteBankServerImpl {
	@Autowired
	private DeleteBankDaoImpl deleteBankDaoImpl;

	public List<BankModel> getBankInfos() {
		return deleteBankDaoImpl.getBankInfos();
	}

	public void deletebankModel(BankModel bankModel) {
		deleteBankDaoImpl.deletebankModel(bankModel);
	}
}
