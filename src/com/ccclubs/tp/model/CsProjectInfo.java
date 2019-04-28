package com.ccclubs.tp.model;

import java.util.Date;

public class CsProjectInfo {
    private Long cspiId;

    private String cspiCode;

    private String cspiName;

    private Long cspiUnitInfo;

    private Long cspiMember;

    private Long cspiAduitMember;

    private Double cspiLimit;

    private Double cspiQuota;

    private Integer cspiPersonNum;

    private Date cspiBegintime;

    private Date cspiEndtime;

    private Short cspiAutoprove;

    private Short cspiEnable;

    private Date cspiAddTime;

    private String cspiAddUser;

    public Long getCspiId() {
        return cspiId;
    }

    public void setCspiId(Long cspiId) {
        this.cspiId = cspiId;
    }

    public String getCspiCode() {
        return cspiCode;
    }

    public void setCspiCode(String cspiCode) {
        this.cspiCode = cspiCode == null ? null : cspiCode.trim();
    }

    public String getCspiName() {
        return cspiName;
    }

    public void setCspiName(String cspiName) {
        this.cspiName = cspiName == null ? null : cspiName.trim();
    }

    public Long getCspiUnitInfo() {
        return cspiUnitInfo;
    }

    public void setCspiUnitInfo(Long cspiUnitInfo) {
        this.cspiUnitInfo = cspiUnitInfo;
    }

    public Long getCspiMember() {
        return cspiMember;
    }

    public void setCspiMember(Long cspiMember) {
        this.cspiMember = cspiMember;
    }

    public Long getCspiAduitMember() {
        return cspiAduitMember;
    }

    public void setCspiAduitMember(Long cspiAduitMember) {
        this.cspiAduitMember = cspiAduitMember;
    }

    public Double getCspiLimit() {
        return cspiLimit;
    }

    public void setCspiLimit(Double cspiLimit) {
        this.cspiLimit = cspiLimit;
    }

    public Double getCspiQuota() {
        return cspiQuota;
    }

    public void setCspiQuota(Double cspiQuota) {
        this.cspiQuota = cspiQuota;
    }

    public Integer getCspiPersonNum() {
        return cspiPersonNum;
    }

    public void setCspiPersonNum(Integer cspiPersonNum) {
        this.cspiPersonNum = cspiPersonNum;
    }

    public Date getCspiBegintime() {
        return cspiBegintime;
    }

    public void setCspiBegintime(Date cspiBegintime) {
        this.cspiBegintime = cspiBegintime;
    }

    public Date getCspiEndtime() {
        return cspiEndtime;
    }

    public void setCspiEndtime(Date cspiEndtime) {
        this.cspiEndtime = cspiEndtime;
    }

    public Short getCspiAutoprove() {
        return cspiAutoprove;
    }

    public void setCspiAutoprove(Short cspiAutoprove) {
        this.cspiAutoprove = cspiAutoprove;
    }

    public Short getCspiEnable() {
        return cspiEnable;
    }

    public void setCspiEnable(Short cspiEnable) {
        this.cspiEnable = cspiEnable;
    }

    public Date getCspiAddTime() {
        return cspiAddTime;
    }

    public void setCspiAddTime(Date cspiAddTime) {
        this.cspiAddTime = cspiAddTime;
    }

    public String getCspiAddUser() {
        return cspiAddUser;
    }

    public void setCspiAddUser(String cspiAddUser) {
        this.cspiAddUser = cspiAddUser == null ? null : cspiAddUser.trim();
    }
}