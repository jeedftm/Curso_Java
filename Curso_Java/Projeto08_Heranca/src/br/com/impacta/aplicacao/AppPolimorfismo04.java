package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo04 {

	public static void main(String[] args) {
		Pessoa p1 = new Funcionario("Joel", 29, Sexo.MASCULINO, "Dev", 5000);

		Funcionario func = (Funcionario) p1;
		func.setSalario(40000);

		JOptionPane.showMessageDialog(null, p1.mostrar());

		p1 = new Aluno("Jedson", 28, Sexo.MASCULINO, 20304050, new Curso(10, "JAVA", 40, 20.00));

		Curso curso = new Curso(11, "C#", 100, 1.200);
		
		if (p1 instanceof Aluno) {
			
			p1.setIdade(27);
			((Aluno) p1).setCurso(curso);
		}

		Aluno aluno = (Aluno) p1;
		aluno.setCurso(curso);
		
		// Forma de realizar o typeCast
		((Aluno)p1).setCurso(curso);

		JOptionPane.showMessageDialog(null, p1.mostrar());

	}

}
