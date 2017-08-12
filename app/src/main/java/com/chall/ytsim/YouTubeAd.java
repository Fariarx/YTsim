package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class YouTubeAd {
    private final double StartSeparateWatchIncome = 0.002; //dollars
    private final double CanalCountCoeff = 1000; //test

    public double getSeparateWatchIncome() {
        return SeparateWatchIncome;
    }

    public void setSeparateWatchIncome(double separateWatchIncome) {
        SeparateWatchIncome = separateWatchIncome;
    }

    private double SeparateWatchIncome;

    public YouTubeAd(int canalWatchCount) {
        //computeIncome(canalWatchCount); тут ещё надо подумать
    }

    public void computeIncome(int canalWatchCount) {
        SeparateWatchIncome = StartSeparateWatchIncome+canalWatchCount/CanalCountCoeff;
    }
}
