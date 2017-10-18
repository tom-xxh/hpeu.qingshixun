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

	public void deleteUserModel(UserModel userModel) {
		userDaoImpl.deleteUserModel(userModel);
	}
	public void updateUserModel(UserModel userModel) {
		userDaoImpl.updateUserModel(userModel);
	}
}
