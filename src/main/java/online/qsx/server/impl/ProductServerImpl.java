package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.ProductDaoImpl;
import online.qsx.model.BankModel;
import online.qsx.model.ProductModel;

@Service
public class ProductServerImpl {
	@Autowired
	private ProductDaoImpl productDaoImpl;

	public List<ProductModel> getProductInfos() {
		return productDaoImpl.getProductInfos();
	}
	public void saveproductModel(ProductModel productModel) {
		productDaoImpl.addProductModel(productModel);
	}
}
