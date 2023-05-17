package co.edu.uptc.view;

import javax.swing.JTabbedPane;

public class MainTabbedPane extends JTabbedPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4871298341229057712L;
	
	private DessertsPanel dessertsPanel;
	private CakePanel cakePanel;
	
	public MainTabbedPane() {
		dessertsPanel = new DessertsPanel();
		cakePanel = new CakePanel();
		
		addTab("Postres", dessertsPanel);
		addTab("Pasteles", cakePanel);
		
	}

}
