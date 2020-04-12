package com.platform.testcase.dao;

import com.platform.testcase.pojo.List;

public interface ListMapper {
    int insert(List record);

    int insertSelective(List record);
}