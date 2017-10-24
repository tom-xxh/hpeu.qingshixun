package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.OrderDaoImpl;
import online.qsx.dao.impl.ProductDaoImpl;
import online.qsx.model.BankModel;
import online.qsx.model.OrderModel;
import online.qsx.model.ProductModel;

@Service
public class OrderServerImpl {
	@Autowired
	private OrderDaoImpl orderDaoImpl;

	public List<OrderModel> getOrderInfos() {
		return orderDaoImpl.getOrderInfos();
	}
	public void saveOrderInfos(OrderModel orderModel) {
		orderDaoImpl.saveOrderInfos(orderModel);
	}
	public void deleteOrderModel(OrderModel orderModel) {
		orderDaoImpl.deleteOrderModel(orderModel);
	}
}
