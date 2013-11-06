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

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class VistaGestioneOperatori extends JPanel implements	ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7391320298284444080L;
	@SuppressWarnings("rawtypes")
	private JList list = null;
	private JPanel panelList = new JPanel();
	private JPanel panelButtons = new JPanel();
	private JButton btnAggiungi = null;
	private JButton btnRimuovi = null;
	private Agenzia ag = null;
	// private JScrollPane scrollPane = null;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VistaGestioneOperatori(final Agenzia agenzia) {
		ag=agenzia;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		GridBagConstraints gbc_panelList = new GridBagConstraints();
		gbc_panelList.anchor = GridBagConstraints.NORTH;
		gbc_panelList.insets = new Insets(0, 0, 0, 5);
		gbc_panelList.gridx = 0;
		gbc_panelList.gridy = 0;
		add(panelList, gbc_panelList);
		panelList.setLayout(new BoxLayout(panelList, BoxLayout.Y_AXIS));

		JLabel lblGestioneOperatori = new JLabel("Gestione Operatori");
		panelList.add(lblGestioneOperatori);

		list = new JList(ag.listaOperatori.toArray());
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				panelList.invalidate();
				panelList.validate();
				panelList.repaint();

			}
		});
		list.setVisible(true);

		panelList.add(list);

		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.anchor = GridBagConstraints.NORTH;
		gbc_panelButtons.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelButtons.gridx = 1;
		gbc_panelButtons.gridy = 0;
		add(panelButtons, gbc_panelButtons);
		panelButtons.setLayout(new BoxLayout(panelButtons, BoxLayout.Y_AXIS));

		btnAggiungi = new JButton("Aggiungi");
		btnAggiungi.addActionListener(this);
		panelButtons.add(btnAggiungi);

		btnRimuovi = new JButton("Rimuovi");
		btnRimuovi.addActionListener(this);
		panelButtons.add(btnRimuovi);

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAggiungi){
			// aggiunta di un operatore alla lista operatori
			JFrame frameAggiungiOp = new FrameAggiungiOperatore(this.ag,panelList, list);
			
			frameAggiungiOp.setVisible(true);			
		}
		if (e.getSource() == btnRimuovi){
			//rimuovi elementi selezionati
			int tmp=list.getSelectedIndex();
			if (tmp!=-1) { 
				System.out.println(tmp);
				ag.listaOperatori.remove(tmp);
				ag.saveToFile(ag.fileOperatori, ag.listaOperatori);
				list.setListData(ag.listaOperatori.toArray());
				panelList.revalidate();
				panelList.repaint();
				
			}
			
		}
		
	}

}
