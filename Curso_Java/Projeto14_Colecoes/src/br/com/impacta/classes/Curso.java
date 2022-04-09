package br.com.impacta.classes;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Curso implements Comparable<Curso> {

	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;

	public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setPreco(preco);
	}

	public String mostrar() {

		return "Código: " + this.getCodigo() + "\nDescrição: " + this.getDescricao() + "\nCarga Horária: "
				+ this.getCargaHoraria() + "\nPreço: " + this.getPreco();

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Curso arg0) {
		
		return this.getDescricao().compareTo(arg0.getDescricao());
	}
	
	@Override
	public boolean equals (Object obj) {
		Curso s = (Curso) obj;
		if (this.getCodigo() == s.getCodigo() &&
				)
	}
	RETURN false;

}