package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.panels.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnHardClicked extends MenuAction {

    public OnHardClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        window.setContentPane(new MainPanel(16, 30, 99));
        window.setSize(20*50+23, 20*50);
        window.validate();
    }
}
