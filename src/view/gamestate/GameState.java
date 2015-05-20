package view.gamestate;
import javax.swing.*;
import java.util.Observer;

public abstract class GameState /*implements Observer*/ {

	protected JFrame win;
	
	public GameState(JFrame window){
		win = window;
	}
	
    public abstract void build();

    public abstract void update();

}