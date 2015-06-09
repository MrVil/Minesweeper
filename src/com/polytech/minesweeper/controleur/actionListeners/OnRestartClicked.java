package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnRestartClicked extends MenuAction {

    public OnRestartClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        window.setContentPane(new MainPanel(10, 10));
        window.validate();
    }
}
