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

    void computeAuditoryChange(int dRating) {

    }
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
        this.loyality = loyality;
    }

    public double getIncreaseDecrease() {
        return increaseDecrease;
    }

    public void setIncreaseDecrease(double increaseDecrease) {
        this.increaseDecrease = increaseDecrease;
    }
}
