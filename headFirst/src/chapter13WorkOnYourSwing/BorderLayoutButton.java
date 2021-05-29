package chapter13WorkOnYourSwing;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutButton {

	public static void main(String[] args) {
		BorderLayoutButton gui = new BorderLayoutButton();
		// gui.go1();
		gui.go2();
		
		
	} // close main
	
	public void go1() {
		JFrame estrutura = new JFrame();
		JButton botao = new JButton("Clique em mim pra valer");
		estrutura.getContentPane().add(BorderLayout.NORTH, botao);
		Font fonteGrande = new Font("serif", Font.BOLD, 28);
		botao.setFont(fonteGrande);
		estrutura.setSize(200, 200);
		estrutura.setVisible(true);
		estrutura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void go2() {
		JFrame estrutura = new JFrame();
		
		JButton leste = new JButton("Hallo");
		JButton oeste = new JButton("Oláá");
		JButton norte = new JButton("Óxente");
		JButton sul = new JButton("Bah, tchê");
		JButton centro = new JButton("=)");		
		
		estrutura.getContentPane().add(BorderLayout.EAST, leste);
		estrutura.getContentPane().add(BorderLayout.WEST, oeste);
		estrutura.getContentPane().add(BorderLayout.NORTH, norte);
		estrutura.getContentPane().add(BorderLayout.SOUTH, sul);
		estrutura.getContentPane().add(BorderLayout.CENTER, centro);
		
		estrutura.setSize(300, 300);
		estrutura.setVisible(true);
		estrutura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} // close class
