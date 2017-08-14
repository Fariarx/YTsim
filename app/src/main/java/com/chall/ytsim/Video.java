package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class Video {

    private double ConstMarkCoeff = 0.08;// Будет постоянно умножаться на число просмотров за тик, общее число оценивших
    //Likes =
    final String name;
    private int watchCount;
    private double likes;
    private double dislikes;
    private int DateUploadMinutes;
    private double videoQuality;//Меняется в методе с расчётом этого параметра


    public Video(String name, double videoQuality, int Days, int Minutes) {
        this.name = name;
        likes = 0;
        dislikes = 0;
        watchCount = 0;
        this.videoQuality = videoQuality;
        DateUploadMinutes = Minutes + Days*1440;
    }

    public void ComputeLikesDislikes(double AuditLoyality, int WatchesForTick) {
        likes += WatchesForTick*ConstMarkCoeff*AuditLoyality/100;
        dislikes += WatchesForTick*ConstMarkCoeff*(100 - AuditLoyality)/100;
    }

    public int getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    public double getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public double getVideoQuality() {
        return videoQuality;
    }
}
