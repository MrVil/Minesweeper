package com.polytech.minesweeper.view;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Vil on 26/05/2015.
 */
public class Tile extends JPanel {

    Border blackline = BorderFactory.createLineBorder(Color.black,1);
    
    public Tile(){
        super();
        this.setBackground(Color.RED);
        this.setBorder(blackline);
    
        addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent arg0){
            if(SwingUtilities.isLeftMouseButton(arg0)){
            setBackground(Color.BLACK);}
            if(SwingUtilities.isRightMouseButton(arg0)){
                setBackground(Color.RED);}
        }
        
        
    });
    
    
    }
}
