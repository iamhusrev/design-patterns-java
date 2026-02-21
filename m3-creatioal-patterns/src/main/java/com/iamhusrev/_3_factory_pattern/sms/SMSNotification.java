package com.iamhusrev._3_factory_pattern.sms;

import com.iamhusrev._3_factory_pattern.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
