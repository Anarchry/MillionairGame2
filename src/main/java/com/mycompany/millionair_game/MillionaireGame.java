package com.mycompany.millionair_game;

/**
 *
 * @author FabiF
 */
public class MillionaireGame {

    public static void main(String[] args) {

        //New instance of GameStart
        
        new Login().setVisible(true);
        GameStart gameStart = new GameStart();
        gameStart.start();


    }

}
