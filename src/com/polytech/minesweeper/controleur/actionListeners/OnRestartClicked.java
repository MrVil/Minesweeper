package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.panels.MainPanel;

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
    	MainPanel main = (MainPanel)window.getContentPane();
    	int width = main.getWidth2();
    	int height = main.getHeight2();
    	int nbBombs = main.getNbBombs();
        window.setContentPane(new MainPanel(height, width, nbBombs));
        window.validate();
    }
}

