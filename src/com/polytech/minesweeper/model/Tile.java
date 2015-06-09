package com.polytech.minesweeper.model;

import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Guyl.B on 27/05/15.
 */

public class Tile extends Observable {

    public static enum State {flagged, marked, hidden, revealed};
    public static enum Type {empty, numbered, mined};

    private Observer TilePanel;
    private State state;
    private Type type;
    private Board board;
    private int value = 0;
    
    public Tile(Board board, Type type){
        this.board = board;
        this.type = type;
        state = State.hidden;
    }
    public Tile(){
    	state = State.hidden;
    }

    public State getState()             { return this.state; }

    public Type getType()               { return this.type; }
    public void setType(Type type)		{this.type = type;}		

    public Board getBoard()             { return this.board; }
    public int getValue()				{ return this.value; }
    public void setValue(int value)				{this.value = value;}
    
    
    public void nextState(){
        if(state == State.hidden)
            state = State.flagged;
        else if (state == State.flagged)
            state = State.marked;
        else if (state == State.marked)
            state = State.hidden;
    }

    public void reveal(){
        if(state != State.revealed){
            state = State.revealed;
            callUpdatePanel();
        }
        
    }

	public void callUpdatePanel() {
		this.setChanged();
		this.notifyObservers();
	}

}
