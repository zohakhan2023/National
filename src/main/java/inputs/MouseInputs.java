package inputs;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import gamestates.GameState;
import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener {
	
	private GamePanel gamePanel;

	public MouseInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseDragged(MouseEvent e) {
		switch (GameState.state) {
		case PLAYING -> gamePanel.getGame().getPlaying().mouseDragged(e);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseMoved(MouseEvent e) {
		switch (GameState.state) {
		case MENU -> gamePanel.getGame().getMenu().mouseMoved(e);
		case PLAYING -> gamePanel.getGame().getPlaying().mouseMoved(e);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseClicked(MouseEvent e) {
		switch (GameState.state) {
		case PLAYING -> gamePanel.getGame().getPlaying().mouseClicked(e);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void mousePressed(MouseEvent e) {
		switch (GameState.state) {
		case MENU -> gamePanel.getGame().getMenu().mousePressed(e);
		case PLAYING -> gamePanel.getGame().getPlaying().mousePressed(e);
		}
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public void mouseReleased(MouseEvent e) {
		switch (GameState.state) {
		case MENU -> gamePanel.getGame().getMenu().mouseReleased(e);
		case PLAYING -> gamePanel.getGame().getPlaying().mouseReleased(e);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Not In use
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Not In use
	}

}
