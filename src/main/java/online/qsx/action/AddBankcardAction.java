package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import online.qsx.model.BankModel;
import online.qsx.server.impl.AddBankServerImpl;

@Component("addBankcardAction")
public class AddBankcardAction {
	@Autowired
	private AddBankServerImpl bankServerImpl;

	private List<BankModel> list;
	private BankModel bankModel;

	public String addBankcardInfos() {
		System.out.println(bankModel.toString());
		bankServerImpl.addbankModel(bankModel);
		list = bankServerImpl.getBankInfos();
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