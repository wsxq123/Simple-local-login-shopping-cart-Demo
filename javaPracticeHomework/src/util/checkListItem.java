package util;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.order.checkPageUI;

public class checkListItem {
	public static void createCheckListItem(JPanel fatherPanel,String product,String price,String amount,String total) {
		
		//gridbag panel	
		JPanel checkListItemPanel = new JPanel();
		checkListItemPanel.setPreferredSize(new Dimension(520, 45));
		checkListItemPanel.setMaximumSize(new Dimension(32767, 45));
		fatherPanel.add(checkListItemPanel);
		GridBagLayout gbl_checkListItemPanel = new GridBagLayout();
		gbl_checkListItemPanel.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_checkListItemPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_checkListItemPanel.rowWeights = new double[]{0.0};
		checkListItemPanel.setLayout(gbl_checkListItemPanel);
		
		//Glue 填充物	
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_3 = new GridBagConstraints();
		gbc_horizontalGlue_3.ipadx = 5;
		gbc_horizontalGlue_3.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_3.gridx = 0;
		gbc_horizontalGlue_3.gridy = 0;
		checkListItemPanel.add(horizontalGlue_3, gbc_horizontalGlue_3);
		
		//product name label	
		JLabel productNameLabel = new JLabel(product);
		productNameLabel.setPreferredSize(new Dimension(150, 15));
		productNameLabel.setMinimumSize(new Dimension(150, 15));
		productNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_productNameLabel = new GridBagConstraints();
		gbc_productNameLabel.ipadx = 20;
		gbc_productNameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productNameLabel.gridx = 1;
		gbc_productNameLabel.gridy = 0;
		checkListItemPanel.add(productNameLabel, gbc_productNameLabel);
		
		//Glue 填充物	
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalGlue_3_1.setPreferredSize(new Dimension(10, 0));
		GridBagConstraints gbc_horizontalGlue_3_1 = new GridBagConstraints();
		gbc_horizontalGlue_3_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_3_1.ipadx = 10;
		gbc_horizontalGlue_3_1.gridx = 2;
		gbc_horizontalGlue_3_1.gridy = 0;
		checkListItemPanel.add(horizontalGlue_3_1, gbc_horizontalGlue_3_1);
		
		//product price label	
		JLabel productPriceLabel = new JLabel(price);
		productPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productPriceLabel.setPreferredSize(new Dimension(45, 15));
		GridBagConstraints gbc_productPriceLabel = new GridBagConstraints();
		gbc_productPriceLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productPriceLabel.gridx = 3;
		gbc_productPriceLabel.gridy = 0;
		checkListItemPanel.add(productPriceLabel, gbc_productPriceLabel);
		
		//Glue 填充物	
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_4 = new GridBagConstraints();
		gbc_horizontalGlue_4.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_4.ipadx = 30;
		gbc_horizontalGlue_4.gridx = 4;
		gbc_horizontalGlue_4.gridy = 0;
		checkListItemPanel.add(horizontalGlue_4, gbc_horizontalGlue_4);
		
		//product amount label
		JLabel amountLabel = new JLabel(amount);
		amountLabel.setPreferredSize(new Dimension(10, 15));
		amountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_amountLabel = new GridBagConstraints();
		gbc_amountLabel.ipadx = 30;
		gbc_amountLabel.insets = new Insets(0, 0, 0, 5);
		gbc_amountLabel.gridx = 5;
		gbc_amountLabel.gridy = 0;
		checkListItemPanel.add(amountLabel, gbc_amountLabel);
		
		//Glue 填充物	
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_5 = new GridBagConstraints();
		gbc_horizontalGlue_5.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_5.ipadx = 30;
		gbc_horizontalGlue_5.gridx = 6;
		gbc_horizontalGlue_5.gridy = 0;
		checkListItemPanel.add(horizontalGlue_5, gbc_horizontalGlue_5);
		
		//product total label
		JLabel productTotalLabel = new JLabel(total);
		productTotalLabel.setPreferredSize(new Dimension(40, 15));
		productTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_productTotalLabel = new GridBagConstraints();
		gbc_productTotalLabel.ipadx = 30;
		gbc_productTotalLabel.insets = new Insets(0, 0, 0, 5);
		gbc_productTotalLabel.gridx = 7;
		gbc_productTotalLabel.gridy = 0;
		checkListItemPanel.add(productTotalLabel, gbc_productTotalLabel);
		
		//Glue 填充物	
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_6 = new GridBagConstraints();
		gbc_horizontalGlue_6.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_6.ipadx = 5;
		gbc_horizontalGlue_6.gridx = 8;
		gbc_horizontalGlue_6.gridy = 0;
		checkListItemPanel.add(horizontalGlue_6, gbc_horizontalGlue_6);
		
		//delete btn
		JButton deleteBtn = ImageBtn.createJButton("/asset/deleteBtn.png");
		deleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fatherPanel.remove(checkListItemPanel);
				fatherPanel.revalidate();
				fatherPanel.repaint();
			}
		});
		GridBagConstraints gbc_deleteBtn = new GridBagConstraints();
		gbc_deleteBtn.insets = new Insets(0, 0, 0, 5);
		gbc_deleteBtn.gridx = 9;
		gbc_deleteBtn.gridy = 0;
		checkListItemPanel.add(deleteBtn, gbc_deleteBtn);	
		
	}
}
