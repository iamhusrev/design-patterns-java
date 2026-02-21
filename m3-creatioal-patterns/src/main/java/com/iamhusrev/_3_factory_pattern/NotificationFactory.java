package com.iamhusrev._3_factory_pattern;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void sendNotification() {
        Notification n = createNotification();
        n.notifyUser();
    }
}
