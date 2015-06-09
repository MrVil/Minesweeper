package com.polytech.minesweeper.view.windows;

import com.polytech.minesweeper.view.menus.MainBar;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class Main extends JFrame{

    public Main(int height, int width, int nbBombs){
        super();

        JPanel board = new com.polytech.minesweeper.view.panels.Main(height, width, nbBombs);
        this.setJMenuBar(new MainBar(this));
        this.setContentPane(board);
        
        this.setTitle("Polytech - Minesweeper");
        this.setSize(height*50+23, width*50);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);

    }

}
