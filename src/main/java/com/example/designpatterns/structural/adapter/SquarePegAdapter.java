package com.example.designpatterns.structural.adapter;


/**
 * Klasa adapter pozwala zmieścić kwadratowy klocek w okrągłym
 * otworze. Rozszerza klasę RoundPeg pozwalając obiektom-
 * adapterom zachowywać się jak okrągłe klocki.
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super((int) (squarePeg.getWidth() * Math.sqrt(2) / 2));
        this.squarePeg = squarePeg;
    }

    public int getRadius() {
        return (int) (squarePeg.getWidth() * Math.sqrt(2) / 2);
    }
}
