package com.chall.ytsim;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class Canal {
    String nameCanal;
    Bitmap iconCanal;
    int ratingCanal;
    List<Video> ListVideo;
    //
    Auditory auditory;
    YouTubeAd youTubeAd;
    TechsAndSoft techsAndSoft;
    YouTuber youTuber;
    //
    double CommonConstForTechAndSoft;

    public Canal(String nameCanal)
    {
        this.nameCanal = nameCanal;

        ListVideo = new ArrayList<>();
    }

    void Tick()
    {

    }
}
