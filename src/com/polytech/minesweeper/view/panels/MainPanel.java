package com.polytech.minesweeper.view.panels;

import javax.swing.*;

import com.polytech.minesweeper.model.Tile;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class MainPanel extends JPanel implements Observer {

    private int width2;
    private int height2;
    private int nbBombs;
    InfoPanel info;
    BoardPanel bp;

    public MainPanel(int x, int y, int bombs){
        info = new InfoPanel(bombs);
        bp = new BoardPanel(x, y, bombs, info);

        height2 = x;
        width2 = y;
        nbBombs = bombs;

        this.add(info, BorderLayout.PAGE_START);
        this.add(bp);
      	bp.board.addObserver(this);
  

    }

    public int getWidth2() {
        return width2;
    }
    public int getHeight2() {
        return height2;
    }
    public int getNbBombs() {
        return nbBombs;
    }

    @Override
    public void update(Observable obs, Object o) {
    		info.Update(bp.board.getNbBombsLeft());
    		System.out.println(bp.board.getNbBombsLeft());
    	}
    }

