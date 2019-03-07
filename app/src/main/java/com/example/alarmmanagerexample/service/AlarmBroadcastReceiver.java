package com.example.alarmmanagerexample.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


import com.example.alarmmanagerexample.R;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    private final static int NOTICATION_ID = 222;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("AlarmBroadcastReceiver", "onReceive");

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, context.getString(R.string.notification_channel_id))
                .setSmallIcon(R.drawable.ic_love_p_64px) //알람 아이콘
                .setContentTitle("Title")  //알람 제목
                .setContentText("Text") //알람 내용
                .setPriority(NotificationCompat.PRIORITY_DEFAULT); //알람 중요도

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(NOTICATION_ID, builder.build()); //알람 생성
    }
}
