package online.qsx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//用户
	@Entity
	//使用小组名首字母缩写加上类名及为表名
	@Table(name="tb_user",uniqueConstraints={@UniqueConstraint(columnNames={"username"}),@UniqueConstraint(columnNames={"e_mail"}),@UniqueConstraint(columnNames={"idcard"})})
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
		//用户身份证号 
		@Column(name="idcard")
		private String IDcard;
		//用户电话
		@Column(name="phonenumber")
		private String phonenumber;
		//用户状态
		@Column(name="state")
		private int state;//0为普通用户，1为管理员
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
		
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public int getState() {
			return state;
		}
		public void setState(int state) {
			this.state = state;
		}
		public String getIDcard() {
			return IDcard;
		}
		public void setIDcard(String iDcard) {
			IDcard = iDcard;
		}
		@Override
		public String toString() {
			return "UserModel [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
					+ ", IDcard=" + IDcard + ", phonenumber=" + phonenumber + ", state=" + state + "]";
		}
		
	}