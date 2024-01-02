package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class productListItem {
	public static void createProductListItem(JPanel fatherPanel,String product,int price) {
		JTextField textField;
		
		//gridbag panel
		JPanel panel_4_2_1 = new JPanel();
		fatherPanel.add(panel_4_2_1);
		GridBagLayout gbl_panel_4_2_1 = new GridBagLayout();
		gbl_panel_4_2_1.columnWidths = new int[]{0, 30, 30, 30, 30, 30, 30, 0, 0, 0, 0};
		gbl_panel_4_2_1.rowHeights = new int[]{0, 0};
		gbl_panel_4_2_1.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4_2_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_4_2_1.setLayout(gbl_panel_4_2_1);
		
		//product name label
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
		
		//product price label
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
		
		//Glue 填充物
		Component horizontalGlue_2_1 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_2_1 = new GridBagConstraints();
		gbc_horizontalGlue_2_1.weightx = 1.0;
		gbc_horizontalGlue_2_1.anchor = GridBagConstraints.EAST;
		gbc_horizontalGlue_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_2_1.gridx = 4;
		gbc_horizontalGlue_2_1.gridy = 0;
		panel_4_2_1.add(horizontalGlue_2_1, gbc_horizontalGlue_2_1);
		
		//plus btn 
		JButton plusBtn = PlusPtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\plusBtn.png"), false, false);
		GridBagConstraints gbc_plusBtn = new GridBagConstraints();
		gbc_plusBtn.insets = new Insets(0, 0, 0, 5);
		gbc_plusBtn.gridx = 5;
		gbc_plusBtn.gridy = 0;
		panel_4_2_1.add(plusBtn, gbc_plusBtn);
		
		//product amount text field
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
		
		//minus btn
		JButton minusBtn = PlusPtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png"), false, false);
		GridBagConstraints gbc_minusBtn = new GridBagConstraints();
		gbc_minusBtn.insets = new Insets(0, 0, 0, 5);
		gbc_minusBtn.gridx = 7;
		gbc_minusBtn.gridy = 0;
		panel_4_2_1.add(minusBtn, gbc_minusBtn);
		
		//delete btn
		JButton deleteBtn = PlusPtn.createJButton("", new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\deleteBtn.png"), false, false);
		GridBagConstraints gbc_deleteBtn = new GridBagConstraints();
		gbc_deleteBtn.insets = new Insets(0, 0, 0, 5);
		gbc_deleteBtn.gridx = 8;
		gbc_deleteBtn.gridy = 0;
		panel_4_2_1.add(deleteBtn, gbc_deleteBtn);
		
	}
}
