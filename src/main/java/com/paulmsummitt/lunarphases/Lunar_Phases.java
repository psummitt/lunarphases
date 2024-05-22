package com.paulmsummitt.lunarphases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Lunar_Phases {

	private JFrame frmLunarPhases;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lunar_Phases window = new Lunar_Phases();
					window.frmLunarPhases.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lunar_Phases() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLunarPhases = new JFrame();
		frmLunarPhases.setTitle("Lunar Phases");
		frmLunarPhases.setBounds(100, 100, 450, 300);
		frmLunarPhases.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
