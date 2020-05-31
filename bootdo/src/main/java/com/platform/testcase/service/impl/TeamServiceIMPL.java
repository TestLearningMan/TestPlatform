package com.platform.testcase.service.impl;

import com.platform.testcase.dao.TeamMapper;
import com.platform.testcase.pojo.Team;
import com.platform.testcase.service.ITeamService;
import com.google.common.base.Splitter;
import com.platform.testcase.dao.TeamMapper;
import com.platform.testcase.service.IProductService;
import com.platform.testcase.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootdo.common.utils.*;
import java.util.List;
import java.util.Map;

@Service
public class TeamServiceIMPL implements ITeamService {
    @Autowired
    TeamMapper teamMapper;

    public R save(Team team){
        String teamName = team.getTeamName();
        if (null == team.getId() || team.getId() == 0 ){
            //团队ID为空，则新增团队
            if (teamMapper.isExist(teamName) == 1){
                return R.error("团队名称已存在");
            }
            teamMapper.insertSelective(team);
        }

        return null;
    }



}
