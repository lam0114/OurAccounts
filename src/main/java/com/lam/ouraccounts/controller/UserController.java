package com.lam.ouraccounts.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lam.ouraccounts.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		Map<String, Integer> map = userService.login(username, password);
		return JSON.toJSONString(map);
	}

	@RequestMapping("/register")
	@ResponseBody
	public String register(@RequestParam("username") String username, @RequestParam("password") String password) {
		int r = userService.register(username, password);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("status", r);
		return JSON.toJSONString(map);
	}

}
