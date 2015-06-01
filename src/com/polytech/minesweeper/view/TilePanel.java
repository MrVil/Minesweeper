package com.polytech.minesweeper.view;

import javax.swing.*;
import javax.swing.border.Border;

import com.polytech.minesweeper.controleur.TileControleur;
import com.polytech.minesweeper.model.Tile;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vil on 26/05/2015.
 */
public class TilePanel extends JPanel implements Observer{

	private Tile tile;
	private TileControleur tileControleur;
    Border blackline = BorderFactory.createLineBorder(Color.black,1);
    
    public TilePanel(){
        super();
        this.tile = new Tile();
        this.setBackground(Color.GRAY);
        this.setBorder(blackline);
        this.tileControleur = new TileControleur();
        this.tileControleur.setTile(this.tile);
        this.addMouseListener(tileControleur);
        tile.addObserver(this);
        
    }
    
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("update en cours");
		if(arg0 == tile){
			if(tile.getState() == Tile.State.hidden){
				setBackground(Color.GRAY);
			}
			if(tile.getState() == Tile.State.flagged){
				setBackground(Color.GREEN);
			}
			if(tile.getState() == Tile.State.marked){
				setBackground(Color.RED);
			}
		}
	}
    
}
