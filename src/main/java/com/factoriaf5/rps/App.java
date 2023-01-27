package com.factoriaf5.rps;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.models.Player;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Player player1 = new Player();
        Player player2 = new Player();
        Game fight = new Game(player1, player2, null, null);
        System.out.println(fight.getShowWinner());
    }
}
