<<<<<<< HEAD
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new GamePanel());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH,GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
=======

public class MainClass {

>>>>>>> 016fd96d06b16e7908fe37c3ef14d8bcb7cd710f
}
