package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaperTest {

    @Test
    public void myPaperIsPapel() {
        Paper myPaper = new Paper();
        assertEquals("Papel", myPaper.getName());
    }
}
