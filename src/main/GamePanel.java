package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel{

	public static final int WIDTH = 1100;
	public static final int HEIGHT = 800;
	
	public GamePanel () {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.lightGray);
	}
	
}
