package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.ProductDaoImpl;
import online.qsx.model.ProductModel;

@Service
public class ProductServerImpl {
	@Autowired
	private ProductDaoImpl productDaoImpl;

	public List<ProductModel> getProductInfos() {
		return productDaoImpl.getProductInfos();
	}
	public void saveproductInfos(ProductModel productModel) {
		productDaoImpl.addProductInfos(productModel);
	}
	public ProductModel getProductInfo(ProductModel productModel) {
		System.out.println(22222222);
		return  productDaoImpl.getProductInfo(productModel);
	}
}
