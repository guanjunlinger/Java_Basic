package com.jmx.notification;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.jmx.notification:type=Hello");
        Hello mbean = new Hello(Executors.newSingleThreadExecutor());
        mbean.addNotificationListener(new PropertyChangeNotificationListener(), null, 1);
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
