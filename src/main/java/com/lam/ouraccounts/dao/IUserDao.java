package com.lam.ouraccounts.dao;

import com.lam.ouraccounts.bean.User;

public interface IUserDao {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User getUserByUserName(String userName);

}