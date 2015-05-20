package com.polytech.minesweeper.view.gamestate;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.*;

public class MainMenu extends GameState {
	
	public MainMenu(JFrame window){
		super(window);
	}
	
	public void build(){

        //JMenu jm = new JMenu();
        JMenuBar jm = new JMenuBar();
        
        JMenu m = new JMenu("Jeu");
        
        JMenuItem mi = new JMenuItem("Partie");
        
        //ItemListener i = new Item
        
        m.add(mi);
        
        jm.add(m);
        
       
        
        win.setJMenuBar(jm);
		
		
		
		win.setSize(400, 400);
		JComponent pan = new JPanel (new GridLayout(10,10));
        Border blackline = BorderFactory.createLineBorder(Color.black,1);

        for(int i = 0; i<100;i++){
            //JComponent ptest = new Case();
            //ptest.setBorder(blackline);
            //pan.add(ptest);
        }
        pan.setBorder(blackline);
        win.add(pan);
	}
	
	public void update(){
	}

}