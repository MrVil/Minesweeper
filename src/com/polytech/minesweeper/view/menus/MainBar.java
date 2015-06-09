package com.polytech.minesweeper.view.menus;
import com.polytech.minesweeper.controleur.actionListeners.*;

import javax.swing.*;

/**
 * Created by Guyl.B on 26/05/2015.
 */
public class MainBar extends JMenuBar {

    JFrame window;

    public MainBar(JFrame window){
        super();

        this.window = window;

        //<MENU>
        JMenu menu = new JMenu("Partie");

        //MENU ITEMS
        //--Start--//
        JMenuItem itemStart = new JMenuItem("Demarrer");
        itemStart.addActionListener(new OnStartClicked(window));
        menu.add(itemStart);

        //--Fast game--//
        JMenu itemFastGame = new JMenu("Partie rapide");
        JMenuItem itemEasy = new JMenuItem("Facile");
        itemEasy.addActionListener(new OnEasyClicked(window));
        JMenuItem itemMedium = new JMenuItem("Moyen");
        itemMedium.addActionListener(new OnMediumClicked(window));
        JMenuItem itemHard = new JMenuItem("Difficile");
        itemHard.addActionListener(new OnHardClicked(window));
        itemFastGame.add(itemEasy);
        itemFastGame.add(itemMedium);
        itemFastGame.add(itemHard);
        menu.add(itemFastGame);

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
