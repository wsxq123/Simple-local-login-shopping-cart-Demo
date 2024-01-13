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
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controller.searchPageUI;
import controller.order.orderSearchUI;
import dao.impl.sellerDaoImpl;
import model.seller;
import util.dynamicClock;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class sellerSearchUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField newNameTextField;
	private JTextField newPwdTextField;
	private JTextField newBirthdateTextField;
	private JTextField sellerIdTextField;
	private JTextField birthDateTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sellerSearchUI frame = new sellerSearchUI();
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
	public sellerSearchUI() {
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

		JLabel lblNewLabel = new JLabel("Seller Search");
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

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(520, 45));
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 4, 0, 0));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_5.add(panel_6);

		JPanel panel_2_3 = new JPanel();
		panel_6.add(panel_2_3);
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setPreferredSize(new Dimension(120, 35));
		panel_2_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"SellerName", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_3.setLayout(new BoxLayout(panel_2_3, BoxLayout.X_AXIS));

		newNameTextField = new JTextField();
		newNameTextField.setBorder(null);
		panel_2_3.add(newNameTextField);
		newNameTextField.setColumns(10);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_5.add(panel_10);

		JPanel panel_2_4 = new JPanel();
		panel_10.add(panel_2_4);
		panel_2_4.setBackground(Color.WHITE);
		panel_2_4.setPreferredSize(new Dimension(120, 35));
		panel_2_4.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"SellerPassword", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_4.setLayout(new BoxLayout(panel_2_4, BoxLayout.X_AXIS));

		newPwdTextField = new JTextField();
		newPwdTextField.setBorder(null);
		panel_2_4.add(newPwdTextField);
		newPwdTextField.setColumns(10);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_5.add(panel_11);

		JPanel panel_2_5 = new JPanel();
		panel_11.add(panel_2_5);
		panel_2_5.setBackground(Color.WHITE);
		panel_2_5.setPreferredSize(new Dimension(120, 35));
		panel_2_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"SellerBirthDate", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_5.setLayout(new BoxLayout(panel_2_5, BoxLayout.X_AXIS));

		newBirthdateTextField = new JTextField();
		newBirthdateTextField.setBorder(null);
		panel_2_5.add(newBirthdateTextField);
		newBirthdateTextField.setColumns(10);

		JButton loginBtn_3 = new JButton("");
		loginBtn_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerDaoImpl sdi = new sellerDaoImpl();
				sdi.createSeller(new seller(newNameTextField.getText(), newPwdTextField.getText(),
						newBirthdateTextField.getText()));
				newNameTextField.setText("");
				newPwdTextField.setText("");
				newBirthdateTextField.setText("");
			}
		});
		loginBtn_3.setIcon(new ImageIcon(sellerSearchUI.class.getResource("/asset/AddBtn.png")));
		loginBtn_3.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_3.setContentAreaFilled(false);
		loginBtn_3.setBorderPainted(false);
		loginBtn_3.setBackground(Color.WHITE);
		panel_5.add(loginBtn_3);

		JPanel panel_14 = new JPanel();
		panel_14.setPreferredSize(new Dimension(520, 2));
		panel_14.setBackground(Color.BLACK);
		panel_4.add(panel_14);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_4.add(panel);
		panel.setPreferredSize(new Dimension(520, 45));
		panel.setLayout(new GridLayout(0, 4, 0, 0));

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.WHITE);
		panel.add(panel_12);

		JPanel panel_2 = new JPanel();
		panel_12.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setPreferredSize(new Dimension(120, 35));
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "SellerID",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		sellerIdTextField = new JTextField();
		sellerIdTextField.setColumns(10);
		sellerIdTextField.setBorder(null);
		panel_2.add(sellerIdTextField);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel.add(panel_13);

		JPanel panel_2_1 = new JPanel();
		panel_13.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setPreferredSize(new Dimension(120, 35));
		panel_2_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Seller Birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setLayout(new BoxLayout(panel_2_1, BoxLayout.X_AXIS));

		birthDateTextField = new JTextField();
		birthDateTextField.setColumns(10);
		birthDateTextField.setBorder(null);
		panel_2_1.add(birthDateTextField);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(520, 170));
		panel_1.setBackground(Color.WHITE);
		panel_4.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		panel_1.add(scrollPane);

		table = new JTable();
		table.setSelectionForeground(Color.WHITE);
		table.setGridColor(Color.LIGHT_GRAY);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);

		JButton loginBtn = new JButton("");
		panel.add(loginBtn);
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerDaoImpl sdi = new sellerDaoImpl();
				if (sellerIdTextField.getText().isEmpty() || birthDateTextField.getText().isEmpty()) {
					System.out.println("input all field!");
				} else {
					seller s = sdi.querySeller(Integer.parseInt(sellerIdTextField.getText()),
							birthDateTextField.getText());
					if (s != null) {
						DefaultTableModel tableModel = new DefaultTableModel(
								new Object[][] { { s.getSeller_id(), s.getSeller_name(), s.getPassword(),
										s.getSeller_brithdate() }, },
								new String[] { "id", "name", "password", "birth date" });
						table.setModel(tableModel);
						sellerIdTextField.setText("");
						birthDateTextField.setText("");
						repaint();
					} else {

						System.out.println("wrong input or no account");
					}
				}
			}
		});
		loginBtn.setMargin(new Insets(2, 2, 2, 2));
		loginBtn.setIcon(new ImageIcon(sellerForgetPwdUI.class.getResource("/asset/searchBtn.png")));
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setBounds(441, 318, 123, 32);

		JButton loginBtn_2 = new JButton("");
		loginBtn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerDaoImpl sdi = new sellerDaoImpl();
				Object[][] o = sdi.queryAllSeller();

				if (o != null) {
					DefaultTableModel tableModel = new DefaultTableModel(o,
							new String[] { "id", "name", "password", "birth date" });
					table.setModel(tableModel);
					repaint();
				} else {
					System.out.println("wrong input or no account");
				}
			}
		});
		panel.add(loginBtn_2);
		loginBtn_2.setIcon(new ImageIcon(sellerSearchUI.class.getResource("/asset/searchAllBtn.png")));
		loginBtn_2.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_2.setContentAreaFilled(false);
		loginBtn_2.setBorderPainted(false);
		loginBtn_2.setBackground(Color.WHITE);
	}

}
