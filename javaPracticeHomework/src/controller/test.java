package controller;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(400, 300));
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		panel_2.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pack();
				panel_2.getAutoscrolls();
				System.out.println(Window.getWindows());

			}
		});
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_2.add(panel_1_1);
		
		JButton btnNewButton_2_1 = new JButton("New button");
		panel_1_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("New button");
		panel_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_2.add(panel_1_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("New button");
		panel_1_1_1.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
		panel_1_1_1.add(lblNewLabel_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("New button");
		panel_1_1_1.add(btnNewButton_1_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_2.add(panel_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("New button");
		panel_1_1_1_1.add(btnNewButton_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("New label");
		panel_1_1_1_1.add(lblNewLabel_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1.add(btnNewButton_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_2.add(panel_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1.add(btnNewButton_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("New label");
		panel_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		panel_2.add(panel_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1_1.add(btnNewButton_2_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("New label");
		panel_1_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		panel_2.add(panel_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1_1_1.add(btnNewButton_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("New label");
		panel_1_1_1_1_1_1_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1_1_1 = new JButton("New button");
		panel_1_1_1_1_1_1_1.add(btnNewButton_1_1_1_1_1_1_1_1);
	}

}
