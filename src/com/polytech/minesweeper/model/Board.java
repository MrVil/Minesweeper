package com.polytech.minesweeper.model;

import com.polytech.minesweeper.tools.Vector2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Guyl.B on 27/05/15.
 */
public class Board {

    private int width, heigth;
    private HashMap<Tile, Vector2> tileContext;
    private HashMap<Vector2, Tile> vectorContext;

    public Board(int width, int height){
        this.heigth = height;
        this.width = width;
        Tile[][] gameboard = new Tile[width][height];
        tileContext = new HashMap<Tile, Vector2>();
        vectorContext = new HashMap<Vector2, Tile>();

        Tile.Type type = Tile.Type.empty;

        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++) {
                gameboard[i][j] = new Tile(this, type);
                tileContext.put(gameboard[i][j], new Vector2(i, j));
                vectorContext.put(new Vector2(i, j), gameboard[i][j]);
            }
    }

    public Tile getTile(int x, int y){
        return vectorContext.get(new Vector2(x, y));
    }


    //TODO : Finish the reveal function
    public void revealNeigbourg(Tile tile){
        if(tile == null)
            return;
        Tile tileTmp = null;
        Vector2 posTmp = null;
        Vector2 position = tileContext.get(tile);
        for(int i = -1; i < 2; i++)
            for (int j = -1; j < 2; j++) {
                posTmp = position.add(i, j);
                tileTmp = vectorContext.get(posTmp);
                revealNeigbourg(tileTmp);
            }
    }

}
