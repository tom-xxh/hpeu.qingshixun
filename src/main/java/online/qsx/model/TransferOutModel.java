package online.qsx.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_transferOut")
public class TransferOutModel {// 转出
	private Long transferOutId;
	private Date date;
	private double transferOutMoney;
	private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransferOutModel [transferOutId=" + transferOutId + ", date=" + date + ", transferOutMoney="
				+ transferOutMoney + ", status=" + status + "]";
	}

}
