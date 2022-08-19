package fr.destouesse.testalarmmanager.model;

import static android.content.Context.ALARM_SERVICE;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Calendar;

public class AlarmManagerCreator {
    private static final String LOG_TAG = "AlarmManagerCreator";
    public static final int ALARM_CODE = 1234;

    public static void createAlarmManager(Context context , Calendar cal){
        Log.d(LOG_TAG,"createAlarmManager");
        Intent intent ;
        PendingIntent pending;

        intent = new Intent(context, AlarmReceiver.class);
        pending=PendingIntent.getBroadcast(
                context,
                ALARM_CODE,
                intent,
                PendingIntent.FLAG_MUTABLE);


        AlarmManager alarmManager=(AlarmManager)context.getSystemService(ALARM_SERVICE);
        alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                cal.getTimeInMillis(),
                pending);
    }
}
