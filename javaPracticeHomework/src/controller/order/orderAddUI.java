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

import controller.member.logInPageUI;
import dao.impl.productDaoImpl;
import model.order_product;
import model.product;
import util.productListItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
import java.awt.GridLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class orderAddUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField amount;
	private JComboBox<String> comboBox;

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
		lblNewLabel.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/shoppingCartIconSpot.png")));
		lblNewLabel.setBounds(543, 19, 21, 25);
		contentPane.add(lblNewLabel);
		// set invisible at start
		lblNewLabel.setVisible(false);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/shoppingCartIcon.png")));
		btnNewButton.setBounds(517, 21, 40, 32);
		contentPane.add(btnNewButton);

		comboBox = new JComboBox<String>();
		comboBox.setBorder(null);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 16));
		comboBox.setEditable(true);
		comboBox.setBounds(33, 28, 219, 25);
		contentPane.add(comboBox);
		
		//抓DB product table 的 data 來填進下拉式選單
		productDaoImpl pd = new productDaoImpl();
		List<product> l = pd.queryAllProduct();

		l.forEach(item -> comboBox.addItem(item.getProduct_name()));

		comboBox.setSelectedItem("select service");

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 80, 554, 218);
		contentPane.add(scrollPane);

		JPanel addedItemPanel = new JPanel();
		addedItemPanel.setBackground(Color.WHITE);
		addedItemPanel.setForeground(Color.WHITE);
		scrollPane.setViewportView(addedItemPanel);
		addedItemPanel.setLayout(new BoxLayout(addedItemPanel, BoxLayout.Y_AXIS));

		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(null);
		FlowLayout fl_titlePanel = (FlowLayout) titlePanel.getLayout();
		fl_titlePanel.setAlignment(FlowLayout.LEFT);
		scrollPane.setColumnHeaderView(titlePanel);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setPreferredSize(new Dimension(60, 0));
		titlePanel.add(horizontalGlue_2);

		JLabel lblNewLabel_1 = new JLabel("Item");
		titlePanel.add(lblNewLabel_1);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(110, 0));
		titlePanel.add(horizontalGlue);

		JLabel lblNewLabel_2 = new JLabel("Price");
		titlePanel.add(lblNewLabel_2);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setPreferredSize(new Dimension(115, 0));
		titlePanel.add(horizontalGlue_1);

		JLabel lblNewLabel_2_1 = new JLabel("Amount");
		titlePanel.add(lblNewLabel_2_1);

		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalGlue_1_1.setPreferredSize(new Dimension(150, 0));
		titlePanel.add(horizontalGlue_1_1);

		JPanel linePanel = new JPanel();
		linePanel.setVisible(false);
		FlowLayout flowLayout = (FlowLayout) linePanel.getLayout();
		flowLayout.setHgap(1);
		flowLayout.setVgap(1);
		linePanel.setBackground(Color.WHITE);
		linePanel.setPreferredSize(new Dimension(520, 1));
		addedItemPanel.add(linePanel);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//把購物車的檔案暫存在本地端(新開一個txt檔存)
				order_product op = new order_product();
				
//				File f = new File();
				
				//switch to logInPageUI
				logInPageUI add=new logInPageUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/checkOutBBtn.png")));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(441, 318, 123, 32);
		contentPane.add(btnNewButton_1_1);
		
//===============for test==========================
		JPanel productItemListPanelEx = new JPanel();
		productItemListPanelEx.setVisible(false);
		productItemListPanelEx.setForeground(Color.WHITE);
		addedItemPanel.add(productItemListPanelEx);
		GridBagLayout gbl_productItemListPanelEx = new GridBagLayout();
		gbl_productItemListPanelEx.columnWidths = new int[] { 0, 0, 0, 46, 0, 0, 30, 30, 0, 0, 0 };
		gbl_productItemListPanelEx.rowHeights = new int[] { 30, 0 };
		gbl_productItemListPanelEx.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_productItemListPanelEx.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		productItemListPanelEx.setLayout(gbl_productItemListPanelEx);

		JLabel lblNewLabel_5_1 = new JLabel("bodyShape_coolSculpting");
		lblNewLabel_5_1.setPreferredSize(new Dimension(150, 15));
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_5_1.insets = new Insets(0, 10, 0, 5);
		gbc_lblNewLabel_5_1.gridx = 1;
		gbc_lblNewLabel_5_1.gridy = 0;
		productItemListPanelEx.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);

		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalGlue_3_1.setPreferredSize(new Dimension(25, 0));
		GridBagConstraints gbc_horizontalGlue_3_1 = new GridBagConstraints();
		gbc_horizontalGlue_3_1.insets = new Insets(0, 5, 0, 5);
		gbc_horizontalGlue_3_1.gridx = 2;
		gbc_horizontalGlue_3_1.gridy = 0;
		productItemListPanelEx.add(horizontalGlue_3_1, gbc_horizontalGlue_3_1);

		JLabel lblNewLabel_6_1 = new JLabel("19220");
		lblNewLabel_6_1.setPreferredSize(new Dimension(50, 15));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.ipadx = 5;
		gbc_lblNewLabel_6_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6_1.gridx = 3;
		gbc_lblNewLabel_6_1.gridy = 0;
		productItemListPanelEx.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);

		Component horizontalGlue_4_1 = Box.createHorizontalGlue();
		horizontalGlue_4_1.setPreferredSize(new Dimension(20, 0));
		GridBagConstraints gbc_horizontalGlue_4_1 = new GridBagConstraints();
		gbc_horizontalGlue_4_1.weightx = 1.0;
		gbc_horizontalGlue_4_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_4_1.gridx = 4;
		gbc_horizontalGlue_4_1.gridy = 0;
		productItemListPanelEx.add(horizontalGlue_4_1, gbc_horizontalGlue_4_1);
		
		amount = new JTextField();
		amount.setText("0");
		amount.setPreferredSize(new Dimension(5, 21));
		amount.setMinimumSize(new Dimension(5, 21));
		amount.setHorizontalAlignment(SwingConstants.CENTER);
		amount.setColumns(3);
		GridBagConstraints gbc_amount = new GridBagConstraints();
		gbc_amount.ipadx = 1;
		gbc_amount.fill = GridBagConstraints.HORIZONTAL;
		gbc_amount.insets = new Insets(0, 0, 0, 5);
		gbc_amount.gridx = 6;
		gbc_amount.gridy = 0;
		productItemListPanelEx.add(amount, gbc_amount);
		
		JButton btnNewButton_2_2_1_2_2_2_1_1 = new JButton("");
		btnNewButton_2_2_1_2_2_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer na = Integer.parseInt(amount.getText()) + 1;
				amount.setText(na.toString());
			}
		});
		btnNewButton_2_2_1_2_2_2_1_1.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/plusBtn.png")));
		btnNewButton_2_2_1_2_2_2_1_1.setContentAreaFilled(false);
		btnNewButton_2_2_1_2_2_2_1_1.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_2_1_2_2_2_1_1 = new GridBagConstraints();
		gbc_btnNewButton_2_2_1_2_2_2_1_1.ipadx = 1;
		gbc_btnNewButton_2_2_1_2_2_2_1_1.insets = new Insets(0, 35, 0, 5);
		gbc_btnNewButton_2_2_1_2_2_2_1_1.gridx = 5;
		gbc_btnNewButton_2_2_1_2_2_2_1_1.gridy = 0;
		productItemListPanelEx.add(btnNewButton_2_2_1_2_2_2_1_1, gbc_btnNewButton_2_2_1_2_2_2_1_1);


		JButton btnNewButton_2_1_1_1_2_3_2_1_1 = new JButton("");
		btnNewButton_2_1_1_1_2_3_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer na = Integer.parseInt(amount.getText());
				if (na > 0) na = na - 1;
				amount.setText(na.toString());
			}
		});
		btnNewButton_2_1_1_1_2_3_2_1_1.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/minusBtn.png")));
		btnNewButton_2_1_1_1_2_3_2_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_2_3_2_1_1.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_1_1_1_2_3_2_1_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1_1_1_2_3_2_1_1.ipadx = 1;
		gbc_btnNewButton_2_1_1_1_2_3_2_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1_1_1_2_3_2_1_1.gridx = 7;
		gbc_btnNewButton_2_1_1_1_2_3_2_1_1.gridy = 0;
		productItemListPanelEx.add(btnNewButton_2_1_1_1_2_3_2_1_1, gbc_btnNewButton_2_1_1_1_2_3_2_1_1);

		JButton btnNewButton_2_1_1_1_2_2_2_2 = new JButton("");
		btnNewButton_2_1_1_1_2_2_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addedItemPanel.remove(productItemListPanelEx);
				addedItemPanel.revalidate();
				addedItemPanel.repaint();
			}
		});
		btnNewButton_2_1_1_1_2_2_2_2.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/deleteBtn.png")));
		btnNewButton_2_1_1_1_2_2_2_2.setContentAreaFilled(false);
		btnNewButton_2_1_1_1_2_2_2_2.setBorderPainted(false);
		GridBagConstraints gbc_btnNewButton_2_1_1_1_2_2_2_2 = new GridBagConstraints();
		gbc_btnNewButton_2_1_1_1_2_2_2_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2_1_1_1_2_2_2_2.ipadx = 1;
		gbc_btnNewButton_2_1_1_1_2_2_2_2.gridx = 8;
		gbc_btnNewButton_2_1_1_1_2_2_2_2.gridy = 0;
		productItemListPanelEx.add(btnNewButton_2_1_1_1_2_2_2_2, gbc_btnNewButton_2_1_1_1_2_2_2_2);

		Component horizontalGlue_4_1_1 = Box.createHorizontalGlue();
		horizontalGlue_4_1_1.setPreferredSize(new Dimension(10, 0));
		GridBagConstraints gbc_horizontalGlue_4_1_1 = new GridBagConstraints();
		gbc_horizontalGlue_4_1_1.gridx = 9;
		gbc_horizontalGlue_4_1_1.gridy = 0;
		productItemListPanelEx.add(horizontalGlue_4_1_1, gbc_horizontalGlue_4_1_1);
//		=====================for test====================================

		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		List<String> addedItemList = new ArrayList<String>();
		
		addBtn.addMouseListener(new MouseAdapter() {
			// 點擊addBtn=>新增product至addedItemPanel
			@Override
			public void mouseClicked(MouseEvent e) {
				// 1.確認下拉式列表選中的item，是productList中的哪一個
				l.forEach(item -> {
					if (item.getProduct_name().equals(comboBox.getSelectedItem().toString())) {
						// 2.確認下拉式列表選中的item，不是已經存在在addedItemPanel裡的product
						if (addedItemList.size() != 0) {
							if (addedItemList.stream().filter(i -> i.equals(item.getProduct_name())).count() == 0) {
								productListItem.createProductListItem(addedItemPanel, item.getProduct_name(),item.getProduct_price().toString());
								addedItemList.add(item.getProduct_name());
							} else {
								System.out.println("already in panel!");
							}
						} else {
							productListItem.createProductListItem(addedItemPanel, item.getProduct_name(),item.getProduct_price().toString());
							addedItemList.add(item.getProduct_name());
						}
						// reRender panel
						validate();
						repaint();
					}
				});
			}
		});
		addBtn.setContentAreaFilled(false);
		addBtn.setBorderPainted(false);
		addBtn.setBackground(Color.WHITE);
		addBtn.setBounds(282, 21, 77, 32);
		contentPane.add(addBtn);
		addBtn.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/AddBtn.png")));

	}
}
