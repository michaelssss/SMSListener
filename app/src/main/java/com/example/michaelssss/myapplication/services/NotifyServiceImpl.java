package com.example.michaelssss.myapplication.services;

import android.telephony.SmsMessage;

/**
 * Created by michaelssss on 2017/6/3.
 */

public class NotifyServiceImpl implements NotifyService {
    @Override
    public void notifyOnReceivedMessage(SmsMessage message) {
        System.out.println("hello world\r\n" + message.getMessageBody());
    }

    @Override
    public void notifyOnPhoneAttach(String phoneNumber) {

    }
}
