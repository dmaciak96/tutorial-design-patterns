package com.example.designpatterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        var hole = new RoundHole(5);
        var roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        var smallSquarePeg = new SquarePeg(5);
        var largeSquarePeg = new SquarePeg(10);

        //Niezgodne typy
        //hole.fits(smallSquarePeg);

        var smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
        var largePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(hole.fits(smallPegAdapter));
        System.out.println(hole.fits(largePegAdapter));
    }
}
