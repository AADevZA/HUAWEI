package com.example.hms4.cordova.push;

import android.content.Intent;
import android.util.Log;

import com.huawei.cordovahmspushplugin.CordovaHMSPushPlugin;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class MessageService extends HmsMessageService {

    private static final String TAG = MessageService.class.getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        if (remoteMessage != null) {
            String message = remoteMessage.getData();
            Log.d(TAG, message);
            CordovaHMSPushPlugin.returnMessage(message);
        }
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        if (s != null) {
            Log.d(TAG, "token:" + s);
        }
    }
}
