package com.lam.ouraccounts.service;

import com.lam.ouraccounts.bean.ApkInfo;

public interface ApkInfoService {

	public int uploadApk(ApkInfo apk);

	public ApkInfo getLatestApk();

}
