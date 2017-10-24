package online.qsx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.ProductModel;

@Repository
public class ProductDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<ProductModel> getProductInfos() {
		return (List<ProductModel>) baseDao.getHibernateTemplate().find("from ProductModel");
	}

	public void addProductInfos(ProductModel productModel) {
		baseDao.getHibernateTemplate().save(productModel);
	}

	public ProductModel getProductInfo(ProductModel productModel) {
		return baseDao.getHibernateTemplate().get(ProductModel.class, productModel.getId());
	}
}
