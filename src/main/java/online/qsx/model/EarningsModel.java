package online.qsx.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_earnings")
public class EarningsModel {// 收益
	private Long earningsId;
	private Date date;
	private double earningsMoney;
	private String status;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getEarningsId() {
		return earningsId;
	}

	public void setEarningsId(Long earningsId) {
		this.earningsId = earningsId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getEarningsMoney() {
		return earningsMoney;
	}

	public void setEarningsMoney(double earningsMoney) {
		this.earningsMoney = earningsMoney;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EarningsModel [earningsId=" + earningsId + ", date=" + date + ", earningsMoney=" + earningsMoney
				+ ", status=" + status + "]";
	}

}
