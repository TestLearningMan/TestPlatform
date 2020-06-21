package com.platform.testcase.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.platform.testcase.pojo.TeamMember;
import com.platform.testcase.service.ITeamMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/testplatform/teamMember")
public class TeamMemberController {

    @Autowired
    ITeamMember iTeamMember;

    @RequestMapping("/add")
    @ResponseBody
    public R add(TeamMember member){
        if (null == member || member.getTeamId() == null ||member.getTesterId() == null){
            R.error("请重新选择团队成员进行新增操作");
        }
        member.setModifierId(ShiroUtils.getUserId());
        member.setCreatorId(ShiroUtils.getUserId());
        return iTeamMember.add(member);
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(TeamMember member){
        if (null == member || member.getTeamId() == null ||member.getTesterId() == null){
            R.error("请重新选择团队成员进行修改操作");
        }
        member.setModifierId(ShiroUtils.getUserId());
        return iTeamMember.update(member);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(List<TeamMember> members){
        if ( null == members || members.size() == 0 ){
            return R.error("需要删除团队成员不能为空");
        }
        return iTeamMember.delete(members);
    }

    @RequestMapping("/List")
    @ResponseBody
    public R list(Map<String,Object> map){
        Query query = new Query(map);
        PageUtils pageUtils = new PageUtils(iTeamMember.list(query),iTeamMember.count(query));
        R r=new R();
        r.put("data",pageUtils);
        return r;
    }

}
