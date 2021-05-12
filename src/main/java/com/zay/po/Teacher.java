package com.zay.po;

import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
    private Integer tId;

    private String tName;

    private String tSubject;

    private String tPassword;

    private String tSex;

    private String tAddress;

    private Date tBirth;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettSubject() {
        return tSubject;
    }

    public void settSubject(String tSubject) {
        this.tSubject = tSubject;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public Date gettBirth() {
        return tBirth;
    }

    public void settBirth(Date tBirth) {
        this.tBirth = tBirth;
    }
}