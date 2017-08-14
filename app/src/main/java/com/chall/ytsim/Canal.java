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
    void Tick(int days, int minutes)
    {   int ChangeSeparatewatchCount;
        if(days%7==0)
        {
            youTuber.sevenDaysPastSet();
        }
        //YouTubeAdIncome - в последнюю очередь после отработки просмотров
        for(Video vid: ListVideo) {
            //ChangeSeparatewatchCount = vid.getTestWatchCoeff();
            ComputeWatchesForConcreteVideoChangeAffecttedByAudtoryNumerosityAndDateOfUpload(days, minutes, auditory.getNumerosity());
            vid.setWatchCount(vid.getWatchCount() + ChangeSeparatewatchCount);
            vid.ComputeLikesDislikes(auditory.getLoyality(), ChangeSeparatewatchCount);
        }

    }

    void CreateVideo(String name, int days, int minutes) {
        Video newvid = new Video(name, techsAndSoft.getCofForAllTech(), days, minutes);
    }

    void ComputeWatchesForConcreteVideoChangeAffecttedByAudtoryNumerosityAndDateOfUpload(int days, int minutes, int numerosity, double loyality){

    }
}
