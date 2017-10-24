package online.qsx.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_transferOut")
public class TransferOutModel {
	private Long transferOutId;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private double transferOutMoney;
	private Long bankcard;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getTransferOutId() {
		return transferOutId;
	}

	public void setTransferOutId(Long transferOutId) {
		this.transferOutId = transferOutId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTransferOutMoney() {
		return transferOutMoney;
	}

	public void setTransferOutMoney(double transferOutMoney) {
		this.transferOutMoney = transferOutMoney;
	}

	public Long getBankcard() {
		return bankcard;
	}

	public void setBankcard(Long bankcard) {
		this.bankcard = bankcard;
	}

	@Override
	public String toString() {
		return "TransferOutModel [transferOutId=" + transferOutId + ", date=" + date + ", transferOutMoney="
				+ transferOutMoney + ", bankcard=" + bankcard + "]";
	}

	public TransferOutModel(Date date, double transferOutMoney, Long bankcard) {
		super();
		this.date = date;
		this.transferOutMoney = transferOutMoney;
		this.bankcard = bankcard;
	}

	public TransferOutModel() {
		super();
	}
	
	
	

}
