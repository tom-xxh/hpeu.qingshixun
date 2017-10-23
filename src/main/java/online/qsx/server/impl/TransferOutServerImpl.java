package online.qsx.server.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.TransferOutDaoImpl;
import online.qsx.model.TransferOutModel;
import online.qsx.model.UserModel;

@Service
public class TransferOutServerImpl {
	@Autowired
	private TransferOutDaoImpl transferOutDaoImpl;

	public List<TransferOutModel> getTransferOutInfos() {
		return transferOutDaoImpl.getTransferOutInfos();
	}
	
	public List<TransferOutModel> findtransferOutInfos(Double transferOutMoney,Long bankcard) {
		System.out.println("调用serberimpl");
		List<TransferOutModel> list= transferOutDaoImpl.findtransferOutInfos(transferOutMoney,bankcard);
		return list;
	}
	
	//保存转出信息
	public void saveTransferOut(TransferOutModel transferOutModel){
		transferOutDaoImpl.saveTransferOut(transferOutModel);
	}
}
