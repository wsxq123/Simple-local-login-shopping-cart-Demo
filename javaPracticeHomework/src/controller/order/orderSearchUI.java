package controller.order;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.searchPageUI;
import controller.seller.sellerSearchUI;
import util.dynamicClock;

public class orderSearchUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderSearchUI frame = new orderSearchUI();
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
	public orderSearchUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);

		dynamicClock.createDynamicClock(contentPane);
		contentPane.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 574, 376);
		panel_4.setPreferredSize(new Dimension(590, 365));
		contentPane.add(panel_4);

		Component verticalStrut_1_1 = Box.createVerticalStrut(20);
		panel_4.add(verticalStrut_1_1);
		verticalStrut_1_1.setPreferredSize(new Dimension(590, 5));

		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(Color.WHITE);
		panel_4.add(panel_3);
		panel_3.setPreferredSize(new Dimension(570, 45));
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setForeground(Color.WHITE);
		panel_3.add(panel_7);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setForeground(Color.WHITE);
		panel_3.add(panel_9);

		JLabel lblNewLabel = new JLabel("Order Search");
		panel_9.add(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 32));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setForeground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_8.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_8);
		
		JButton loginBtn_1 = new JButton("");
		loginBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchPageUI add = new searchPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		loginBtn_1.setMargin(new Insets(0, 0, 0, 30));
		loginBtn_1.setIcon(new ImageIcon(sellerSearchUI.class.getResource("/asset/backBtn.png")));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);
		panel_8.add(loginBtn_1);
	}

}
