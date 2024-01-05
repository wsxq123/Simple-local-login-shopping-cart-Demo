package controller;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.order_product;
import util.productListItem;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class test3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

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
		panel.setBounds(100, 24, 326, 34);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("name");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("price");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("get test1");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				JTextField jtf = new JTextField();
//				jtf = (JTextField) panel.getComponent(0);
//				System.out.println(jtf.getText());
				
//				order_product op = new order_product();
//				
//				for(Component c:panel.getComponents()) {
//					
//				}
				
				JLabel jl = (JLabel) panel.getComponent(0);
				System.out.println(jl.getText());
				JLabel jl2 = (JLabel) panel.getComponent(1);
				System.out.println(jl2.getText());
				JTextField jtf = (JTextField) panel.getComponent(2);
				System.out.println(jtf.getText());
				
				
			}
		});
		btnNewButton.setBounds(441, 218, 87, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(100, 96, 338, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setMaximumSize(new Dimension(32767, 30));
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setMaximumSize(new Dimension(32767, 30));
		panel_1.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setMaximumSize(new Dimension(32767, 30));
		panel_1.add(panel_2_1_1);
		
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
