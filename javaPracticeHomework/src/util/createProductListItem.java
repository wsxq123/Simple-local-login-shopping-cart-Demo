package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.order.orderAddUI;

public class createProductListItem {
	public static void create(JPanel fatherPanel,String product,String price) {
		JTextField textField;
		
		//gridbag panel				
		JPanel gridbagPanel = new JPanel();
		gridbagPanel.setMaximumSize(new Dimension(32767, 30));
		fatherPanel.add(gridbagPanel);
		GridBagLayout gbl_productItemListPanelEx = new GridBagLayout();
		gbl_productItemListPanelEx.columnWidths = new int[] {0, 0, 0, 46, 0, 0, 30, 30, 0, 0, 0};
		gbl_productItemListPanelEx.rowHeights = new int[]{30, 0};
		gbl_productItemListPanelEx.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.9E-324, 0.0, 1.0, Double.MIN_VALUE};
		gbl_productItemListPanelEx.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		gridbagPanel.setLayout(gbl_productItemListPanelEx);
		
		//product name label			
		JLabel lblNewLabel_5_1 = new JLabel(product);
		lblNewLabel_5_1.setPreferredSize(new Dimension(150, 15));
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_5_1.insets = new Insets(0, 10, 0, 5);
		gbc_lblNewLabel_5_1.gridx = 1;
		gbc_lblNewLabel_5_1.gridy = 0;
		gridbagPanel.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
		
		//Glue 填充物	
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalGlue_3_1.setPreferredSize(new Dimension(25, 0));
		GridBagConstraints gbc_horizontalGlue_3_1 = new GridBagConstraints();
		gbc_horizontalGlue_3_1.insets = new Insets(0, 5, 0, 5);
		gbc_horizontalGlue_3_1.gridx = 2;
		gbc_horizontalGlue_3_1.gridy = 0;
		gridbagPanel.add(horizontalGlue_3_1, gbc_horizontalGlue_3_1);
		
		//product price label		
		JLabel lblNewLabel_6_1 = new JLabel(price);
		lblNewLabel_6_1.setPreferredSize(new Dimension(50, 15));
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_6_1 = new GridBagConstraints();
		gbc_lblNewLabel_6_1.ipadx = 5;
		gbc_lblNewLabel_6_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_6_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6_1.gridx = 3;
		gbc_lblNewLabel_6_1.gridy = 0;
		gridbagPanel.add(lblNewLabel_6_1, gbc_lblNewLabel_6_1);
		
		//Glue 填充物		
		Component horizontalGlue_4_1 = Box.createHorizontalGlue();
		horizontalGlue_4_1.setPreferredSize(new Dimension(20, 0));
		GridBagConstraints gbc_horizontalGlue_4_1 = new GridBagConstraints();
		gbc_horizontalGlue_4_1.weightx = 1.0;
		gbc_horizontalGlue_4_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_4_1.gridx = 4;
		gbc_horizontalGlue_4_1.gridy = 0;
		gridbagPanel.add(horizontalGlue_4_1, gbc_horizontalGlue_4_1);
		
		//product amount text field			
		textField = new JTextField();
		textField.setText("0");
		textField.setPreferredSize(new Dimension(5, 21));
		textField.setMinimumSize(new Dimension(5, 21));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(3);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.ipadx = 1;
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.gridx = 6;
		gbc_textField_2.gridy = 0;
		gridbagPanel.add(textField, gbc_textField_2);
		
		//plus btn 
		JButton plusBtn = ImageBtn.createJButton("/asset/plusBtn.png");
		plusBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer na = Integer.parseInt(textField.getText()) + 1;
				textField.setText(na.toString());
			}
		});
		GridBagConstraints gbc_plusBtn = new GridBagConstraints();
		gbc_plusBtn.ipadx = 1;
		gbc_plusBtn.insets = new Insets(0, 35, 0, 5);
		gbc_plusBtn.gridx = 5;
		gbc_plusBtn.gridy = 0;
		gridbagPanel.add(plusBtn, gbc_plusBtn);
		
		//minus btn
		JButton minusBtn = ImageBtn.createJButton("/asset/minusBtn.png");
		minusBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Integer na = Integer.parseInt(textField.getText());
				if (na > 0) na = na - 1;
				textField.setText(na.toString());
			}
		});
		GridBagConstraints gbc_minusBtn = new GridBagConstraints();
		gbc_minusBtn.ipadx = 1;
		gbc_minusBtn.insets = new Insets(0, 0, 0, 5);
		gbc_minusBtn.gridx = 7;
		gbc_minusBtn.gridy = 0;
		gridbagPanel.add(minusBtn, gbc_minusBtn);
		
		//delete btn
		JButton deleteBtn = ImageBtn.createJButton("/asset/deleteBtn.png");
		deleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fatherPanel.remove(gridbagPanel);
				fatherPanel.revalidate();
				fatherPanel.repaint();
			}
		});
		GridBagConstraints gbc_deleteBtn = new GridBagConstraints();
		gbc_deleteBtn.ipadx = 1;
		gbc_deleteBtn.insets = new Insets(0, 0, 0, 5);
		gbc_deleteBtn.gridx = 8;
		gbc_deleteBtn.gridy = 0;
		gridbagPanel.add(deleteBtn, gbc_deleteBtn);	
		
		//Glue 填充物	
		Component horizontalGlue_4_1_1 = Box.createHorizontalGlue();
		horizontalGlue_4_1_1.setPreferredSize(new Dimension(10, 0));
		GridBagConstraints gbc_horizontalGlue_4_1_1 = new GridBagConstraints();
		gbc_horizontalGlue_4_1_1.gridx = 9;
		gbc_horizontalGlue_4_1_1.gridy = 0;
		gridbagPanel.add(horizontalGlue_4_1_1, gbc_horizontalGlue_4_1_1);
		
	

	}
}
