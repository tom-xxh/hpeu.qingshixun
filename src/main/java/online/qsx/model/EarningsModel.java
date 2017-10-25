package online.qsx.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_earnings")
public class EarningsModel {// 收益
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productname;// 产品名称
	private double totalmoney;// 花费金额
	private double interestrate;// 利率
	private Date createDate;// 购买日期
	private double earnings;// 收益金额
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
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

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(double totalmoney) {
		this.totalmoney = totalmoney;
	}

	public double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(double interestrate) {
		this.interestrate = interestrate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "EarningsModel [id=" + id + ", productname=" + productname + ", totalmoney=" + totalmoney
				+ ", interestrate=" + interestrate + ", createDate=" + createDate + ", earnings=" + earnings + "]";
	}

}
