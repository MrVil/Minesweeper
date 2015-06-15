package com.polytech.minesweeper.controleur.actionListeners;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class OnCancelClicked extends MenuAction{

	JFrame window;
	public OnCancelClicked(JFrame window) {
		super(window);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		window.setVisible(false);
		window.dispose();
	}

}
