package com.polytech.minesweeper.model;

class ClockThread extends Thread
{
	int nbSec = 0;
	
	public void run()
	{
		while(true)
		{
			nbSec++;
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