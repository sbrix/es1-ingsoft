package it.unipr.sbrix.esercizio1;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class VistaAdmin extends VistaOperatori {

	private JPanel contentPane;
	private Agenzia agenzia = null;

	/**
	 * Create the frame.
	 */
	
	/*public VistaAdmin(Agenzia ag){
		super(ag);
		lblShowmode.setText("Modalita Amministratore");
		lblShowutente.setText("Admin");
		agenzia = ag;
	
	}*/

	public VistaAdmin(int id,Agenzia ag) {
		super(id,ag);
		lblShowmode.setText("Modalita Amministratore");
		lblShowutente.setText("Admin");
		agenzia = ag;
		this.setId(-2);
		
		JButton btnGestioneOperatori = new JButton("Gestione Operatori");
		GridBagConstraints gbc_btnGestioneOperatori = new GridBagConstraints();
		gbc_btnGestioneOperatori.insets = new Insets(0, 0, 0, 5);
		gbc_btnGestioneOperatori.gridx = 0;
		gbc_btnGestioneOperatori.gridy = 2;
		this.panelOperazioni.add(btnGestioneOperatori, gbc_btnGestioneOperatori);
	}

}
