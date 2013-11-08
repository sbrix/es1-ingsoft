package it.unipr.sbrix.esercizio1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAdmin extends VistaOperatore {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8085052232171478200L;
	private JPanel contentPane;
	private Agenzia agenzia = null;

	/**
	 * Create the frame.
	 */

	public VistaAdmin(int ut, int id, Agenzia ag) {
		super(ut, id, ag);
		lblShowmode.setText("Modalita Amministratore");
		lblShowutente.setText("Admin");
		agenzia = ag;
		this.setId(-2);

		JButton btnGestioneUtenti = new JButton("Gestione utenti");
		GridBagConstraints gbc_btnGestioneOperatori = new GridBagConstraints();
		gbc_btnGestioneOperatori.insets = new Insets(0, 0, 0, 5);
		gbc_btnGestioneOperatori.gridx = 0;
		gbc_btnGestioneOperatori.gridy = 2;
		btnGestioneUtenti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// TODO Auto-generated method stub

				if (agenzia != null)
					gestioneOperatori(agenzia);
				else {
					JOptionPane.showMessageDialog(null, new JLabel("Errore"));
					System.exit(ERROR);

				}
			}

		});
		this.panelOperazioni.add(btnGestioneUtenti, gbc_btnGestioneOperatori);
	}

	private void gestioneOperatori(Agenzia agenzia) {
		// TODO Auto-generated method stub
		panelVista.removeAll();
		panelVista.add(new VistaGestioneUtenti(agenzia));
		this.invalidate();
		this.validate();
		this.repaint();

	}

}
