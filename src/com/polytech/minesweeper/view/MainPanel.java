package com.polytech.minesweeper.view;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainPanel extends JPanel{

    public MainPanel(){
        super(new GridLayout(10,10));
        for(int i = 0; i < 100; i++){
            this.add(new TilePanel());
        }
    }
}
