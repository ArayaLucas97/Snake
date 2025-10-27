package snakeGUI;

import javax.swing.*;

public class MenuOptions extends JFrame {
    public MenuOptions() {
        setTitle("SnakeGame");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        
        int centerX = (500 - 70) / 2;
        
        // Botón de comienzo de juego (puedes posicionarlo también)
        JButton startButton = new JButton("START");
        startButton.setBounds(centerX, 200, 90, 30);  
        startButton.setBorderPainted(true);
        startButton.setContentAreaFilled(true);
        startButton.setFocusPainted(true);
        startButton.setOpaque(true);
        // Agrega ActionListener aquí si quieres
        
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
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MenuOptions();
    }
}