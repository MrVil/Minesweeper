package com.polytech.minesweeper.view.panels;

import javax.swing.*;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class InfoPanel extends JPanel  {

    JLabel nbBomb;
    JLabel chrono;

    public InfoPanel(int nbBombs) {
        this.add(new JLabel("Nombre de bombes Restantes"));
        nbBomb = new JLabel(String.valueOf(nbBombs));
        this.add(nbBomb);
        this.add(new JLabel("Temp écoulé : "));
        chrono = new JLabel(String.valueOf(0));
        this.add(chrono);
    }
    public void updateTimer(int i){
    	chrono.setText("");
    	this.validate();
    	chrono.setText(String.valueOf(i));
    	this.validate();
    }
    
    public void update(int i){
    	nbBomb.setText("");
    	this.validate();
    	nbBomb.setText(String.valueOf(i));
    	this.validate();
    	System.out.println(i);
    }

	public void removeNbBombs(int i) {
		update(i);
	}
	
	public void addNbBombs(int i){
		update(i);
	}
   
}
