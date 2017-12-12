package com.example.chewei.myrxjavaproject.com.example.api.base;

/**
 * 返回值包含：notification对象和responseData对象
 */

public class BaseResponse<T> {
    public Notification notification;
    public T responseData;

    public BaseResponse() {
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public T getResponseData() {
        return responseData;
    }
}
