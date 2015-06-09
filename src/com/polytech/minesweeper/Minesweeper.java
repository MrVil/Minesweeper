package com.polytech.minesweeper;

import com.polytech.minesweeper.view.windows.Main;

import javax.swing.*;

/**
 * Created by Vil on 26/05/2015.
 */
public class Minesweeper {

    public static JFrame win;

    public static void main(String[] args){
        win = new Main(10, 10);
    }
}
