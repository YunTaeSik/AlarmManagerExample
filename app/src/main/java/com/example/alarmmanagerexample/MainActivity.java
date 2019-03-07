package com.example.alarmmanagerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.alarmmanagerexample.service.JobSchedulerStart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JobSchedulerStart.start(this);
    }
}
