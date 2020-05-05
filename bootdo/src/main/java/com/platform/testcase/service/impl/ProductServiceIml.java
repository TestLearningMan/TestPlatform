package com.platform.testcase.service.impl;

import com.google.common.base.Splitter;
import com.platform.testcase.dao.ProductMapper;
import com.platform.testcase.pojo.Product;
import com.platform.testcase.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bootdo.common.utils.*;

import java.util.List;


@Service
public class ProductServiceIml implements IProductService {
    @Autowired
    ProductMapper productMapper;

    public R save(Product product){
        if (productMapper.getCountByProductName(product.getProductName()) >0){
            return R.error(-1,"产品名称已存在");
        }
        if (StringUtils.isBlank(product.getId().toString())){
            product.setStatus(1);
            product.setCreatorId(ShiroUtils.getUserId());
            product.setModifierId(ShiroUtils.getUserId());
            int result = productMapper.insertSelective(product);
            if (result > 0){
                return R.ok();
            }
                return R.error();

        }
        else{
            product.setModifierId(ShiroUtils.getUserId());
            int result = productMapper.save(product);
            if (result > 0){
                return R.ok();
            }
            return R.error();
            }
        }

    public R delete(Long id){
        int result=productMapper.delete(id);
        if (result > 0){
            return R.ok();
        }
        return R.error();
    }

    public R batchDelete(String productIds){
        List<String> productIdList = Splitter.on(",").splitToList(productIds);
        if (productIdList.size() == 0){
            return R.error();
        }

    }
}
