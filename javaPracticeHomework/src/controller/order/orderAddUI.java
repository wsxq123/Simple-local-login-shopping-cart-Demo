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
import model.member;
import model.order_product;
import model.product;
import model.shoppingCart;
import util.cal;
import util.createCheckListItem;
import util.checkPanelItem;
import util.dynamicClock;
import util.createProductListItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
	private JComboBox<String> comboBox;
	private JLabel promptTextLabel2;

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
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		dynamicClock.createDynamicClock(contentPane,442,10);
		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/shoppingCartIconSpot.png")));
//		lblNewLabel.setBounds(543, 19, 21, 25);
//		contentPane.add(lblNewLabel);
//		// set invisible at start
//		lblNewLabel.setVisible(false);
//
//		JButton btnNewButton = new JButton("");
//		btnNewButton.setVisible(false);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton.setBackground(Color.WHITE);
//		btnNewButton.setContentAreaFilled(false);
//		btnNewButton.setBorderPainted(false);
//		btnNewButton.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/shoppingCartIcon.png")));
//		btnNewButton.setBounds(517, 21, 40, 32);
//		contentPane.add(btnNewButton);

		comboBox = new JComboBox<String>();
		comboBox.setBorder(null);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 16));
		comboBox.setEditable(true);
		comboBox.setBounds(33, 28, 219, 25);
		contentPane.add(comboBox);

		// 抓DB product table 的 data 來填進下拉式選單
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
		titlePanel.setBackground(Color.WHITE);
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
		
		JLabel promptTextLabel = new JLabel("The item is already selected in the panel!");
		promptTextLabel.setVisible(false);
		promptTextLabel.setForeground(Color.RED);
		promptTextLabel.setFont(UIManager.getFont("List.font"));
		promptTextLabel.setBounds(10, 63, 269, 15);
		contentPane.add(promptTextLabel);
		
		promptTextLabel2 = new JLabel("No item in panel !");
		promptTextLabel2.setVisible(false);
		promptTextLabel2.setForeground(Color.RED);
		promptTextLabel2.setBounds(10, 63, 242, 15);
		contentPane.add(promptTextLabel2);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//檢查在addedItemPanel的product，若無則回傳null
				List<String[]> shoppingCartInPanel = checkPanelItem.checkPanel(1, addedItemPanel);
				
				int switchCode=0;
				
				if(new File("Order.txt").isFile()) {
					if(shoppingCartInPanel != null) {
						//panel有item，且有Order.txt
						switchCode = 1;
					}else {
						//panel無item，有Order.txt
						switchCode = 2;
					}
				}else {
					if(shoppingCartInPanel != null) {
						//panel有item，無Order.txt
						switchCode = 3;
					}
				}
				//System.out.println("switchCode: "+switchCode );
				switch (switchCode) {
					case 1:
						try {
							List<String[]> shoppingCartListFromFile = (List<String[]>) cal.readFile("Order.txt").readObject();
							List<String[]> newList = Stream.concat(shoppingCartInPanel.stream(), shoppingCartListFromFile.stream()).toList();
							shoppingCartInPanel = newList;
						} catch (ClassNotFoundException e1) {
							e1.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					case 3:
						cal.addFile("Order.txt", shoppingCartInPanel);
					case 2:
						checkPageUI add = new checkPageUI();
						add.setVisible(true);
						dispose();
						break;
					default:
						promptTextLabel.setVisible(false);
						promptTextLabel2.setVisible(true);
						System.out.println("Please select item & add to panel!");
				}
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/checkOutBBtn.png")));
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(441, 318, 123, 32);
		contentPane.add(btnNewButton_1_1);

		

		List<String> addedItemList = new ArrayList<String>();

		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// 點擊addBtn=>新增product至addedItemPanel
		addBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 1.確認下拉式列表選中的item，是productList中的哪一個
				l.forEach(item -> {
					if (item.getProduct_name().equals(comboBox.getSelectedItem().toString())) {
						// 2.確認下拉式列表選中的item，不是已經存在在addedItemPanel裡的product
						if (addedItemList.size() == 0
								|| addedItemList.stream().filter(i -> i.equals(item.getProduct_name())).count() == 0) {
							promptTextLabel.setVisible(false);
							promptTextLabel2.setVisible(false);
							createProductListItem.create(addedItemPanel, item.getProduct_name(),
									item.getProduct_price().toString());
							addedItemList.add(item.getProduct_name());
						} else {
							promptTextLabel.setVisible(true);
							System.out.println("already in panel!");
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
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				logInPageUI add = new logInPageUI();
				add.setVisible(true);					
				dispose();
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(orderAddUI.class.getResource("/asset/backBtn.png")));
		btnNewButton_1_1_1.setContentAreaFilled(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1.setBounds(10, 318, 123, 32);
		contentPane.add(btnNewButton_1_1_1);
	}
}
