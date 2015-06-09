package com.polytech.minesweeper.controleur.actions;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 09/06/15.
 */
public class Quit extends AbstractAction {

    public Quit(){}

    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
