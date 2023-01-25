package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FigureTest {

    private Figure miJugada;

    @Test
    public void test_figure_is_Figure() {
        miJugada = new Rock();
        assertTrue(miJugada instanceof Figure);
    }

    @Test
    public void test_figure_is_Rock() {
        miJugada = new Rock();
        assertTrue(miJugada instanceof Rock);
        assertEquals("roca", miJugada.getType());
    }

    @Test
    public void test_figure_is_Paper() {
        miJugada = new Paper();
        assertTrue(miJugada instanceof Paper);
        assertEquals("papel", miJugada.getType());
    }

    @Test
    public void test_figure_is_Scissors() {
        miJugada = new Scissors();
        assertTrue(miJugada instanceof Scissors);
        assertEquals("tijeras", miJugada.getType());
    }
}
