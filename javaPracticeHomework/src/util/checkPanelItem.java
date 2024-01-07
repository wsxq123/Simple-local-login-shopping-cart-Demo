package util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class checkPanelItem {
	public static List<String[]> checkPanel(int ic, JPanel checkPanel) {
		List<String[]> shoppingCartList = new ArrayList<String[]>();	
		
		//檢查使用者新增在 checkPanel 的 product，若有且amount(ic=1時需不為0)，則裝成一個object
		if (checkPanel.getComponentCount() != 0) {
			for (int i = 0; i < checkPanel.getComponentCount(); i++) {
				
				// arr= [productName,productPrice,productAmount]
				String[] arr = new String[3];
				JPanel jp = (JPanel) checkPanel.getComponent(i);
				
				if (ic == 1) {
					arr[0] = ((JLabel) jp.getComponent(0)).getText();
					arr[1] = ((JLabel) jp.getComponent(2)).getText();
					arr[2] = ((JTextField) jp.getComponent(4)).getText();
					if (!arr[2].equals("0"))
						shoppingCartList.add(arr);
				}else if (ic == 2) {
					arr[0] = ((JLabel) jp.getComponent(1)).getText();
					arr[1] = ((JLabel) jp.getComponent(3)).getText();
					arr[2] = ((JLabel) jp.getComponent(5)).getText();
					shoppingCartList.add(arr);
				}
			}
//			shoppingCartList.forEach(item -> System.out.println(item[0]+" "+item[1]+" "+item[2]));
		}else {
			System.out.println("No item in checkPanel! (from checkPanelItem.checkPanel)");
			shoppingCartList = null;
		}

		return shoppingCartList;
	}
};
