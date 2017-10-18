package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.TransferInModel;
import online.qsx.server.impl.TransferInServerImpl;

@Component("TransferInAction")
public class TransferInAction {
	@Autowired
	private TransferInServerImpl transferInServerImpl;
	private List<TransferInModel> list;
	private TransferInModel transferInModel;

	public String findTransferInInfos() {
		list = transferInServerImpl.getTransferInInfos();
		return "succeed";
	}

	public List<TransferInModel> getList() {
		return list;
	}

	public void setList(List<TransferInModel> list) {
		this.list = list;
	}

	public TransferInModel getTransferInModel() {
		return transferInModel;
	}

	public void setTransferInModel(TransferInModel transferInModel) {
		this.transferInModel = transferInModel;
	}

}
