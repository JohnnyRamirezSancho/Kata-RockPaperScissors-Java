package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Player;

public class GameTest {
    Player player1 = new Player();
    Player player2 = new Player();

    @Test
    public void game_have_two_players() {
        Game newGame = new Game(player1, player2, "roca", "tijeras");
        assertEquals(player1, newGame.getPlayer1());
        assertEquals(player2, newGame.getPlayer2());
    }

    @Test
    public void player1_choose_rock_and_player2_choose_scissors() {
        Game newGame = new Game(player1, player2, "roca", "tijeras");
        assertEquals("roca", newGame.getFigure1().getType());
        assertEquals("tijeras", newGame.getFigure2().getType());
    }

    @Test
    public void player1_choose_rock_and_player2_choose_scissors_win_player1() {
        Game newGame = new Game(player1, player2, "roca", "tijeras");
        assertEquals("Player1 win!", newGame.getWinner());
    }

    public void player1_choose_rock_and_player2_choose_paper_win_player2() {
        Game newGame = new Game(player1, player2, "roca", "papel");
        assertEquals("Player2 win!", newGame.getWinner());
    }

    public void player1_choose_rock_and_player2_choose_rock_then_tied() {
        Game newGame = new Game(player1, player2, "roca", "papel");
        assertEquals("Player1 and Player2, tied!", newGame.getWinner());
    }
}
