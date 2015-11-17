package com.lam.ouraccounts.dao;

import com.lam.ouraccounts.bean.Feedback;

public interface IFeedbackDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}