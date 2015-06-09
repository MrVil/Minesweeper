package com.polytech.minesweeper.view;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class MainWindow extends JFrame{

    public MainWindow(){
        super();

        JPanel board = new MainPanel(10, 10);
        this.setJMenuBar(new MainMenuBar(this));
        this.setContentPane(board);
        
        this.setTitle("Polytech - Minesweeper");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

    }

}
