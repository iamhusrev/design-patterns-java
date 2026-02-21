package com.iamhusrev._3_factory_pattern.email;

import com.iamhusrev._3_factory_pattern.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}

