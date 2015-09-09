package com.example.oathkeeper.android_studentorganizationsms.Bean;

/**
 * 用户的实体表，保存用户的各属性
 * Created by Oathkeeper on 2015/9/9.
 */
public class User {

    //学号和学校编号共同作为主键
    private String studentID;
    private String schoolID;

    //密码 通常不保存
    private String password;


    /**
     * 以下是会在组织中展示的资料
     */
    //名字
    private String studentName;
    //注册时首次绑定，日后可修改
    private String mobileNumber;
    //性别
    private boolean gender;
    //入学年份
    private String schoolYear;
    //学院
    private String academy;
    //专业
    private String major;
    //班级
    private String classes;
    //出生年月日，格式为19950101
    private String birthday;
    //家乡
    private String hometown;

    //构造器
    public User() {
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public boolean getGender() {
        return gender;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public String getAcademy() {
        return academy;
    }

    public String getMajor() {
        return major;
    }

    public String getClasses() {
        return classes;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getHometown() {
        return hometown;
    }
}
