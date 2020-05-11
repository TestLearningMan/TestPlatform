package com.platform.testcase.dao;

import com.platform.testcase.pojo.Product;

import java.util.List;
import java.util.Map;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);

    int getCountByProductName(String ProductName);

    int save(Product product);

    int delete(Long id);

    int batchDelete(List<String> productIdList);

    int count(Map<String,Object> map);

    List<Product> list(Map<String,Object> map);
}