package com.platform.testcase.service;

import com.bootdo.common.utils.R;
import com.platform.testcase.pojo.Function;

import java.util.List;

public interface IFunctionService {
    public R save(Function function);
    public R delete(List<Long> idList);
    public R forbidden(List<Long> idList,int type);
}
