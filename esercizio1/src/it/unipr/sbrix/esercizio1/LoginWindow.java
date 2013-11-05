package it.unipr.sbrix.esercizio1;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class LoginWindow {

	private JFrame frmLogin;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private static Agenzia agenzia = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			agenzia = new Agenzia();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 120);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		frmLogin.getContentPane().setLayout(gridBagLayout);

		JLabel lblUsername = new JLabel("Username:");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		frmLogin.getContentPane().add(lblUsername, gbc_lblUsername);

		textFieldUsername = new JTextField();
		GridBagConstraints gbc_textFieldUsername = new GridBagConstraints();
		gbc_textFieldUsername.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUsername.gridx = 1;
		gbc_textFieldUsername.gridy = 0;
		frmLogin.getContentPane().add(textFieldUsername, gbc_textFieldUsername);
		textFieldUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		frmLogin.getContentPane().add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		frmLogin.getContentPane().add(passwordField, gbc_passwordField);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				// controllo se utente e cliente o operatore
				String name = new String(textFieldUsername.getText());
				String pwd = new String(passwordField.getPassword());
				if (!agenzia.listaClienti.isEmpty()) {
					for (Cliente i : agenzia.listaClienti) {
						if (i.userName.equals(name) && i.password.equals(Base64Service.encode(pwd))) {
							// vai schermata clienti
							VistaCliente frameCliente = new VistaCliente(i.id, agenzia);
						}
					}
				} else if (!agenzia.listaOperatori.isEmpty()) {
					for (Operatore i : agenzia.listaOperatori) {
						if (i.userName.equals(name) && i.password.equals(Base64Service.encode(pwd))) {
							// vai schermata operatore
							VistaOperatori vistaOp = new VistaOperatori(i.id_personale,agenzia);
							
							
						}
					}
				} else {
					if (name.equals("admin") && pwd.equals("admin")) {
						
						VistaAdmin frameAdmin = new VistaAdmin(-2,agenzia);
						
						frameAdmin.setVisible(true);
						frmLogin.setVisible(false);
						
						
						

					} else {
						JOptionPane.showMessageDialog(null, new JLabel(
								"Password o nome utente non valido"));
						textFieldUsername.setText(null);
						passwordField.setText(null);
					}
				}
			}

		});
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.BOTH;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 0;
		gbc_btnLogin.gridy = 2;
		frmLogin.getContentPane().add(btnLogin, gbc_btnLogin);
		frmLogin.getContentPane().setFocusTraversalPolicy(
				new FocusTraversalOnArray(new Component[] { lblUsername, textFieldUsername,
						lblPassword, passwordField, btnLogin }));
	}

}
