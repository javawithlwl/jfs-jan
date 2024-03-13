package com.careerit.jfs.interview;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
final class Planet{
    private final String name;
    private final double mass;
    private final double radius;

    public Planet(String name, double mass, double radius){
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public Planet changeName(String name){
        return new Planet(name, mass, radius);
    }

}
public class ImmutableClsManager {

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 5.97e24, 6.371e6);
        earth = earth.changeName("EarthWorld");
        System.out.println(earth);

    }
}
