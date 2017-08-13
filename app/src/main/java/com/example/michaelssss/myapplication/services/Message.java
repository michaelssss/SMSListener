package com.example.michaelssss.myapplication.services;

/**
 * Created by michaelssss on 2017/7/29.
 */

public class Message {
    private long reciviedTime;
    private String from;
    private String reciviedContent;


    public Message(long reciviedTime, String from, String reciviedContent) {
        this.reciviedTime = reciviedTime;
        this.from = from;
        this.reciviedContent = reciviedContent;
    }

    public Message() {
    }

    public String getReciviedContent() {
        return reciviedContent;
    }

    public String getFrom() {
        return from;
    }

    public long getReciviedTime() {
        return reciviedTime;
    }
}
