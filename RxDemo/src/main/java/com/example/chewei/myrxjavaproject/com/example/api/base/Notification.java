package com.example.chewei.myrxjavaproject.com.example.api.base;

public class Notification {

    /**
     * notifCode : 0
     * notifInfo : success
     */

    private String notifCode="0";
    private String notifInfo;

    public Notification() {
    }

    public Notification(String notifCode, String notifInfo) {

        this.notifCode = notifCode;
        this.notifInfo = notifInfo;
    }

    public String getNotifInfo() {
        return notifInfo;
    }

    public String getNotifCode() {
        return notifCode;
    }

    public void setNotifCode(String notifCode) {
        this.notifCode = notifCode;
    }

    public void setNotifInfo(String notifInfo) {
        this.notifInfo = notifInfo;
    }
}
