package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class WeldedAd {
    private final int testIncome = 1000;
    private double videoIncome;
    private double adGiverRating;
    private int hren;

    public void setTestComputeIncome()
    {
        videoIncome = testIncome/adGiverRating;
    }

    public WeldedAd() {
        adGiverRating = Math.random()*5;
        setTestComputeIncome();
    }

    public double getVideoIncome() {
        return videoIncome;
    }

    public void setVideoIncome(double videoIncome) {
        this.videoIncome = videoIncome;
    }

    public double getAdGiverRating() {
        return adGiverRating;
    }

    public void setAdGiverRating(double adGiverRating) {
        this.adGiverRating = adGiverRating;
    }

}
