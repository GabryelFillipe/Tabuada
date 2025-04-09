package br.dev.gabryel.tabuada.gui;

import java.awt.Container;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private String tituloDaTela;
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;

	public void criarTela(String tituloDaTela) {

		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);

		// Obtendo a referecia do painel de conteudo da tela
		Container container = tela.getContentPane();
		

		// Criar o label Multiplicando.
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);

		// Criando o Label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);

		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		// Criando o Label MaxMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Maximo Multiplicador:");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		// Criando os Buttons calcular e Limpar
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 40);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 40);
		

		// Adicionando os componentes no Painel de conteudo do Jframe
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);

		// Tornar a tela visivel "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}

}