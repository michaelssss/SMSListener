package com.example.michaelssss.myapplication;

import android.util.Log;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.Charset;

/**
 * Created by michaelssss on 2017/7/29.
 */

public class MyUrlConnection {

    public void sendMessage(String message) {
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) URI.create("http://michaelssss.com:8080/logsms").toURL().openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setDoOutput(true);
            try (OutputStream outputStream = urlConnection.getOutputStream()) {
                outputStream.write(message.getBytes(Charset.forName("UTF-8")));
                outputStream.flush();
                urlConnection.getResponseCode();
            }
        } catch (Exception e) {
            Log.i("url error", "sendMessage: ", e);
        }
    }
}
