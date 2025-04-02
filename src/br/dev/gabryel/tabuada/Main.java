package br.dev.gabryel.tabuada;

import br.dev.gabryel.tabuada.model.Tabuada;

public class Main {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		tabuada.setMultiplicando(8);
		tabuada.setMinimoMultiplicador(14);
		tabuada.setMaximoMultiplicador(20);
		tabuada.mostrarTabuada();
		
		Tabuada tabuada2 = new Tabuada();
		tabuada2.setMultiplicando(457);
		tabuada2.setMinimoMultiplicador(56);
		tabuada2.setMaximoMultiplicador(18);
		tabuada2.mostrarTabuada();
		
		System.out.println(tabuada.getMultiplicando());
		double mult1 = tabuada.getMultiplicando();
		double algo = mult1 * 3;
		if(mult1 %2 == 0) {
			System.out.println("O multiplicando " + mult1 + " É par!");
		}else {
			System.out.println("O multiplicando " + mult1 + "É impar!");
		}
		
	}

}

