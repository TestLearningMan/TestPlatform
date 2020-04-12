package com.platform.testcase.dao;

import com.platform.testcase.pojo.Function;

public interface FunctionMapper {
    int insert(Function record);

    int insertSelective(Function record);
}