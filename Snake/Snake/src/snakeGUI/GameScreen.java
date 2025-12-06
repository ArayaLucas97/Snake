package snakeGUI;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameScreen extends JFrame {
	
	public GameScreen() {
	 setTitle("SnakeGame");
     setSize(500, 500);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setResizable(false);
     setLocationRelativeTo(null);
     
    //Panel basico para ver
     JPanel gamePanel = new JPanel();
     gamePanel.setBackground(Color.GRAY);
     
     add(gamePanel);
	}
}
