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
	public String Password;//验证旧密码
	public String Password2;//新密码
	public String queryKey;//查询关键词
	public String queryRow;//查询条件

	// 通过id查管理员信息1
	public String infoAdmin() {
		userModel = adminServerImpl.getAdmin(userModel);
		System.out.println("进来了" + userModel.getId());
		return "infoAdmin";
	}

	// 通过id查管理员信息2
	public String findAdmin() {
		userModel = adminServerImpl.getAdmin(userModel);
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
	
	//添加会员
	public String addUser() {
		adminServerImpl.addUserModel(userModel);
		list = adminServerImpl.getUsers();
		System.out.println("2" + list.toString());
		return "addUser";
	}
	//查询会员
	public String queryUser() {
		System.out.println("queryKey:"+queryKey+"/queryRow:"+queryRow);
		if(queryKey.equals("")){
			return "queryError";
		}
		list=adminServerImpl.queryUser(queryRow,queryKey);
		for(UserModel user:list){
			System.out.println("1");
			System.out.println(user.toString());
		}
		System.out.println("queryUser");
		return "queryUser";
	}
	//查询修改管理员信息
	public String editUser(){
		System.out.println("查询待修改的管理员信息");
		userModel = adminServerImpl.getUser(userModel);
		return "editUser";
	}
	//查询修改管理员信息
		public String saveUser(){
			System.out.println("saveAdmin进来了");
			userServerImpl.edit(userModel);
			System.out.println("saveAdmin出来了");
			list = userServerImpl.getUsers();
			System.out.println("saveAdmin又进来了");
			return "saveUser";
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

	public String getQueryKey() {
		return queryKey;
	}

	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public String getQueryRow() {
		return queryRow;
	}

	public void setQueryRow(String queryRow) {
		this.queryRow = queryRow;
	}


}
