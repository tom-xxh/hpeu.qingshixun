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
	//查询
		public List<UserModel> findUserModel(String name,String password){
				List<UserModel> list= userDaoImpl.findUserModel(name, password);
				
			return list;
		}
		//添加
			public void addUserModel(UserModel userModel){
				userDaoImpl.addUserMode(userModel);
			}
	
}
