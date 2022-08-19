package fr.destouesse.testalarmmanager.view.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import fr.destouesse.testalarmmanager.R;
import fr.destouesse.testalarmmanager.presentation.main.IMainPresenter;
import fr.destouesse.testalarmmanager.presentation.main.MainPresenter;

public class MainActivity extends AppCompatActivity implements  IMainActivity{
    private static final String LOG_TAG = "MainPresenter";
    private IMainPresenter presenter;
    private Button setAlarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG,"onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAlarmManager = findViewById(R.id.setAlarmManager);
        setAlarmManager.setOnClickListener(v -> {
            presenter.startAlarmManager();
        });

        presenter = new MainPresenter(this,this.getBaseContext());
        presenter.onCreate();
    }

    @Override
    protected void onRestart() {
        Log.d(LOG_TAG,"onRestart");

        super.onRestart();
        presenter.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG,"onResume");

        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(LOG_TAG,"onPause");

        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d(LOG_TAG,"onDestroy");

        super.onDestroy();
        presenter.onDestroy();
    }
}