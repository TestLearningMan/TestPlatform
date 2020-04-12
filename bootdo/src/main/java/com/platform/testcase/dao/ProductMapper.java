package com.platform.testcase.dao;

import com.platform.testcase.pojo.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}