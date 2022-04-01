package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppArray06 {

	public static void main(String[] args) {
		
		Automovel [] automoveis = new Automovel [3];
		
		automoveis [0] = new Automovel("VW", "Fusca", 1972, "BBC1984");
		automoveis [1] = new Automovel("VW", "Kombi", 1980, "CDV1984");
		automoveis [2] = new Automovel("HYUNDAI", "Creta", 2022, "FH1C89");
		
		Arrays.sort(automoveis);
		
		for (Automovel automovel : automoveis) {
			JOptionPane.showMessageDialog(null, automovel.mostrar());
		}

	}

}
