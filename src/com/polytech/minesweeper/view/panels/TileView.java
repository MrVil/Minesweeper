package com.polytech.minesweeper.view.panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

import com.polytech.minesweeper.controleur.TileControleur;
import com.polytech.minesweeper.model.Tile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Vil on 26/05/2015.
 */
public class TileView extends JPanel implements Observer{

	private Tile tile;
	private TileControleur tileControleur;
    private Border blackline = BorderFactory.createLineBorder(Color.black,1);
    private BufferedImage flagImg;
    private JLabel label = new JLabel("", JLabel.CENTER);
    BufferedImage imgFlag = null;
    BufferedImage imgAsking = null;
    BufferedImage imgMine = null;
	BufferedImage imgBlank = null;
		
	
    public TileView(Tile tile){
        super();
        this.tile = tile;
        this.setBackground(Color.GRAY);
        this.setBorder(blackline);
        this.tileControleur = new TileControleur();
        this.tileControleur.setTile(this.tile);
        this.addMouseListener(tileControleur);
        tile.addObserver(this);
        this.add(label);
        try {
			imgFlag = ImageIO.read(new File("content/img/flag.png"));
			imgAsking = ImageIO.read(new File("content/img/asking.png"));
			imgBlank = ImageIO.read(new File("content/img/blank.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		label.setIcon(new ImageIcon(imgBlank));
      }

    
    
	@Override
	public void update(Observable arg0, Object arg1) {
		
		if(arg0 == tile){
			if(this.tile.getType() == Tile.Type.mined && imgMine == null){
	        	try {
	        		imgMine = ImageIO.read(new File("content/img/mine.png"));
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
			if(tile.getState() == Tile.State.hidden){
				setBackground(Color.GRAY);
			}
			if(tile.getState() == Tile.State.flagged){
				label.setIcon(new ImageIcon(imgFlag));
				setBackground(Color.GREEN);
			}
			if(tile.getState() == Tile.State.marked){
				label.setIcon(new ImageIcon(imgAsking));
				setBackground(Color.BLUE);
			}
			if(tile.getState() == Tile.State.revealed){
				if(tile.getType() == Tile.Type.mined){
					label.setIcon(new ImageIcon(imgMine));
					setBackground(Color.RED);
				}
				else{
					setBackground(Color.white);
					int val = this.tile.getValue();
					switch (val){
					
						case 1 :
							label.setText(String.valueOf(val));
							label.setForeground(Color.BLUE);
							break;
						case 2 :
							label.setText(String.valueOf(val));
							label.setForeground(Color.GREEN);
							break;
						case 3 : 
							label.setText(String.valueOf(val));
							label.setForeground(Color.RED);
							break;
						case 4 : 
							label.setText(String.valueOf(val));
							break;
						case 5 :
							label.setText(String.valueOf(val));
							break;
						case 6 : 
							label.setText(String.valueOf(val));
							break;
						case 7 : 
							label.setText(String.valueOf(val));
							break;
						case 8 : 
							label.setText(String.valueOf(val));
							break;
						default : 
							break;
						
							
							
					}
				}
			}
		}
	}
}
