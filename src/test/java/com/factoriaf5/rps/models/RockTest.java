package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void myRock_is_Roca() {
        Rock myRock = new Rock();
        assertEquals("Roca", myRock.getName());
    }
}
