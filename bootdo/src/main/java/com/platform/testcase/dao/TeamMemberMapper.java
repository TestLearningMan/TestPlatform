package com.platform.testcase.dao;

import com.platform.testcase.pojo.TeamMember;

public interface TeamMemberMapper {
    int deleteByPrimaryKey(Long teamId);

    int insert(TeamMember record);

    int insertSelective(TeamMember record);

    TeamMember selectByPrimaryKey(Long teamId);

    int updateByPrimaryKeySelective(TeamMember record);

    int updateByPrimaryKey(TeamMember record);
}