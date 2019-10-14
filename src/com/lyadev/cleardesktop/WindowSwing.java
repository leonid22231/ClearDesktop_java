package com.lyadev.cleardesktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowSwing extends Window {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6934152479513947610L;

	/**
	 * Launch the application.
	 */
	private int buttonheight;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowSwing frame = new WindowSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowSwing() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JButton btnNewProfile = new JButton("New profile");
		btnNewProfile.setSize(new Dimension(114, 26));
		mnNewMenu.add(btnNewProfile);
		
		JButton btnNewButton = new JButton("Load profile");
		btnNewButton.setPreferredSize(new Dimension(114, 26));
		btnNewButton.setMinimumSize(new Dimension(114, 26));
		btnNewButton.setSize(new Dimension(114, 26));
		mnNewMenu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save profile");
		mnNewMenu.add(btnNewButton_1);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JButton btnNewButton_2 = new JButton("About ClearDesktop");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnHelp.add(btnNewButton_2);

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
