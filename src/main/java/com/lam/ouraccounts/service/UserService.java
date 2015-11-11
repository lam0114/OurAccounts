package com.lam.ouraccounts.service;

import org.springframework.stereotype.Service;

import com.lam.ouraccounts.bean.User;

@Service
public interface UserService {

	public User login(String param, String pwd);

}
