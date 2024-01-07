package controller.member;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import controller.order.checkPageUI;
import controller.order.orderAddUI;
import controller.seller.sellerLoginUI;
import dao.impl.memberDaoImpl;
import model.member;
import util.TextPrompt;
import util.dynamicClock;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import java.awt.GridLayout;

public class registerPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField bitthdateTextField;
	private JTextField addressTextField;
	private JTextField phoneTextField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerPageUI frame = new registerPageUI();
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
	public registerPageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		dynamicClock.createDynamicClock(contentPane);
		
		JLabel promptTextLabel2 = new JLabel("Please input all field !");
		promptTextLabel2.setVisible(false);
		
				JLabel promptTextLabel = new JLabel("Account exist !");
				promptTextLabel.setVisible(false);
				promptTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
				promptTextLabel.setForeground(Color.RED);
				promptTextLabel.setBounds(210, 44, 165, 22);
				contentPane.add(promptTextLabel);
		promptTextLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		promptTextLabel2.setForeground(Color.RED);
		promptTextLabel2.setBounds(210, 44, 165, 22);
		contentPane.add(promptTextLabel2);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(-8, 5, 590, 365);
		panel_7.setPreferredSize(new Dimension(590, 365));
		contentPane.add(panel_7);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_7.add(panel_3);
		panel_3.setPreferredSize(new Dimension(590, 40));

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 32));
		panel_3.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_7.add(panel);
		panel.setPreferredSize(new Dimension(590, 45));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_2.setPreferredSize(new Dimension(200, 40));
		panel_2.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Name",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		nameTextField = new JTextField();
		nameTextField.setHorizontalAlignment(SwingConstants.CENTER);
		nameTextField.setBorder(null);
		panel_2.add(nameTextField);
		nameTextField.setColumns(10);

		// Prompt word in textField
		TextPrompt tp = new TextPrompt("Ex: Tony", nameTextField);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_7.add(panel_1);
		panel_1.setPreferredSize(new Dimension(590, 45));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setPreferredSize(new Dimension(200, 40));
		panel_2_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Birth Date", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BoxLayout(panel_2_1, BoxLayout.X_AXIS));

		bitthdateTextField = new JTextField();
		bitthdateTextField.setHorizontalAlignment(SwingConstants.CENTER);
		bitthdateTextField.setColumns(10);
		bitthdateTextField.setBorder(null);
		panel_2_1.add(bitthdateTextField);
		// TODO-Date Picker

		TextPrompt tp2 = new TextPrompt("Ex: 19900101", bitthdateTextField);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_7.add(panel_1_2);
		panel_1_2.setPreferredSize(new Dimension(590, 65));
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setPreferredSize(new Dimension(280, 60));
		panel_6.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Gender",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.add(panel_6);

		JRadioButton maleRadioBtn = new JRadioButton("male");
		maleRadioBtn.setBackground(Color.WHITE);
		panel_6.add(maleRadioBtn);
		buttonGroup.add(maleRadioBtn);

		JRadioButton femaleRadioBtn = new JRadioButton("female");
		femaleRadioBtn.setBackground(Color.WHITE);
		panel_6.add(femaleRadioBtn);
		buttonGroup.add(femaleRadioBtn);

		JRadioButton thirdRadioBtn = new JRadioButton("prefer not to say");
		thirdRadioBtn.setBackground(Color.WHITE);
		panel_6.add(thirdRadioBtn);
		buttonGroup.add(thirdRadioBtn);

		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setBackground(Color.WHITE);
		panel_7.add(panel_1_2_2);
		panel_1_2_2.setPreferredSize(new Dimension(590, 45));
		panel_1_2_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setPreferredSize(new Dimension(200, 40));
		panel_4.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Phone",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

		phoneTextField = new JTextField();
		panel_4.add(phoneTextField);
		phoneTextField.setHorizontalAlignment(SwingConstants.CENTER);
		phoneTextField.setColumns(10);
		phoneTextField.setBorder(null);

		TextPrompt tp3 = new TextPrompt("Ex: 09xxxxxxxx", phoneTextField);

		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBackground(Color.WHITE);
		panel_7.add(panel_1_2_1);
		panel_1_2_1.setPreferredSize(new Dimension(590, 45));
		panel_1_2_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setPreferredSize(new Dimension(200, 40));
		panel_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Address",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2_1.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

		addressTextField = new JTextField();
		panel_5.add(addressTextField);
		addressTextField.setHorizontalAlignment(SwingConstants.CENTER);
		addressTextField.setColumns(10);
		addressTextField.setBorder(null);

		TextPrompt tp4 = new TextPrompt("Ex: Taipei", addressTextField);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.WHITE);
		panel_7.add(panel_1_1_1);
		panel_1_1_1.setPreferredSize(new Dimension(590, 45));
		panel_1_1_1.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_1_1_1.add(panel_8);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_1_1_1.add(panel_10);

		JButton loginBtn_1 = new JButton("");
		loginBtn_1.setBorder(null);
		panel_10.add(loginBtn_1);
		loginBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				promptTextLabel.setVisible(false);
				promptTextLabel2.setVisible(false);
				boolean check = true;

				// 看有沒有沒寫的欄位
				JTextField[] inputArr = { nameTextField, bitthdateTextField, phoneTextField, addressTextField };
				for (JTextField o : inputArr) {
					if (o.getText().isEmpty()) {
						check = false;
						System.out.println("check1: "+check);
					}
				}

				// 看gender哪個被選中
				Integer gender = -1;
				if (buttonGroup.getSelection() != null) {
					if (maleRadioBtn.isSelected() == true)
						gender = 0;
					if (femaleRadioBtn.isSelected() == true)
						gender = 1;
					if (thirdRadioBtn.isSelected() == true)
						gender = 2;
				} else {
					System.out.println("check2: "+check);
					check = false;
				}

				if (check == true) {
					// check member account not exist
					memberDaoImpl mdi = new memberDaoImpl();
					if (!mdi.queryMemberAccount(phoneTextField.getText(), bitthdateTextField.getText())) {
						// create member account
						mdi.createMember(new member(nameTextField.getText(), bitthdateTextField.getText(), gender,
								phoneTextField.getText(), addressTextField.getText()));

						// switch to logInPageUI
						logInPageUI add = new logInPageUI();
						add.setVisible(true);
						dispose();

					} else {
						promptTextLabel.setVisible(true);
						System.out.println("account exist!");
					}
				}else {
					promptTextLabel2.setVisible(true);
				}
			}
		});
		loginBtn_1.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_1.setIcon(new ImageIcon(registerPageUI.class.getResource("/asset/signUpBtn.png")));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);

		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_9.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_9.setBackground(Color.WHITE);
		panel_1_1_1.add(panel_9);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logInPageUI add=new logInPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(registerPageUI.class.getResource("/asset/backBtn.png")));
		panel_9.add(btnNewButton);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut);
		tp4.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp4.setHorizontalAlignment(SwingConstants.CENTER);
		tp4.setForeground(Color.gray);
		tp3.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp3.setHorizontalAlignment(SwingConstants.CENTER);
		tp3.setForeground(Color.gray);
		tp2.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp2.setHorizontalAlignment(SwingConstants.CENTER);
		tp2.setForeground(Color.gray);
		tp.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp.setHorizontalAlignment(SwingConstants.CENTER);
		tp.setForeground(Color.gray);
	}
}
