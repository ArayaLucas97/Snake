package snakeGUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuOptions extends JFrame {
	private JPanel mainPanel;
	private CardLayout cardLayout;
	private GameScreen gameScreen;
    public MenuOptions() {
        setTitle("SnakeGame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        cardLayout = new CardLayout();
        mainPanel =  new JPanel(cardLayout);
        
        //crear el panel del menu
        JPanel menuPanel = createMenuPanel();
        mainPanel.add(menuPanel, "menu");
        
        add(mainPanel);
        cardLayout.show(mainPanel,"menu");
       
        setVisible(true);
    }
    private JPanel createMenuPanel() {
    	JPanel panel = new JPanel();
    	panel.setLayout(null);
    	
    	int centerX = (500 - 70) / 2;
    	 
    	 // Botón de comienzo de juego (puedes posicionarlo también)
	    JButton startButton = new JButton("START");
	    startButton.setBounds(centerX, 200, 90, 30);  
	    startButton.setBorderPainted(true);
	    startButton.setContentAreaFilled(true);
	    startButton.setFocusPainted(true);
	    startButton.setOpaque(true);
	    startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar a la pantalla del juego
                cardLayout.show(mainPanel, "Game");
            }
        });
	    
	    // Botón de exit
	    JButton exitButton = new JButton("EXIT");
	    exitButton.setBounds(centerX+10, 250, 70, 30);  // Centro aproximado en 500x500: x=215, y=235
	    exitButton.setBorderPainted(true);
	    exitButton.setContentAreaFilled(true);
	    exitButton.setFocusPainted(true);
	    exitButton.setOpaque(true);
	    exitButton.addActionListener(e -> System.exit(0));
	    
	    // Agregamos los botones al panel
	    panel.add(startButton);
	    panel.add(exitButton);
	    
		return panel;
    }
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> new MenuOptions());
    	/*SwingUtilities.invokeLater asegura que el código dentro de él se ejecute 
    	en el Event Dispatch Thread (EDT), que es el hilo dedicado de Swing para 
    	manejar la UI de manera segura.*/
    	
    }
}