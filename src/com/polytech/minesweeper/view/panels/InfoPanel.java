package com.polytech.minesweeper.view.panels;

import javax.swing.*;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class InfoPanel extends JPanel  {

    JLabel nbBomb;

    public InfoPanel(int nbBombs) {
        this.add(new JLabel("Nombre de bombes Restantes"));
        nbBomb = new JLabel(String.valueOf(nbBombs));
        this.add(nbBomb);
        
    }
    
    public void Update(int i){
    	nbBomb.setText("");
    	this.validate();
    	nbBomb.setText(String.valueOf(i));
    	this.validate();
    	System.out.println(i);
    }

	public void removeNbBombs(int i) {
		Update(i);
	}
	
	public void addNbBombs(int i){
		Update(i);
	}
   
}
