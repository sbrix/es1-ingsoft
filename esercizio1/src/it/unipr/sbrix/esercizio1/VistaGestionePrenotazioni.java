package it.unipr.sbrix.esercizio1;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class VistaGestionePrenotazioni extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5247151955150439392L;

	/**
	 * Create the panel.
	 */
	public VistaGestionePrenotazioni(int id) {
		ArrayList<Integer> idPrenotazioni = new ArrayList<>(0);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JList<JLabel> list = new JList<JLabel>();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		add(list, gbc_list);
		for (Prenotazione i:Agenzia.listaPrenotazioni){
			if (i.cliente.id == id){
				list.add(new JLabel(i.toString()));
				idPrenotazioni.add(i.id);
			}
		}
		
		JButton btnCompra = new JButton("Compra");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//gestione trasformazione prenotazione in vendita da parte del cliente
			}
		});
		GridBagConstraints gbc_btnCompra = new GridBagConstraints();
		gbc_btnCompra.anchor = GridBagConstraints.NORTH;
		gbc_btnCompra.gridx = 1;
		gbc_btnCompra.gridy = 0;
		add(btnCompra, gbc_btnCompra);

	}

}
