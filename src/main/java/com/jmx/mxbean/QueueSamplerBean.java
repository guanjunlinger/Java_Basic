package com.jmx.mxbean;

import javax.management.MXBean;

@MXBean
public interface QueueSamplerBean {
     QueueSample getQueueSample();
     void clearQueue();
}

