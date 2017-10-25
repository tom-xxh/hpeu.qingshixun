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
		return productDaoImpl.getProductInfo(productModel);
	}

	public List<ProductModel> getProduct(ProductModel productModel) {
		return productDaoImpl.getProduct(productModel);
	}
	public void deleteProductModel(ProductModel productModel) {
		productDaoImpl.deleteProductModel(productModel);
	}

	public void updateProductModel(ProductModel productModel) {
		productDaoImpl.updateProductModel(productModel);
	}
}
