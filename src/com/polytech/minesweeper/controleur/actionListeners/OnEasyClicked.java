package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.panels.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnEasyClicked extends MenuAction {

    public OnEasyClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        window.setContentPane(new Main(9, 9,10));
        window.setSize(10*50+23, 10*50);
        window.validate();
    }
}
