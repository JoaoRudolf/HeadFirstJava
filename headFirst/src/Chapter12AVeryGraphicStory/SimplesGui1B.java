package Chapter12AVeryGraphicStory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimplesGui1B implements ActionListener {
	JButton botao;

	public static void main(String[] args) {
		SimplesGui1B gui = new SimplesGui1B();
		gui.go();
	} // fecha main

	public void go() {
		JFrame quadro = new JFrame();
		botao = new JButton("Clique em mim");
		botao.addActionListener(this);

		quadro.getContentPane().add(botao);
		quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quadro.setSize(300, 300);
		quadro.setVisible(true);

	} // fecha método go

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Fui clicado");
	} // fecha método actionPerformed

} // fecha classe
