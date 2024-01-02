package controller;
import javax.swing.JButton;
import java.awt.Color;

public final class RedOK {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text "OK"
	 * @wbp.factory.parameter.source foreground java.awt.Color.RED
	 */
	public static JButton createJButton(String text, Color foreground) {
		JButton button = new JButton(text);
		button.setForeground(foreground);
		return button;
	}
}