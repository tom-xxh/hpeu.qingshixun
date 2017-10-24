package online.qsx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_product")
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;
	private Long productcard;// 产品编号
	private String productname;// 产品名称
	private String producttype;// 产品类型
	private double productprice;// 单股价格
	private double interestrate;// 跌涨率

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductcard() {
		return productcard;
	}

	public void setProductcard(Long productcard) {
		this.productcard = productcard;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", productcard=" + productcard + ", productname=" + productname
				+ ", producttype=" + producttype + ", productprice=" + productprice + ", interestrate=" + interestrate + "]";
	}

}
