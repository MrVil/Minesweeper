package com.polytech.minesweeper.view;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class MainMenuBar extends JMenuBar {

    public MainMenuBar(){
        super();
        JMenu menu = new JMenu("Partie");
        JMenuItem menuItem = new JMenuItem("Demarrer");
        menu.add(menuItem);
        menuItem = new JMenuItem("Recommencer");
        menu.add(menuItem);
        menuItem = new JMenuItem("Quitter");
        menu.add(menuItem);
        this.add(menu);
    }
}
