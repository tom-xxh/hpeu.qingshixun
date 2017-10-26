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
@Table(name = "t_transfer")
public class TransferModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transfer_id")
	private Long transferId;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private double transfer_Money;
	private Long bankcard;
	private String status;//操作

	@ManyToOne(cascade={CascadeType.ALL} ,fetch = FetchType.EAGER)
	@JoinColumn(name="user_id")
	private UserModel userModel;
	
	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		System.out.println("100000000000000");
		this.userModel = userModel;
	}

	
	public Long getTransferId() {
		return transferId;
	}

	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTransfer_Money() {
		return transfer_Money;
	}

	public void setTransfer_Money(double transfer_Money) {
		this.transfer_Money = transfer_Money;
	}

	public Long getBankcard() {
		return bankcard;
	}

	public void setBankcard(Long bankcard) {
		this.bankcard = bankcard;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransferModel [transferId=" + transferId + ", date=" + date + ", transfer_Money=" + transfer_Money
				+ ", bankcard=" + bankcard + ", status=" + status + "]";
	}	

}
