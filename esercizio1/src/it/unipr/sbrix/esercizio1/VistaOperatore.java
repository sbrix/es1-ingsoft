package it.unipr.sbrix.esercizio1;

import javax.swing.JButton;

public class VistaOperatore extends VistaCliente {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2492679810842288395L;

	public VistaOperatore(int userType, int idOperatore, Agenzia ag) {
		super(userType, idOperatore, ag);

		JButton btnGestioneClienti = new JButton("Gestione Clienti");
		panelOperazioni.add(btnGestioneClienti);

		JButton btnGestioneHotel = new JButton("Gestione Hotel");
		panelOperazioni.add(btnGestioneHotel);

		JButton btnGestioneVoli = new JButton("Gestione Voli");
		panelOperazioni.add(btnGestioneVoli);

		JButton btnGestioneViaggiOrganizzati = new JButton(
				"Gestione Viaggi Organizzati");
		panelOperazioni.add(btnGestioneViaggiOrganizzati);
		this.lblShowmode.setText("Operatore");
		this.revalidate();
		this.repaint();

		// TODO Auto-generated constructor stub

	}

}
