package util;
import javax.swing.JButton;
import javax.swing.Icon;

public final class MinusBtn {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source text ""
	 * @wbp.factory.parameter.source icon new javax.swing.ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png")
	 * @wbp.factory.parameter.source contentAreaFilled false
	 * @wbp.factory.parameter.source borderPainted false
	 */
	public static JButton createJButton(String text, Icon icon, boolean contentAreaFilled, boolean borderPainted) {
		JButton button = new JButton(text);
		button.setIcon(icon);
		button.setContentAreaFilled(contentAreaFilled);
		button.setBorderPainted(borderPainted);
		return button;
	}
}