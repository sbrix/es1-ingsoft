package it.unipr.sbrix.esercizio1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaAdmin extends VistaOperatori {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3327525701222224498L;
	private JFrame mainFrame = new JFrame("Pannello amministratore");
	private JPanel mainPanel = new JPanel();
	private GridBagLayout layout = new GridBagLayout();
	private JPanel listaOperazioni = new JPanel();
	private JPanel header = new JPanel();
	private JLabel nomeUtente = new JLabel();
	private Agenzia agenzia;
	
	public VistaAdmin(Agenzia ag){
		agenzia = ag;
		GridBagConstraints labelConst = new GridBagConstraints();
		labelConst.anchor=GridBagConstraints.NORTHWEST;
		GridBagConstraints boxListConst = new GridBagConstraints();
		boxListConst.anchor = GridBagConstraints.WEST;
		GridBagConstraints centralFrameConst = new GridBagConstraints();
		centralFrameConst.anchor = GridBagConstraints.CENTER;
		mainFrame.setSize(800, 600);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void run() {

		// String nome = null;
		// String cognome = null;
		

		
	}

	void  init() {

		

		GridBagConstraints constrainLabel = new GridBagConstraints();
		constrainLabel.gridx = 0;
		constrainLabel.gridy = 0;
		JLabel nomeUtente = new JLabel("Admin mode");
		layout.addLayoutComponent(nomeUtente, constrainLabel);
		//layout.setConstraints(nomeOperatore, constrainLabel);
		

		JButton gestioneVoli = new JButton("Gestione voli");
		JButton gestioneViaggiOrganizzati = new JButton("Gestione viaggi organizzati");
		JButton gestionePrenotazioni = new JButton("Gestione Prenotazioni");
		JButton gestioneVendite = new JButton("Gestione vendite");
		BoxLayout layoutOperazioni = new BoxLayout(listaOperazioni, BoxLayout.Y_AXIS);
		listaOperazioni.add(gestioneVendite);
		listaOperazioni.add(gestionePrenotazioni);
		GridBagConstraints constrainOperazioni = new GridBagConstraints();
		constrainOperazioni.gridx = 0;
		constrainOperazioni.gridy = 1;
		layout.addLayoutComponent(listaOperazioni, constrainOperazioni);
		header.add(nomeUtente);
		
		mainPanel.setLayout(layout);
		mainPanel.add(header);
		mainPanel.add(listaOperazioni);
	    mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}

	JButton addGestioneHotel() {
		JButton gestioneHotel = new JButton("Gestione hotel");
		gestioneHotel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		return gestioneHotel;
	}
	
	JButton addGestioneClienti(){
		JButton gestioneClienti = new JButton("Gestione clienti");
		gestioneClienti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		return gestioneClienti;
	}

	
}
