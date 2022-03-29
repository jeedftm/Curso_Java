package br.com.impacta.classes;

public class Retangulo extends Figura {
	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Sobrescrita obrigat�ria
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.getBase() * this.getAltura();
	}

}

// CRIAR O CIRCULO
