package br.com.impacta.interfaces;

//Interface � abstrato por padr�o.
public interface Figura extends Comparable <Figura> {
	
	// Todos os met�dos de uma interface s�o p�blicos. publicos e abstrators por defini��o e final.
	double  calcularArea(); 
//		 public static final 
		 String AUTOR = "Equipe Impacta";
	
		 default String apresentaFigura () {
			 
				String resposta = "Classe: " + this.getClass().getSimpleName()+
											"\n �rea: " + this.calcularArea();
				
				return resposta;
				
				// This � uma referencia ao objeto da classe que 
				// vai implementar.
		 	}
		 }
