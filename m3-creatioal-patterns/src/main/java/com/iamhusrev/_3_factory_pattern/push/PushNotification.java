package com.iamhusrev._3_factory_pattern.push;

import com.iamhusrev._3_factory_pattern.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a Push notification");
    }
}
