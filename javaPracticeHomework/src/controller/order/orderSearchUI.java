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

import controller.searchPageUI;
import controller.seller.sellerSearchUI;
import dao.impl.orderDaoImpl;
import util.dynamicClock;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class orderSearchUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField startTextField;
	private JTextField endTextField;
	private JTable table;

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

		Component verticalStrut_1_1_1 = Box.createVerticalStrut(20);
		verticalStrut_1_1_1.setPreferredSize(new Dimension(590, 5));
		panel_4.add(verticalStrut_1_1_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(560, 50));
		panel_4.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2_3 = new JPanel();
		panel_5.add(panel_2_3);
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setPreferredSize(new Dimension(130, 35));
		panel_2_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"date start", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_3.setLayout(new BoxLayout(panel_2_3, BoxLayout.X_AXIS));

		startTextField = new JTextField();
		startTextField.setBorder(null);
		panel_2_3.add(startTextField);
		startTextField.setColumns(10);

		JPanel panel = new JPanel();
		panel_5.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(130, 35));
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "date end",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		endTextField = new JTextField();
		endTextField.setBorder(null);
		panel.add(endTextField);
		endTextField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(520, 230));
		panel_4.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"id", "number", "Date", "Time", "memberID", "sellerID", "total"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(65);
		table.getColumnModel().getColumn(4).setPreferredWidth(60);
		table.getColumnModel().getColumn(5).setPreferredWidth(60);
		scrollPane.setViewportView(table);

		JButton loginBtn_1_1 = new JButton("");
		loginBtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderDaoImpl odi = new orderDaoImpl();

				Object[][] o = odi.queryOrderByDate(startTextField.getText(), endTextField.getText());
				if (o != null) {
					DefaultTableModel tableModel = new DefaultTableModel(o,
							new String[] {"id", "number", "Date", "Time", "memberID", "sellerID", "total"});
					table.setModel(tableModel);
					
					table.getColumnModel().getColumn(0).setPreferredWidth(20);
					table.getColumnModel().getColumn(1).setPreferredWidth(100);
					table.getColumnModel().getColumn(2).setPreferredWidth(80);
					table.getColumnModel().getColumn(3).setPreferredWidth(65);
					table.getColumnModel().getColumn(4).setPreferredWidth(60);
					table.getColumnModel().getColumn(5).setPreferredWidth(60);
					
					repaint();
				} else {
					System.out.println("wrong input or no account");
				}
			}
		});
		loginBtn_1_1.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_1_1.setIcon(new ImageIcon(orderSearchUI.class.getResource("/asset/searchBtn.png")));
		loginBtn_1_1.setContentAreaFilled(false);
		loginBtn_1_1.setBorderPainted(false);
		loginBtn_1_1.setBackground(Color.WHITE);
		panel_5.add(loginBtn_1_1);

	}

}
