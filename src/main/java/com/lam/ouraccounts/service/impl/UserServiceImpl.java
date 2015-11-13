package com.lam.ouraccounts.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lam.ouraccounts.bean.User;
import com.lam.ouraccounts.dao.IUserDao;
import com.lam.ouraccounts.service.UserService;
import com.lam.ouraccounts.util.MD5;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	@Autowired
	private IUserDao userDao;

	@Override
	public Map<String, Integer> login(String username, String password) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		User user = userDao.getUserByParam(username);
		if (user != null) {
			if (MD5.getMD5(password.trim()).equals(user.getPwd())) {
				map.put("status", 2);
			} else {
				map.put("status", 1);
			}
		} else {
			map.put("status", 0);
		}
		return map;
	}

	@Override
	public int register(String username, String password) {
		User user = userDao.getUserByParam(username);
		if (user == null) {
			user = new User();
			user.setUserId(System.currentTimeMillis() + "");
			user.setUserName(username);
			user.setPwd(MD5.getMD5(password));
			userDao.insert(user);
			return 1;
		} else {
			return 0;
		}
	}

}
