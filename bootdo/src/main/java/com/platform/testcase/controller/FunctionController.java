package com.platform.testcase.controller;

import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.google.common.base.Splitter;
import com.platform.testcase.pojo.Function;
import com.platform.testcase.service.impl.FunctionServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static com.platform.testcase.utils.BaseTypeUtils.strToLong;

@RequestMapping("/testplatform/function")
public class FunctionController {
    @Autowired
    FunctionServiceImpl functionService;

    /**
     *
     * @param function
     * @return add result
     */
    @RequestMapping("/save")
    @ResponseBody
    public R save(Function function){
        if (StringUtils.isBlank(function.getFunctionName()) ){
            return R.error("功能名称不能为空");
        }
        function.setModifierId(ShiroUtils.getUserId());
        function.setCreatorId(ShiroUtils.getUserId());
        return functionService.save(function);
    }
    public R delete(String ids){
        if (StringUtils.isBlank(ids)){
            return R.error("请选择需要删除的功能");
        }
        List<String> list = Splitter.on(",").splitToList(ids);
        List<Long> idList = strToLong(list);
        return functionService.delete(idList);
    }
    public R forbidden(String ids,int type){
        if (StringUtils.isBlank(ids)){
            return R.error("请选择需要删除的功能");
        }
        List<String> list = Splitter.on(",").splitToList(ids);
        List<Long> idList = strToLong(list);
        return functionService.forbidden(idList,type);
    }


}
