package com.polytech.minesweeper.view.panels;

import com.polytech.minesweeper.model.Board;

import java.awt.GridLayout;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class Main extends JPanel{

	private int width2;
	private int height2;
	private int nbBombs;
  
    public Main(int x, int y,int k){
        super(new GridLayout(x,y));
        height2 = x;
        width2 = y;
        nbBombs = k;
        Board board = new Board(x, y, k);
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++)
                this.add(new TileView(board.getTile(i,j)));
        }
    }

	public int getWidth2() {
		return width2;
	}

	public void setWidth2(int width2) {
		this.width2 = width2;
	}

	public int getHeight2() {
		return height2;
	}

	public void setHeight2(int height2) {
		this.height2 = height2;
	}

	public int getNbBombs() {
		return nbBombs;
	}

	public void setNbBombs(int nbBombs) {
		this.nbBombs = nbBombs;
	}
}
