package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.UserModel;
import online.qsx.server.impl.AdminServerImpl;
import online.qsx.server.impl.UserServerImpl;

@Component("adminAction")
public class AdminAction {
	@Autowired
	private AdminServerImpl adminServerImpl;
	@Autowired
	private UserServerImpl userServerImpl;
	private UserModel userModel;
	private List<UserModel> list;
	public String Password;
	public String Password2;


	// 通过id查管理员信息1
	public String infoAdmin() {
		userModel = adminServerImpl.getUser(userModel);
		System.out.println("进来了" + userModel.getId());
		return "infoAdmin";
	}

	// 通过id查管理员信息2
	public String findAdmin() {
		userModel = adminServerImpl.getUser(userModel);
		System.out.println("进来了" + userModel.getId());
		return "findAdmin";
	}

	// 修改管理员信息
	public String editAdmin() {
		System.out.println("editAdmin进来了");
		userServerImpl.edit(userModel);
		list = userServerImpl.getUsers();
		return "editAdmin";
	}

	// 密码验证
	public String passwordUpdate() {
		System.out.println(Password + "/" + Password2);
		adminServerImpl.checkPwd(Password, Password2);
		return "input";
	}

	public UserModel getUserModel() {
		return userModel;
	}
	
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
	
	public List<UserModel> getList() {
		return list;
	}
	
	public void setList(List<UserModel> list) {
		this.list = list;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPassword2() {
		return Password2;
	}

	public void setPassword2(String password2) {
		Password2 = password2;
	}
}
