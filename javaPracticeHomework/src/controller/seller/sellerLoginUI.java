package controller.seller;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controller.enterPageUI;
import controller.searchPageUI;
import controller.member.logInPageUI;
import dao.impl.sellerDaoImpl;
import util.dynamicClock;
import java.awt.GridLayout;

public class sellerLoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField phoneTextField;
	private JTextField pwdTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sellerLoginUI frame = new sellerLoginUI();
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
	public sellerLoginUI() {
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
		verticalStrut_1_1.setPreferredSize(new Dimension(590, 10));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_4.add(panel_3);
		panel_3.setPreferredSize(new Dimension(590, 60));
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6);

		JLabel lblNewLabel = new JLabel("Seller Login");
		lblNewLabel.setBackground(Color.WHITE);
		panel_6.add(lblNewLabel);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 40));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5);

		JButton loginBtn_2 = new JButton("");
		loginBtn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enterPageUI add = new enterPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		panel_5.add(loginBtn_2);
		loginBtn_2.setIcon(new ImageIcon(sellerLoginUI.class.getResource("/asset/backBtn.png")));
		loginBtn_2.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_2.setContentAreaFilled(false);
		loginBtn_2.setBorderPainted(false);
		loginBtn_2.setBackground(Color.WHITE);

		JLabel warningLabel = new JLabel("Wrong input or No account");
		panel_4.add(warningLabel);
		warningLabel.setVisible(false);
		warningLabel.setForeground(Color.RED);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_4.add(panel);
		panel.setPreferredSize(new Dimension(590, 60));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_2.setPreferredSize(new Dimension(200, 45));
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SellerID",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		phoneTextField = new JTextField();
		phoneTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				warningLabel.setVisible(false);
			}
		});
		phoneTextField.setHorizontalAlignment(SwingConstants.CENTER);
		phoneTextField.setFont(new Font("新細明體", Font.PLAIN, 15));
		phoneTextField.setBorder(null);
		panel_2.add(phoneTextField);
		phoneTextField.setColumns(14);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_4.add(panel_1);
		panel_1.setPreferredSize(new Dimension(590, 60));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setPreferredSize(new Dimension(200, 45));
		panel_2_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Password",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BoxLayout(panel_2_1, BoxLayout.X_AXIS));

		pwdTextField = new JTextField();
		pwdTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				warningLabel.setVisible(false);
			}
		});
		pwdTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pwdTextField.setFont(new Font("新細明體", Font.PLAIN, 15));
		pwdTextField.setBorder(null);
		panel_2_1.add(pwdTextField);
		pwdTextField.setColumns(14);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_4.add(panel_1_1);
		panel_1_1.setPreferredSize(new Dimension(590, 45));
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton loginBtn = new JButton("");
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				sellerDaoImpl s = new sellerDaoImpl();
				if (s.querySellerAccount(Integer.parseInt(phoneTextField.getText()), pwdTextField.getText())) {
					searchPageUI add = new searchPageUI();
					add.setVisible(true);
					dispose();
				} else {
					warningLabel.setVisible(true);
					System.out.println("wrong input or no account");
				}
			}
		});
		loginBtn.setMargin(new Insets(2, 2, 2, 2));
		loginBtn.setIcon(new ImageIcon(logInPageUI.class.getResource("/asset/loginBtn.png")));
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setBounds(441, 318, 123, 32);
		panel_1_1.add(loginBtn);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_4.add(panel_1_1_1);
		panel_1_1_1.setPreferredSize(new Dimension(590, 45));
		panel_1_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton loginBtn_1 = new JButton("");
		loginBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerForgetPwdUI add = new sellerForgetPwdUI();
				add.setVisible(true);
				dispose();
			}
		});
		loginBtn_1.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_1.setIcon(new ImageIcon(sellerLoginUI.class.getResource("/asset/forgetPwd.png")));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);
		panel_1_1_1.add(loginBtn_1);

	}

}
