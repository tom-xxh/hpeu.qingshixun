package online.qsx.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_transferIn")
public class TransferInModel {// 转入
	private Long transferInId;
	private Date date;
	private double transferInMoney;
	private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransferInModel [transferInId=" + transferInId + ", date=" + date + ", transferInMoney=" + transferInMoney
				+ ", status=" + status + "]";
	}

}
