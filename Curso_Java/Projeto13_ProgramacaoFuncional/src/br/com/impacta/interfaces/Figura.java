package br.com.impacta.interfaces;

//Interface é abstrato por padrão.
public interface Figura extends Comparable <Figura> {
	
	// Todos os metódos de uma interface são públicos. publicos e abstrators por definição e final.
	double  calcularArea(); 
//		 public static final 
		 String AUTOR = "Equipe Impacta";
	
		 default String apresentaFigura () {
			 
				String resposta = "Classe: " + this.getClass().getSimpleName()+
											"\n Àrea: " + this.calcularArea();
				
				return resposta;
				
				// This é uma referencia ao objeto da classe que 
				// vai implementar.
		 	}
		 }
