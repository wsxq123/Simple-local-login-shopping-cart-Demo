package controller.member;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import dao.impl.memberDaoImpl;
import model.member;
import util.TextPrompt;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

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
		contentPane.setPreferredSize(new Dimension(590, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(590, 40));
		contentPane.add(panel_3);

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 32));
		panel_3.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(590, 45));
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2 = new JPanel();
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
		tp.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp.setHorizontalAlignment(SwingConstants.CENTER);
		tp.setForeground(Color.gray);

		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(590, 45));
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_2_1 = new JPanel();
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
		//TODO-Date Picker

		TextPrompt tp2 = new TextPrompt("Ex: 19900101", bitthdateTextField);
		tp2.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp2.setHorizontalAlignment(SwingConstants.CENTER);
		tp2.setForeground(Color.gray);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setPreferredSize(new Dimension(590, 65));
		contentPane.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(280, 60));
		panel_6.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Gender",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_2.add(panel_6);

		JRadioButton maleRadioBtn = new JRadioButton("male");
		panel_6.add(maleRadioBtn);
		buttonGroup.add(maleRadioBtn);

		JRadioButton femaleRadioBtn = new JRadioButton("female");
		panel_6.add(femaleRadioBtn);
		buttonGroup.add(femaleRadioBtn);

		JRadioButton thirdRadioBtn = new JRadioButton("prefer not to say");
		panel_6.add(thirdRadioBtn);
		buttonGroup.add(thirdRadioBtn);

		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setPreferredSize(new Dimension(590, 45));
		contentPane.add(panel_1_2_2);
		panel_1_2_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_4 = new JPanel();
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
		tp3.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp3.setHorizontalAlignment(SwingConstants.CENTER);
		tp3.setForeground(Color.gray);

		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setPreferredSize(new Dimension(590, 45));
		contentPane.add(panel_1_2_1);
		panel_1_2_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_5 = new JPanel();
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
		tp4.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp4.setHorizontalAlignment(SwingConstants.CENTER);
		tp4.setForeground(Color.gray);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setPreferredSize(new Dimension(590, 45));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton loginBtn_1 = new JButton("");
		loginBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 看gender哪個被選中
				Integer gender = -1;
				if (buttonGroup.getSelection() != null) {
					if (maleRadioBtn.isSelected() == true) gender = 0;
					if (femaleRadioBtn.isSelected() == true) gender = 1;
					if (thirdRadioBtn.isSelected() == true) gender = 2;
				}
				
				//create member account
				memberDaoImpl mdi = new memberDaoImpl();
				mdi.createMember(new member(nameTextField.getText(), bitthdateTextField.getText(), gender,
											phoneTextField.getText(), addressTextField.getText()));
				
				//switch to logInPageUI
				logInPageUI add=new logInPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		loginBtn_1.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_1.setIcon(new ImageIcon(registerPageUI.class.getResource("/asset/signUpBtn.png")));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);
		panel_1_1_1.add(loginBtn_1);
	}

}
