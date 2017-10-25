package online.qsx.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;

import online.qsx.model.UserModel;
import online.qsx.server.impl.AdminServerImpl;
import online.qsx.server.impl.UserServerImpl;

@Component("userAction")
public class UserAction {
	@Autowired
	private UserServerImpl userServerImpl;
	@Autowired
	private AdminServerImpl adminServerImpl;
	private List<UserModel> list;
	private UserModel userModel;
	// 当前用户身份
	public static long userState;

	// 当前用户下标
	public static long index = 0;
	public String Password;
	public String Password2;

	// 密码验证
	public String passwordUpdate() {
		System.out.println(Password + "/" + Password2);
		userServerImpl.checkPwd(Password, Password2);
		return "input";
	}

	/*
	 * 登录注册属性
	 */
	// 注册验证账户1
	private String name = null;
	// 注册验证账户2次账户
	private String name2 = null;
	// 注册账户长度
	private int nameLength;
	// 注册账户判断为空账户对比账户
	private String name3 = null;
	// 注册验证邮箱
	private String email = null;
	// 注册验证2次邮箱
	private String email2 = null;

	// 登录账号 ，密码
	private String loginName = null;
	private String loginPassword = null;
	// 容器
	private String loginName2 = null;
	private String loginPassword2 = null;

	public String findUsers() {
		list = userServerImpl.getUsers();
		return "list";
	}

	public String info() {
		userModel = userServerImpl.getUser(userModel);
		System.out.println("-----" + userModel.getId());
		return "info";
	}

	public String updateInfo() {
		userModel = userServerImpl.getUser(userModel);
		System.out.println("-----" + userModel.getId());
		return "updateInfo";
	}

	public String delete() {
		userServerImpl.deleteUserModel(userModel);
		HttpSession session = ServletActionContext.getRequest().getSession();
		String row = (String) session.getAttribute("queryRow");
		String key = (String) session.getAttribute("queryKey");
		list = adminServerImpl.queryUser(row, key);
		return "succeed";
	}

	public String update() {
		userServerImpl.updateUserModel(userModel);
		list = userServerImpl.getUsers();
		return "succeed";
	}

	// 修改
	public String to_edit() {
		userModel = userServerImpl.getUser(userModel);
		return "update";
	}

	public String do_edit() {
		userServerImpl.edit(userModel);
		list = userServerImpl.getUsers();
		return "list";
	}

	public List<UserModel> getList() {
		return list;
	}

	// 注册
	public String add() {
		userModel.setUser_count(0.0);
		userServerImpl.addUserModel(userModel);
		list = userServerImpl.getUsers();
		System.out.println("2" + list.toString());
		return "add";
	}

	// 注册验证
	// 注册验证账户AJAX
	@SuppressWarnings("unused")
	public String ajaxUsername() {

		List<UserModel> username = userServerImpl.findUserName(name);
		for (UserModel userModel : username) {
			name2 = userModel.getName();
		}
		for (int i = 0; i < name.length(); i++) {
			nameLength++;
			System.out.println(nameLength);
		}
		if (!name.equals(name2) || name.length() < 1) {
			name = null;
		}
		if (nameLength < 6 || nameLength > 12) {
			name = "2";
		} else if (name == null) {
			name = "1";
		} else {
			name = "0";
		}
		return "name";
	}

	// 注册验证邮箱AJAX
	public String ajaxUserEmail() {
		List<UserModel> useremail = userServerImpl.findUserEmail(email);
		for (UserModel userModel : useremail) {
			email2 = userModel.getEmail();
		}
		System.out.println(email + "  " + email2);
		if (!email.equals(email2) || email.length() < 2) {
			email = null;
		}
		if (email == null) {
			email = "1";
		} else {
			email = "0";
		}
		return "email";
	}

	// 登录查询
	public String login() {
		List<UserModel> list = userServerImpl.findUserModel(userModel.getName(), userModel.getPassword());
		for (UserModel userModel : list) {
			index = userModel.getId();
			userState = userModel.getState();
			System.out.println();
			System.out.println("最后的state：" + userState);
			System.out.println("最后的：" + list.toString());
			System.out.println("最后的index：" + index);
		}
		if (index <= 0) {
			index = userModel.getId();
			System.out.println("最后的index：" + index);
			return "error";
		} else if (userState == 0) {
			userModel = list.get(0);
			return "login";
		} else if (userState == 1) {
			userModel = list.get(0);
			return "admin";
		}
		return "error";
	}

	// 登录查询判断
	public String ajaxLoginFromAction() {
		System.out.println("第一次进入ajaxLoginFromAction" + "     " + loginName + "  " + loginName2);
		List<UserModel> list = userServerImpl.findUserModel(loginName, loginPassword);
		for (UserModel userModel : list) {
			loginName2 = userModel.getName();
			loginPassword2 = userModel.getPassword();
			System.out.println(loginName + "           " + loginPassword);
		}
		if (loginName2 == null && loginName2 == null) {
			loginName = "1";

		} else {
			loginName = "0";
		}
		System.out.println(loginName2 + "           " + loginPassword2);
		System.out.println(loginName + "XXXXXXXXXXXXX");
		return "loginName";
	}

	// 登录注册get and set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getNameLength() {
		return nameLength;
	}

	public void setNameLength(int nameLength) {
		this.nameLength = nameLength;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginName2() {
		return loginName2;
	}

	public void setLoginName2(String loginName2) {
		this.loginName2 = loginName2;
	}

	public String getLoginPassword2() {
		return loginPassword2;
	}

	public void setLoginPassword2(String loginPassword2) {
		this.loginPassword2 = loginPassword2;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

}
