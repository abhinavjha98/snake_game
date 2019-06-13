import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.xml.ws.soap.Addressing;

public class GamePanel extends JPanel implements Runnable, KeyListener {

	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;
	
	private Thread thread;
	private boolean running;
	private long TargetTime;
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
		addKeyListener(null);
	}
	@Override
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
		thread = new Thread(this);
		thread.start();
	}
	private void setFPS(int fps) {
		TargetTime = 1000/fps;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (running) return;
		init();
		long startTime;
		long elapsed;
		long wait;
		while(running) {
			startTime = System.nanoTime();
			elapsed = System.nanoTime() - startTime;
		}
	}
	private void init() {
		setFPS(10);
	}

}
