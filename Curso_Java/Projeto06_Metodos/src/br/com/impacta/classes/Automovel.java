package br.com.impacta.classes;

public class Automovel { // Tanto a classe com as váriaveis devem ser publicas para acesso futuro
	// Atributos.
	private String marca;
	private String modelo;
	private  int ano;
	private String placa;

	public String mostrarDados() { // Sempre que não for vazio, não retorna nada
		
		String titulo = "Dados do automovel";
		
		String resposta 	=	
				titulo + "\n\nMarca: " + this.getMarca()+
							"\nModelo: "   + this.getModelo() +
							"\nAno: "         + this.getAno() +
							"\nPlaca: "       + this.getPlaca() ;
 	return resposta;
	}
	
public String mostrarDados(String titulo) { // Sempre que não for vazio, não retorna nada
		
	
		
		String resposta 	=	
							"\n\nMarca: " + this.getMarca()+
							"\nModelo: "   + this.getModelo() +
							"\nAno: "         + this.getAno() +
							"\nPlaca: "       + this.getPlaca() ;
 	return resposta;
	}

	// THIS referencia a própria classe.  
	// É uma referência que serve para acesso a todos.
	// Os atributos da classe.
	// (atributos e metódos).
	// Toda classe possui um THIS (identifica info que fazerm parte da classe).
	public void lerDados (String marca, String modelo, int ano, String placa) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
		
	/*this.marca = marca; 						// ATRIBUTOS X PARAMETROS 
		this.modelo = modelo;					// ATRIBUTOS X PARAMETROS 
		this.ano = setAno(ano);				// ATRIBUTOS X PARAMETROS 
		this.placa = placa;	 */					// ATRIBUTOS X PARAMETROS 
	}
	
	// GET ENVIA
	// SET RECEBE

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor que 1970. ");
		}
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
