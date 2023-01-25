package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class PaperTest {
    
    @Test
    public void miPapel_is_papel() {
        Paper miPapel = new Paper();
        assertTrue(miPapel instanceof Paper);
        assertEquals("papel", miPapel.getType());
   }
}
