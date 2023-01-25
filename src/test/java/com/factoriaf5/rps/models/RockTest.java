package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void miRoca_is_roca() {
        Rock miRoca = new Rock();
        assertTrue(miRoca instanceof Rock);
        assertEquals("roca", miRoca.getType());
   }
}
