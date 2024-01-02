package controller.order;
import javax.swing.JPanel;
import java.awt.LayoutManager;
import java.awt.Component;

public final class TestList {
	/**
	 * @wbp.factory
	 * @wbp.factory.parameter.source layout gbl_panel_4_2_1
	 * @wbp.factory.parameter.source comp lblNewLabel_1_2_1
	 * @wbp.factory.parameter.source constraints gbc_lblNewLabel_1_2_1
	 * @wbp.factory.parameter.source comp_1 lblNewLabel_2_2_1
	 * @wbp.factory.parameter.source constraints_1 gbc_lblNewLabel_2_2_1
	 * @wbp.factory.parameter.source comp_2 horizontalGlue_2_1
	 * @wbp.factory.parameter.source constraints_2 gbc_horizontalGlue_2_1
	 * @wbp.factory.parameter.source comp_3 btnNewButton_2_2_1_2_2_1
	 * @wbp.factory.parameter.source constraints_3 gbc_btnNewButton_2_2_1_2_2_1
	 * @wbp.factory.parameter.source comp_4 textField
	 * @wbp.factory.parameter.source constraints_4 gbc_textField
	 * @wbp.factory.parameter.source comp_5 btnNewButton_2_1_1_1_2_3_1
	 * @wbp.factory.parameter.source constraints_5 gbc_btnNewButton_2_1_1_1_2_3_1
	 * @wbp.factory.parameter.source comp_6 btnNewButton_2_1_1_1_2_2_2_1
	 * @wbp.factory.parameter.source constraints_6 gbc_btnNewButton_2_1_1_1_2_2_2_1
	 */
	public static JPanel createJPanel(LayoutManager layout, Component comp, Object constraints, Component comp_1, Object constraints_1, Component comp_2, Object constraints_2, Component comp_3, Object constraints_3, Component comp_4, Object constraints_4, Component comp_5, Object constraints_5, Component comp_6, Object constraints_6) {
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		panel.add(comp, constraints);
		panel.add(comp_1, constraints_1);
		panel.add(comp_2, constraints_2);
		panel.add(comp_3, constraints_3);
		panel.add(comp_4, constraints_4);
		panel.add(comp_5, constraints_5);
		panel.add(comp_6, constraints_6);
		return panel;
	}
}