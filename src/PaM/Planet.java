package PaM;

import java.util.ArrayList;
import java.util.List;

public class Planet extends OrbitalObject{

    private List<Moon> moons = new ArrayList<>();

    public double findDistance(Planet planet){
        return Math.abs(distanceFromSun - planet.getDistanceFromSun());
    }

    public Planet(double yearLength, double distanceFromSun, String name, List<Moon> moons) {
        this.yearLength = yearLength;
        this.distanceFromSun = distanceFromSun;
        this.name = name;
        this.moons = moons;
    }

    public double getYearLength() {
        return yearLength;
    }

    public void setYearLength(double yearLength) {
        this.yearLength = yearLength;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public void addMoon(Moon moon){
        moons.add(moon);
    }

    public int getAmountMoons(){
        return moons.size();
    }
}
