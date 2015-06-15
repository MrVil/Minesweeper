package com.polytech.minesweeper.view.panels;

import javax.swing.*;

/**
 * Created by Guyl.B on 15/06/15.
 */
public class InfoPanel extends JPanel  {

    JLabel nbBomb;
    int nbBombs;

    public InfoPanel(int nbBombs) {
        this.add(new JLabel("Nombre de bombes Restantes"));
        this.nbBombs = nbBombs;
        nbBomb = new JLabel(String.valueOf(nbBombs));
        this.add(nbBomb);
        
    }
    
    public void Update(int i){
    	nbBombs+=i;
    	nbBomb.setText("");
    	this.validate();
    	nbBomb.setText(String.valueOf(nbBombs));
    	this.validate();
    	System.out.println(nbBombs);
    }

	public void removeNbBombs() {
		Update(-1);
	}
	
	public void addNbBombs(){
		Update(1);
	}
   
}
