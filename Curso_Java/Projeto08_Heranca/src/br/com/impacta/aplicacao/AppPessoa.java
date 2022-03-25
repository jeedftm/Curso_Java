package br.com.impacta.aplicacao;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa pess = new Pessoa();
		pess.setNome("Jedson");
		pess.setIdade(18);
		pess.setSexo(Sexo.MASCULINO);
		
		// Instancia da classe funcionário
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(28);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Vendedor");
		funcionario.setSalario(5000);
		
		// Instanciando da classe aluno
		
		Aluno aluno = new Aluno();
		aluno.setNome("Tifany");
		aluno.setIdade(12);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(2030405060);
//		Curso novoCurso = new Curso ();
//		novoCurso.setCodigo(190);
//		novoCurso.setDescricao("Java Programmer");
//		novoCurso.setCargaHoraria(100);
//		novoCurso.setPreco(1000);
		
		aluno.setCurso(new Curso (222,"Java Programmer", 100, 1000));
		
	}
}
