package br.com.impacta.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.DocumentoCpf;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;

public class CadastroFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtCargo;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroFuncionarios frame = new CadastroFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionarios() {
		setForeground(new Color(255, 0, 0));
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 251);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 0, 0));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(6, 2, 342, 213);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDocumento.setForeground(new Color(255, 0, 0));
		lblDocumento.setBackground(new Color(192, 192, 192));
		lblDocumento.setBounds(10, 11, 88, 14);
		panel.add(lblDocumento);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome.setForeground(new Color(255, 0, 0));
		lblNome.setBackground(new Color(192, 192, 192));
		lblNome.setBounds(10, 36, 88, 14);
		panel.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setBackground(new Color(192, 192, 192));
		lblIdade.setBounds(10, 61, 88, 14);
		panel.add(lblIdade);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSexo.setForeground(new Color(255, 0, 0));
		lblSexo.setBackground(new Color(192, 192, 192));
		lblSexo.setBounds(10, 86, 88, 14);
		panel.add(lblSexo);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCargo.setForeground(new Color(255, 0, 0));
		lblCargo.setBackground(new Color(192, 192, 192));
		lblCargo.setBounds(10, 109, 88, 14);
		panel.add(lblCargo);

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSalario.setForeground(new Color(255, 0, 0));
		lblSalario.setBackground(new Color(192, 192, 192));
		lblSalario.setBounds(10, 135, 88, 14);
		panel.add(lblSalario);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(108, 9, 105, 20);
		panel.add(txtDocumento);
		txtDocumento.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(108, 34, 224, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(108, 59, 27, 20);
		panel.add(txtIdade);
		txtIdade.setColumns(10);

		txtCargo = new JTextField();
		txtCargo.setBounds(108, 107, 146, 20);
		panel.add(txtCargo);
		txtCargo.setColumns(10);

		txtSalario = new JTextField();
		txtSalario.setBounds(108, 133, 76, 20);
		panel.add(txtSalario);
		txtSalario.setColumns(10);

		JComboBox<Sexo> cmbSexo = new JComboBox<Sexo>();
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(108, 83, 105, 22);
		panel.add(cmbSexo);

		JButton btnIncluirFuncionario = new JButton("Incluir Funcionario");
		btnIncluirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					// Obtendo o documento.
					Documento documento;
					String doc = txtDocumento.getText();
					if (doc.length() == 11) {
						documento = new DocumentoCpf(doc);
					} else if (doc.length() == 14) {
						documento = new DocumentoCnpj(doc);
					} else {
						throw new Exception("Documento informado não é CPF nem CNPJ.");
					}

					// Obtendo nome
					String nome = txtNome.getText();
					// Obtendo a idade
					int idade = Integer.parseInt(txtIdade.getText());
					// obtendo o sexo
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();
					// obtendo o cargo.
					String cargo = txtCargo.getText();
					// obtendo salario
					double salario = Double.parseDouble(txtSalario.getText());
					// Instanciando a classe Funcionario
					Funcionario funcionario = new Funcionario(nome, idade, sexo, documento, cargo, salario);
					// Apresentado os dados
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, funcionario.mostrar());

				} catch (Exception e) {
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, "ERROR  : " + e.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnIncluirFuncionario.setBounds(10, 179, 146, 23);
		panel.add(btnIncluirFuncionario);
	}
}
