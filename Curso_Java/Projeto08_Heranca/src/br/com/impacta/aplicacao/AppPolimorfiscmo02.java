package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfiscmo02 {

	public static void main(String[] args) {
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO,"Dev", 5000);
		 Aluno p2 = new Aluno ("Jedson", 28, Sexo.MASCULINO, 20304050, 
				new Curso (10, "JAVA", 40, 20.00));
		 
		 mostrarPessoa (p1);
		 mostrarPessoa (p2);

	}
	
	private static void mostrarPessoa (Pessoa p) {
		
		String nomeClasse = p.getClass().getSimpleName();
		String resposta = p.mostrar();
		JOptionPane.showMessageDialog(null, "Classe: " + nomeClasse + "\n " + resposta);
	}

}
