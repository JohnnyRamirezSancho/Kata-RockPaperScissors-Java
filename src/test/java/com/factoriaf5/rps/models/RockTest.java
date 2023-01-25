package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void myRock_is_Roca() {
        Rock roca = new Rock();
        assertTrue(roca instanceof Rock);
        assertEquals("roca", roca.getType());
   }
}
