package com.polytech.minesweeper.view;

import com.polytech.minesweeper.controleur.actionListeners.OnQuitClicked;
import com.polytech.minesweeper.controleur.actionListeners.OnRestartClicked;
import com.polytech.minesweeper.controleur.actionListeners.OnStartClicked;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainMenuBar extends JMenuBar {

    JFrame window;

    public MainMenuBar(JFrame window){
        super();

        this.window = window;

        //<MENU>
        JMenu menu = new JMenu("Partie");

        //MENU ITEMS
        //--Start--//
        JMenuItem itemStart = new JMenuItem("Demarrer");
        itemStart.addActionListener(new OnStartClicked(window));
        menu.add(itemStart);

        //--Restart--//
        JMenuItem itemRestart = new JMenuItem("Recommencer");
        itemRestart.addActionListener(new OnRestartClicked(window));
        menu.add(itemRestart);

        //--Quit--//
        JMenuItem itemQuit = new JMenuItem("Quitter");
        itemQuit.addActionListener(new OnQuitClicked(window));
        menu.add(itemQuit);

        //</MENU>
        this.add(menu);
    }
}
