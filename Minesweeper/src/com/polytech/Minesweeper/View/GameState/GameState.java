
package com.polytech.Minesweeper.View.GameState;

import javax.swing.*;
import java.util.Observer;

public abstract class GameState implements Observer {

    /**
     *
     *
     */
    public abstract void loadContent();

    public abstract void update();

    public abstract void draw();
}