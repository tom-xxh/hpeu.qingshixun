package online.qsx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import online.qsx.common.BaseDao;
import online.qsx.model.UserModel;

@Repository
public class UserDaoImpl {
	@Autowired
	private BaseDao baseDao;

	@SuppressWarnings("unchecked")
	public List<UserModel> getUsers() {
		return (List<UserModel>) baseDao.getHibernateTemplate().find("from UserModel");
	}

	public void deleteUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().delete(userModel);
	}

	public void updateUserModel(UserModel userModel) {
		baseDao.getHibernateTemplate().delete(userModel);
	}

	public UserModel getUser(UserModel userModel) {
		return baseDao.getHibernateTemplate().get(UserModel.class, userModel.getId());
	}
	//增加
	public void addUserMode(UserModel userModel){
		baseDao.getHibernateTemplate().save(userModel);
	}
	//登录查询
	@SuppressWarnings("unchecked")
	public List<UserModel> findUserModel(String name,String password){
		@SuppressWarnings("unused")
		String  hql="from UserModel UM where UM.name=? and UM.password=?";
			
		List<UserModel> id= (List<UserModel>) baseDao.getHibernateTemplate().find(hql,new String[]{name, password});
		for (UserModel userModel : id) {
			System.out.println("1231"+id.toString());
		}
		return id;
	}
}
