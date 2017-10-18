package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.TransferOutDaoImpl;
import online.qsx.model.TransferOutModel;

@Service
public class TransferOutServerImpl {
	@Autowired
	private TransferOutDaoImpl transferOutDaoImpl;

	public List<TransferOutModel> gettransferOutInfos() {
		return transferOutDaoImpl.getTransferOutInfos();
	}
}
