package com.ccclubs.tp.model;

import java.util.Date;

public class CsProjectPerson {
    private Long csppId;

    private Long csppProjectInfo;

    private Long csppMember;

    private Long csppUnitPerson;

    private Date csppAddTime;

    private String csppAddUser;

    public Long getCsppId() {
        return csppId;
    }

    public void setCsppId(Long csppId) {
        this.csppId = csppId;
    }

    public Long getCsppProjectInfo() {
        return csppProjectInfo;
    }

    public void setCsppProjectInfo(Long csppProjectInfo) {
        this.csppProjectInfo = csppProjectInfo;
    }

    public Long getCsppMember() {
        return csppMember;
    }

    public void setCsppMember(Long csppMember) {
        this.csppMember = csppMember;
    }

    public Long getCsppUnitPerson() {
        return csppUnitPerson;
    }

    public void setCsppUnitPerson(Long csppUnitPerson) {
        this.csppUnitPerson = csppUnitPerson;
    }

    public Date getCsppAddTime() {
        return csppAddTime;
    }

    public void setCsppAddTime(Date csppAddTime) {
        this.csppAddTime = csppAddTime;
    }

    public String getCsppAddUser() {
        return csppAddUser;
    }

    public void setCsppAddUser(String csppAddUser) {
        this.csppAddUser = csppAddUser == null ? null : csppAddUser.trim();
    }
}