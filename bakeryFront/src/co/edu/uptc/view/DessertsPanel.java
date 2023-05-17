package co.edu.uptc.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DessertsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -445059639786003944L;
	private DessertsTable dessertsTable;
	
	public DessertsPanel() {
		setLayout(new BorderLayout());
		
		dessertsTable = new DessertsTable();
		JScrollPane scrollPane = new JScrollPane(dessertsTable);
		
		add(scrollPane, BorderLayout.CENTER);
	}

}
