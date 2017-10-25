package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.EarningsModel;
import online.qsx.model.OrderModel;
import online.qsx.model.ProductModel;
import online.qsx.server.impl.EarningsServerImpl;
import online.qsx.server.impl.OrderServerImpl;
import online.qsx.server.impl.ProductServerImpl;

@Component("EarningsAction")
public class EarningsAction {
	@Autowired
	private EarningsServerImpl earningsServerImpl;
	@Autowired
	private OrderServerImpl orderServerImpl;
	@Autowired
	private ProductServerImpl productServerImpl;
	private List<EarningsModel> list;
	private EarningsModel earningsModel;
	private OrderModel orderModel;
	private ProductModel productModel;

	public String findEarningsInfos() {
		list = earningsServerImpl.getEarningsInfos();
		return "succeed";
	}

	public String deleteEarningsInfos() {
		earningsServerImpl.deleteEarningsModel(earningsModel);
		list = earningsServerImpl.getEarningsInfos();
		return "succeed";
	}

	public String saveEarningsInfos() {
		double interestrate = 0;
		orderModel = orderServerImpl.getOrderInfo(orderModel);
		ProductModel productModel1 = new ProductModel();
		productModel1.setProductname(orderModel.getProductname());
		List<ProductModel> list = productServerImpl.getProduct(productModel1);
		for (ProductModel productModel : list) {
			interestrate = productModel.getInterestrate();
		}
		EarningsModel earningsModel1 = new EarningsModel();
		earningsModel1.setCreateDate(orderModel.getCreateDate());
		earningsModel1.setProductname(orderModel.getProductname());
		earningsModel1.setTotalmoney(orderModel.getTotalmoney());
		earningsModel1.setInterestrate(interestrate);
		earningsModel1.setEarnings(interestrate*orderModel.getTotalmoney()/100);
		earningsServerImpl.saveEarningsInfos(earningsModel1);
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

	public OrderModel getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel) {
		this.orderModel = orderModel;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

}
