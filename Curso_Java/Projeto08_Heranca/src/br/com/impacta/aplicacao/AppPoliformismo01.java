package br.com.impacta.aplicacao;
import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPoliformismo01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO,"Dev", 5000);
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
		// Quem executa o metódo é o objeto, nunca a variavel.
		// p1 é apenas uma variavel de referencia
		// Poliformismo sempre ligado a metódo
		
		 p1 = new Aluno ("Jedson", 28, Sexo.MASCULINO, 20304050, 
				new Curso (10, "JAVA", 40, 20.00));
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
	}

}
