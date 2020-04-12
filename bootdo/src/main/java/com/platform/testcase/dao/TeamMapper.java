package com.platform.testcase.dao;

import com.platform.testcase.pojo.Team;

public interface TeamMapper {
    int insert(Team record);

    int insertSelective(Team record);
}