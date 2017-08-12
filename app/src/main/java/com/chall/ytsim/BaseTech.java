package com.chall.ytsim;

/**
 * Created by КапляНикотина on 12.08.2017.
 */

public class BaseTech {
    private String techName;
    private double cost;
    private double cofForTech;
    public BaseTech(String nameTech,double cost,double cofForTech)
    {
        this.techName = nameTech;
        this.cost = cost;
        this.cofForTech = cofForTech;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCofForTech() {
        return cofForTech;
    }

    public void setCofForTech(double cofForTech) {
        this.cofForTech = cofForTech;
    }
}
