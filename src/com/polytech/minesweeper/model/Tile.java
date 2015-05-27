package com.polytech.minesweeper.model;

import java.util.GregorianCalendar;

/**
 * Created by Guyl.B on 27/05/15.
 */

public class Tile {

    static enum State {flagged, marked, hidden, revealed};
    static enum Type {empty, numbered, mined};

    private State state;
    private Type type;
    private Board board;

    public Tile(Board board, Type type){
        this.board = board;
        this.type = type;
        state = State.hidden;
    }
    
    public void setState(State state)   { this.state = state; }
    public State getState()             { return this.state; }

    public Type getType()               { return this.type; }

    public Board getBoard()             { return this.board; }

}
