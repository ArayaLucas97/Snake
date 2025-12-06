package snakeGUI;

import java.awt.*;
import javax.swing.*;

public class GameScreen extends JPanel{
	public GameScreen() {
		setBackground(Color.BLACK);
		setLayout(null); // o el layout que necesito para mi juego
		
		JLabel label = new JLabel("Aquí va el juego");
		//color de letras de fondo
        label.setForeground(Color.WHITE);
        label.setBounds(180, 200, 150, 30);
        add(label);
	}
}
