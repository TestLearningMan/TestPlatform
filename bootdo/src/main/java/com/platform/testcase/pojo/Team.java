package com.platform.testcase.pojo;

import java.util.Date;

public class Team {
    private Long id;

    private Long testerId;

    private Date createTime;

    private Date modifiedTime;

    private Long creatorId;

    private Long modifierId;

    public Team(Long id, Long testerId, Date createTime, Date modifiedTime, Long creatorId, Long modifierId) {
        this.id = id;
        this.testerId = testerId;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.creatorId = creatorId;
        this.modifierId = modifierId;
    }

    public Team() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTesterId() {
        return testerId;
    }

    public void setTesterId(Long testerId) {
        this.testerId = testerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }
}