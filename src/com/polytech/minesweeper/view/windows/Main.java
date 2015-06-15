package com.polytech.minesweeper.view.windows;

import com.polytech.minesweeper.model.Board;
import com.polytech.minesweeper.view.menus.MainBar;
import com.polytech.minesweeper.view.panels.MainPanel;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vil on 26/05/2015.
 */
public class Main extends JFrame implements Observer {

    public Main(int height, int width, int nbBombs){
        super();

        MainPanel mp = new MainPanel(height, width, nbBombs);
        this.setJMenuBar(new MainBar(this));
        this.setContentPane(mp);

        mp.getBoardPanel().getBoard().addObserver(this);

        this.setTitle("Polytech - Minesweeper");
        this.setSize(height*50+23, width*50);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);

    }

    @Override
    public void update(Observable observable, Object o) {
        Board b = (Board)observable;
        if(b.getVictory()){
            JOptionPane.showMessageDialog(this, "Victoire !");
        }
        else if(b.getDefeat()){
            JOptionPane.showMessageDialog(this, "Perdu");
        }
    }
}
