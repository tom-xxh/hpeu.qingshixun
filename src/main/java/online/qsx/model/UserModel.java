package online.qsx.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//用户
	@Entity
	//使用小组名首字母缩写加上类名及为表名
	@Table(name="t_user",uniqueConstraints={@UniqueConstraint(columnNames={"username"}),@UniqueConstraint(columnNames={"e_mail"})})
	public class UserModel {
		//用户id
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="user_id")
		private long id;
		//用户名
		@Column(name="username")
		private String name;
		//用户密码
		@Column(name="password")
		private String password;
		//用户邮箱
		@Column(name="e_mail")
		private String email;
		
		@Column(name="idcard")
		private String IDcard;
		
		private Long phonenumber;
		
		//用户状态
		@Column(name="state")
		private int state;//0为普通用户，1为管理员
		//账户余额
		private Double user_count;
		
		@OneToMany(cascade={CascadeType.ALL} ,fetch = FetchType.LAZY)
		@JoinColumn(name="user_id")
		private Set<TransferModel> transferModels = new HashSet<TransferModel>();
		
		@OneToMany(cascade={CascadeType.ALL} ,fetch = FetchType.LAZY)
		@JoinColumn(name="user_id")
		private Set<BankModel> bankModels = new HashSet<BankModel>();
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public int getState() {
			return state;
		}
		public void setState(int state) {
			this.state = state;
		}
		public Double getUser_count() {
			return user_count;
		}
		public void setUser_count(Double user_count) {
			this.user_count = user_count;
		}
		public Set<TransferModel> getTransferModels() {
			return transferModels;
		}
		public void setTransferModels(Set<TransferModel> transferModels) {
			this.transferModels = transferModels;
		}
		public Set<BankModel> getBankModels() {
			return bankModels;
		}
		
		public void setBankModels(Set<BankModel> bankModels) {
			this.bankModels = bankModels;
		}
		
		public String getIDcard() {
			return IDcard;
		}
		public void setIDcard(String iDcard) {
			IDcard = iDcard;
		}
		public Long getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(Long phonenumber) {
			this.phonenumber = phonenumber;
		}
		@Override
		public String toString() {
			return "UserModel [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
					+ ", IDcard=" + IDcard + ", phonenumber=" + phonenumber + ", state=" + state + ", user_count="
					+ user_count + "]";
		}
		
	}
