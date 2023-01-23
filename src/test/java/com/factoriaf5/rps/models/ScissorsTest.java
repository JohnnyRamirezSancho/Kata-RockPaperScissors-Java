package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScissorsTest {

    @Test
    public void myScissorsIsTijeras() {
        Scissors myScissors = new Scissors();
        assertEquals("Tijeras", myScissors.getName());
    }
    
}
