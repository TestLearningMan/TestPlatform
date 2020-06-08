package com.platform.testcase.service.impl;

import com.bootdo.common.utils.R;
import com.platform.testcase.pojo.TeamMember;
import com.platform.testcase.service.ITeamMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class TeamMemberImpl implements ITeamMember {
    @Autowired
    ITeamMember iTeamMember;

    @RequestMapping("/add")
    @ResponseBody
    public R add(List<TeamMember> members,Long teamId){
        if (null == members||members.size() == 0){
            R.error("请重新选择团队成员");
        }

        return null;
    }
}
