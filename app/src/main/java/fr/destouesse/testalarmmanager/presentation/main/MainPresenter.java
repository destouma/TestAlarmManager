package fr.destouesse.testalarmmanager.presentation.main;

import android.content.Context;
import android.util.Log;

import java.util.Calendar;

import fr.destouesse.testalarmmanager.model.AlarmManagerCreator;
import fr.destouesse.testalarmmanager.view.main.IMainActivity;

public class MainPresenter implements IMainPresenter{
    private static final String LOG_TAG = "MainPresenter";
    private static final int DELAY = 30;

    private IMainActivity view;
    private Context context;

    public MainPresenter(IMainActivity view, Context context){
        this.view = view;
        this.context = context;
    }

    @Override
    public void startAlarmManager(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.SECOND,DELAY);
        AlarmManagerCreator.createAlarmManager(context,cal);
    }

    @Override
    public void onCreate() {
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    public void onRestart() {
        Log.d(LOG_TAG, "onRestart");

    }

    @Override
    public void onResume(){
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onPause(){
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onDestroy(){
        Log.d(LOG_TAG, "onDestroy");
    }

}
