package chapter13WorkOnYourSwing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextArea1 implements ActionListener {

	JTextArea texto = new JTextArea();
	
	public static void main(String[] args) {
		TextArea1 gui = new TextArea1();
		gui.go();
		
	} // close main
	
	public void go() {
		JFrame estrutura = new JFrame();
		JPanel painel = new JPanel();
		JButton botao = new JButton("Apenas clique!");
		botao.addActionListener(this);
		texto = new JTextArea(10, 20);
		texto.setLineWrap(true);
		
		JScrollPane rolagem = new JScrollPane(texto);
		rolagem.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		rolagem.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		painel.add(rolagem);
		
		estrutura.getContentPane().add(BorderLayout.CENTER, painel);
		estrutura.getContentPane().add(BorderLayout.SOUTH, botao);
		
		estrutura.setSize(350, 300);
		estrutura.setVisible(true);
		
	} // close go() method

	public void actionPerformed(ActionEvent e) {
		texto.append("você clicou mesmo, hein? \n");
		
	} // close actionPerformed() method
	
} // close class
