package controller.order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JComboBox;
import java.awt.Font;

public class orderAddUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderAddUI frame = new orderAddUI();
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
	public orderAddUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIconSpot.png"));
		lblNewLabel.setBounds(538, 8, 21, 25);
		contentPane.add(lblNewLabel);
		//set invisible at start
		lblNewLabel.setVisible(false);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 144, 554, 170);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIcon.png"));
		btnNewButton.setBounds(512, 10, 40, 32);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 16));
		comboBox.setEditable(true);
		comboBox.setBounds(33, 28, 159, 25);
		contentPane.add(comboBox);
		
		comboBox.addItem("a");
		comboBox.addItem("aa");
		comboBox.addItem("aaa");
		comboBox.addItem("aaaa");
		
		comboBox.setSelectedItem("select service");
	}
}
