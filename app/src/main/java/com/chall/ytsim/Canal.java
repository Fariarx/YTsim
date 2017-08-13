package com.chall.ytsim;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class Canal {
    String nameCanal;
    Bitmap iconCanal = null;
    int ratingCanal;
    //
    List<Video> ListVideo;
    Auditory auditory;
    YouTubeAd youTubeAd;
    public TechsAndSoft techsAndSoft;
    YouTuber youTuber;
    ItemsSourceTech techItems;
    //
    double CommonConstForTechAndSoft;

    public Canal(String nameCanal)
    {
        techItems = new ItemsSourceTech();
        //
        this.nameCanal = nameCanal;
        this.ratingCanal = 0;
        ListVideo = new ArrayList<>();
        auditory = new Auditory();
        techsAndSoft = new TechsAndSoft(techItems.getCameras(0),techItems.getComps(0),techItems.getMicrophones(0),techItems.getSoftMusic(0),techItems.getSoftVideo(0));
        youTubeAd = new YouTubeAd();
        youTuber = new YouTuber(100,10);
    }
    void Tick(int minutes,int days)
    {

    }
    void CaptureVideo()
}
