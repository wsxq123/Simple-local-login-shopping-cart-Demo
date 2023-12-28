package controller.order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.Choice;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.impl.productDaoImpl;
import model.product;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class orderAddUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderAddUI frame = new orderAddUI();
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
	public orderAddUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 415);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIconSpot.png"));
		lblNewLabel.setBounds(543, 19, 21, 25);
		contentPane.add(lblNewLabel);
		//set invisible at start
		lblNewLabel.setVisible(false);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 81, 554, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setRowMargin(10);
		table.setRowHeight(30);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setRowSelectionAllowed(false);
		table.setShowHorizontalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"bodyShape_coolSculpting", "12999"},
				{"bodyShape_starformer", "15999"},
				{"facialLaser_ECO2 Laser", "8999"},
				{"facialLaser_picoWay", "4999"},
			},
			new String[] {
				"name", "price"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(150);
		table.getColumnModel().getColumn(0).setMinWidth(150);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setMinWidth(5);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("新細明體", Font.PLAIN, 18));
		table.setBounds(10, 113, 313, 120);
		panel.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(316, 10, 228, 27);
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton btnNewButton_2_2 = new JButton("");
		panel_2.add(btnNewButton_2_2);
		btnNewButton_2_2.setContentAreaFilled(false);
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\plusBtn.png"));
		btnNewButton_2_2.setBorderPainted(false);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("新細明體", Font.PLAIN, 14));
		textField.setPreferredSize(new Dimension(4, 21));
		textField.setText("0");
		textField.setColumns(10);
		
		JButton btnNewButton_2_1_1 = new JButton("");
		panel_2.add(btnNewButton_2_1_1);
		btnNewButton_2_1_1.setContentAreaFilled(false);
		btnNewButton_2_1_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png"));
		btnNewButton_2_1_1.setBorderPainted(false);
		
		JLabel lblNewLabel_1 = new JLabel("bodyShape_coolSculpting");
		lblNewLabel_1.setBounds(367, 120, 145, 18);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\shoppingCartIcon.png"));
		btnNewButton.setBounds(517, 21, 40, 32);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		comboBox.setBorder(null);
		comboBox.setFont(new Font("新細明體", Font.PLAIN, 16));
		comboBox.setEditable(true);
		comboBox.setBounds(33, 28, 219, 25);
		contentPane.add(comboBox);
		
		productDaoImpl pd = new productDaoImpl();
		List<product> l = pd.queryAllProduct();
		
		for(product p:l) {
			System.out.println(p.getProduct_name());
			comboBox.addItem(p.getProduct_name());
		}
		
		comboBox.setSelectedItem("select service");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(487, 334, 77, 32);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\AddBtn.png"));
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\minusBtn.png"));
		btnNewButton_2_1.setBounds(403, 21, 21, 23);
		contentPane.add(btnNewButton_2_1);
		btnNewButton_2_1.setBorderPainted(false);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(343, 21, 21, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\javaOCP\\javaPracticeShop\\javaPracticeHomework\\asset\\plusBtn.png"));
		
		JTextArea textArea = new JTextArea();
		textArea.setText("0");
		textArea.setBounds(363, 19, 30, 25);
		contentPane.add(textArea);
	}
}
