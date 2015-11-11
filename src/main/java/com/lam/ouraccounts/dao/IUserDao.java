package com.lam.ouraccounts.dao;

import java.util.Map;

import com.lam.ouraccounts.bean.User;

public interface IUserDao {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	User login(Map<String, String> params);
}