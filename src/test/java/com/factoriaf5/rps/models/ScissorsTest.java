package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScissorsTest {
    
    @Test
    public void misTijeras_is_tijeras() {
        Scissors misTijeras = new Scissors();
        assertTrue(misTijeras instanceof Scissors);
        assertEquals("tijeras", misTijeras.getType());
   }
}
