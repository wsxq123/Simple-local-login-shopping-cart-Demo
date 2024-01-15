package controller.member;

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
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controller.searchPageUI;
import controller.seller.sellerSearchUI;
import dao.impl.memberDaoImpl;
import dao.impl.sellerDaoImpl;
import model.member;
import model.seller;
import util.dynamicClock;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class memberSearchUI extends JFrame {

	private JPanel contentPane;
	private JTextField phoneTextField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memberSearchUI frame = new memberSearchUI();
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
	public memberSearchUI() {
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(570, 40));
		panel_4.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 30 };
		gbl_panel.rowHeights = new int[] { 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 1.0 };
		panel.setLayout(gbl_panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.weightx = 1.0;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("Member Search");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Corbel", Font.PLAIN, 32));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton loginBtn_1_1 = new JButton("");
		loginBtn_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				searchPageUI add = new searchPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		panel_3.add(loginBtn_1_1);
		loginBtn_1_1.setIcon(new ImageIcon(memberSearchUI.class.getResource("/asset/backBtn.png")));
		loginBtn_1_1.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_1_1.setContentAreaFilled(false);
		loginBtn_1_1.setBorderPainted(false);
		loginBtn_1_1.setBackground(Color.WHITE);

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
		panel_2_3.setPreferredSize(new Dimension(150, 35));
		panel_2_3.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Member Phone", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_3.setLayout(new BoxLayout(panel_2_3, BoxLayout.X_AXIS));

		phoneTextField = new JTextField();
		phoneTextField.setBorder(null);
		panel_2_3.add(phoneTextField);
		phoneTextField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(520, 230));
		panel_4.add(scrollPane);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "name", "birthdate", "gender", "phone", "address"
			}
		));
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);

		JButton loginBtn_1_1_1 = new JButton("");
		loginBtn_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberDaoImpl mdi = new memberDaoImpl();
				if (phoneTextField.getText().isEmpty()) {
					System.out.println("input all field!");
				} else {
					member m = mdi.queryMember(phoneTextField.getText());
					if (m != null) {
						DefaultTableModel tableModel = new DefaultTableModel(
								new Object[][] { { m.getMember_id(), m.getName(), m.getBirthdate(), m.getGender(),
										m.getPhone(), m.getAddress() }, },
								new String[] { "id", "name", "birth date", "gender", "phone", "address" });
						table.setModel(tableModel);
						phoneTextField.setText("");
						repaint();
					} else {
						System.out.println("wrong input or no account");
					}
				}
			}
		});
		loginBtn_1_1_1.setIcon(new ImageIcon(memberSearchUI.class.getResource("/asset/searchBtn.png")));
		loginBtn_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_1_1_1.setContentAreaFilled(false);
		loginBtn_1_1_1.setBorderPainted(false);
		loginBtn_1_1_1.setBackground(Color.WHITE);
		panel_5.add(loginBtn_1_1_1);

		JButton loginBtn_1_1_1_1 = new JButton("");
		loginBtn_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberDaoImpl mdi = new memberDaoImpl();
				Object[][] o = mdi.queryAllMember();

				if (o != null) {
					DefaultTableModel tableModel = new DefaultTableModel(o,
							new String[] {"id", "name", "birth date", "gender", "phone", "address" });
					table.setModel(tableModel);
					repaint();
				} else {
					System.out.println("wrong input or no account");
				}
			}
		});
		loginBtn_1_1_1_1.setIcon(new ImageIcon(memberSearchUI.class.getResource("/asset/searchAllBtn.png")));
		loginBtn_1_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_1_1_1_1.setContentAreaFilled(false);
		loginBtn_1_1_1_1.setBorderPainted(false);
		loginBtn_1_1_1_1.setBackground(Color.WHITE);
		panel_5.add(loginBtn_1_1_1_1);

		JButton loginBtn_1_1_1_2 = new JButton("");
		loginBtn_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberDaoImpl mdi = new memberDaoImpl();
				mdi.deleteMember(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()));
				loginBtn_1_1_1_1.doClick();
			}
		});
		loginBtn_1_1_1_2.setIcon(new ImageIcon(memberSearchUI.class.getResource("/asset/deleteBtn2.png")));
		loginBtn_1_1_1_2.setMargin(new Insets(0, 0, 0, 0));
		loginBtn_1_1_1_2.setContentAreaFilled(false);
		loginBtn_1_1_1_2.setBorderPainted(false);
		loginBtn_1_1_1_2.setBackground(Color.WHITE);
		panel_5.add(loginBtn_1_1_1_2);
	}

}
