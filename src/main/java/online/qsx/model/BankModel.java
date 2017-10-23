package online.qsx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 银行卡 model类
 */
@Entity
@Table(catalog = "test", name = "t_bank")
public class BankModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bank_id")
	private Long id;
	private String username;
	private Long idcard;
	private Long bankcard;
	private Long phonenumber;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getIdcard() {
		return idcard;
	}

	public void setIdcard(Long idcard) {
		this.idcard = idcard;
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

	@Override
	public String toString() {
		return "BankModel [id=" + id + ", username=" + username + ", idcard=" + idcard + ", bankcard=" + bankcard
				+ ", phonenumber=" + phonenumber + "]";
	}

}
