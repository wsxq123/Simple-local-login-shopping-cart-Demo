package controller.order;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.member.logInPageUI;
import util.ImageBtn;
import util.cal;
import util.checkListItem;

import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;

public class checkPageUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkPageUI frame = new checkPageUI();
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
	public checkPageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(590, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(590, 40));
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Check");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 40));
		panel_3.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(520, 218));
		scrollPane.setBounds(10, 80, 554, 218);
		contentPane.add(scrollPane);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBorder(null);
		FlowLayout fl_titlePanel = (FlowLayout) titlePanel.getLayout();
		fl_titlePanel.setAlignment(FlowLayout.LEFT);
		scrollPane.setColumnHeaderView(titlePanel);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setPreferredSize(new Dimension(70, 0));
		titlePanel.add(horizontalGlue_2);

		JLabel lblNewLabel_1 = new JLabel("Item");
		titlePanel.add(lblNewLabel_1);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(100, 0));
		titlePanel.add(horizontalGlue);

		JLabel lblNewLabel_2 = new JLabel("Price");
		titlePanel.add(lblNewLabel_2);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setPreferredSize(new Dimension(40, 0));
		titlePanel.add(horizontalGlue_1);

		JLabel lblNewLabel_2_1 = new JLabel("Amount");
		titlePanel.add(lblNewLabel_2_1);

		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalGlue_1_1.setPreferredSize(new Dimension(45, 0));
		titlePanel.add(horizontalGlue_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Total");
		titlePanel.add(lblNewLabel_2_1_1);
		
		JPanel checkListPanel = new JPanel();
		scrollPane.setViewportView(checkListPanel);
		checkListPanel.setLayout(new BoxLayout(checkListPanel, BoxLayout.Y_AXIS));
		
		
		
		//==================for test=====================
		
		JPanel checkListItemPanel = new JPanel();
		checkListItemPanel.setVisible(false);
		checkListItemPanel.setPreferredSize(new Dimension(520, 45));
		checkListItemPanel.setMaximumSize(new Dimension(32767, 45));
		checkListPanel.add(checkListItemPanel);
		GridBagLayout gbl_checkListItemPanel = new GridBagLayout();
		gbl_checkListItemPanel.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_checkListItemPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_checkListItemPanel.rowWeights = new double[]{0.0};
		checkListItemPanel.setLayout(gbl_checkListItemPanel);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_3 = new GridBagConstraints();
		gbc_horizontalGlue_3.ipadx = 5;
		gbc_horizontalGlue_3.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_3.gridx = 0;
		gbc_horizontalGlue_3.gridy = 0;
		checkListItemPanel.add(horizontalGlue_3, gbc_horizontalGlue_3);
		
		JLabel productNameLabel = new JLabel("bodyShape_coolSculpting");
		productNameLabel.setPreferredSize(new Dimension(150, 15));
		productNameLabel.setMinimumSize(new Dimension(150, 15));
		productNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_productNameLabel = new GridBagConstraints();
		gbc_productNameLabel.ipadx = 20;
		gbc_productNameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productNameLabel.gridx = 1;
		gbc_productNameLabel.gridy = 0;
		checkListItemPanel.add(productNameLabel, gbc_productNameLabel);
		
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalGlue_3_1.setPreferredSize(new Dimension(10, 0));
		GridBagConstraints gbc_horizontalGlue_3_1 = new GridBagConstraints();
		gbc_horizontalGlue_3_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_3_1.ipadx = 10;
		gbc_horizontalGlue_3_1.gridx = 2;
		gbc_horizontalGlue_3_1.gridy = 0;
		checkListItemPanel.add(horizontalGlue_3_1, gbc_horizontalGlue_3_1);
		
		JLabel productPriceLabel = new JLabel("159999");
		productPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productPriceLabel.setPreferredSize(new Dimension(45, 15));
		GridBagConstraints gbc_productPriceLabel = new GridBagConstraints();
		gbc_productPriceLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productPriceLabel.gridx = 3;
		gbc_productPriceLabel.gridy = 0;
		checkListItemPanel.add(productPriceLabel, gbc_productPriceLabel);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_4 = new GridBagConstraints();
		gbc_horizontalGlue_4.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_4.ipadx = 30;
		gbc_horizontalGlue_4.gridx = 4;
		gbc_horizontalGlue_4.gridy = 0;
		checkListItemPanel.add(horizontalGlue_4, gbc_horizontalGlue_4);
		
		JLabel amountLabel = new JLabel("100");
		amountLabel.setPreferredSize(new Dimension(10, 15));
		amountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_amountLabel = new GridBagConstraints();
		gbc_amountLabel.ipadx = 30;
		gbc_amountLabel.insets = new Insets(0, 0, 0, 5);
		gbc_amountLabel.gridx = 5;
		gbc_amountLabel.gridy = 0;
		checkListItemPanel.add(amountLabel, gbc_amountLabel);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_5 = new GridBagConstraints();
		gbc_horizontalGlue_5.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_5.ipadx = 30;
		gbc_horizontalGlue_5.gridx = 6;
		gbc_horizontalGlue_5.gridy = 0;
		checkListItemPanel.add(horizontalGlue_5, gbc_horizontalGlue_5);
		
		JLabel productTotalLabel = new JLabel("60000000");
		productTotalLabel.setPreferredSize(new Dimension(40, 15));
		productTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_productTotalLabel = new GridBagConstraints();
		gbc_productTotalLabel.ipadx = 30;
		gbc_productTotalLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productTotalLabel.gridx = 7;
		gbc_productTotalLabel.gridy = 0;
		checkListItemPanel.add(productTotalLabel, gbc_productTotalLabel);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_6 = new GridBagConstraints();
		gbc_horizontalGlue_6.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_6.ipadx = 5;
		gbc_horizontalGlue_6.gridx = 8;
		gbc_horizontalGlue_6.gridy = 0;
		checkListItemPanel.add(horizontalGlue_6, gbc_horizontalGlue_6);
		
		JButton btnNewButton = ImageBtn.createJButton("/asset/deleteBtn.png");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(checkPageUI.class.getResource("/asset/deleteBtn.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 9;
		gbc_btnNewButton.gridy = 0;
		checkListItemPanel.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(520, 20));
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.add(panel_1);
		
		JLabel checkTotalLabel = new JLabel("99999");
		panel_1.add(checkTotalLabel);
		
		
		//抓 order.txt 的 data 來填進我的 Check List 裡面
		Integer checkTotal = 0;
		ObjectInputStream ois = cal.readFile("Order.txt");
		
		try {
			List<Object[]> lo = (List<Object[]>) ois.readObject();
			
			for(Object[] o:lo) {
				Integer total=Integer.parseInt(o[1].toString()) * Integer.parseInt(o[2].toString());
				checkListItem.createCheckListItem(checkListPanel, o[0].toString(), o[1].toString(), o[2].toString(),total.toString());				
				checkTotal = checkTotal + total;
			}
			
			checkTotalLabel.setText(checkTotal.toString());
			
			JPanel panel_4 = new JPanel();
			panel_4.setPreferredSize(new Dimension(520, 60));
			contentPane.add(panel_4);
			panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
			
			JPanel panel_6 = new JPanel();
			panel_4.add(panel_6);
			
			JPanel panel_5 = new JPanel();
			FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
			flowLayout_1.setAlignment(FlowLayout.RIGHT);
			panel_4.add(panel_5);
			
			JButton btnNewButton_1 = new JButton("");
			btnNewButton_1.setMargin(new Insets(2, 2, 2, 2));
			btnNewButton_1.setIcon(new ImageIcon(logInPageUI.class.getResource("/asset/confirmBtn.png")));
			btnNewButton_1.setContentAreaFilled(false);
			btnNewButton_1.setBorderPainted(false);
			btnNewButton_1.setBackground(Color.WHITE);
			panel_5.add(btnNewButton_1);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//==================for test=====================
		
		//==================for test=====================
//		checkListItem.createCheckListItem(checkListPanel, "plasticSurgery_BOTOX", "5999", "10");
//		checkListItem.createCheckListItem(checkListPanel, "bodyShape_coolSculpting", "12999", "1");
//		checkListItem.createCheckListItem(checkListPanel, "yrdgf", "155999", "5");
//		checkListItem.createCheckListItem(checkListPanel, "plasticSurgery_BOTOX", "5999", "10");
//		checkListItem.createCheckListItem(checkListPanel, "bodyShape_coolSculpting", "12999", "1");
//		checkListItem.createCheckListItem(checkListPanel, "yrdgf", "155999", "5");
//		checkListItem.createCheckListItem(checkListPanel, "plasticSurgery_BOTOX", "5999", "10");
//		checkListItem.createCheckListItem(checkListPanel, "bodyShape_coolSculpting", "12999", "1");
//		checkListItem.createCheckListItem(checkListPanel, "yrdgf", "155999", "5");


	}

}
