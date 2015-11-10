package com.lam.ouraccounts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lam.ouraccounts.bean.ApkInfo;

@RestController("checkUpdateController")
public class CheckUpdateController {

	@RequestMapping("/checkUpdate")
	@ResponseBody
	public String checkUpdate() {
		ApkInfo apk = new ApkInfo(2, "1.2", "http://133.130.89.237:8080/resouces/app-release.apk");
		return JSON.toJSONString(apk);
	}
	
}
