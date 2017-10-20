package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.AddBankDaoImpl;
import online.qsx.model.BankModel;

@Service
public class AddBankServerImpl {

	@Autowired
	private AddBankDaoImpl addBankDaoImpl;

	public List<BankModel> getBankInfos() {
		return addBankDaoImpl.getBankInfos();
	}

	public void addbankModel(BankModel bankModel) {
		addBankDaoImpl.addBankModel(bankModel);
	}
}
