package it.unipr.sbrix.esercizio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class FrameAggiungiUtente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7286693484441790756L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCognome;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private Choice choiceUserType;

	/**
	 * Create the frame.
	 */
	public FrameAggiungiUtente(final Agenzia ag, final JPanel panel,
			@SuppressWarnings("rawtypes") final JList list) {
		setTitle("Aggiungi operatore");
		setResizable(false);
		setBounds(100, 100, 473, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		JLabel lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 0;
		gbc_lblTipo.gridy = 4;
		contentPane.add(lblTipo, gbc_lblTipo);

		choiceUserType = new Choice();
		choiceUserType.add("Cliente");
		choiceUserType.add("Operatore");
		choiceUserType.add("Administrator");
		GridBagConstraints gbc_choiceUserType = new GridBagConstraints();
		gbc_choiceUserType.anchor = GridBagConstraints.WEST;
		gbc_choiceUserType.insets = new Insets(0, 0, 5, 0);
		gbc_choiceUserType.gridx = 1;
		gbc_choiceUserType.gridy = 4;
		contentPane.add(choiceUserType, gbc_choiceUserType);
		GridBagConstraints gbc_btnAggiungi = new GridBagConstraints();
		gbc_btnAggiungi.insets = new Insets(0, 0, 0, 5);
		gbc_btnAggiungi.gridx = 0;
		gbc_btnAggiungi.gridy = 5;

		JButton btnAggiungi = new JButton("Aggiungi");
		btnAggiungi.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent arg0) {
				// aggiungi dati alla lista utenti
				Utente utente = new Utente(textFieldNome.getText().trim(), textFieldCognome
						.getText().trim(), textFieldUsername.getText().trim(), new String(
						passwordField.getPassword()).trim(), ag);
				switch (choiceUserType.getSelectedItem()) {
				case "Cliente": {
					utente.setUserType(Utente.CLIENTE);
					break;
				}
				case "Operatore": {
					utente.setUserType(Utente.OPERATORE);
					break;
				}
				case "Administrator": {
					utente.setUserType(Utente.ADMIN);
					break;

				}
				}

				ag.listaUtenti.add(utente);
				ag.saveToFile(ag.fileIdUtenti, ag.idGlobaleUtenti);
				ag.saveToFile(ag.fileUtenti, ag.listaUtenti);
				list.setListData(ag.listaUtenti.toArray());
				panel.revalidate();
				panel.repaint();
				JOptionPane.showMessageDialog(null, new JLabel("Utente inserito"));
				setVisible(false);

			}
		});
		contentPane.add(btnAggiungi, gbc_btnAggiungi);

	}

}
