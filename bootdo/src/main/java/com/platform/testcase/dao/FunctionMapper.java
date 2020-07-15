package com.platform.testcase.dao;

import com.platform.testcase.pojo.Function;

import java.util.List;

public interface FunctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    int isExist(String functionName);

    int delete(List<Long> idList);

    int enable(List<Long> idList);

    int disable(List<Long> idList);

}