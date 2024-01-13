package controller.order;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import dao.impl.orderDaoImpl;
import dao.impl.order_productDaoImpl;
import dao.impl.productDaoImpl;
import model.order;
import model.order_product;
import model.product;
import util.cal;
import util.createCheckListItem;
import util.dynamicClock;

import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.PrintJob;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class receiptPageUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receiptPageUI frame = new receiptPageUI();
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
	public receiptPageUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		dynamicClock.createDynamicClock(contentPane);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 574, 376);
		panel.setPreferredSize(new Dimension(590, 10));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel.add(panel_3);
		panel_3.setPreferredSize(new Dimension(520, 35));
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_3.add(panel_1);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7);

		JLabel lblNewLabel = new JLabel("Receipt");
		panel_7.add(lblNewLabel);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Corbel", Font.PLAIN, 25));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_3.add(panel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setPreferredSize(new Dimension(520, 60));
		panel.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_5.setPreferredSize(new Dimension(500, 20));
		panel_4.add(panel_5);

		JLabel lblNewLabel_1 = new JLabel("Order Date: ");
		panel_5.add(lblNewLabel_1);

		JLabel OrderDateLabel = new JLabel("OrderDateLabel");
		panel_5.add(OrderDateLabel);

		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(Color.WHITE);
		FlowLayout flowLayout_3 = (FlowLayout) panel_5_1.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_5_1.setPreferredSize(new Dimension(500, 20));
		panel_4.add(panel_5_1);

		JLabel lblNewLabel_1_1 = new JLabel("Order Number : ");
		panel_5_1.add(lblNewLabel_1_1);

		JLabel OrderNumLabel = new JLabel("OrderNumLabel");
		panel_5_1.add(OrderNumLabel);

		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setBackground(Color.WHITE);
		FlowLayout flowLayout_5 = (FlowLayout) panel_5_1_1.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setPreferredSize(new Dimension(500, 20));
		panel_4.add(panel_5_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Order Total Sum : ");
		panel_5_1_1.add(lblNewLabel_1_1_1);

		JLabel OrderTotalLabel = new JLabel("OrderTotalLabel");
		panel_5_1_1.add(OrderTotalLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(520, 200));
		panel.add(scrollPane);

		JPanel titlePanel = new JPanel();
		scrollPane.setViewportView(titlePanel);
		titlePanel.setBackground(Color.WHITE);
		titlePanel.setBorder(null);
		FlowLayout fl_titlePanel = (FlowLayout) titlePanel.getLayout();
		fl_titlePanel.setAlignment(FlowLayout.LEFT);
		scrollPane.setColumnHeaderView(titlePanel);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setPreferredSize(new Dimension(70, 0));
		titlePanel.add(horizontalGlue_2);

		JLabel lblNewLabel_1_2 = new JLabel("Item");
		titlePanel.add(lblNewLabel_1_2);

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

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));

		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(Color.WHITE);
		FlowLayout flowLayout_1 = (FlowLayout) panel_4_1_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel_4_1_1.setPreferredSize(new Dimension(520, 50));
		panel.add(panel_4_1_1);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderAddUI add = new orderAddUI();
				add.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(receiptPageUI.class.getResource("/asset/backBtn.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		panel_4_1_1.add(btnNewButton_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// 攤平scroll
				int heightDiff = panel_6.getHeight() - scrollPane.getHeight() + titlePanel.getHeight();
				scrollPane.setPreferredSize(new Dimension(520, scrollPane.getHeight() + heightDiff));
				panel.setBounds(0, 0, 574, panel.getHeight() + heightDiff);
				setBounds(getBounds().x, getBounds().y, getBounds().width, getBounds().height + heightDiff);
				repaint();

				// way1 截圖 to PDF
				JFrame jf = new JFrame();
				jf = (JFrame) getFrames()[0];
				PritnActionPerformed(contentPane, jf);

				// way2 截圖輸出
//				Container c = getContentPane();
//				BufferedImage im = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
//				c.paint(im.getGraphics());
//				try {
//					ImageIO.write(im, "PNG", new File("shot.png"));
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(receiptPageUI.class.getResource("/asset/printBtn.png")));
		panel_2.add(btnNewButton);

		// 讀Order.txt的orderNum，接著去抓DB的order data，填上receipt
		ObjectInputStream ois = cal.readFile("Order.txt");
		String orderNum = null;
		try {
			orderNum = (String) ois.readObject();
			ois.close();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		cal.deleteFile("Order.txt");

		orderDaoImpl odI = new orderDaoImpl();
		order o = odI.queryOrder(orderNum);
		OrderDateLabel.setText(o.getOrder_Date());
		OrderNumLabel.setText(o.getOrder_Number());
		OrderTotalLabel.setText(Integer.toString(o.getTotal()));

		order_productDaoImpl opdI = new order_productDaoImpl();
		List<order_product> opList = opdI.queryOrder_product(orderNum);
		opList.forEach(item -> {
			product p = new productDaoImpl().queryProduct(item.getProduct_id());
			createCheckListItem.create(panel_6, p.getProduct_name(), Integer.toString(p.getProduct_price()),
					Integer.toString(item.getAmount()), Integer.toString(item.getCost()), 2);
		});

	}

	public void PritnActionPerformed(JPanel contentPane, JFrame jf) {
		PrintJob pjp = contentPane.getToolkit().getPrintJob(jf, null, null);
		Graphics g = pjp.getGraphics();
		contentPane.print(g);
		g.dispose();
		pjp.end();
	}

}
