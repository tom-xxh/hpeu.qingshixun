package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.OrderDaoImpl;
import online.qsx.model.OrderModel;

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

	public OrderModel getOrderInfo(OrderModel orderModel) {
		return orderDaoImpl.getOrderInfo(orderModel);
	}
}
