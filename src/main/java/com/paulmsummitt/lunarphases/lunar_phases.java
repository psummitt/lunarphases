package com.paulmsummitt.lunarphases;

/**
  * @author Paul M. Summitt
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.jdatepicker.impl.DateComponentFormatter;

public class lunar_phases extends javax.swing.JFrame {
	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);;
	String day = "";
	JDialog d;

	/**
	 * Creates new form lunar_phases
	 */
	public lunar_phases() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	// Generated using JFormDesigner Evaluation license - unknown
	private void initComponents() {

		// ======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Lunar Phases");
		var contentPane = getContentPane();

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPaneLayout.setHorizontalGroup(
				contentPaneLayout.createParallelGroup(Alignment.LEADING)
						.addGap(0, 375, Short.MAX_VALUE));
		contentPaneLayout.setVerticalGroup(
				contentPaneLayout.createParallelGroup(Alignment.LEADING)
						.addGap(0, 287, Short.MAX_VALUE));
		contentPane.setLayout(contentPaneLayout);
		pack();
		setLocationRelativeTo(getOwner());
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(lunar_phases.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(lunar_phases.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(lunar_phases.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(lunar_phases.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new lunar_phases().setVisible(true);
			}
		});
	}

	/**
	 * @return the dateComponentFormatter
	 */
	public DateComponentFormatter getDateComponentFormatter() {
		return dateComponentFormatter;
	}

	UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model, null);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
}
