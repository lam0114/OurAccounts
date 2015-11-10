package com.lam.ouraccounts.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lam.ouraccounts.bean.ApkInfo;
import com.lam.ouraccounts.service.ApkInfoService;

@RestController("checkUpdateController")
public class CheckUpdateController {

	@Resource
	private ApkInfoService apkInfoService;

	@RequestMapping("/checkUpdate")
	@ResponseBody
	public String checkUpdate() {
		ApkInfo apk = apkInfoService.getLatestApk();
		return JSON.toJSONString(apk);
	}

}
