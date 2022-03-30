package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCpf implements Documento{
	
	private String cpf;

	@Override
	public void setNumero(String numero) {
		// TODO Auto-generated method stub
		if(!numero.matches("[0-9] {11}")) {
			throw new NumberFormatException("CPF deve ter 11 digitos");
		}
		this.cpf = numero;
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return this.cpf;
	}
	
}
