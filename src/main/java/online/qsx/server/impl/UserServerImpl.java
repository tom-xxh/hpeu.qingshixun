package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.UserDaoImpl;
import online.qsx.model.UserModel;

@Service
public class UserServerImpl {

	@Autowired
	private UserDaoImpl userDaoImpl;

	public List<UserModel> getUsers() {
		return userDaoImpl.getUsers();
	}
	
	public UserModel getUser(UserModel userModel) {
		return userDaoImpl.getUser(userModel);
	}

	public void deleteUserModel(UserModel userModel) {
		userDaoImpl.deleteUserModel(userModel);
	}

	public void updateUserModel(UserModel userModel) {
		userDaoImpl.updateUserModel(userModel);
	}

	// 添加
	public void addUserModel(UserModel userModel) {
		System.out.println("XXXXXXX"+"QQQ");
		userDaoImpl.addUserModel(userModel);
	}

	

	public void edit(UserModel userModel) {
		System.out.println("111");
		userDaoImpl.edit(userModel);
	}

	// 验证密码
	public List<UserModel> checkPwd(String Password, String Password2) {
		userDaoImpl.checkPwd(Password, Password2);
		return null;
	}

	// 查询
	public List<UserModel> findUserModel(String name, String password) {
		List<UserModel> list = userDaoImpl.findUserModel(name, password);
		return list;
	}

	// 注册账号查询
	public List<UserModel> findUserName(String name) {
		List<UserModel> username = userDaoImpl.findUserName(name);
		return username;

	}

	// 注册账号邮箱
	public List<UserModel> findUserEmail(String Email) {
		List<UserModel> userEmail = userDaoImpl.findUserEmail(Email);
		return userEmail;

	}

}
