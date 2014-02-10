package fit2drive.gui.home;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HomeView extends JFrame {

	public enum Menuitems{
		SCHOOL,
		EMPLOYEE
		};
	
	private Map<Menuitems,JMenuItem> menuItems = new HashMap<>();
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final JMenuBar menuBar = new JMenuBar();
	
	
	public HomeView() {
		
		// Properties of JFrame
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		// Creating the JMenuBar
		this.setJMenuBar(menuBar);
		
		// Entities
		JMenu menuEntities = new JMenu("Entities");
		addNewJmenuItem(menuEntities, new JMenuItem("School"),   Menuitems.SCHOOL);
		addNewJmenuItem(menuEntities, new JMenuItem("Employee"), Menuitems.EMPLOYEE);
		menuBar.add(menuEntities);
		
		
		
		
	}
	
	private void addNewJmenuItem(JMenu menu, JMenuItem item, Menuitems key) {
		menu.add(item);
		menuItems.put(key, item);
	}
	
	public JMenuItem getMenuItem(Menuitems key) {
		return menuItems.get(key);
	}
	
	public void addActionListener(Menuitems key, ActionListener al) {
		this.getMenuItem(key).addActionListener(al);
	}

}
