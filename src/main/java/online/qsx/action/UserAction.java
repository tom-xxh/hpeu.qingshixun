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

	public String findUsers() {
		list = userServerImpl.getUsers();
		return "list";
	}
		
	public String info() {
		userModel=userServerImpl.getUser(userModel);
		return "info";
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

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
