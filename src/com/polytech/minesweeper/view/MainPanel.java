package com.polytech.minesweeper.view;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class MainPanel extends JPanel{

    public MainPanel(){
        super();
        for(int i = 0; i < 100; i++){
            this.add(new Tile());
        }
    }
}
