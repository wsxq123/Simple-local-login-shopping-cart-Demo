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

import dao.impl.sellerDaoImpl;
import model.seller;
import util.dynamicClock;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class sellerForgetPwdUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sellerIdTextField;
	private JTextField birthdateTextField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sellerForgetPwdUI frame = new sellerForgetPwdUI();
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
	public sellerForgetPwdUI() {
		setBackground(Color.WHITE);
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
		panel_3.setBackground(Color.WHITE);
		panel_4.add(panel_3);
		panel_3.setPreferredSize(new Dimension(590, 50));

		JLabel lblNewLabel = new JLabel("Forget Password");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 40));
		panel_3.add(lblNewLabel);

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

		sellerIdTextField = new JTextField();
		sellerIdTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				warningLabel.setVisible(false);
			}
		});
		sellerIdTextField.setHorizontalAlignment(SwingConstants.CENTER);
		sellerIdTextField.setFont(new Font("新細明體", Font.PLAIN, 15));
		sellerIdTextField.setBorder(null);
		panel_2.add(sellerIdTextField);
		sellerIdTextField.setColumns(14);

		JPanel panel_2_1 = new JPanel();
		panel.add(panel_2_1);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setPreferredSize(new Dimension(200, 45));
		panel_2_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Seller Birthdate", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setLayout(new BoxLayout(panel_2_1, BoxLayout.X_AXIS));

		birthdateTextField = new JTextField();
		birthdateTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				warningLabel.setVisible(false);
			}
		});
		birthdateTextField.setHorizontalAlignment(SwingConstants.CENTER);
		birthdateTextField.setFont(new Font("新細明體", Font.PLAIN, 15));
		birthdateTextField.setBorder(null);
		panel_2_1.add(birthdateTextField);
		birthdateTextField.setColumns(14);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(520, 150));
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
				seller s = sdi.querySeller(Integer.parseInt(sellerIdTextField.getText()), birthdateTextField.getText());

				if (s != null) {
					DefaultTableModel tableModel = new DefaultTableModel(
							new Object[][] { { s.getSeller_id(), s.getSeller_name(), s.getPassword(),
									s.getSeller_brithdate() }, },
							new String[] { "id", "name", "password", "birth date" });
					table.setModel(tableModel);
					repaint();
				} else {
					warningLabel.setVisible(true);
					System.out.println("wrong input or no account");
				}
			}
		});
		loginBtn.setMargin(new Insets(2, 2, 2, 2));
		loginBtn.setIcon(new ImageIcon(sellerForgetPwdUI.class.getResource("/asset/searchBtn.png")));
		loginBtn.setContentAreaFilled(false);
		loginBtn.setBorderPainted(false);
		loginBtn.setBackground(Color.WHITE);
		loginBtn.setBounds(441, 318, 123, 32);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(540, 50));
		panel_4.add(panel_5);
		
		JButton loginBtn_1 = new JButton("");
		loginBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sellerLoginUI add = new sellerLoginUI();
				add.setVisible(true);
				dispose();
			}
		});
		panel_5.add(loginBtn_1);
		loginBtn_1.setIcon(new ImageIcon(sellerForgetPwdUI.class.getResource("/asset/backBtn.png")));
		loginBtn_1.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);
	}
}
