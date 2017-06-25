package com.example.michaelssss.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;

import com.example.michaelssss.myapplication.services.NotifyService;
import com.example.michaelssss.myapplication.services.NotifyServiceImpl;

/**
 * Created by michaelssss on 2017/6/3.
 */

public class SmsLisenter extends BroadcastReceiver {
    private NotifyService service;

    public SmsLisenter() {
        this.service = new NotifyServiceImpl();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(Telephony.Sms.Intents.SMS_RECEIVED_ACTION)) {
            Bundle bundle = intent.getExtras();
            if (null != bundle) {
                Object[] pdusData = (Object[]) bundle.get("pdus");
                for (Object o : pdusData) {
                    service.notifyOnReceivedMessage(SmsMessage.createFromPdu((byte[]) o));
                }
            }
        }
    }
}
