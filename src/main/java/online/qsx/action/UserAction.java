package online.qsx.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import online.qsx.model.UserModel;
import online.qsx.server.impl.UserServerImpl;

@Component("userAction")
public class UserAction {

	@Autowired
	private UserServerImpl userServerImpl;

	private List<UserModel> list;
	private UserModel userModel;

	//当前用户下标
		long index=0;
		
	public String findUsers() {
		list = userServerImpl.getUsers();
		return "list";
	}

	public String delete() {
		userServerImpl.deleteUserModel(userModel);
		list = userServerImpl.getUsers();
		return "succeed";
	}

	public String update() {
		userServerImpl.updateUserModel(userModel);
		list = userServerImpl.getUsers();
		return "succeed";
	}

	public List<UserModel> getList() {
		return list;
	}
	
	//添加
	public String add(){
		userServerImpl.addUserModel(userModel);
		list=userServerImpl.getUsers();
		System.out.println("2"+list.toString());
		return "add";
	}
	//登录查询
	public String login(){
		System.out.println("最后的index："+index);
		List<UserModel> list = userServerImpl.findUserModel(userModel.getName(), userModel.getPassword());
		for (UserModel userModel : list) {
			index= userModel.getId();
			System.out.println("最后的："+list.toString());
			System.out.println("最后的index："+index);
		}
		if (index<=0) {
			index= userModel.getId();
			System.out.println("最后的index："+index);
			return "error";
		}
		return "login";
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
