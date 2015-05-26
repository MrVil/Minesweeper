package com.polytech.minesweeper.view;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Vil on 26/05/2015.
 */
public class Tile extends JPanel implements MouseListener {

    Border blackline = BorderFactory.createLineBorder(Color.black,1);
    
    public Tile(){
        super();
        this.setBackground(Color.GRAY);
        this.setBorder(blackline);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            setBackground(Color.BLACK);}
        if(SwingUtilities.isRightMouseButton(e)){
            setBackground(Color.RED);}
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
