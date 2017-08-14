package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class YouTubeAd {
    private double StartSeparateWatchIncome = 0.002; //dollars
   // private final double CanalCountCoeff = 1000; //test
   private double SeparateWatchIncome;

    public YouTubeAd() {
        //computeIncome(canalWatchCount); тут ещё надо подумать
    }

    public double getStartSeparateWatchIncome() {
        return StartSeparateWatchIncome;
    }

//    public void computeIncome(int canalWatchCount) {
//        SeparateWatchIncome = StartSeparateWatchIncome + canalWatchCount/CanalCountCoeff;
//    }
}
