package br.com.impacta.aplicacao;

import br.com.impacta.threads.ContadorThread;

public class AppThread01 {

	public static void main(String[] args) {
		ContadorThread t1 = new ContadorThread();
		t1.start();

	}

}
