package com.lam.ouraccounts.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public Map<String, Integer> login(String username, String password);

	public int register(String username, String password);

}
