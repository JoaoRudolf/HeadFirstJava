package chapter12AVeryGraphicStory.miniMusicPlayer3;

import java.awt.Color;
import java.awt.Graphics;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel implements ControllerEventListener {

	private static final long serialVersionUID = 1L;
	
	boolean msg = false;
	
	public void controlChange(ShortMessage event) {
		msg = true;
		repaint();
	} // close controlChange method
	
	public void paintComponent(Graphics g) {
		if (msg) {
			int r = (int) (Math.random() * 250);
			int gr = (int) (Math.random() * 250);
			int b = (int) (Math.random() * 250);
			
			g.setColor(new Color(r, gr, b));
			
			int height = (int) ((Math.random() * 120) + 10);
			int width = (int) ((Math.random() * 120) + 10);
			
			int x = (int) ((Math.random() * 40) + 10);
			int y = (int) ((Math.random() * 40) + 10);
			
			g.fillRect(x, y, width, height);
			msg = false;
		} // close if
	} // close paintComponent() method
} // close class
