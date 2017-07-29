package com.example.michaelssss.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Arrays;

import static android.Manifest.permission.INTERNET;
import static android.Manifest.permission.READ_SMS;
import static android.Manifest.permission.RECEIVE_SMS;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Main2Activity", "check permission");
        if (ContextCompat.checkSelfPermission(this, RECEIVE_SMS) == PackageManager.PERMISSION_DENIED ||
                ContextCompat.checkSelfPermission(this, READ_SMS) == PackageManager.PERMISSION_DENIED ||
                ContextCompat.checkSelfPermission(this, INTERNET) == PackageManager.PERMISSION_DENIED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.RECEIVE_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this, new String[]{RECEIVE_SMS, READ_SMS, INTERNET}, 1);
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Log.i("Main2Activity", "get permission");
                } else {
                    Log.i("Main2Activity", "not Get permission");
                }
            }
            default: {
                Log.i("Main2A permissions", Arrays.toString(permissions));
                Log.i("Main2A grantResults ", Arrays.toString(grantResults));
            }
        }
    }
}
