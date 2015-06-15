package com.polytech.minesweeper.model;

public class ClockThread extends Thread
{
	public int nbSec = 0;
	private Board board;
	
	public ClockThread(Board board) {
		this.board = board;
	}

	public void run()
	{
		while(true)
		{
			nbSec++;
			this.board.callUpdate();
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
				
		}
	}
	
}