package com.example.michaelssss.myapplication.services;

/**
 * Created by michaelssss on 2017/7/29.
 */

public class Message {
    private String reciviedTime;
    private String from;
    private String reciviedContent;


    public Message(String reciviedTime, String from, String reciviedContent) {
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

    public String getReciviedTime() {
        return reciviedTime;
    }
}
