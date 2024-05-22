package inputs;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gamestates.GameState;
import main.GamePanel;

public class KeyboardInputs implements KeyListener {

	private GamePanel gamePanel;

	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyReleased(KeyEvent e) {
		switch (GameState.state) {
		case MENU -> gamePanel.getGame().getMenu().keyReleased(e);
		case PLAYING -> gamePanel.getGame().getPlaying().keyReleased(e);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void keyPressed(KeyEvent e) {
		switch (GameState.state) {
		case MENU -> gamePanel.getGame().getMenu().keyPressed(e);
		case PLAYING -> gamePanel.getGame().getPlaying().keyPressed(e);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Not In Use
	}
	
}
