package com.example;

public class Cone {
    public double calcVolume(double radius, double height) {
        double volume = 1.0/3.0 * Math.pow(radius, 2) * Math.PI * height;
        return volume;
    }
}
