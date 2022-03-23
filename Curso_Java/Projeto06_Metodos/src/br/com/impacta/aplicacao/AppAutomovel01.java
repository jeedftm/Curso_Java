package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {
		char pulaLinha = '\n';
		// Declarando Variavel

		// tipo, nome, instanciar
		Automovel auto = new Automovel(); // Variavel auto
		auto.lerDados("Honda", "Civic", 2021, "EBB1234");
		
		auto.setAno(1970);	
		/*auto.ano = 2021; // Atributos
		auto.marca = "Honda"; // Atributos
		auto.modelo = "Civic"; // Atributos
		auto.placa = "EBB1234"; // Atributos

		System.out.println("Print sem o método" + pulaLinha + auto.ano);
		System.out.println(auto.marca);
		System.out.println(auto.modelo);
		System.out.println(auto.placa + pulaLinha +  pulaLinha  ); */
		
		// Utilizando metódo dentro do bean para mostrar.
		
		System.out.println("Print com o método \n");
		String texto = 	auto.mostrarDados("Informações"); // "objeto auto" e classe mostrar
		System.out.println(texto);
		JOptionPane.showMessageDialog(null,texto);
		JOptionPane.showMessageDialog(null,texto,"Relatório",JOptionPane.ERROR_MESSAGE);
		
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

	}
}
