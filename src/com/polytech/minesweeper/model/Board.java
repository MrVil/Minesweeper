package com.polytech.minesweeper.model;

import com.polytech.minesweeper.tools.Vector2;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Guyl.B on 27/05/15.
 */
public class Board {

    private int width, height;
    private HashMap<Tile, Vector2> tileContext;
    private int nbBombs;
    private HashMap<Vector2, Tile> vectorContext;
    private Tile[][] gameboard;
    private boolean firstClickMade = false;
    private int nbCaseToReveal;
    
    

    public Board(int width, int height, int nbBombs){
        this.height = height;
        this.width = width;
        gameboard = new Tile[width][height];
        tileContext = new HashMap<Tile, Vector2>();
        this.nbBombs = nbBombs;

        Tile.Type type = Tile.Type.empty;
        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++) {
                gameboard[i][j] = new Tile(this, type);
                tileContext.put(gameboard[i][j], new Vector2(i, j));
            }
    }

    public void placeBombs(Tile tile){
        Random rand = new Random();
        Vector2 posCaseIni = tileContext.get(tile);
        int xCase = posCaseIni.x;
        int yCase = posCaseIni.y;
        while(nbBombs>0){
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            
            if(gameboard[x][y].getType() != Tile.Type.mined && x != xCase && y != yCase){
                gameboard[x][y].setType(Tile.Type.mined);
                updateNeightbourgs(gameboard[x][y]);
                nbBombs--;
            }
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
    	Vector2 position = this.tileContext.get(tile);
    	if(tile.getValue() == 0 && tile.getState() != Tile.State.revealed){
    		tile.reveal();
    		for(int i = -1; i <2;i++){
    			for(int j = -1;j<2;j++){
    				int posx = position.x + i;
    				int posy = position.y + j;
    				if(posx<width && posx>=0 && posy< height && posy>=0){
    					Tile t = gameboard[posx][posy]; 
    					reveal(t);
    				}
    			}
    		}
    	}
    	else{
    		tile.reveal();
    	}
    }

	public boolean isFirstClickMade() {
		return firstClickMade;
	}

	public void setFirstClickMade(boolean firstClickMade) {
		this.firstClickMade = firstClickMade;
	}
}
