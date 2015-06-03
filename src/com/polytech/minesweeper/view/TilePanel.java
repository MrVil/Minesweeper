package com.polytech.minesweeper.view;

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
public class TilePanel extends JPanel implements Observer{

	private Tile tile;
	private TileControleur tileControleur;
    private Border blackline = BorderFactory.createLineBorder(Color.black,1);
    private BufferedImage flagImg;
    private JLabel label = new JLabel("", SwingConstants.CENTER);
    
    public TilePanel(Tile tile){
        super();
        this.tile = tile;
        this.setBackground(Color.GRAY);
        this.setBorder(blackline);
        this.tileControleur = new TileControleur();
        this.tileControleur.setTile(this.tile);
        this.addMouseListener(tileControleur);
        tile.addObserver(this);
        this.add(label);
        try{ flagImg = ImageIO.read(new File("content/img/flag.png")); }
        catch (IOException e){ e.printStackTrace(); }
    }
    
	@Override
	public void update(Observable arg0, Object arg1) {
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
			if(tile.getState() == Tile.State.revealed){
				if(tile.getType() == Tile.Type.mined){
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
					label.setText();  
				
				}
			}
		}
	}

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(tile.getState() == Tile.State.flagged) {
            g.drawImage(flagImg, this.getX(), this.getY(), this.getWidth(), this.getHeight(), this);
            System.err.println("Flagged !");
        }
    }

}
