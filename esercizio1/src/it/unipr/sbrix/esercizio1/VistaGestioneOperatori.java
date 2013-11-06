package it.unipr.sbrix.esercizio1;

import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestioneOperatori extends JPanel {

	/**
	 * Create the panel.
	 */
	public VistaGestioneOperatori(final Agenzia ag) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panelList = new JPanel();
		GridBagConstraints gbc_panelList = new GridBagConstraints();
		gbc_panelList.anchor = GridBagConstraints.NORTH;
		gbc_panelList.insets = new Insets(0, 0, 0, 5);
		gbc_panelList.gridx = 0;
		gbc_panelList.gridy = 0;
		add(panelList, gbc_panelList);
		panelList.setLayout(new BoxLayout(panelList, BoxLayout.Y_AXIS));
		
		JLabel lblGestioneOperatori = new JLabel("Gestione Operatori");
		panelList.add(lblGestioneOperatori);
		
		JList list = new JList();
		panelList.add(list);
		
		JPanel panelButtons = new JPanel();
		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.anchor = GridBagConstraints.NORTH;
		gbc_panelButtons.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelButtons.gridx = 1;
		gbc_panelButtons.gridy = 0;
		add(panelButtons, gbc_panelButtons);
		panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.Y_AXIS));
		
		JButton btnAggiungi = new JButton("Aggiungi");
		btnAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//aggiunta di un operatore alla lista operatori
				JFrame frameAggiungiOp = new FrameAggiungiOperatore(ag);
				frameAggiungiOp.setVisible(true);
				
				
			}
		});
		panelButtons.add(btnAggiungi);
		
		JButton btnRimuovi = new JButton("Rimuovi");
		panelButtons.add(btnRimuovi);

	}

}
