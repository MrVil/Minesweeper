package com.polytech.minesweeper.view;

import com.polytech.minesweeper.model.Board;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainPanel extends JPanel{

    int x = 10, y = 10;

    public MainPanel(int x, int y){
        super(new GridLayout(x,y));
        this.x = x;
        this.y = y;
        Board board = new Board(x, y, 20);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++)
                this.add(new TilePanel(board.getTile(i,j)));
        }
    }
}
