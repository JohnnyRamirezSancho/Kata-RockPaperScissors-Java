package com.factoriaf5.rps.models;

public class Player {
    private String[] figures = { "roca", "papel", "tijeras", "lagarto", "Spock"};
    private int index = (int) (Math.random() * figures.length);

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
        if (string == "lagarto") {
            return new Lizard();
        }
        if (string == "Spock") {
            return new Spock();
        }
        return null;
    }
}
