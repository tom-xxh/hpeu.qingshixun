package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.TransferOutDaoImpl;
import online.qsx.model.TransferModel;

@Service
public class TransferOutServerImpl {
	@Autowired
	private TransferOutDaoImpl transferOutDaoImpl;

	public List<TransferModel> getTransferOutInfos() {
		return transferOutDaoImpl.getTransferInfos();
	}
	
	public List<TransferModel> findtransferInfos() {
		List<TransferModel> list= transferOutDaoImpl.getTransferInfos();
		return list;
	}
	
	//保存转出信息
	public void saveTransferOut(TransferModel transferModel){
		transferOutDaoImpl.saveTransferOut(transferModel);
	}
	
	public void deleteTransferInfos(TransferModel transferModel){
		transferOutDaoImpl.deleteTransferInfos(transferModel);
	}
}
