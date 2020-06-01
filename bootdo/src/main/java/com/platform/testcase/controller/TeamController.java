package com.platform.testcase.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.StringUtils;
import com.platform.testcase.dao.TeamMapper;
import com.platform.testcase.pojo.Team;
import com.platform.testcase.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("/testplatform/team")
@Controller
public class TeamController {
    @Autowired
    TeamMapper teamMapper;

    @Autowired
    ITeamService iTeamService;


    @RequestMapping("/save")
    @ResponseBody
    public R addTeam(Team team){
        if (null == team || StringUtils.isBlank(team.getTeamName()) ){
            return R.error("团队信息或者团队名称不能为空");
        }
        if (teamMapper.isExist(team.getTeamName()) == 1){
            return R.error("团队名称已存在");
        }
        return iTeamService.save(team);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String ids){
        if (StringUtils.isBlank(ids)){
            return R.ok("请选择需要删除的团队");
        }
        return iTeamService.delete(ids);
    }

    @RequestMapping("/list")
    @ResponseBody
    public R List(Map<String,Object> param){
        Object limit = param.get("limit");
        if (null == limit || StringUtils.isBlank(limit.toString())){
            return R.error("页数不能为空");
        }
        Query query = new Query(param);
        PageUtils pageUtils = new PageUtils(
                iTeamService.list(query),iTeamService.count(query));
        R result = new R();
        result.put("pageUtils",pageUtils);
        return result;
    }


}
