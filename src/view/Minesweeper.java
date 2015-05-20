package view;
import javax.swing.*;
import view.gamestate.*;

import view.gamestate.GameStateHandler;


public class Minesweeper{
    public static void main(String[] args){
        
    	GameStateHandler window = new GameStateHandler();
        window.setVisible(true);
        
    }
}