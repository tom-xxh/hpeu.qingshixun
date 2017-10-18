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
}
