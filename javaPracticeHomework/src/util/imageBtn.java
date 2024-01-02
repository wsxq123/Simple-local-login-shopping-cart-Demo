package util;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import controller.order.orderAddUI;

public class imageBtn {
	public static JButton createJButton(String path) {
		JButton button = new JButton();
		button.setIcon(new ImageIcon(orderAddUI.class.getResource(path)));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		return button;
	}
}
