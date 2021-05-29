package chapter13WorkOnYourSwing;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MakingAGui {
	
	public static void main(String[] args) {
		JFrame estrutura = new JFrame();
		JButton botao = new JButton("clique em mim ;)");
		JCheckBox caixaSelecao = new JCheckBox("Selecione-me");
		JCheckBox caixaSelecao2 = new JCheckBox("Selecione euu!");
		JTextField caixaTexto = new JTextField();
		JTextField caixaTexto2 = new JTextField();
		
		estrutura.getContentPane().add(BorderLayout.EAST, botao);
		estrutura.getContentPane().add(BorderLayout.LINE_START, caixaSelecao);
		estrutura.getContentPane().add(caixaSelecao2);
		estrutura.getContentPane().add(BorderLayout.SOUTH, caixaTexto);
		estrutura.getContentPane().add(BorderLayout.NORTH, caixaTexto2);
		
		estrutura.setSize(500, 500);
		estrutura.setVisible(true);
		estrutura.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	} // close main
	
} // close class
