package br.com.impacta.classes;

public class Pessoaa {
	String nome;
	int idade;
	
	public Pessoaa (String n, int i) {
		nome = n;
		idade = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
