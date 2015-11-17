package com.lam.ouraccounts.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.lam.ouraccounts.service.FeedbackService;

@RestController
@RequestMapping("feedback")
public class FeedbackController {

	@Resource
	private FeedbackService feedbackService;

	@RequestMapping("feedback")
	@ResponseBody
	public String addFeedback(@RequestParam("feedbackContent") String feedbackContent,
			@RequestParam(value = "feedbackAddress", required = false) String feedbackAddress) {
		System.out.println("---------"+feedbackContent);
		int r = feedbackService.addFeedback(feedbackContent, feedbackAddress);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("status", r);
		return JSON.toJSONString(map);
	}

}
