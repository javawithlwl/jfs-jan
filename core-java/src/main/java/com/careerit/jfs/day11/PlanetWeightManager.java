package com.careerit.jfs.day11;

public class PlanetWeightManager {

    public static void main(String[] args) {

        double weightOnEarth = 60;
        double mass = weightOnEarth / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()){
            System.out.println("Weight on "+p+" is "+p.surfaceWeight(mass)+" kg");
        }
    }
}
