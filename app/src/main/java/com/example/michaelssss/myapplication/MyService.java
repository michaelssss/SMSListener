package com.example.michaelssss.myapplication;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by michaelssss on 2017/6/3.
 */

public class MyService extends IntentService {
    public MyService() {
        this("MyService");
    }

    public MyService(String name) {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        final Runnable runnable = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Log.i("this is spada", "this is spada");
                        Thread.sleep(500L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
//        thread.start();
    }
}
