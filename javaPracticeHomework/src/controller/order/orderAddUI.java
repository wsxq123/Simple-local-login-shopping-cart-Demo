package controller.order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.impl.productDaoImpl;
import model.product;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;
import util.PlusPtn;
import util.MinusBtn;
import util.DeleteBtn;

public class orderAddUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderAddUI frame = new orderAddUI();
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
	public orderAddUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIconSpot.png"));
		lblNewLabel.setBounds(543, 19, 21, 25);
		contentPane.add(lblNewLabel);
		//set invisible at start
		lblNewLabel.setVisible(false);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIcon.png"));
		btnNewButton.setBounds(517, 21, 40, 32);
		contentPane.add(btnNewButton);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		comboBox.setBorder(null);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 16));
		comboBox.setEditable(true);
		comboBox.setBounds(33, 28, 219, 25);
		contentPane.add(comboBox);
		
		productDaoImpl pd = new productDaoImpl();
		List<product> l = pd.queryAllProduct();
		
		for(product p:l) {
			System.out.println(p.getProduct_name());
			comboBox.addItem(p.getProduct_name());
		}
		
		comboBox.setSelectedItem("select service");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(282, 21, 77, 32);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\AddBtn.png"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 554, 217);
		contentPane.add(scrollPane);
		
		JPanel panel_3_1_1 = new JPanel();
		scrollPane.setViewportView(panel_3_1_1);
		panel_3_1_1.setPreferredSize(new Dimension(213, 20));
		panel_3_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_3_1_1.add(panel);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setPreferredSize(new Dimension(50, 0));
		panel.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1 = new JLabel("Item");
		panel.add(lblNewLabel_1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(90, 0));
		panel.add(horizontalGlue);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		panel.add(lblNewLabel_2);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setPreferredSize(new Dimension(130, 0));
		panel.add(horizontalGlue_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Amount");
		panel.add(lblNewLabel_2_1);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalGlue_1_1.setPreferredSize(new Dimension(140, 0));
		panel.add(horizontalGlue_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setPreferredSize(new Dimension(530, 1));
		panel_3_1_1.add(panel_1);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_3_1_1.add(panel_4_2_1);
		GridBagLayout gbl_panel_4_2_1 = new GridBagLayout();
		gbl_panel_4_2_1.columnWidths = new int[]{0, 30, 30, 30, 30, 30, 30, 0, 0, 0, 0};
		gbl_panel_4_2_1.rowHeights = new int[]{0, 0};
		gbl_panel_4_2_1.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4_2_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4_2_1.setLayout(gbl_panel_4_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("bodyShape_coolSculpting");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.ipadx = 20;
		gbc_lblNewLabel_1_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1_2_1.gridwidth = 2;
		gbc_lblNewLabel_1_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1_2_1.gridx = 0;
		gbc_lblNewLabel_1_2_1.gridy = 0;
		panel_4_2_1.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("12999");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_2_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_2_1.ipadx = 20;
		gbc_lblNewLabel_2_2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2_2_1.gridwidth = 2;
		gbc_lblNewLabel_2_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2_2_1.gridx = 2;
		gbc_lblNewLabel_2_2_1.gridy = 0;
		panel_4_2_1.add(lblNewLabel_2_2_1, gbc_lblNewLabel_2_2_1);
		
		Component horizontalGlue_2_1 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_2_1 = new GridBagConstraints();
		gbc_horizontalGlue_2_1.weightx = 1.0;
		gbc_horizontalGlue_2_1.anchor = GridBagConstraints.EAST;
		gbc_horizontalGlue_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_2_1.gridx = 4;
		gbc_horizontalGlue_2_1.gridy = 0;
		panel_4_2_1.add(horizontalGlue_2_1, gbc_horizontalGlue_2_1);
		
		JButton btnNewButton_2_2_1_2_2_1 = new JButton("");
		btnNewButton_2_2_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2_1_2_2_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\plusBtn.png"));
		btnNewButton_2_2_1_2_2_1.setContentAreaFilled(false);
		btnNewButton_2_2_1_2_2_1.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_2_1_2_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_2_1_2_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_2_1_2_2_1.gridx = 5;
		gbc_btnNewButton_2_2_1_2_2_1.gridy = 0;
		panel_4_2_1.add(btnNewButton_2_2_1_2_2_1, gbc_btnNewButton_2_2_1_2_2_1);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setPreferredSize(new Dimension(5, 21));
		textField.setMinimumSize(new Dimension(5, 21));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.gridx = 6;
		gbc_textField.gridy = 0;
		panel_4_2_1.add(textField, gbc_textField);
		
		JButton btnNewButton_2_1_1_1_2_3_1 = new JButton("");
		btnNewButton_2_1_1_1_2_3_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png"));
		btnNewButton_2_1_1_1_2_3_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_2_3_1.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_1_1_1_2_3_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1_1_1_2_3_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1_1_1_2_3_1.gridx = 7;
		gbc_btnNewButton_2_1_1_1_2_3_1.gridy = 0;
		panel_4_2_1.add(btnNewButton_2_1_1_1_2_3_1, gbc_btnNewButton_2_1_1_1_2_3_1);
		
		JButton btnNewButton_2_1_1_1_2_2_2_1 = new JButton("");
		btnNewButton_2_1_1_1_2_2_2_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\deleteBtn.png"));
		btnNewButton_2_1_1_1_2_2_2_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_2_2_2_1.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_1_1_1_2_2_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1_1_1_2_2_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1_1_1_2_2_2_1.gridx = 8;
		gbc_btnNewButton_2_1_1_1_2_2_2_1.gridy = 0;
		panel_4_2_1.add(btnNewButton_2_1_1_1_2_2_2_1, gbc_btnNewButton_2_1_1_1_2_2_2_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\checkOutBBtn.png"));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(441, 318, 123, 32);
		contentPane.add(btnNewButton_1_1);
		
		JButton button = PlusPtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\plusBtn.png"), false, false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(141, 331, 47, 23);
		contentPane.add(button);
		
		JButton button_1 = MinusBtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png"), false, false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(198, 327, 47, 23);
		contentPane.add(button_1);
		
		JButton button_2 = DeleteBtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\deleteBtn.png"), false, false);
		button_2.setBounds(260, 331, 47, 23);
		contentPane.add(button_2);
	}
	
public void productListItem(JPanel fatherItem,String product,int price) {
	
		
		
		
	}
}


