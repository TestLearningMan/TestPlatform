package com.platform.testcase.dao;

import com.platform.testcase.pojo.CaseDetail;

public interface CaseDetailMapper {
    int insert(CaseDetail record);

    int insertSelective(CaseDetail record);
}