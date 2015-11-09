package com.lam.ouraccounts.bean;

public class ApkInfo {

	private int versionCode;
	private String versionName;
	private String downloadUrl;

	public ApkInfo() {
		super();
	}

	public ApkInfo(int versionCode, String versionName, String downloadUrl) {
		this.versionCode = versionCode;
		this.versionName = versionName;
		this.downloadUrl = downloadUrl;
	}

	public int getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(int versionCode) {
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
