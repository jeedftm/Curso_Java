package br.com.impacta.threads;

import javax.swing.JOptionPane;

public class ContadorThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 20; i++) {
				JOptionPane.showMessageDialog(null, i);
				Thread.sleep(500); // Atualização de meio segundo,tipo um time out
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
