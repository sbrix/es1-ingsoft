package it.unipr.sbrix.esercizio1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAdmin extends VistaOperatori {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8085052232171478200L;
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
		btnGestioneOperatori.addActionListener(new ActionListener() {
			
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
		this.panelOperazioni.add(btnGestioneOperatori, gbc_btnGestioneOperatori);
	}
	
	private void gestioneOperatori(Agenzia agenzia) {
		// TODO Auto-generated method stub
		panelVista.removeAll();
		panelVista.add(new VistaGestioneOperatori(agenzia));
		this.invalidate();
		this.validate();
		this.repaint();
		
	}

}
