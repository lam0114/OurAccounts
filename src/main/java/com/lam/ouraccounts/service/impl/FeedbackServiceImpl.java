package com.lam.ouraccounts.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lam.ouraccounts.bean.Feedback;
import com.lam.ouraccounts.dao.IFeedbackDao;
import com.lam.ouraccounts.service.FeedbackService;
import com.lam.ouraccounts.util.Constant;

@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService {

	@Resource
	@Autowired
	private IFeedbackDao feedbackDao;

	public int addFeedback(String feedbackContent, String feedbackAddress) {
		Feedback feedback = new Feedback();
		feedback.setFeedbackContent(feedbackContent);
		feedback.setFeedbackAddress(feedbackAddress);
		feedback.setCreateTime(Constant.getCurrentDate());
		return feedbackDao.insertSelective(feedback);
	}

}
