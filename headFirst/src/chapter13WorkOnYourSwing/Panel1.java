package chapter13WorkOnYourSwing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 {

	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
		
	} // close main
	
	public void go() {
		JFrame estrutura = new JFrame("Rudolf megatrends");
		JPanel painelLeste = new JPanel();
		painelLeste.setBackground(Color.darkGray);
		
		BoxLayout leiaute = new BoxLayout(painelLeste, BoxLayout.PAGE_AXIS);
		painelLeste.setLayout(leiaute);
		
		JButton botao = new JButton("vrum vrum");
		JButton botao2 = new JButton("miau miau");
		estrutura.getContentPane().add(BorderLayout.EAST, painelLeste);
		
		painelLeste.add(botao);
		painelLeste.add(botao2);
		estrutura.setSize(250, 200);
		estrutura.setVisible(true);
		estrutura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JPanel painelNorte = new JPanel();
//		//JTextField campoTexto = new JTextField(20);
//		JTextField campoTexto = new JTextField("nome");
//		estrutura.getContentPane().add(campoTexto);
//		//painelNorte.add(campoTexto);
		
	}
	
	
} // close class
