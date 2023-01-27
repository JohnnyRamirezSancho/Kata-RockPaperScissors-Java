package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Player;

public class Game {

    private Player player1;
    private Player player2;
    private Figure figure1;
    private Figure figure2;
    private String winner;
    private String showWinner;

    public Game(Player player1, Player player2, String figurePlayer1, String figurePlayer2) {
        this.player1 = player1;
        this.player2 = player2;
        this.figure1 = this.player1.choose(figurePlayer1);
        this.figure2 = this.player2.choose(figurePlayer2);
        combat(figurePlayer1, figurePlayer2);
    }

    public String combat(String figurePlayer1, String figurePlayer2) {
        if (this.figure1.getType() == "roca") {
            if (this.figure2.getType() == "tijeras") {
                setWinner("Player1 win!");
            }
            if (this.figure2.getType() == "roca") {
                setWinner("Player1 and Player2, tied!");
            }
            if (this.figure2.getType() == "papel") {
                setWinner("Player2 win!");
            }
            if (this.figure2.getType() == "lagarto") {
                setWinner("Player1 win!");
            }
            if (this.figure2.getType() == "Spock") {
                setWinner("Player2 win!");
            }
        }
        
        if (this.figure1.getType() == "papel") {
            if (this.figure2.getType() == "roca") {
                setWinner("Player1 win!");
            }
            if (this.figure2.getType() == "papel") {
                setWinner("Player1 and Player2, tied!");
            }
            if (this.figure2.getType() == "tijeras") {
                setWinner("Player2 win!");
            }
            if (this.figure2.getType() == "lagarto") {
                setWinner("Player2 win!");
            }
            if (this.figure2.getType() == "Spock") {
                setWinner("Player1 win!");
            }
        }

        if (this.figure1.getType() == "tijeras") {
            if (this.figure2.getType() == "papel") {
                setWinner("Player1 win!");
            }
            if (this.figure2.getType() == "tijeras") {
                setWinner("Player1 and Player2, tied!");
            }
            if (this.figure2.getType() == "roca") {
                setWinner("Player2 win!");
            }
        }
        setShowWinner("Player1: " + this.figure1.getType() + "\n" + "Player2: " + this.figure2.getType() + "\n" + getWinner());
        return getWinner();
    }
    
    public String getShowWinner() {
        return showWinner;
    }

    public void setShowWinner(String showWinner) {
        this.showWinner = showWinner;
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