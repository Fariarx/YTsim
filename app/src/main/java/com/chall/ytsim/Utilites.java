package com.chall.ytsim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chall on 12.08.2017.
 */

public class Utilites {

    List<BaseTech> comps;
    List<BaseTech> cameras;
    List<BaseTech> softVideo;

    public Utilites()
    {
        setComps();
        setCameras();
        setSoftVideo();
    }

    void setComps()
    {
        comps = new ArrayList<BaseTech>();
        comps.add(new BaseTech("NextFuture",70,1));
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

    BaseTech getComps(int index)
    {
        return comps.get(index);
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
