package com.polytech.minesweeper.controleur.actionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Guyl.B on 08/06/15.
 */
public class OnStartClicked extends MenuAction{

    public OnStartClicked (JFrame window){
        super(window);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello !");
    }

}
