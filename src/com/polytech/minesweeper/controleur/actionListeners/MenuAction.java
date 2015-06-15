package com.polytech.minesweeper.controleur.actionListeners;

import javax.swing.*;

import java.awt.event.ActionListener;

/**
 * Created by Guyl.B on 09/06/15.
 */
public abstract class MenuAction implements ActionListener {

    JFrame window;
    JPanel p;

    public MenuAction (JFrame window){
        super();
        this.window = window;
    }

	public MenuAction(JPanel main_panel) {
		super();
		this.p = main_panel;
	}
}
