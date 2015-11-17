package com.lam.ouraccounts.bean;

public class Feedback {

	private Integer id;
	private String feedbackContent;
	private String feedbackAddress;
	private String userId;
	private String createTime;
	private String remark;

	public Feedback() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFeedbackContent() {
		return feedbackContent;
	}

	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
	}

	public String getFeedbackAddress() {
		return feedbackAddress;
	}

	public void setFeedbackAddress(String feedbackAddress) {
		this.feedbackAddress = feedbackAddress == null ? null : feedbackAddress.trim();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime == null ? null : createTime.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}