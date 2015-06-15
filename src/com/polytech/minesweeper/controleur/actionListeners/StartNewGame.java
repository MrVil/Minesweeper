package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.panels.MainPanel;
import com.polytech.minesweeper.view.windows.NewGame;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class StartNewGame extends MenuAction {

    JFrame mainWin;
    NewGame window;

    public StartNewGame (NewGame window, JFrame mainWin){
        super(window);
        this.window = window;
        this.mainWin = mainWin;
    }

    public void actionPerformed(ActionEvent e) {

        int x = Integer.parseInt(window.getWidth_field().getText());
        int y = Integer.parseInt(window.getHeight_field().getText());
        int bombs = Integer.parseInt(window.getBomb_field().getText());

        window.setVisible(false);
        window.dispose();

        mainWin.setContentPane(new MainPanel(x, y, bombs));
        mainWin.setSize(y * 50 + 23, x * 50);
        mainWin.validate();
    }
}

