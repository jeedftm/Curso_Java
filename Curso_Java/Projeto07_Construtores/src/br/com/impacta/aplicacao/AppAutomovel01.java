package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		char pulaLinha = '\n';

		Automovel auto = new Automovel("Passei a marca", "Passei o modelo"); // Variavel auto método que aceita 2 parametros
		JOptionPane.showMessageDialog(null, auto.mostrarDados());
		Automovel auto2 = new Automovel("Passei a placa2", "Passei o modelo2", 2050); // método que aceita 3 parametros
		JOptionPane.showMessageDialog(null, auto2.mostrarDados());
		Automovel auto3 = new Automovel("Passei a placa3", "Passei o modelo3", 2050, "Passei a Placa1"); // método que aceita 4 parametros
		JOptionPane.showMessageDialog(null, auto3.mostrarDados());
		/*
		 * Valores DAFAULT para ATRUBUTOS: numericos: 0 boolean: false char: \o
		 * referencia (classes): null
		 */

	}
}
