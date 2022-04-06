package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.interfaces.Figura;

public class AppClasseInterna {

	public static void main(String[] args) {
		// Uso de classe interna anônima - Complemento

		Figura figura = new Figura() {

			@Override
			public int compareTo(Figura arg0) { // Classe que implementa a interface figura.
				
				return 0;
			}

			@Override
			public double calcularArea() {
				
				return 0;
			} 

		};
		
		Pessoa p = new Pessoa () {
			
		};

	}

}
