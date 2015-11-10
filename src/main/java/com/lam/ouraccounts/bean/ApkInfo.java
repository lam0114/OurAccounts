package com.lam.ouraccounts.bean;

public class ApkInfo {

	private Integer versionCode;
	private String versionName;
	private String downloadUrl;

	public ApkInfo() {
		super();
	}

	public ApkInfo(String versionName, String downloadUrl) {
		this.versionName = versionName;
		this.downloadUrl = downloadUrl;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

}