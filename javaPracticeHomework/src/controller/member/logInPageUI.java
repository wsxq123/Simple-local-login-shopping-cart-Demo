package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.order.orderAddUI;
import dao.impl.memberDaoImpl;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import util.TextPrompt;
import util.cal;
import util.dynamicClock;

import java.awt.Component;
import javax.swing.Box;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.border.EtchedBorder;

public class logInPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField phoneTextField;
	private JTextField birthDateTextField;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logInPageUI frame = new logInPageUI();
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
	public logInPageUI() {
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
		panel_3.setPreferredSize(new Dimension(590, 60));
		
		JLabel lblNewLabel = new JLabel("Login");
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
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Phone", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		//Prompt word in textField
		TextPrompt tp = new TextPrompt("Ex: 09xxxxxxxx", phoneTextField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_4.add(panel_1);
		panel_1.setPreferredSize(new Dimension(590, 60));
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setPreferredSize(new Dimension(200, 45));
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Birth Date", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(new BoxLayout(panel_2_1, BoxLayout.X_AXIS));
		
		birthDateTextField = new JTextField();
		birthDateTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				warningLabel.setVisible(false);
			}
		});
		birthDateTextField.setHorizontalAlignment(SwingConstants.CENTER);
		birthDateTextField.setFont(new Font("新細明體", Font.PLAIN, 15));
		birthDateTextField.setBorder(null);
		panel_2_1.add(birthDateTextField);
		birthDateTextField.setColumns(14);
		//TODO-Date Picker
		
		//Prompt word in textField
		TextPrompt tp1 = new TextPrompt("Ex: 19900101", birthDateTextField);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_4.add(panel_1_1);
		panel_1_1.setPreferredSize(new Dimension(590, 45));
		panel_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton loginBtn = new JButton("");
		loginBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				memberDaoImpl m =new memberDaoImpl();
				if(m.queryMemberAccount(phoneTextField.getText(), birthDateTextField.getText())) {
					String memberInfo = Integer.toString(m.queryMember(phoneTextField.getText()).getMember_id());
					cal.addFile("memberInfo.txt", memberInfo);
					
					
					try {
						String memberInfoFromFile = (String) cal.readFile("memberInfo.txt").readObject();
						System.out.println(memberInfoFromFile);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					orderAddUI add=new orderAddUI();
					add.setVisible(true);
					dispose();
				}else {
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
				registerPageUI add=new registerPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		loginBtn_1.setMargin(new Insets(2, 2, 2, 2));
		loginBtn_1.setIcon(new ImageIcon(logInPageUI.class.getResource("/asset/registerBtn.png")));
		loginBtn_1.setContentAreaFilled(false);
		loginBtn_1.setBorderPainted(false);
		loginBtn_1.setBackground(Color.WHITE);
		panel_1_1_1.add(loginBtn_1);
		
		tp1.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp1.setHorizontalAlignment(SwingConstants.CENTER);
		tp1.setForeground( Color.gray );
		tp.setFont(new Font("新細明體", Font.ITALIC, 15));
		tp.setHorizontalAlignment(SwingConstants.CENTER);
		tp.setForeground( Color.gray );
		
	
	}
}
