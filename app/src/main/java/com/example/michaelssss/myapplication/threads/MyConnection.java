package com.example.michaelssss.myapplication.threads;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Queue;

/**
 * Created by michaelssss on 2017/6/26.
 */

public class MyConnection implements Runnable {
    private URLConnection connection;
    private Queue<String> messageQueue;

    public MyConnection(URLConnection connection, Queue<String> messageQueue) {
        this.connection = connection;
        this.messageQueue = messageQueue;
    }

    @Override
    public void run() {
        try {
            connection.connect();
            while (true) {
                try (OutputStream outputStream = connection.getOutputStream();) {
                    while (!messageQueue.isEmpty()) {
                        outputStream.write((messageQueue.poll() + "\r\n").getBytes(Charset.forName("UTF-8")));
                    }
                    outputStream.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
