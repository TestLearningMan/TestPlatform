package com.platform.testcase.service;

import com.bootdo.common.utils.R;

import java.lang.reflect.Member;
import java.util.List;

public interface ITeamMember {
    public R add(List<Member> members, Long teamId);

}
