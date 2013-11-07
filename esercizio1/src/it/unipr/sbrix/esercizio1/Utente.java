package it.unipr.sbrix.esercizio1;

import java.io.Serializable;

public class Utente implements Serializable {
	@Override
	public String toString() {
		return "ID="+id+", Nome=" + nome + ", Cognome=" + cognome +", Username="+userName+ ", Tipo=" + userTypeToString();
	}

	public static final int ADMIN = 0;
	public static final int OPERATORE = 1;
	public static final int CLIENTE = 2;
	private static final long serialVersionUID = 3705447070498719951L;

	Utente() {
	};

	Utente(String nm, String cg, String un, String pw, Agenzia ag) {

		nome = nm;
		cognome = cg;
		userName = un;
		password = pw;
		userType = Utente.CLIENTE;
		id = ag.idGlobaleUtenti++;
		ag.saveToFile(ag.fileIdUtenti, ag.idGlobaleUtenti);

	}

	private int id;

	public int getId() {
		return id;
	}

	String nome = null;
	String cognome = null;
	String userName = null;
	String password = null;
	private int userType;

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String userTypeToString() {
		switch (this.userType) {
		case CLIENTE: {
			return new String("Cliente");
		}
		case OPERATORE: {
			return new String("Operatore");
		}
		case ADMIN: {
			return new String("Admin");
		}
		default: return null;
		}
	}
}
