package com.polytech.minesweeper.controleur.actionListeners;

import com.polytech.minesweeper.view.windows.NewGame;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnStartClicked extends MenuAction{

    public OnStartClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        JFrame newGame = new NewGame();

    }

}
