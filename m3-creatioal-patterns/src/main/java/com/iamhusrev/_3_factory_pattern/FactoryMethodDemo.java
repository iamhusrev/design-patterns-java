package com.iamhusrev._3_factory_pattern;

import com.iamhusrev._3_factory_pattern.push.PushNotificationFactory;
import com.iamhusrev._3_factory_pattern.sms.SMSNotificationFactory;
import com.iamhusrev._3_factory_pattern.email.EmailNotificationFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        factory.sendNotification();  // Sending an Email notification

        factory = new SMSNotificationFactory();
        factory.sendNotification();  // Sending an SMS notification

        factory = new PushNotificationFactory();
        factory.sendNotification();  // Sending a Push notification
    }
}
