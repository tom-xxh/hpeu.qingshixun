package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.EarningsDaoImpl;
import online.qsx.model.EarningsModel;

@Service
public class EarningsServerImpl {
	@Autowired
	private EarningsDaoImpl earningsDaoImpl;

	public List<EarningsModel> getEarningsInfos() {
		return earningsDaoImpl.getEarningsInfos();
	}
}
