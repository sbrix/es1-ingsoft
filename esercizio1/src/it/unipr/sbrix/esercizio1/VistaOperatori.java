package it.unipr.sbrix.esercizio1;

public class VistaOperatori extends VistaCliente {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2492679810842288395L;
	

	

	public VistaOperatori(int idCliente,Agenzia ag) {
		super(idCliente,ag);
		
		// TODO Auto-generated constructor stub

	}
	
	

	public void setId(int number) {
		this.operatoreID = number;
	}

}
