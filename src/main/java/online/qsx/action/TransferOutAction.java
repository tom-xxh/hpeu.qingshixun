package online.qsx.action;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

import org.hibernate.engine.jdbc.internal.DDLFormatterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.common.BaseDao;
import online.qsx.model.TransferOutModel;
import online.qsx.model.UserModel;
import online.qsx.server.impl.TransferOutServerImpl;

@Component("TransferOutAction")
public class TransferOutAction {
	@Autowired
	private TransferOutServerImpl transferOutServerImpl;
	private TransferOutModel transferOutModel;
	private List<TransferOutModel> list;

	public String findTransferOutInfos() {
		list = transferOutServerImpl.findtransferOutInfos(transferOutModel.getTransferOutMoney(),transferOutModel.getBankcard());
		return "succeed";
	}
	
	//转出
	public String transferOut(){
		transferOutModel.setDate(new Date());
		transferOutServerImpl.saveTransferOut(transferOutModel);
		list=transferOutServerImpl.getTransferOutInfos();
		return "transferOut";
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
