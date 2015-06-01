package com.polytech.minesweeper.model;

import com.polytech.minesweeper.tools.Vector2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

/**
 * Created by Guyl.B on 27/05/15.
 */
public class Board {

    private int width, heigth;
    private Tile[][] gameboard;
    private HashMap<Tile, Vector2> tileContext;
    private int nbBombs = 15;
    private Random i = new Random();

    public Board(int width, int height){
        this.heigth = height;
        this.width = width;
        gameboard = new Tile[width][height];
        tileContext = new HashMap<Tile, Vector2>();

        Tile.Type type = Tile.Type.empty;

        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++) {
                gameboard[i][j] = new Tile(this, type);
                tileContext.put(gameboard[i][j], new Vector2(i, j));
            }
        int nbwhile= 0;
        while(nbBombs>0){
        	
        	int x = i.nextInt(width);
        	System.out.println(x);
        	int y = i.nextInt(height);
        	System.out.println(y);
        	if(gameboard[x][y].getType() != Tile.Type.mined){
        		System.out.println("je place une bombe à la position x : " + x + "y : " + y );
        		gameboard[x][y].setType(Tile.Type.mined);
        		updateNeightbourgs(gameboard[x][y]);
        		nbBombs--;
        		nbwhile++;
        	}
        }
        System.out.println(nbwhile);
        
    }
    
    private void updateNeightbourgs(Tile tile) {
		Vector2 position = this.tileContext.get(tile);
		for(int i = -1; i<2;i++){
			for(int j = -1;j<2;j++){
				int posx = position.x + i;
				int posy = position.y + j;
				if(posx<width && posx>=0 && posy<heigth && posy>=0){
					gameboard[posx][posy].setValue(gameboard[posx][posy].getValue()+1);
				}
			}
		}
	}
	
    public Tile getTile(int x, int y){
        return gameboard[x][y];
    }

    public void updateNeigbourd(Tile tile){

    }

}
