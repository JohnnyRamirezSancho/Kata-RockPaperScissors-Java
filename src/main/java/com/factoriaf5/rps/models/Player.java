package com.factoriaf5.rps.models;

public class Player {

public Figure choose(String string) {
    if(string == "roca") {
        return new Rock();
    }
    if(string == "papel") {
        return new Paper();
    }
    if(string == "tijeras") {
        return new Scissors();
    }
    return null;
}

}
