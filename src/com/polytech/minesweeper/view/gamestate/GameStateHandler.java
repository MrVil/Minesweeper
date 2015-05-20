package com.polytech.minesweeper.view.gamestate;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.Override;
import java.lang.System;


public class GameStateHandler extends JFrame{

    private GameState currentGS, nextGS;

    public GameStateHandler(){
        super("Minesweeper");
        
        currentGS = new MainMenu(this);
        currentGS.build();
        
        WindowListener l = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        addWindowListener(l);
        setSize(200,100);
        setVisible(true);
    }
    

}