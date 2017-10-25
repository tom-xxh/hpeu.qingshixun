package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.BankModel;
import online.qsx.model.UserModel;
import online.qsx.server.impl.AddBankServerImpl;
import online.qsx.server.impl.UserServerImpl;

@Component(value="addBankcardAction")
public class AddBankcardAction {
	@Autowired
	private AddBankServerImpl bankServerImpl;
	@Autowired
	private UserServerImpl userServerImpl;
	private List<BankModel> list;
	private BankModel bankModel;
	private UserModel userModel;

	public String addBankcardInfos() {
		bankModel.setBank_count(20000.0);
		userModel  = userServerImpl.getUser(userModel);
		bankModel.setUserModel(userModel);
		bankServerImpl.addbankModel(bankModel);
		return "succeed";
	}

	public List<BankModel> getList() {
		return list;
	}

	public void setList(List<BankModel> list) {
		this.list = list;
	}

	public BankModel getBankModel() {
		return bankModel;
	}

	public void setBankModel(BankModel bankModel) {
		this.bankModel = bankModel;
	}

}
