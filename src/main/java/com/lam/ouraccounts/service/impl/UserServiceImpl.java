package com.lam.ouraccounts.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lam.ouraccounts.bean.User;
import com.lam.ouraccounts.dao.IUserDao;
import com.lam.ouraccounts.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	@Autowired
	private IUserDao userDao;

	@Override
	public User login(String param, String pwd) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("param", param);
		params.put("pwd", pwd);
		return userDao.login(params);
	}

}
