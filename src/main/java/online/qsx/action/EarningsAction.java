package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.EarningsModel;
import online.qsx.server.impl.EarningsServerImpl;

@Component("EarningsAction")
public class EarningsAction {
	@Autowired
	private EarningsServerImpl earningsServerImpl;
	private List<EarningsModel> list;
	private EarningsModel earningsModel;

	public String findEarningsInfos() {
		list = earningsServerImpl.getEarningsInfos();
		return "succeed";
	}

	public List<EarningsModel> getList() {
		return list;
	}

	public void setList(List<EarningsModel> list) {
		this.list = list;
	}

	public EarningsModel getEarningsModel() {
		return earningsModel;
	}

	public void setEarningsModel(EarningsModel earningsModel) {
		this.earningsModel = earningsModel;
	}

}
