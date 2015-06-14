package com.polytech.minesweeper.view.panels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class MainPanel extends JPanel {

    private int width2;
    private int height2;
    private int nbBombs;

    public MainPanel(int x, int y, int bombs){
        InfoPanel info = new InfoPanel();
        BoardPanel bp = new BoardPanel(x, y, bombs, info);

        height2 = x;
        width2 = y;
        nbBombs = bombs;

        this.add(info, BorderLayout.PAGE_START);
        this.add(bp);

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

}
