package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa pess = new Pessoa();
		pess.nome = "Jedson";
		pess.idade = 19;
		pess.sexo = Sexo.MASCULINO;
	}
}
