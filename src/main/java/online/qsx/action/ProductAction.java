package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.ProductModel;
import online.qsx.server.impl.ProductServerImpl;

@Component("ProductAction")
public class ProductAction {
	@Autowired
	private ProductServerImpl productServerImpl;

	private List<ProductModel> list;
	private ProductModel productModel;

	public String findProductInfos() {
		list = productServerImpl.getProductInfos();
		return "list";
	}

	public String searchProductInfos() {
		list = productServerImpl.getProductInfos();
		return "lists";
	}

	public String searchProductInfo() {
		productModel = productServerImpl.getProductInfo(productModel);
		return "succeed";
	}

	public String saveProductInfos() {
		productServerImpl.saveproductInfos(productModel);
		return "succeed";
	}

	public String deleteProductInfos() {
		productServerImpl.deleteProductModel(productModel);
		list = productServerImpl.getProductInfos();
		return "succeed";
	}

	public String updateProductInfos() {
		productServerImpl.updateProductModel(productModel);
		return "succeed";
	}

	public List<ProductModel> getList() {
		return list;
	}

	public void setList(List<ProductModel> list) {
		this.list = list;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

}
