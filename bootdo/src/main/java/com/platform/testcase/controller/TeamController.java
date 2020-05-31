package com.platform.testcase.controller;

import com.bootdo.common.utils.R;
import com.bootdo.common.utils.StringUtils;
import com.platform.testcase.dao.TeamMapper;
import com.platform.testcase.pojo.Team;
import com.platform.testcase.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/testplatform/team")
@Controller
public class TeamController {
    @Autowired
    TeamMapper teamMapper;

    @Autowired
    ITeamService iTeamService;


    @RequestMapping("/add")
    @ResponseBody
    public R addTeam(Team team){
        if (null == team && StringUtils.isBlank(team.getTeamName())  );

        return null;
    }




}
