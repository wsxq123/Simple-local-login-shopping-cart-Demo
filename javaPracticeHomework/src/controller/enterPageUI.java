package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.logInPageUI;
import controller.seller.sellerLoginUI;
import util.dynamicClock;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class enterPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enterPageUI frame = new enterPageUI();
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
	public enterPageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dynamicClock.createDynamicClock(contentPane);
		
		
		JLabel lblNewLabel_1 = new JLabel("<html>Beauty Plastic <br/> hospital</html>");
		lblNewLabel_1.setFont(new Font("Corbel Light", Font.PLAIN, 52));
		lblNewLabel_1.setBounds(252, 38, 295, 161);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("");
		btnNewButton.setRolloverEnabled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logInPageUI add=new logInPageUI();
				add.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(enterPageUI.class.getResource("/asset/Button_1_hover.png")));
				btnNewButton.setBounds(398, 242, 154, 51);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(enterPageUI.class.getResource("/asset/Button_1.png")));
				btnNewButton.setBounds(401, 244, 146, 48);
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(enterPageUI.class.getResource("/asset/Button_1.png")));
		btnNewButton.setBounds(401, 244, 146, 48);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("<HTML><U>seller system ></U></HTML>");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerLoginUI add=new sellerLoginUI();
				add.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(456, 10, 108, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-54, 10, 550, 366);
		lblNewLabel.setIcon(new ImageIcon(enterPageUI.class.getResource("/asset/BG2.jpg")));
		contentPane.add(lblNewLabel);
	}
}
