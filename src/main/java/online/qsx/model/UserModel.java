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
	@Table(name="CM_user",uniqueConstraints={@UniqueConstraint(columnNames={"username"}),@UniqueConstraint(columnNames={"e_mail"}),@UniqueConstraint(columnNames={"idcard"})})
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
		private String IDcare;
		//用户电话
		@Column(name="phonenumber")
		private String phonenumber;
		//用户状态
		@Column(name="state")
		private int state;//0为普通用户，1为管理员
		
		//toString()
		
		public String ActionFindtoString(){
			return "id";
		}
		
		@Override
		public String toString() {
			return "UserModel [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
					+ ", IDcare=" + IDcare + ", phonenumber=" + phonenumber + ", state=" + state + "]";
		}

		//构造方法
		public UserModel(long id, String name, String password, String email, String iDcare, String phonenumber,
				int state) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			this.email = email;
			IDcare = iDcare;
			this.phonenumber = phonenumber;
			this.state = state;
		}

		
		public UserModel() {
			super();
		}

		public UserModel(long id) {
			super();
			this.id = id;
		}

		public UserModel(String name, String password, String email, String iDcare, String phonenumber, int state) {
			super();
			this.name = name;
			this.password = password;
			this.email = email;
			IDcare = iDcare;
			this.phonenumber = phonenumber;
			this.state = state;
		}

		//get  and  set
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

		public String getIDcare() {
			return IDcare;
		}

		public void setIDcare(String iDcare) {
			IDcare = iDcare;
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
		

}
