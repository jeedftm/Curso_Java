package br.com.impacta.aplicacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Tarefa;

public class AppTarefa {

	public static void main(String[] args) {

		try {

			// Data e horas atuais
			Date data = new Date();
			System.out.println(data);
			// obtendo uma data do usuário.
			String sdata = JOptionPane.showInputDialog("Informe uma data (dd/mm/aa) ");
			// Convertendo o texto para um objeto Data.
			DateFormat dt = new SimpleDateFormat("dd/MM/yyyy"); // maisculo para não confundir com minutos
			Date dataUser = dt.parse(sdata);
			System.out.println(dataUser);
			// Apresentando as datas no formato BR
			/*
			 * System.out.println(dt.format(data)); 
			 * System.out.println(dt.format(dataUser));
			 */
			System.out.println();
			Tarefa t1 = new Tarefa(new Date(), "Gerar relatório", 10);
			Tarefa t2 = new Tarefa(dataUser, "Imprimir recibo NF", 5);
			
			System.out.println(t1);
			System.out.println(t2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
