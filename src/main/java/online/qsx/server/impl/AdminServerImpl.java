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

	// 查询管理员
	public UserModel getAdmin(UserModel userModel) {
		return adminDaoImpl.getAdmin(userModel);
	}

	// 查询会员

	public UserModel getUser(UserModel userModel) {
		return adminDaoImpl.getUser(userModel);
	}

	// 验证密码
	public List<UserModel> checkPwd(String Password, String Password2) {
		adminDaoImpl.checkPwd(Password, Password2);
		return null;
	}

	// 添加
	public void addUserModel(UserModel userModel) {
		adminDaoImpl.addUserModel(userModel);
	}

	// 模糊查询
	public List<UserModel> queryUser(String queryRow, String queryKey) {
		List<UserModel> list = adminDaoImpl.queryUser(queryRow, queryKey);
		return list;
	}

	public Long getCountUser() {
		return adminDaoImpl.getCountUser();
	}

}
