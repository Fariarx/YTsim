package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class YouTuber {
    int money;
    Work work;
    public YouTuber(int money,int IncomeFor7days)
    {
        this.money = money;
        work = new Work(IncomeFor7days);
    }
    void sevenDaysPastSet()
    {
        work.ChangeWealth();
    }
}
