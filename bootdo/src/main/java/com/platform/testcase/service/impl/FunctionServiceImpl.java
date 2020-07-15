package com.platform.testcase.service.impl;

import com.bootdo.common.utils.R;
import com.platform.testcase.dao.FunctionMapper;
import com.platform.testcase.pojo.Function;
import com.platform.testcase.service.IFunctionService;
import com.platform.testcase.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FunctionServiceImpl implements IFunctionService {

    @Autowired
    FunctionMapper functionMapper;

    public R save(Function function){
        if (functionMapper.isExist(function.getFunctionName()) !=0){
            return R.error("功能名称重复");
        }
        int result =0;
        if (function.getId() == -1){
            //无id时，则为新增
            function.setId(IdGenerator.getId());
            result = functionMapper.insertSelective(function);
        }else {
            result = functionMapper.updateByPrimaryKeySelective(function);
        }
        if (result > 0){
            return R.ok("功能保存成功");
        }
        return R.error("功能保存失败");
    }
    public R delete(List<Long> idList){
        int result = functionMapper.delete(idList);
        if ( result ==0){
            return R.error("删除功能失败");
        }
        return R.ok("成功删除"+result+"条功能");
    }
    public R forbidden(List<Long> idList,int type){
        int result = 0;
        if (type ==1){
            //type =1,则启用
            result = functionMapper.enable(idList);
        }
        if(type ==0){
            //type = 0 ,则禁用
            result = functionMapper.disable(idList);
        }
        if (result == 0){
            return R.ok("功能禁用/启用失败");
        }
        String str = new StringBuilder().append("功能禁用/启用成功").append(result)
                .append("条").toString();
        return R.ok(str);


    }
}
