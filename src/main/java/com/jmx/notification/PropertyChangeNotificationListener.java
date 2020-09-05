package com.jmx.notification;

import javax.management.Notification;
import javax.management.NotificationListener;

public class PropertyChangeNotificationListener implements NotificationListener {
    @Override
    public void handleNotification(Notification notification, Object handback) {
        System.out.println("Thread:"+Thread.currentThread().getId()+"\n"+notification.getMessage());
    }
}
