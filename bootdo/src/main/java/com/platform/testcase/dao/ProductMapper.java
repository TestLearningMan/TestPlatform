package com.platform.testcase.dao;

import com.platform.testcase.pojo.Product;

import java.util.List;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);

    int getCountByProductName(String ProductName);

    int save(Product product);

    int delete(Long id);

    int batchDelete(List<String> productIdList);
}