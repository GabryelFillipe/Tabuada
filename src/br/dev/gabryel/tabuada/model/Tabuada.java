package br.dev.gabryel.tabuada.model;

public class Tabuada {
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;

	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public String[] mostrarTabuada() {
		if (minimoMultiplicador > maximoMultiplicador) {
			double troca = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = troca;
		}
		// Criar o vetor que vai guardar a tabuada
		// Cada elemento do vetor sera uma linha da tabuada
		int tamanhoTabuada = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		String[] tabuada = new String[tamanhoTabuada];
		int i = 0;
	
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			tabuada[i] = multiplicando + " X " + minimoMultiplicador + " = " + produto;
			i++;
			minimoMultiplicador++;
		}
		
		return tabuada;
		
	}

}
