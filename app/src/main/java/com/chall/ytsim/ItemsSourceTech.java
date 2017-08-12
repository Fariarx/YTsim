package com.chall.ytsim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class ItemsSourceTech {

   private List<BaseTech> comps;
    private List<BaseTech> microphones;
    private List<BaseTech> softMusic;
    private List<BaseTech> cameras;
    private List<BaseTech> softVideo;

    public ItemsSourceTech()
    {
        setComps();
        setMicrophones();
        setSoftMusic();
        setCameras();
        setSoftVideo();
    }

    void setComps()
    {
        comps = new ArrayList<BaseTech>();
        comps.add(new BaseTech("NextFuture",70,1));
    }
    void setMicrophones()
    {
        microphones = new ArrayList<BaseTech>();
        microphones.add(new BaseTech("Mic",12,1.4));
    }
    void setCameras()
    {
        cameras = new ArrayList<BaseTech>();
        cameras.add(new BaseTech("Sany1604",30,1.6));
        cameras.add(new BaseTech("PensionicSD-56",50,2.0));
    }

    void setSoftVideo()
    {
        softVideo = new ArrayList<BaseTech>();
        softVideo.add(new BaseTech("SanyVegos", 30,1.5));
    }
    void setSoftMusic()
    {
        softMusic = new ArrayList<BaseTech>();
        softMusic.add(new BaseTech("SoundC",15,1));
    }


    BaseTech getComps(int index)
    {
        return comps.get(index);
    }
    BaseTech getMicrophones(int index)
    {
        return microphones.get(index);
    }
    BaseTech getSoftMusic(int index)
    {
        return softMusic.get(index);
    }

    BaseTech getCameras(int index)
    {
        return cameras.get(index);
    }

    BaseTech getSoftVideo(int index)
    {
        return softVideo.get(index);
    }
}
