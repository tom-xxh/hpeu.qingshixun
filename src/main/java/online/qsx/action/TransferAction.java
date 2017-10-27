package online.qsx.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.TransferModel;
import online.qsx.model.UserModel;
import online.qsx.server.impl.TransferOutServerImpl;
import online.qsx.server.impl.UserServerImpl;
import online.qsx.server.impl.TransferInServerImpl;

@Component("TransferAction")
public class TransferAction {
	@Autowired
	private TransferOutServerImpl transferOutServerImpl;

	@Autowired
	private TransferInServerImpl transferInServerImpl;	
	
	@Autowired
	private UserServerImpl userServerImpl;	
	private TransferModel transferModel;
	private UserModel userModel;
	private List<TransferModel> list;

	// 信息查询
	public String findTransferInfos() {
		list = transferOutServerImpl.findtransferInfos();
		return "succeed";
	}

	// 提现
	public String transferOut() {
		transferModel.setDate(new Date());
		transferModel.setStatus("转出");
		userModel = userServerImpl.getUser(userModel);
//		System.out.println("action:"+userModel.toString());
		transferModel.setUserModel(userModel);
		transferOutServerImpl.saveTransferOut(transferModel,userModel);
		return "transferOut";
	}
	
	//转入
	public String transferIn(){
		transferModel.setDate(new Date());
		transferModel.setStatus("转入");
		userModel = userServerImpl.getUser(userModel);
		transferModel.setUserModel(userModel);
		transferInServerImpl.saveTransferIn(transferModel,userModel);
		return "transferIn";
	}

	public String deleteTransferInfos() {
		transferOutServerImpl.deleteTransferInfos(transferModel);
		list = transferOutServerImpl.getTransferOutInfos();
		return "succeed";
	}

	public TransferModel getTransferModel() {
		return transferModel;
	}

	public void setTransferModel(TransferModel transferModel) {
		this.transferModel = transferModel;
	}

	public List<TransferModel> getList() {
		return list;
	}

	public void setList(List<TransferModel> list) {
		this.list = list;
	}

	public TransferOutServerImpl getTransferOutServerImpl() {
		return transferOutServerImpl;
	}

	public void setTransferOutServerImpl(TransferOutServerImpl transferOutServerImpl) {
		this.transferOutServerImpl = transferOutServerImpl;
	}

	public TransferInServerImpl getTransferInServerImpl() {
		return transferInServerImpl;
	}

	public void setTransferInServerImpl(TransferInServerImpl transferInServerImpl) {
		this.transferInServerImpl = transferInServerImpl;
	}
	
//	public UserModel getUserModel() {
//		return userModel;
//	}
//
//	public void setUserModel(UserModel userModel) {
//		this.userModel = userModel;
//	}

}
