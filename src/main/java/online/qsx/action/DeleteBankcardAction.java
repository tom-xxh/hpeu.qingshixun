package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.BankModel;
import online.qsx.server.impl.DeleteBankServerImpl;

@Component("deleteBankcardAction")
public class DeleteBankcardAction {
	@Autowired
	private DeleteBankServerImpl deleteBankServerImpl;

	private List<BankModel> list;
	private BankModel bankModel;
   
	public String deleteBankcardInfos() {
		deleteBankServerImpl.deletebankModel(bankModel);
		list = deleteBankServerImpl.getBankInfos();
		return "succeed";
	}

	public String findBankcardInfos() {
		list = deleteBankServerImpl.getBankInfos();
		return "list";
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
