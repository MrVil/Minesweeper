package com.polytech.minesweeper.view.panels;

import com.polytech.minesweeper.model.Board;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class BoardPanel extends JPanel{
  
	public Board board;
	
    public BoardPanel(int x, int y, int k, InfoPanel info){
        super(new GridLayout(x,y));
        board = new Board(x, y, k);
	    for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++)
                this.add(new TileView(board.getTile(i,j)));
        }
    }

    public Board getBoard(){
        return board;
    }

}
