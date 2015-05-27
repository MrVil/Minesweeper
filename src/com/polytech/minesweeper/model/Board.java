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

    public Board(int width, int height){
        this.heigth = height;
        this.width = width;
        gameboard = new Tile[width][height];

        Tile.Type type = Tile.Type.empty;
        HashMap<Tile, Vector2> hm = new HashMap<Tile, Vector2>();

        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++) {
                gameboard[i][j] = new Tile(this, type);
                hm.put(gameboard[i][j], new Vector2(i, j));
            }

    }



}
