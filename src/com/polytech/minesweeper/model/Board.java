package com.polytech.minesweeper.model;

import com.polytech.minesweeper.tools.Vector2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Timer;

/**
 * Created by Guyl.B on 27/05/15.
 */
public class Board {

    private int width, height;
    private HashMap<Tile, Vector2> tileContext;
    private int nbBombs;
    private Tile[][] gameboard;
    private boolean firstClickMade = false;
    private int nbCaseToReveal;
    private boolean victory = false;
    private boolean defeat = false;
    ClockThread time;
    

    public Board(int width, int height, int nbBombs){
        this.height = height;
        this.width = width;
        gameboard = new Tile[width][height];
        tileContext = new HashMap<Tile, Vector2>();
        this.nbBombs = nbBombs;
        this.nbCaseToReveal = width*height - nbBombs;
        Tile.Type type = Tile.Type.empty;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++) {
                gameboard[i][j] = new Tile(this, type);
                tileContext.put(gameboard[i][j], new Vector2(i, j));
            }
        }
        time = new ClockThread();
        time.start();
    }

    public void placeBombs(Tile tile){
    	HashMap<Tile, Vector2> copy = new HashMap(tileContext);
    	copy.remove(tile);
    	List<Vector2> copyList = new ArrayList(copy.values());
    	System.out.println(copyList.size());
        Random rand = new Random();
        
        while(nbBombs>0){
        	int i = rand.nextInt(copyList.size());
        	int x = copyList.get(i).x;
            int y = copyList.get(i).y;
            Tile t = gameboard[x][y];
            t.setType(Tile.Type.mined);
            updateNeightbourgs(t);
            copyList.remove(i);
            System.out.println(copyList.size());
            nbBombs--;
        }
    }
    
    private void updateNeightbourgs(Tile tile) {
		Vector2 position = this.tileContext.get(tile);
		for(int i = -1; i<2;i++){
			for(int j = -1;j<2;j++){
				int posx = position.x + i;
				int posy = position.y + j;
				if(posx<width && posx>=0 && posy< height && posy>=0){
					gameboard[posx][posy].setValue(gameboard[posx][posy].getValue()+1);
				}
			}
		}
	}
	
    public Tile getTile(int x, int y){
    	return gameboard[x][y];
       // return vectorContext.get(new Vector2(x, y));
    }

    public void reveal(Tile tile){
    	if(tile.getType() == Tile.Type.mined){
    		defeat();
    	}
    	else{
    		if(tile.getState() == Tile.State.revealed){
        		if(nbNeightBourgFlagged(tile) == tile.getValue())
        		{
        			revealNeightBourgsFlagged(tile);
        		}
        	}
    		else{
    			this.nbCaseToReveal--;
    			if(tile.getValue() == 0 && tile.getState() != Tile.State.revealed){
    				tile.reveal();
    				revealNeightBourgs(tile);
    			}	
    			else if	(tile.getState() != Tile.State.revealed){
    				tile.reveal();    		
    			}
    		}
    	}
    	if(this.nbCaseToReveal == 0){
    		this.victory();
    	}
    	System.out.println(nbCaseToReveal);
    }
    
    private int nbNeightBourgFlagged(Tile tile) {
    	int nbNeightBourgFlagged = 0; 
    	Vector2 position = this.tileContext.get(tile);
    	for(int i = -1; i <2;i++){
    		for(int j = -1;j<2;j++){
				int posx = position.x + i;
				int posy = position.y + j;
				if(posx<width && posx>=0 && posy< height && posy>=0){
					Tile t = gameboard[posx][posy];
					if(t.getState() == Tile.State.flagged){
						
						nbNeightBourgFlagged++;
						 						  						
					}
				}
			}	
    	}
		return nbNeightBourgFlagged;
	}

	private void revealNeightBourgs(Tile tile){
    	Vector2 position = this.tileContext.get(tile);
    	for(int i = -1; i <2;i++){
			for(int j = -1;j<2;j++){
				int posx = position.x + i;
				int posy = position.y + j;
				if(posx<width && posx>=0 && posy< height && posy>=0){
					Tile t = gameboard[posx][posy]; 
					if(t.getState() != Tile.State.revealed){
						reveal(t);
					}
				}
			}	
		}
    }
	
	
	private void revealNeightBourgsFlagged(Tile tile){
    	Vector2 position = this.tileContext.get(tile);
    	for(int i = -1; i <2;i++){
			for(int j = -1;j<2;j++){
				int posx = position.x + i;
				int posy = position.y + j;
				if(posx<width && posx>=0 && posy< height && posy>=0){
					Tile t = gameboard[posx][posy]; 
					if(t.getState() != Tile.State.revealed && t.getState() != Tile.State.flagged){
						t.reveal();    						  						
						if(t.getType() == Tile.Type.mined){
							this.defeat();
						}
					}
				}
			}	
		}
    }
    
    private void victory() {
		System.out.println("Félicitations grand maitre jedi");
		this.victory = true;
		System.out.println(" Il vous a fallut : " + time.nbSec + " secondes pour terminer le démineur");
		this.revealAll();
		time.stop();
		
	}

	private void defeat() {
		System.out.println("vous avez perdu");
		this.revealAll();
		System.out.println(" Il vous a fallut : " + time.nbSec + " secondes pour terminer le démineur");
		time.stop();
		this.defeat = false;
	}

	private void revealAll() {
		for(int i = 0;i<width;i++){
			for(int j = 0;j<height;j++){
				gameboard[i][j].reveal();
			}
		}
		
	}

	public boolean allTileReveal(){
    	return this.nbCaseToReveal == 0;
    }

	public boolean isFirstClickMade() {
		return firstClickMade;
	}

	public void setFirstClickMade(boolean firstClickMade) {
		this.firstClickMade = firstClickMade;
	}
}
