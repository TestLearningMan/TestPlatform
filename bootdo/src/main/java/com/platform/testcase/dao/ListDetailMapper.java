package com.platform.testcase.dao;

import com.platform.testcase.pojo.ListDetail;

public interface ListDetailMapper {
    int insert(ListDetail record);

    int insertSelective(ListDetail record);
}