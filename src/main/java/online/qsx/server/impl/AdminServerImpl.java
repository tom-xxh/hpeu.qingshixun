package online.qsx.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.qsx.dao.impl.AdminDaoImpl;
import online.qsx.model.UserModel;

@Service
public class AdminServerImpl {
	@Autowired
	AdminDaoImpl adminDaoImpl;
	
	public List<UserModel> getUsers() {
		return adminDaoImpl.getUsers();
	}
	
	public UserModel getUser(UserModel userModel) {
		return adminDaoImpl.getUser(userModel);
	}
	//验证密码
		public List<UserModel> checkPwd(String Password,String Password2){
			adminDaoImpl.checkPwd(Password, Password2);
			return null;		
		}
}
