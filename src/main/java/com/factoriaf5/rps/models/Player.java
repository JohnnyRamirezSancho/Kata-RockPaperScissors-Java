package com.factoriaf5.rps.models;

public class Player {
    private String[] figures = { "roca", "papel", "tijeras" };
    private int index = (int) (Math.random() * 3);

    public Figure choose(String string) {
        if (string == null) {
            string = figures[index];
        }

        if (string == "roca") {
            return new Rock();
        }
        if (string == "papel") {
            return new Paper();
        }
        if (string == "tijeras") {
            return new Scissors();
        }
        return null;
    }
}
