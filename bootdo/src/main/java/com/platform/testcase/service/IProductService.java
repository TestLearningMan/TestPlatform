package com.platform.testcase.service;

import com.bootdo.common.utils.R;
import com.platform.testcase.pojo.Product;

public interface IProductService {
    public R save(Product product);
    public R delete(Long id);
    public R batchDelete(String productIds);
}
