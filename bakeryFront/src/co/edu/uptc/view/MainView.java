package co.edu.uptc.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4277622400715270756L;

	public MainView() {
		// get screen dimensions
		Dimension fullScreen = Toolkit.getDefaultToolkit().getScreenSize();
		
		// View Configuration
		setSize(fullScreen);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		add(new MainTabbedPane());
	}
}
