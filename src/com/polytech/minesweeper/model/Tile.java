package com.polytech.minesweeper.model;

/**
 * Created by Guyl.B on 27/05/15.
 */

public class Tile {

    static enum State {flagged, marked, hidden, discovered};
    static enum Type {empty, numbered, mined};

    private State state;
    private Type type;
    private Board board;

    public Tile(Board board, Type type){
        this.board = board;
        this.type = type;
        state = State.hidden;
    }
}
