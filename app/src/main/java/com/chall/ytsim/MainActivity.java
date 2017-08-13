package com.chall.ytsim;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Canal canal;
    int minutes = 540;
    int day = 1;

    //Chronometer
    Chronometer e;
    int seconds = 0;
    long elapsedMillis = 0;
    int secondChange = 0;
    //
    TextView timeHours;
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
    void setResours() {
        e = (Chronometer) findViewById(R.id.chronometer2);
        timeHours = (TextView) findViewById(R.id.textView4);
        timeDay = (TextView) findViewById(R.id.textView5);
    }
    void startTimer() {
        //Chr tick
        e.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                elapsedMillis = SystemClock.elapsedRealtime()
                        - e.getBase();
                ///
                seconds = (int) (elapsedMillis / 1000);
                if(secondChange != seconds) {
                    TickChronometr();
                    secondChange = seconds;
                }
                setdate();
            }
        });
        e.setBase(SystemClock.elapsedRealtime());
        e.start();
    }
    void TickChronometr()
    {
        minutes++;
        if(minutes == 1440) {
            day++;
            minutes = 0;
        }
        if(minutes<10)
        timeHours.setText(getString(R.string.time)+ "0" + hour);
        else
            timeHours.setText(getString(R.string.time) + hour);
        timeDay.setText(getString(R.string.day) + day);
    }
    void setdate() {
        canal.Tick(minutes,day);

    }
}
