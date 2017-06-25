package com.example.michaelssss.myapplication.services;

import android.telephony.SmsMessage;

/**
 * Created by michaelssss on 2017/6/3.
 */

public interface NotifyService {
    /**
     * 当接收到短信的时候
     */
    void notifyOnReceivedMessage(SmsMessage message);

    void notifyOnPhoneAttach(String phoneNumber);
}
