package com.polytech.minesweeper.controleur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javax.swing.SwingUtilities;

import com.polytech.minesweeper.model.Tile;
import com.polytech.minesweeper.view.TilePanel;

public class TileControleur implements MouseListener {

	private Tile tile;	
	private Observer tilePanel;
	//private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
        if(SwingUtilities.isLeftMouseButton(arg0)){
            tile.reveal();}
        if(SwingUtilities.isRightMouseButton(arg0)){
			tile.nextState();
		}
        System.out.println("La tile est de type" + tile.getType() + " et sa valeur est  : " + tile.getValue());
        tile.callUpdatePanel();
    }
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}


	


}
