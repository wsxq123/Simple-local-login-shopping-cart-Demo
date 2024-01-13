package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.logInPageUI;
import controller.member.memberSearchUI;
import controller.order.orderAddUI;
import controller.order.orderSearchUI;
import controller.product.productSearchUI;
import controller.seller.sellerLoginUI;
import controller.seller.sellerSearchUI;
import dao.impl.memberDaoImpl;
import util.cal;
import util.dynamicClock;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;

public class searchPageUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchPageUI frame = new searchPageUI();
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
	public searchPageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dynamicClock.createDynamicClock(contentPane);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(5, 5, 576, 366);
		contentPane.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_6.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_6.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_3.add(panel);
		panel.setBorder(null);
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				orderSearchUI add = new orderSearchUI();
				add.setVisible(true);
				dispose();
			}
		});
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel.add(panel_4);
		btnNewButton_3.setMargin(new Insets(15, 2, 15, 2));
		btnNewButton_3.setIcon(new ImageIcon(searchPageUI.class.getResource("/asset/orderSearchBtn.png")));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(441, 318, 123, 32);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberSearchUI add = new memberSearchUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_1.setIcon(new ImageIcon(searchPageUI.class.getResource("/asset/memberSearchBtn.png")));
		btnNewButton_3_1.setMargin(new Insets(15, 2, 15, 2));
		btnNewButton_3_1.setContentAreaFilled(false);
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_3_1);
		
		
		JButton btnNewButton_3_1_1 = new JButton("");
		btnNewButton_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				productSearchUI add = new productSearchUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_1_1.setIcon(new ImageIcon(searchPageUI.class.getResource("/asset/productSearchBtn.png")));
		btnNewButton_3_1_1.setMargin(new Insets(15, 2, 15, 2));
		btnNewButton_3_1_1.setContentAreaFilled(false);
		btnNewButton_3_1_1.setBorderPainted(false);
		btnNewButton_3_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_3_1_1);
		
		
		JButton btnNewButton_3_1_1_1 = new JButton("");
		btnNewButton_3_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerSearchUI add = new sellerSearchUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_1_1_1.setIcon(new ImageIcon(searchPageUI.class.getResource("/asset/sellerSearchBtn.png")));
		btnNewButton_3_1_1_1.setMargin(new Insets(15, 2, 15, 2));
		btnNewButton_3_1_1_1.setContentAreaFilled(false);
		btnNewButton_3_1_1_1.setBorderPainted(false);
		btnNewButton_3_1_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_3_1_1_1);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel.add(panel_5);
		
		JPanel panel_1 = new JPanel();
		panel_6.add(panel_1);
		panel_1.setBackground(Color.WHITE);
	}

}
