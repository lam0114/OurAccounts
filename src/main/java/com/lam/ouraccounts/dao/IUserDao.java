package com.lam.ouraccounts.dao;

import com.lam.ouraccounts.bean.User;

public interface IUserDao {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * Query user based on parameter
	 * @param param username or mobile or email
	 * @return	return an user if exist, if not return null
	 */
	User getUserByParam(String param);

}