package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class Video {
    final String name;
    private int watchCount;
    private int likes;
    private int dislikes;
    private int videoQuality;//Меняется в методе с расчётом этого параметра


    public Video(String name) {
        this.name = name;
        likes = 0;
        dislikes = 0;
        watchCount = 0;
        CaptureVideo();
    }

    private void CaptureVideo() {
        //TODO: add formula and arguments
        //videoQuality = SomeFormuka
    }

    public int getWatchCount() {
        return watchCount;
    }

    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getVideoQuality() {
        return videoQuality;
    }
}
