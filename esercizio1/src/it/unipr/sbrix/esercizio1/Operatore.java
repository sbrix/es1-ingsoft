package it.unipr.sbrix.esercizio1;

import java.io.Serializable;

public class Operatore implements Serializable {

	@Override
	public String toString() {
		return "Operatore [name=" + name + ", cognome=" + cognome
				+ ", id_personale=" + id_personale + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -1354786526633497969L;
	String name=null;
	String cognome=null;
	String userName = null;
	String password = null;
	Integer id_personale=null;
	//static Integer id_globale=null;
	
	Operatore( String a, String b, String un, String pwd){
		name=a;
		cognome=b;
		userName= un;
		password = Base64Service.encode(pwd);
		
		
	}
	Operatore(){}
}
