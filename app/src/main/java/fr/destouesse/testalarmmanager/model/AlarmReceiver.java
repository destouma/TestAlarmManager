package fr.destouesse.testalarmmanager.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver  extends BroadcastReceiver {
    private static final String LOG_TAG = "AlarmReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(LOG_TAG,"onReceive");
//        NotificationCreator.createNotification(context);
        NotificationCreator.createLockScreenNotification(context);
    }
}
