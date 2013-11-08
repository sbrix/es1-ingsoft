package it.unipr.sbrix.esercizio1;

public class VistaOperatore extends VistaCliente {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2492679810842288395L;

	public VistaOperatore(int userType, int idOperatore, Agenzia ag) {
		super(userType, idOperatore, ag);

		// TODO Auto-generated constructor stub

	}

	public void setId(int number) {
		this.personalID = number;
	}

}
