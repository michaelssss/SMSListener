package com.example.michaelssss.myapplication.threads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by michaelssss on 2017/6/26.
 */

public class ConnectionThreadPool {
    private ConnectionThreadPool() {
        this.pool = new ConcurrentHashMap<>();
    }

    private static final ConnectionThreadPool instance = new ConnectionThreadPool();
    private Map<String, Thread> pool;

    public Thread getThreadObject(String threadName) {
        if (!pool.containsKey(threadName)) {
            throw new RuntimeException("threadName :" + threadName + "is not initial");
        }
        return pool.get(threadName);
    }

    public Thread getThreadObject(Class<? extends Runnable> clazz) {
        String threadName = clazz.getSimpleName();
        return getThreadObject(threadName);
    }
}
