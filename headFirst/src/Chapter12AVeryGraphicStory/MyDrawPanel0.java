package Chapter12AVeryGraphicStory;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyDrawPanel0 extends JPanel {

	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
	} // fecha método
	

} //fecha classe
