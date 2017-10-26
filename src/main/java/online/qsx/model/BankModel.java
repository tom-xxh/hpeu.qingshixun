package online.qsx.model;

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

/*
 * 银行卡 model类
 */
@Entity
@Table(name = "t_bank")
public class BankModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id")
	private Long id;

	private String realName;
	private Long id_card;
	private Long bankcard;
	private Long phonenumber;
	private Double bank_count;
	
	@ManyToOne(cascade={CascadeType.ALL} ,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private BankModel bankModel;


	public BankModel getBankModel() {
		return bankModel;
	}

	public void setBankModel(BankModel bankModel) {
		this.bankModel = bankModel;
	}

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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Long getId_card() {
		return id_card;
	}

	public void setId_card(Long id_card) {
		this.id_card = id_card;
	}

	public Long getBankcard() {
		return bankcard;
	}

	public void setBankcard(Long bankcard) {
		this.bankcard = bankcard;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Double getBank_count() {
		return bank_count;
	}

	public void setBank_count(Double bank_count) {
		this.bank_count = bank_count;
	}

	@Override
	public String toString() {
		return "BankModel [id=" + id + ", realName=" + realName + ", id_card=" + id_card + ", bankcard=" + bankcard
				+ ", phonenumber=" + phonenumber + ", bank_count=" + bank_count + "]";
	}

}
