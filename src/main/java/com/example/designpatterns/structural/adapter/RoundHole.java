package com.example.designpatterns.structural.adapter;

public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.radius >= peg.getRadius();
    }

    public int getRadius() {
        return radius;
    }
}
