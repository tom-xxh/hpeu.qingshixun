package online.qsx.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_transferIn")
public class TransferInModel {// ×ªÈë
	private Long transferInId;
	private Date date;
	private double transferInMoney;
	private Long bankcard;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getTransferInId() {
		return transferInId;
	}

	public void setTransferInId(Long transferInId) {
		this.transferInId = transferInId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTransferInMoney() {
		return transferInMoney;
	}

	public void setTransferInMoney(double transferInMoney) {
		this.transferInMoney = transferInMoney;
	}

	public Long getBankcard() {
		return bankcard;
	}

	public void setBankcard(Long bankcard) {
		this.bankcard = bankcard;
	}

	@Override
	public String toString() {
		return "TransferInModel [transferInId=" + transferInId + ", date=" + date + ", transferInMoney="
				+ transferInMoney + ", bankcard=" + bankcard + "]";
	}

}