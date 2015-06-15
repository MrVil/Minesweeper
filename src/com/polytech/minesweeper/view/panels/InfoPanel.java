package com.polytech.minesweeper.view.panels;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class InfoPanel extends JPanel implements Observer {

    JLabel nbBomb;

    public InfoPanel() {
        this.add(new JLabel("Nombre de bombes Restantes"));
        nbBomb = new JLabel("45");
        this.add(nbBomb);
    }

    @Override
    public void update(Observable obs, Object o) {
        this.remove(nbBomb);
        //Board bd = (Board)obs;
        nbBomb = new JLabel("3");
        this.add(nbBomb);
    }
}
