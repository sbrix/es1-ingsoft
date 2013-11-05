package it.unipr.sbrix.esercizio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1951610647929956881L;
	private JPanel contentPane;
	private int userId = -1;

	/**
	 * Create the frame.
	 */
	public VistaCliente() {
	}

	public VistaCliente(int id) {
		userId = id;
		setTitle("Agenzia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblModalit = new JLabel("Modalit\u00E0:");
		GridBagConstraints gbc_lblModalit = new GridBagConstraints();
		gbc_lblModalit.insets = new Insets(0, 0, 5, 5);
		gbc_lblModalit.gridx = 0;
		gbc_lblModalit.gridy = 0;
		contentPane.add(lblModalit, gbc_lblModalit);

		JLabel lblShowmode = new JLabel("showMode");
		GridBagConstraints gbc_lblShowmode = new GridBagConstraints();
		gbc_lblShowmode.anchor = GridBagConstraints.WEST;
		gbc_lblShowmode.insets = new Insets(0, 0, 5, 0);
		gbc_lblShowmode.gridx = 1;
		gbc_lblShowmode.gridy = 0;
		contentPane.add(lblShowmode, gbc_lblShowmode);

		JLabel lblUtente = new JLabel("Utente:");
		GridBagConstraints gbc_lblUtente = new GridBagConstraints();
		gbc_lblUtente.insets = new Insets(0, 0, 5, 5);
		gbc_lblUtente.gridx = 0;
		gbc_lblUtente.gridy = 1;
		contentPane.add(lblUtente, gbc_lblUtente);

		JLabel lblShowutente = new JLabel("showUtente");
		GridBagConstraints gbc_lblShowutente = new GridBagConstraints();
		gbc_lblShowutente.anchor = GridBagConstraints.WEST;
		gbc_lblShowutente.insets = new Insets(0, 0, 5, 0);
		gbc_lblShowutente.gridx = 1;
		gbc_lblShowutente.gridy = 1;
		contentPane.add(lblShowutente, gbc_lblShowutente);

		JPanel panelOperazioni = new JPanel();
		GridBagConstraints gbc_panelOperazioni = new GridBagConstraints();
		gbc_panelOperazioni.anchor = GridBagConstraints.NORTHWEST;
		gbc_panelOperazioni.insets = new Insets(0, 0, 0, 5);
		gbc_panelOperazioni.gridx = 0;
		gbc_panelOperazioni.gridy = 2;
		contentPane.add(panelOperazioni, gbc_panelOperazioni);
		panelOperazioni.setLayout(new BoxLayout(panelOperazioni, BoxLayout.X_AXIS));

		JButton btnGestionePrenotazioni = new JButton("Gestione Prenotazioni");
		btnGestionePrenotazioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gestionePrenotazione(userId);
			}
		});
		panelOperazioni.add(btnGestionePrenotazioni);

		JPanel panelVista = new JPanel();
		GridBagConstraints gbc_panelVista = new GridBagConstraints();
		gbc_panelVista.fill = GridBagConstraints.BOTH;
		gbc_panelVista.gridx = 1;
		gbc_panelVista.gridy = 2;
		contentPane.add(panelVista, gbc_panelVista);
	}

	private void gestionePrenotazione(int id) {

	}

}