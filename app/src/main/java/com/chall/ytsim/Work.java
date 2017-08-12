package com.chall.ytsim;

import java.util.Random;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class Work {
    private int IncomeFor7days;
    private final int ForChangeWealth= 5;//$
    private Random ff;

    public Work(int IncomeFor7days) {
        this.IncomeFor7days = IncomeFor7days;
        ff = new Random();
    }
    void ChangeWealth()
    {
        if(ff.nextInt(4) >= 2)//шанс выпадения
        {
            if(ff.nextInt(4) >= 1)//шанс +-
                IncomeFor7days += ForChangeWealth;
            else IncomeFor7days -= ForChangeWealth;
        }
    }

    public int getIncomeFor7days() {
        return IncomeFor7days;
    }

    public void setIncomeFor7days(int incomeFor7days) {
        IncomeFor7days = incomeFor7days;
    }
}
