package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.TransferInDaoImpl;
import online.qsx.model.TransferModel;

@Service
public class TransferInServerImpl {
	@Autowired
	private TransferInDaoImpl transferInDaoImpl;

	public List<TransferModel> getTransferInInfos() {
		return transferInDaoImpl.getTransferInfos();
	}

	// 保存转入信息
	public void saveTransferIn(TransferModel transferModel) {
		transferInDaoImpl.saveTransferIn(transferModel);
	}
}
