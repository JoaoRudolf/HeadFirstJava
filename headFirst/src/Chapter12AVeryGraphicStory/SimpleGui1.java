package Chapter12AVeryGraphicStory;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui1 {

	public static void main(String[] args) {
		JFrame quadro = new JFrame();
		JButton botao = new JButton("Clique aqui");
		
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.getContentPane().add(botao);
		
		quadro.setSize(300,300);
		quadro.setVisible(true);
	}
}
