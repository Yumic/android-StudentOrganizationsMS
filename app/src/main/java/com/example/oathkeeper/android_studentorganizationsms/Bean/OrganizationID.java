package com.example.oathkeeper.android_studentorganizationsms.Bean;

import java.util.Date;

/**
 * 组织的实体类
 * Created by Oathkeeper on 2015/9/9.
 */
public class OrganizationID {

    //组织ID和学校ID 共同作为主键
    private String organizationID;
    private String SchoolID;

    //创始人 可有多个 用数组存储
    private String[] founder;
    //组织名 对外展示
    private String organizationName;
    //组织创建时间
    private Date foundedTime;
    //组织介绍
    private String organizationDetail;
    //组织类别
    private String organizationCategory;

    public OrganizationID() {

    }

    public String getOrganizationID() {
        return organizationID;
    }

    public String getSchoolID() {
        return SchoolID;
    }

    public String[] getFounder() {
        return founder;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public Date getFoundedTime() {
        return foundedTime;
    }

    public String getOrganizationDetail() {
        return organizationDetail;
    }

    public String getOrganizationCategory() {
        return organizationCategory;
    }

    public void setSchoolID(String schoolID) {
        SchoolID = schoolID;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setFoundedTime(Date foundedTime) {
        this.foundedTime = foundedTime;
    }

    public void setFounder(String[] founder) {
        this.founder = founder;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public void setOrganizationDetail(String organizationDetail) {
        this.organizationDetail = organizationDetail;
    }

    public void setOrganizationCategory(String organizationCategory) {
        this.organizationCategory = organizationCategory;
    }
}
