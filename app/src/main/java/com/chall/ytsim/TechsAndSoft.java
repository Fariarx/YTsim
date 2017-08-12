package com.chall.ytsim;

import java.util.List;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class TechsAndSoft {
   private BaseTech camera;
   private BaseTech computer;
   private BaseTech microphone;
   private BaseTech softMusic;
   private BaseTech softVideo;

    public TechsAndSoft(BaseTech camera, BaseTech computer, BaseTech microphone, BaseTech softMusic, BaseTech softVideo) {
        this.camera = camera;
        this.computer = computer;
        this.microphone = microphone;
        this.softMusic = softMusic;
        this.softVideo = softVideo;
    }


    public BaseTech getCamera() {
        return camera;
    }

    public void setCamera(BaseTech camera) {
        this.camera = camera;
    }

    public BaseTech getComputer() {
        return computer;
    }

    public void setComputer(BaseTech computer) {
        this.computer = computer;
    }

    public BaseTech getMicrophone() {
        return microphone;
    }

    public void setMicrophone(BaseTech microphone) {
        this.microphone = microphone;
    }

    public BaseTech getSoftMusic() {
        return softMusic;
    }

    public void setSoftMusic(BaseTech softMusic) {
        this.softMusic = softMusic;
    }

    public BaseTech getSoftVideo() {
        return softVideo;
    }

    public void setSoftVideo(BaseTech softVideo) {
        this.softVideo = softVideo;
    }
}
