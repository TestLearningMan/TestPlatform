package com.platform.testcase.controller;

import com.platform.testcase.pojo.Product;
import com.platform.testcase.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.bootdo.common.utils.*;


@RequestMapping("/testplatform/product")
@Controller
public class TestCaseController {

    @Autowired
    IProductService iProductService;

    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    @ResponseBody
    public R AddProduct(Product product){
        if (StringUtils.isBlank(product.getProductName())){
            return R.error(-1,"产品名称不能为空");
        }
        return iProductService.save(product);
    }

    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    @ResponseBody
    public R deleteProduct(Long id){
        if (null == id || id == 0 ){
            R.error(-1,"前端参数传递错误，请刷新页面后，重新操作");
        }
        return iProductService.delete(id);
    }

    @RequestMapping(value = "/batchDelete")
    @ResponseBody
    public R batchDelete(String productIds){
        if (StringUtils.isBlank(productIds)){
            R.error(-1,"请先选择需要删除的产品");
        }
        return iProductService.batchDelete(productIds);
    }

    @RequestMapping(value = "/search")
    @ResponseBody
    public R search(String condition){
        if (StringUtils.isBlank(condition)){
            R.error("查询条件不能为空");
        }

    }

}
