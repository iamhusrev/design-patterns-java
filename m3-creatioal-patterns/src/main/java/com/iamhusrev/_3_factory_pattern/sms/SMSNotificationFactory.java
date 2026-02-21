package com.iamhusrev._3_factory_pattern.sms;

import com.iamhusrev._3_factory_pattern.Notification;
import com.iamhusrev._3_factory_pattern.NotificationFactory;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
