package it.unipr.sbrix.esercizio1;

import java.io.Serializable;

public class Vendite extends ViaggiOrganizzati implements Serializable {

	@Override
	public String toString() {
		return "Vendite [id=" + id + ", cliente=" + cliente.toString() + ", hotel="
				+ hotel.toString() + ", giorniPernottamento=" + durataPernottamento
				+ ", andata=" + andata.toString() + ", ritorno=" + ritorno.toString()
				+ ", operatore=" + operatore.toString() + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 2808661019581646478L;
	int id;
	Utente cliente;
	Operatore operatore;
}
