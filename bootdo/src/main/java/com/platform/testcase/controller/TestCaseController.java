package com.platform.testcase.controller;

import com.platform.testcase.pojo.Product;
import com.platform.testcase.service.IProductService;
import com.platform.testcase.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.bootdo.common.utils.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


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

    @RequestMapping(value = "/list")
    @ResponseBody
    public R list(@RequestParam Map<String,Object> map){
        Object limit = map.get("limit");
        if (null == limit || StringUtils.isBlank(limit.toString())
                || 0 == Integer.parseInt(limit.toString())) {
            return R.error("每页条数不能为空");
        }
        Query query = new Query(map);
        int total = iProductService.count(map);
        List<ProductVo> productVoLinkedHashMap =  iProductService.list(query);
        PageUtils pageUtils = new PageUtils(productVoLinkedHashMap,
                total);
        R r = new R();
        r.put("pageUtils",pageUtils);
        return r;
    }

}
