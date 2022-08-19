package fr.destouesse.testalarmmanager.presentation.main;

public interface IMainPresenter {
    void onCreate();

    void onRestart();

    void onResume();

    void onPause();

    void onDestroy();

    void startAlarmManager();
}
