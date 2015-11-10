package com.lam.ouraccounts.dao;

import com.lam.ouraccounts.bean.ApkInfo;

public interface IApkInfoDao {
	int deleteByPrimaryKey(Integer versionCode);

	int insert(ApkInfo record);

	int insertSelective(ApkInfo record);

	ApkInfo selectByPrimaryKey(Integer versionCode);

	int updateByPrimaryKeySelective(ApkInfo record);

	int updateByPrimaryKey(ApkInfo record);
	
	ApkInfo selectLatestApk();
}