package com.polytech.minesweeper.view;

import com.polytech.minesweeper.controleur.actionListeners.OnQuitClicked;
import com.polytech.minesweeper.controleur.actionListeners.OnRestartClicked;
import com.polytech.minesweeper.controleur.actionListeners.OnStartClicked;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainMenuBar extends JMenuBar {

    public MainMenuBar(){
        super();

        //<MENU>
        JMenu menu = new JMenu("Partie");

        //MENU ITEMS
        //--Start--//
        JMenuItem itemStart = new JMenuItem("Demarrer");
        itemStart.addActionListener(new OnStartClicked());
        menu.add(itemStart);

        //--Restart--//
        JMenuItem itemRestart = new JMenuItem("Recommencer");
        itemRestart.addActionListener(new OnRestartClicked());
        menu.add(itemRestart);

        //--Quit--//
        JMenuItem itemQuit = new JMenuItem("Quitter");
        itemQuit.addActionListener(new OnQuitClicked());
        menu.add(itemQuit);

        //</MENU>
        this.add(menu);
    }
}
