package online.qsx.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
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
		HttpServletRequest request = ServletActionContext.getRequest();
		Long bankcard = Long.valueOf(request.getParameter("bankid"));
		System.out.println(bankcard);
		bankModel.setBankcard(bankcard);
		deleteBankServerImpl.deletebankModel(bankModel);
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
