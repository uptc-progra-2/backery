package co.edu.uptc.view;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DessertsTable extends JTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"NOMBRE POSTRE", "PRECIO", "RECETA"};
	
	public DessertsTable() {
		Object[][] data = {
				{"Postre de maracuya", 5000, ""},
				{"Postre de tres leches", 5000, ""},
				{"Postre de fresa", 5000, ""},
				{"Postre de limon", 5000, ""},
				{"Postre de tiramisu", 5000, ""},
		};
		
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		setModel(model);
	}

}
