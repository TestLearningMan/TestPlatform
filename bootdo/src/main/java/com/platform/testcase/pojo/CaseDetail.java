package com.platform.testcase.pojo;

import java.util.Date;

public class CaseDetail {
    private Long id;

    private Long functionId;

    private Integer level;

    private String imgPath;

    private String precondition;

    private String title;

    private String excStep;

    private String expResults;

    private String remarks;

    private Integer status;

    private String apitestCaseid;

    private String unittestCaseid;

    private String uitestCaseid;

    private Long backdevId;

    private String relateDemand;

    private Long frontdevId;

    private Long productmanId;

    private Date createTime;

    private Date modifiedTime;

    private Long creatorId;

    private Long modifierId;

    public CaseDetail(Long id, Long functionId, Integer level, String imgPath, String precondition, String title, String excStep, String expResults, String remarks, Integer status, String apitestCaseid, String unittestCaseid, String uitestCaseid, Long backdevId, String relateDemand, Long frontdevId, Long productmanId, Date createTime, Date modifiedTime, Long creatorId, Long modifierId) {
        this.id = id;
        this.functionId = functionId;
        this.level = level;
        this.imgPath = imgPath;
        this.precondition = precondition;
        this.title = title;
        this.excStep = excStep;
        this.expResults = expResults;
        this.remarks = remarks;
        this.status = status;
        this.apitestCaseid = apitestCaseid;
        this.unittestCaseid = unittestCaseid;
        this.uitestCaseid = uitestCaseid;
        this.backdevId = backdevId;
        this.relateDemand = relateDemand;
        this.frontdevId = frontdevId;
        this.productmanId = productmanId;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
        this.creatorId = creatorId;
        this.modifierId = modifierId;
    }

    public CaseDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getPrecondition() {
        return precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition == null ? null : precondition.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getExcStep() {
        return excStep;
    }

    public void setExcStep(String excStep) {
        this.excStep = excStep == null ? null : excStep.trim();
    }

    public String getExpResults() {
        return expResults;
    }

    public void setExpResults(String expResults) {
        this.expResults = expResults == null ? null : expResults.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApitestCaseid() {
        return apitestCaseid;
    }

    public void setApitestCaseid(String apitestCaseid) {
        this.apitestCaseid = apitestCaseid == null ? null : apitestCaseid.trim();
    }

    public String getUnittestCaseid() {
        return unittestCaseid;
    }

    public void setUnittestCaseid(String unittestCaseid) {
        this.unittestCaseid = unittestCaseid == null ? null : unittestCaseid.trim();
    }

    public String getUitestCaseid() {
        return uitestCaseid;
    }

    public void setUitestCaseid(String uitestCaseid) {
        this.uitestCaseid = uitestCaseid == null ? null : uitestCaseid.trim();
    }

    public Long getBackdevId() {
        return backdevId;
    }

    public void setBackdevId(Long backdevId) {
        this.backdevId = backdevId;
    }

    public String getRelateDemand() {
        return relateDemand;
    }

    public void setRelateDemand(String relateDemand) {
        this.relateDemand = relateDemand == null ? null : relateDemand.trim();
    }

    public Long getFrontdevId() {
        return frontdevId;
    }

    public void setFrontdevId(Long frontdevId) {
        this.frontdevId = frontdevId;
    }

    public Long getProductmanId() {
        return productmanId;
    }

    public void setProductmanId(Long productmanId) {
        this.productmanId = productmanId;
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