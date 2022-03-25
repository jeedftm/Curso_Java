package br.com.impacta.classes;

import java.util.Random;

public class Automovel { // Tanto a classe com as váriaveis devem ser publicas para acesso futuro
	
	// Finalized 
	public static final String PAIS_ORIGEM = "Brasil"; 
	// Usa Static e Final junto, a variavel Tem que estar em Maisculo, por se tratar de uma constante
	
	// Atributos.
	private String marca;
	private String modelo;
	private  int ano;
	private String placa;
	
	private final int chassi;
	
	
	//construtores
	public Automovel ( String marca, String modelo) {
		this.chassi = (int)(Math.random()*1000);
		this.setMarca(marca);
		this.setModelo(modelo);	
	}
	public Automovel ( String marca, String modelo, int ano) {
		this(marca,modelo);
		this.setAno(ano);
	}
	public Automovel ( String marca, String modelo, int ano, String placa) {
		this(marca,modelo,ano);
		this.setPlaca(placa);
	}

	public String mostrarDados() { // Sempre que não for vazio, não retorna nada
		
		String titulo = "Dados do automovel";
		
		String resposta 	=	
				titulo + "\n\nMarca: " + this.getMarca()+
							"\nModelo: "   + this.getModelo()+
							"\nChassi : "   + this.getChassi()+
							"\nAno: "         + this.getAno() +
							"\nPais Origem: " + PAIS_ORIGEM +
							"\nPlaca: "       + this.getPlaca() ; 
		if (this.getAno() > 0) {
			 resposta += "\nAno: "         + this.getAno();
		}
		if (this.getPlaca() != null) {
			resposta += "\nPlaca: "       + this.getPlaca() ;
		}
		resposta += "\nPais Origem: " + PAIS_ORIGEM;
 	return resposta;
	}
	
public String mostrarDados(String titulo) { // Sempre que não for vazio, não retorna nada
		
	
		
		String resposta 	=	
				"\n\nMarca: " + this.getMarca()+
				"\nModelo: "   + this.getModelo()+
				"\nChassi : "   + this.getChassi()+
				"\nAno: "         + this.getAno() +
				"\nPais Origem: " + PAIS_ORIGEM +
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

	public int getChassi() {
		return chassi;
	}
	
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
