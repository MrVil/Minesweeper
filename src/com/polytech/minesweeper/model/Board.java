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
    private Tile[][] gameboard;
    private HashMap<Tile, Vector2> tileContext;

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
    }

    public Tile getTile(int x, int y){
        return gameboard[x][y];
    }

    public void updateNeigbourd(Tile tile){

    }

}
