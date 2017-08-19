package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class Auditory {
    private int numerosity;
    private double loyality; //ОТ 0 ДО 10!
    private double increaseDecrease;


    public Auditory() {
        numerosity = 0;
        loyality = 0;
        increaseDecrease = 0;
    }

    void ComputeLoyality(int videoQuality) {

    }

    void computeIncreaseDecrease(Video video) {

    }

    void computeIncreaseDecreaseForTick

    //Дальше - автосозданные свойства, ничего особо важного
    public int getNumerosity() {
        return numerosity;
    }

    public void setNumerosity(int numerosity) {
        this.numerosity = numerosity;
    }

    public double getLoyality() {

        return loyality;
    }

    public void setLoyality(double loyality) {
        //делаем так, чтобы лояльность не переваливала за сотку и чтобы не была меньше 0
        if(loyality>=100)
            this.loyality = 100;
        else if(loyality<=0)
            this.loyality = 0;
        else this.loyality = loyality;
    }

    public double getIncreaseDecrease() {
        return increaseDecrease;
    }

    public void setIncreaseDecrease(double increaseDecrease) {
        this.increaseDecrease = increaseDecrease;
    }
}
