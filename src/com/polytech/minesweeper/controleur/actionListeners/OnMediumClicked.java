package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.panels.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnMediumClicked extends MenuAction {

    public OnMediumClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        window.setContentPane(new Main(15, 15));
        window.setSize(15*50+23, 15*50);
        window.validate();
    }
}
