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
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		productListItem.createProductListItem(contentPane,"adv",1200);
		
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
