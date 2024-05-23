package com.paulmsummitt.lunarphases;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.SqlDateModel;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.awt.EventQueue;
import javax.swing.JToolBar;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.Component;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JFormattedTextField.AbstractFormatter;
import org.jdatepicker.impl.DateComponentFormatter;

public class Lunar_Phases extends JFrame implements ActionListener {

	private JFrame frmLunarPhases;
	private JDatePickerImpl datePicker;
	/**
	 * @wbp.nonvisual location=317,269
	 */
	private final DateComponentFormatter dateComponentFormatter = new DateComponentFormatter();

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
		frmLunarPhases.getContentPane().setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Lunar Phases");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		frmLunarPhases.getContentPane().add(lblNewLabel, "name_221400315762100");

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, null);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, dateComponentFormatter);

		frmLunarPhases.getContentPane().add(datePicker);
	}

}
