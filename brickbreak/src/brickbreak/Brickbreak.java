/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreak;
import static com.sun.glass.events.DndEvent.EXIT;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Brickbreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                JFrame frame = new JFrame();
		GamePlay game = new GamePlay();
		JButton button = new JButton("restart");
		frame.setSize(750, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(game);
		frame.add(button, BorderLayout.SOUTH);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		button.addActionListener(game);
		game.addKeyListener(game);
		game.setFocusable(true);
		Thread t = new Thread(game);
		t.start();
        
    }
    
}
