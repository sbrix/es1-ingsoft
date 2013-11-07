package it.unipr.sbrix.esercizio1;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

//ArrayList<Integer> idPrenotazioni = new ArrayList<>(0);
/*for (Prenotazione i : ag.listaPrenotazioni) {
 if (i.cliente.id == id) {
 list.add(new JLabel(i.toString()));
 idPrenotazioni.add(i.id);
 }*/
public class VistaGestionePrenotazioni extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5247151955150439392L;
	private JPanel panelLista = new JPanel();
	private JButton btnAggiungi = new JButton("Aggiungi");
	private JPanel panelButtons = new JPanel();
	private JButton btnCompra = new JButton("Compra");
	private JButton btnRimuovi = new JButton("Rimuovi");
	private final JLabel lblGestionePrenotazioni = new JLabel("Gestione prenotazioni");
	@SuppressWarnings("rawtypes")
	private final JList list = new JList();

	/**
	 * Create the panel.
	 */
	public VistaGestionePrenotazioni(int uType, int id, Agenzia ag) {
		// System.out.println("Costruttore vista gestione prenotazione");
		// ArrayList<Integer> idPrenotazioni = new ArrayList<>(0);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		GridBagConstraints gbc_panelLista = new GridBagConstraints();
		gbc_panelLista.insets = new Insets(0, 0, 0, 5);
		gbc_panelLista.fill = GridBagConstraints.VERTICAL;
		gbc_panelLista.gridx = 0;
		gbc_panelLista.gridy = 0;
		add(panelLista, gbc_panelLista);
		panelLista.setLayout(new BoxLayout(panelLista, BoxLayout.Y_AXIS));

		panelLista.add(lblGestionePrenotazioni);

		panelLista.add(list);

		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelButtons.anchor = GridBagConstraints.NORTH;
		gbc_panelButtons.gridx = 1;
		gbc_panelButtons.gridy = 0;
		add(panelButtons, gbc_panelButtons);
		panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.Y_AXIS));
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// trasforma prenotazione in vendita
			}
		});

		panelButtons.add(btnCompra);
		btnRimuovi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// rimuovi prenotazione
			}
		});

		panelButtons.add(btnAggiungi);

		btnAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// aggiungi prenotazione
			}
		});

		panelButtons.add(btnRimuovi);
		if (uType != Utente.CLIENTE) {
			System.out.println("debug rimozione pulsante aggiungi");
			btnAggiungi.setVisible(false);
			
		}
		this.invalidate();
		this.validate();
		this.repaint();
		this.setVisible(true);

	}

}
