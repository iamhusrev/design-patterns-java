package com.iamhusrev._3_factory_pattern.email;

import com.iamhusrev._3_factory_pattern.Notification;
import com.iamhusrev._3_factory_pattern.NotificationFactory;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

