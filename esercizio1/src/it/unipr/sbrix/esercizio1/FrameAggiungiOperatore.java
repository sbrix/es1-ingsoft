package it.unipr.sbrix.esercizio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameAggiungiOperatore extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCognome;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	

	/**
	 * Create the frame.
	 */
	public FrameAggiungiOperatore(final Agenzia ag) {
		setTitle("Aggiungi operatore");
		setResizable(false);
		setBounds(100, 100, 467, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		contentPane.add(lblNome, gbc_lblNome);
		
		textFieldNome = new JTextField();
		GridBagConstraints gbc_textFieldNome = new GridBagConstraints();
		gbc_textFieldNome.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNome.gridx = 1;
		gbc_textFieldNome.gridy = 0;
		contentPane.add(textFieldNome, gbc_textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCognome = new JLabel("Cognome:");
		GridBagConstraints gbc_lblCognome = new GridBagConstraints();
		gbc_lblCognome.anchor = GridBagConstraints.EAST;
		gbc_lblCognome.insets = new Insets(0, 0, 5, 5);
		gbc_lblCognome.gridx = 0;
		gbc_lblCognome.gridy = 1;
		contentPane.add(lblCognome, gbc_lblCognome);
		
		textFieldCognome = new JTextField();
		GridBagConstraints gbc_textFieldCognome = new GridBagConstraints();
		gbc_textFieldCognome.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCognome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCognome.gridx = 1;
		gbc_textFieldCognome.gridy = 1;
		contentPane.add(textFieldCognome, gbc_textFieldCognome);
		textFieldCognome.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 2;
		contentPane.add(lblUsername, gbc_lblUsername);
		
		textFieldUsername = new JTextField();
		GridBagConstraints gbc_textFieldUsername = new GridBagConstraints();
		gbc_textFieldUsername.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUsername.gridx = 1;
		gbc_textFieldUsername.gridy = 2;
		contentPane.add(textFieldUsername, gbc_textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 3;
		contentPane.add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 3;
		contentPane.add(passwordField, gbc_passwordField);
		
		JButton btnAggiungi = new JButton("Aggiungi");
		btnAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//aggiungi dati alla lista operatori
				Operatore op = new Operatore(textFieldNome.getText().trim(), textFieldCognome.getText().trim(), textFieldUsername.getText().trim(), new String(passwordField.getPassword()));
				op.id_personale= ag.idGlobaleOperatori++;
				ag.listaOperatori.add(op);
				ag.saveToFile(ag.fileIdOperatori, ag.idGlobaleOperatori);
				ag.saveToFile(ag.fileOperatori, ag.listaOperatori);
				
				
			}
		});
		GridBagConstraints gbc_btnAggiungi = new GridBagConstraints();
		gbc_btnAggiungi.insets = new Insets(0, 0, 0, 5);
		gbc_btnAggiungi.gridx = 0;
		gbc_btnAggiungi.gridy = 4;
		contentPane.add(btnAggiungi, gbc_btnAggiungi);
	}

}
