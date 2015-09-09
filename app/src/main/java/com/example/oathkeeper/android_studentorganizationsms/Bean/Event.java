package com.example.oathkeeper.android_studentorganizationsms.Bean;

import java.util.Date;

/**
 * 事件的实体类
 * Created by Oathkeeper on 2015/9/9.
 */
public class Event {

    //事件ID 主键
    private String eventID;
    //事件标题
    private String eventTitle;
    //事件详情
    private String eventDetail;
    //事件事件
    private String eventTime;
    //事件地点
    private String eventLocation;
    //事件状态 0-进行中 1-已完成 2- 中断
    private int eventStatus;
    //事件类别 0-组织内通知 1-组织内活动 2-校园活动
    private String eventCategory;
    //事件创建时间 自动生成
    private Date createdTime;
    //事件发起人
    private String studentID;

    //构造器
    public Event(String studentID, Date createdTime) {
        this.studentID = studentID;
        this.createdTime = createdTime;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void setEventStatus(int eventStatus) {
        this.eventStatus = eventStatus;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getEventID() {
        return eventID;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventDetail() {
        return eventDetail;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public int getEventStatus() {
        return eventStatus;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public String getStudentID() {
        return studentID;
    }
}
