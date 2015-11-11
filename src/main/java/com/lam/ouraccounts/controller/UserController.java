package com.lam.ouraccounts.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lam.ouraccounts.bean.User;
import com.lam.ouraccounts.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam("param") String param, @RequestParam("pwd") String pwd) {
		User user = userService.login(param, pwd);
		String result = "";
		if (user != null) {
			result = "success";
		} else {
			result = "failed";
		}
		return JSON.toJSONString(result);
	}

}
