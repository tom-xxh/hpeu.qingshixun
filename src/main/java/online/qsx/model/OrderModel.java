package online.qsx.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_order")
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long id;
	private Long productcard;// 产品编号
	private String productname;// 产品名称
	private int productnumber;// 产品数量
	private double totalmoney;// 花费金额
	// TemporalType.DATE yyyy-MM-dd
	// TemporalType.TIME yyyy-MM-dd hh:mm:ss
	@Temporal(TemporalType.DATE)
	@Column(name = "createDate")
	private Date createDate;// 购买日期
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "user_id")
	// 特殊属性
	private UserModel userModel;

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

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

	public int getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(int productnumber) {
		this.productnumber = productnumber;
	}

	public double getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "OrderModel [id=" + id + ", productcard=" + productcard + ", productname=" + productname
				+ ", productnumber=" + productnumber + ", totalmoney=" + totalmoney + ", createDate=" + createDate
				+ "]";
	}

}
