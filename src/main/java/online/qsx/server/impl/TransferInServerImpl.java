package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.TransferInDaoImpl;
import online.qsx.model.TransferInModel;

@Service
public class TransferInServerImpl {
	@Autowired
	private TransferInDaoImpl transferInDaoImpl;

	public List<TransferInModel> getTransferInInfos() {
		return transferInDaoImpl.getTransferInInfos();
	}
}
