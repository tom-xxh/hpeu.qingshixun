package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.TransferOutModel;
import online.qsx.server.impl.TransferOutServerImpl;

@Component("TransferOutAction")
public class TransferOutAction {
	@Autowired
	private TransferOutServerImpl transferOutServerImpl;
	private List<TransferOutModel> list;
	private TransferOutModel transferOutModel;

	public String findTransferOutInfos() {
		list = transferOutServerImpl.gettransferOutInfos();
		return "succeed";
	}

	public TransferOutModel getTransferOutModel() {
		return transferOutModel;
	}

	public void setTransferOutModel(TransferOutModel transferOutModel) {
		this.transferOutModel = transferOutModel;
	}

	public List<TransferOutModel> getList() {
		return list;
	}

	public void setList(List<TransferOutModel> list) {
		this.list = list;
	}

}
