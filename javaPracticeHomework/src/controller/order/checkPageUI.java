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
import controller.member.logInPageUI;
import dao.impl.orderDaoImpl;
import dao.impl.order_productDaoImpl;
import dao.impl.productDaoImpl;
import model.order;
import model.order_product;
import model.product;
import util.cal;
import util.createCheckListItem;
import util.checkPanelItem;
import util.dynamicClock;

import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import java.awt.Insets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

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
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		dynamicClock.createDynamicClock(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 574, 376);
		panel_7.setBackground(Color.WHITE);
		panel_7.setPreferredSize(new Dimension(590, 365));
		contentPane.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_7.add(panel_3);
		panel_3.setPreferredSize(new Dimension(520, 45));
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel promptText = new JLabel("No item in check panel !");
		promptText.setVisible(false);
		promptText.setVerticalAlignment(SwingConstants.BOTTOM);
		promptText.setForeground(Color.RED);
		panel_3.add(promptText);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_3.add(panel_8);
		
		JLabel lblNewLabel = new JLabel("Check");
		panel_8.add(lblNewLabel);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 36));
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel_3.add(lblNewLabel_5);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_7.add(scrollPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(520, 218));
		scrollPane.setBounds(10, 80, 554, 218);
		
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.WHITE);
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
		checkListPanel.setBackground(Color.WHITE);
		scrollPane.setViewportView(checkListPanel);
		checkListPanel.setLayout(new BoxLayout(checkListPanel, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel_7.add(panel);
		panel.setPreferredSize(new Dimension(520, 20));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.add(panel_1);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_7.add(panel_4);
		panel_4.setPreferredSize(new Dimension(520, 60));
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_4.add(panel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel_4.add(panel_5);
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 檢查在checkListPanel上的item，若有，裝成一個Object覆寫Order.txt，若無，則刪除Order.txt		
				List<String[]> shoppingCartList2 = checkPanelItem.checkPanel(2, checkListPanel);
				if(shoppingCartList2 != null) {
					cal.addFile("Order.txt",shoppingCartList2);
				}else {
					cal.deleteFile("Order.txt");
				}
				
				orderAddUI add=new orderAddUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setMargin(new Insets(2, 2, 2, 2));
		btnNewButton_2.setIcon(new ImageIcon(checkPageUI.class.getResource("/asset/addItemBtn.png")));
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//確認在panel上的item，若有item則裝成order_product 塞進DB
				List<String[]> shoppingCartList = checkPanelItem.checkPanel(2, checkListPanel);
				String orderNum = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
				
				if(shoppingCartList!=null) {	
					shoppingCartList.forEach(item -> {
						product p = new productDaoImpl().queryProductIDByName(item[0]);
						
//						System.out.println("orderNum: "+orderNum +" "+"orderid: "+ p.getProduct_id()+" "+"orderName: "+p.getProduct_name()+" "+
//						"amount: "+Integer.parseInt(item[2]));
						
						order_product op = new order_product(orderNum, p.getProduct_id(), Integer.parseInt(item[2]),
								Integer.parseInt(item[1]) * Integer.parseInt(item[2]));
						
						order_productDaoImpl opdI = new order_productDaoImpl();
						opdI.createOrder_prduct(op);
						
					});
					
					
					//create order
					String orderDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
					String orderTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
					String memberID = null ;
					try {
						memberID =(String) cal.readFile("memberInfo.txt").readObject();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
								
					Integer OrderTotal = new order_productDaoImpl().queryOrder_productTotal(orderNum);					
					
					orderDaoImpl odI = new orderDaoImpl();
					odI.createOrder(new order(orderNum,orderDate,orderTime,memberID,"0",OrderTotal));
					
					cal.addFile("Order.txt",orderNum);
					receiptPageUI add = new receiptPageUI();
					add.setVisible(true);					
					dispose();
				}else {
					promptText.setVisible(true);
				}
				
				
			}
		});
		btnNewButton_1.setMargin(new Insets(2, 2, 2, 2));
		btnNewButton_1.setIcon(new ImageIcon(logInPageUI.class.getResource("/asset/confirmBtn.png")));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		panel_5.add(btnNewButton_1);
		
		
		//抓 order.txt 的 data 填進 Check List 
		Integer checkTotal = 0;
		ObjectInputStream ois = cal.readFile("Order.txt");
		
		try {
			@SuppressWarnings("unchecked")
			List<String[]> lo = (List<String[]>) ois.readObject();
			
			for(String[] o:lo) {
				Integer total=Integer.parseInt(o[1]) * Integer.parseInt(o[2]);
				createCheckListItem.create(checkListPanel, o[0].toString(), o[1].toString(), o[2].toString(),total.toString(),1);				
				checkTotal = checkTotal + total;
			}
			ois.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JLabel checkTotalLabel = new JLabel("99999");
		panel_1.add(checkTotalLabel);
		
		checkTotalLabel.setText(checkTotal.toString());
	}

}
