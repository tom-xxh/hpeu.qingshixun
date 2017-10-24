package online.qsx.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.OrderModel;
import online.qsx.model.ProductModel;
import online.qsx.server.impl.OrderServerImpl;
import online.qsx.server.impl.ProductServerImpl;

@Component("OrderAction")
public class OrderAction {
	@Autowired
	private OrderServerImpl orderServerImpl;
	@Autowired
	private ProductServerImpl productServerImpl;
	private List<OrderModel> list;
	private OrderModel orderModel;
	private ProductModel productModel;

	public String findOrderInfos() {
		list = orderServerImpl.getOrderInfos();
		return "list";
	}

	
	public String deleteOrderInfos() {
		orderServerImpl.deleteOrderModel(orderModel);
		list = orderServerImpl.getOrderInfos();
		return "succeed";
	}
	
	
	public String saveOrderInfos() {
		int productnumber = 10;
		productModel = productServerImpl.getProductInfo(productModel);
		OrderModel orderModel1 = new OrderModel();
		orderModel1.setProductcard(productModel.getProductcard());
		orderModel1.setProductname(productModel.getProductname());
		orderModel1.setProductnumber(productnumber);
		orderModel1.setTotalmoney(productModel.getProductprice() * productnumber);
		orderModel1.setCreateDate(new Date());
		orderServerImpl.saveOrderInfos(orderModel1);
		return "succeed";
	}

	public List<OrderModel> getList() {
		return list;
	}

	public void setList(List<OrderModel> list) {
		this.list = list;
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
