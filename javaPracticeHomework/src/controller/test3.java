package controller;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import util.productListItem;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class test3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		productListItem.createProductListItem(contentPane,"adv","1200");
		productListItem.createProductListItem(contentPane,"asdad","1900");
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(100, 24, 141, 68);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		System.out.println(panel.getHeight());
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JScrollBar scrollBar = new JScrollBar();
		panel_2.add(scrollBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 112, 174, 55);
		contentPane.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_3.add(btnNewButton_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(327, 24, 116, 93);
		contentPane.add(scrollPane_1);
		
		JPanel panel_4 = new JPanel();
		scrollPane_1.setViewportView(panel_4);
		
		JButton btnNewButton_10 = new JButton("New button");
		
		JButton btnNewButton_9 = new JButton("New button");
		
		JButton btnNewButton_11 = new JButton("New button");
		
		JButton btnNewButton_13 = new JButton("New button");
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		panel_4.add(btnNewButton_10);
		panel_4.add(btnNewButton_9);
		panel_4.add(btnNewButton_11);
		panel_4.add(btnNewButton_13);
		panel_4.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_4.add(btnNewButton_14);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(307, 161, 141, 73);
		contentPane.add(scrollPane_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		scrollPane_2.setColumnHeaderView(lblNewLabel);
		
		System.out.println(scrollPane_1.getHeight());
		System.out.println(panel_4.getSize());
		System.out.println(panel_4.getSize().getSize());
		System.out.println(panel_4.getSize().getHeight());
		System.out.println(panel_4.getHeight());
		
		
//		JPanel panel_4_2_1 = new JPanel();
//		contentPane.add(panel_4_2_1);
//		GridBagLayout gbl_panel_4_2_1 = new GridBagLayout();
//		gbl_panel_4_2_1.columnWidths = new int[]{0, 30, 30, 30, 30, 30, 30, 0, 0, 0, 0};
//		gbl_panel_4_2_1.rowHeights = new int[]{0, 0};
//		gbl_panel_4_2_1.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		gbl_panel_4_2_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
//		panel_4_2_1.setLayout(gbl_panel_4_2_1);
//		
//		JLabel lblNewLabel_1_2_1 = new JLabel("bodyShape_coolSculpting");
//		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
//		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
//		gbc_lblNewLabel_1_2_1.ipadx = 20;
//		gbc_lblNewLabel_1_2_1.fill = GridBagConstraints.HORIZONTAL;
//		gbc_lblNewLabel_1_2_1.gridwidth = 2;
//		gbc_lblNewLabel_1_2_1.insets = new Insets(0, 0, 0, 5);
//		gbc_lblNewLabel_1_2_1.gridx = 0;
//		gbc_lblNewLabel_1_2_1.gridy = 0;
//		panel_4_2_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		

	}
}
