package com.iamhusrev._3_factory_pattern.push;

import com.iamhusrev._3_factory_pattern.Notification;
import com.iamhusrev._3_factory_pattern.NotificationFactory;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
