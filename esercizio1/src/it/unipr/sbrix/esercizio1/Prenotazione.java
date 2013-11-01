package it.unipr.sbrix.esercizio1;

import java.io.Serializable;

public class Prenotazione extends ViaggiOrganizzati implements Serializable {
	@Override
	public String toString() {
		
		
		return "Prenotazione [id=" + id + ", cliente=" + cliente.toString()
				+ ", hotel=" + hotel.toString() + ", giorniPernottamento="
				+ durataPernottamento + ", andata=" + andata.toString()
				+ ", ritorno=" + ritorno.toString() + ", operatore="
				+ operatore.toString() + ", scadenza="
				+ scadenza
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1530929609848261724L;
	int id;
	Cliente cliente;
	Operatore operatore;
	long scadenza;

}
