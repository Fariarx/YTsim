package com.chall.ytsim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Canal canal;
    int timeTickInMilisec = 50;
    int minetsForTick = 5;
    int minutes = 540;
    int day = 1;

    //
    Timer mTimer = new Timer();
    TimerTaskTick mMyTimerTask;
    TextView timeSet;
    TextView timeDay;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setResours();

        canal = new Canal("New Canal");
        startTimer();
    }
    ///////////////////////
    private void setResours() {
        timeSet = (TextView) findViewById(R.id.textView4);
        timeDay = (TextView) findViewById(R.id.textView3);
        timeDay.setText(getString(R.string.day) + day);
    }
    private class TimerTaskTick extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Tick();
                    startTimer();
                }
            });

        }
    }
    private void startTimer() {
        mMyTimerTask = new TimerTaskTick();
        mTimer.schedule(mMyTimerTask, timeTickInMilisec);
    }
    private int hours = 0;
    private int minutesInNowHour = 0;
    private void setdate() {
        minutes+=minetsForTick;
        if(minutes == 1440) {
            day++;
            minutes = 0;
            timeDay.setText(getString(R.string.day) + day);
        }
        hours = (int) minutes/60;
        if(hours<10) {
            timeSet.setText(getString(R.string.time) + "0" + hours + ":");
        }
        else
            timeSet.setText(getString(R.string.time) + hours + ":");
        minutesInNowHour = minutes-(hours*60);
        if(minutesInNowHour<10) {
            timeSet.setText(timeSet.getText() + "0" + minutesInNowHour);
        }
        else
            timeSet.setText(timeSet.getText() + String.valueOf( minutesInNowHour));
    }
    ///////////////////////
    void Tick()
    {
        setdate();
        canal.Tick(minutes,day);
    }
}
