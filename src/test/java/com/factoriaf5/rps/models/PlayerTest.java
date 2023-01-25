package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {

    private Player player1;

    public PlayerTest() {
        this.player1 = new Player();
    }

    @Test
    public void test_player_can_choose_rock() {

        Figure rockPlayer1 = player1.choose("roca");
        assertTrue(rockPlayer1 instanceof Rock);
        assertEquals("roca", rockPlayer1.getType());
    }

    @Test
    public void test_player_can_choose_paper() {

        Figure paperPlayer1 = player1.choose("papel");
        assertTrue(paperPlayer1 instanceof Paper);
        assertEquals("papel", paperPlayer1.getType());
    }

    @Test
    public void test_player_can_choose_scissors() {

        Figure scissorsPlayer1 = player1.choose("tijeras");
        assertTrue(scissorsPlayer1 instanceof Scissors);
        assertEquals("tijeras", scissorsPlayer1.getType());
    }
}