package com.polytech.minesweeper.view;

import com.polytech.minesweeper.model.Board;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainPanel extends JPanel{

  
    public MainPanel(int x, int y){
        super(new GridLayout(x,y));
        Board board = new Board(x, y, 9);
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++)
                this.add(new TilePanel(board.getTile(i,j)));
        }
    }
}
