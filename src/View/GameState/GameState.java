
package com.polytech.Minesweeper.View.GameState;

import javax.swing.*;
import java.util.Observer;

public abstract class GameState extends Observer {

    /**
     *
     *
     */
    public abstract void loadContent();

    public void update();

    public abstract void draw();
}