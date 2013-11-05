package it.unipr.sbrix.esercizio1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		final Agenzia agenzia = new Agenzia();

		JFrame frame = new JFrame("Login");
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(3, 2);
		panel.setLayout(layout);
		frame.setSize(400, 100);
		final JTextField userName = new JTextField();
		// userName.setText("User name");
		// userName.setVisible(true);
		final JPasswordField password = new JPasswordField("");
		JLabel userLabel = new JLabel("User name:");
		
		JLabel passwordLabel = new JLabel("Password:");
		
		JButton loginButton = new JButton("Accedi");
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//controllo se utente e cliente o operatore
				String name = new String(userName.getText());
				String pwd = new String(password.getPassword());
				if(!agenzia.listaClienti.isEmpty()){
					for (Cliente i:agenzia.listaClienti){
						if (i.userName.equals(name) && i.password.equals(Base64Service.encode(pwd))){
							//vai schermata clienti
						}
					}
				}
				else 
					if(!agenzia.listaOperatori.isEmpty()){
						for ( Operatore i:agenzia.listaOperatori){
							if (i.userName.equals(name) && i.password.equals(Base64Service.encode(pwd))){
								//vai schermata operatore
								VistaOperatori vistaOp = new VistaOperatori();
								vistaOp.setId(i.id_personale);
								vistaOp.run();
							}
						}
					}
					else {
						if (name.equals("admin") && pwd.equals("admin")){
							
						}
						else JOptionPane.showMessageDialog(null, new JLabel("Nessun utente valido nel database"));
					}
				// TODO Auto-generated method stub
				
			}
		});
		
		// password.setVisible(true);
		panel.add(userLabel);
		panel.add(userName);
		panel.add(passwordLabel);
		panel.add(password);
		panel.add(loginButton);
		frame.add(panel);
		frame.setVisible(true);
		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		agenzia.consoleInput.close();

	}

}
