
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Grid extends JComponent implements KeyListener, MouseListener {
	
	public static Cell[][] cell;
	
	public final int ROWS;
	public final int COLS;
	
	private final int X_GRID_OFFSET = 0;
	private final int Y_GRID_OFFSET = 0;
	
	private final int CELL_WIDTH = 5;
	private final int CELL_HEIGHT = 5;
	
	private final int DISPLAY_WIDTH;
	private final int DISPLAY_HEIGHT;
	
	private Player player;
	
	private boolean gameOver;
	
	public Grid(int width, int height, int rows, int cols) {
		
		DISPLAY_WIDTH = width;
		DISPLAY_HEIGHT = height;
		
		ROWS = rows;
		COLS = cols;
		cell = new Cell[COLS][ROWS];
		
		addKeyListener(this);
		addMouseListener(this);
		
	}
	
	private void initPlayer() {
		
		
	}

	private void initWalls() {
		
		
	}
	
	private void initPearls() {
		
		
	}
	
	private void initPlayerImage() {
		
		
	}
	
	private void initWallImage() {
		
		
	}
	
	private void initPearlImage() {
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		
		
	}
	
	private void drawPlayer(Graphics g) {
		
		
	}
	
	private void drawWalls(Graphics g) {
		
		
	}
	
	private void drawPearls(Graphics g) {
		
		
	}
	
	public boolean occupiedByWall(int x, int y) {
		
		return cell[x][y] instanceof Wall;
		
	}
	
	public boolean occupiedByPearl(int x, int y) {
		
		return cell[x][y] instanceof Pearl;
		
	}
	
	public void gameOver() {
		
		
	}
	
	public void setGameOver(boolean gameOver) {
		
		this.gameOver = gameOver;
		
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {

		switch(arg0.getKeyCode()) {
		
		case KeyEvent.VK_UP:
		case KeyEvent.VK_KP_UP:
		case KeyEvent.VK_W:
			//move up
			break;
		
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_KP_DOWN:
		case KeyEvent.VK_S:
			//move down
			break;
		
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_KP_RIGHT:
		case KeyEvent.VK_D:
			//move right
			break;
			
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_KP_LEFT:
		case KeyEvent.VK_A:
			//move left
			break;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		this.grabFocus();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

		this.grabFocus();
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
