package com.polytech.minesweeper.controleur;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.SwingUtilities;

import com.polytech.minesweeper.model.Tile;
import com.polytech.minesweeper.view.TilePanel;

public class TileControleur extends Observable implements MouseListener {

	private Tile tile;
	private Observer tilePanel;
	@Override
	public void mouseClicked(MouseEvent arg0) {
        if(SwingUtilities.isLeftMouseButton(arg0)){
            tile.setState(Tile.State.revealed);}
        if(SwingUtilities.isRightMouseButton(arg0)){
            if(tile.getState() == Tile.State.hidden){
            	tile.setState(Tile.State.flagged);
            }
            if(tile.getState() == Tile.State.flagged){
            	tile.setState(Tile.State.marked);
            }
            if(tile.getState() == Tile.State.marked){
            	tile.setState(Tile.State.hidden);
            }}            
            
		notifyObservers(tilePanel);
	}
	
	public void addObserver(Observer obs){
		this.setTilePanel(obs);
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

	public Observer getTilePanel() {
		return tilePanel;
	}

	public void setTilePanel(Observer tilePanel) {
		this.tilePanel = tilePanel;
	}


}
