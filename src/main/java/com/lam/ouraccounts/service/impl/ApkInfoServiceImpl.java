package com.lam.ouraccounts.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lam.ouraccounts.bean.ApkInfo;
import com.lam.ouraccounts.dao.IApkInfoDao;
import com.lam.ouraccounts.service.ApkInfoService;

@Service("apkInfoService")
public class ApkInfoServiceImpl implements ApkInfoService {

	@Resource
	@Autowired
	private IApkInfoDao apkInfoDao;

	@Override
	public int uploadApk(ApkInfo apk) {
		return apkInfoDao.insert(apk);
	}

	@Override
	public ApkInfo getLatestApk() {
		return apkInfoDao.selectLatestApk();
	}

}
