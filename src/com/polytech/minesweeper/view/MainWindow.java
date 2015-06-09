package com.polytech.minesweeper.view;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class MainWindow extends JFrame{

    public MainWindow(){
        super();
        
        int height = 10;
        int width = 10;
        JPanel board = new MainPanel(height, width);
        JPanel info = new PanelInfo(height,width);
        this.setJMenuBar(new MainMenuBar(this));
        this.setContentPane(board);
        
        
        this.setTitle("Polytech - Minesweeper");
        this.setSize(height*50+23, width*50);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        

    }

}
