package com.example.michaelssss.myapplication.services;

import android.telephony.SmsMessage;

import com.alibaba.fastjson.JSON;
import com.example.michaelssss.myapplication.MyUrlConnection;

/**
 * Created by michaelssss on 2017/6/3.
 */

public class NotifyServiceImpl implements NotifyService {
    private MyUrlConnection urlConnection;

    public NotifyServiceImpl() {
        this.urlConnection = new MyUrlConnection();
    }

    @Override
    public void notifyOnReceivedMessage(SmsMessage message) {
        String messageContent = message.getMessageBody();
        String messageFrom = message.getOriginatingAddress();
        Long messageReciviedTime = message.getTimestampMillis();
        final Message message1 = new Message(messageReciviedTime, messageFrom, messageContent);
        new Thread(new Runnable() {
            @Override
            public void run() {
                urlConnection.sendMessage(JSON.toJSONString(message1));
            }
        }).start();
    }

    @Override
    public void notifyOnPhoneAttach(String phoneNumber) {

    }
}
