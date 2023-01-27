package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Player;

public class Game {

    private Player player1;
    private Player player2;
    private Figure figure1;
    private Figure figure2;
    private String winner;
       
    public Game(Player player1, Player player2, String figurePlayer1, String figurePlayer2) {
        this.player1 = player1;
        this.player2 = player2;
        this.figure1 = this.player1.choose(figurePlayer1);
        this.figure2 = this.player2.choose(figurePlayer2);
        if(this.figure1.getType()=="roca")
            if(this.figure2.getType()=="tijeras") {
                winner =  "Player1 win!";
            }
            if(this.figure2.getType()=="roca") {
                winner =  "Player1 and Player2, tied!";
            }
            if(this.figure2.getType()=="papel") {
                winner =  "Player2 win!";
            }
        }
    

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }


    public Player getPlayer1() {
        return player1;
    }
    public Player getPlayer2() {
        return player2;
    }

    public Figure getFigure1() {
        return figure1;
    }

    public Figure getFigure2() {
        return figure2;
    }

}
