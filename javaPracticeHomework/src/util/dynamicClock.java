package util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class dynamicClock{
	public static void createDynamicClock(JPanel fatherPanel) {
		JLabel lblNewLabel_3 = new JLabel("2024-01-06 12:33:50");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 13, 146, 15);
		fatherPanel.add(lblNewLabel_3);
		
		ActionListener updateClockAction = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
				  LocalDateTime now = LocalDateTime.now();  
				   
			      lblNewLabel_3.setText(dtf.format(now)); 
			    }
		};
		
		Timer t = new Timer(1000, updateClockAction);
		t.start();	
	}
	
	public static void createDynamicClock(JPanel fatherPanel,int setX,int setY) {
		JLabel lblNewLabel_3 = new JLabel("2024-01-06 12:33:50");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(setX, setY, 146, 15);
		fatherPanel.add(lblNewLabel_3);
		
		ActionListener updateClockAction = new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
				  LocalDateTime now = LocalDateTime.now();  
				   
			      lblNewLabel_3.setText(dtf.format(now)); 
			    }
		};
		
		Timer t = new Timer(1000, updateClockAction);
		t.start();	
	}
}
