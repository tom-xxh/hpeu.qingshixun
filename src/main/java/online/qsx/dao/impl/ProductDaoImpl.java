package online.qsx.dao.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
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
		HttpServletResponse response = null;
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		baseDao.getHibernateTemplate().save(productModel);
		productModel = baseDao.getHibernateTemplate().get(ProductModel.class, productModel.getId());
		if (productModel.getId() == null) {
			out.print(
					"<script language='javascript'>alert('理财产品添加失败！');window.location='searchProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("理财产品添加失败！");
		} else {
			out.print(
					"<script language='javascript'>alert('理财产品添加成功！');window.location='searchProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("理财产品添加成功！");
		}
	}

	public ProductModel getProductInfo(ProductModel productModel) {
		return baseDao.getHibernateTemplate().get(ProductModel.class, productModel.getId());
	}

	@SuppressWarnings("unchecked")
	public List<ProductModel> getProduct(ProductModel productModel) {
		String sql = "from ProductModel p where p.productname = ? ";
		return (List<ProductModel>) baseDao.getHibernateTemplate().find(sql, productModel.getProductname());
	}

	public void deleteProductModel(ProductModel productModel) {
		baseDao.getHibernateTemplate().delete(productModel);
	}

	public void updateProductModel(ProductModel productModel) {
		HttpServletResponse response = null;
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		baseDao.getHibernateTemplate().update(productModel);
		productModel = baseDao.getHibernateTemplate().get(ProductModel.class, productModel.getId());
		if (productModel.getId() == null) {
			out.print(
					"<script language='javascript'>alert('理财产品修改失败！');window.location='searchProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("理财产品修改失败！");
		} else {
			out.print(
					"<script language='javascript'>alert('理财产品修改成功！');window.location='searchProductAction';</script>");
			out.flush();
			out.close();
			System.out.println("理财产品修改成功！");
		}
	}
}
