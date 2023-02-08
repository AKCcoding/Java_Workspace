import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

public class MainUI
{

	JFrame fOS;
	private JTable JTable1;
	private JTextField textField_SubTotal;
	private JTextField textField_Tax;
	private JTextField textField_Total;
	private JTextField textField_Cash;
	private JTextField textField_Change;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MainUI window = new MainUI();
					window.fOS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	@SuppressWarnings("unchecked")
	public MainUI() 
	{
		initialize();
	}
	public void ItemCost()
	{
		double sum = 0.0;
		for (int i = 0; i < JTable1.getRowCount(); i++) 
		{
			sum = sum + Double.parseDouble(JTable1.getValueAt(i, 2).toString());
		}
		textField_SubTotal.setText(Double.toString(sum));
		double cTotal1 = Double.parseDouble(textField_SubTotal.getText());
		double tax = (cTotal1 * 12.0/100);
		
		String taxTotal = String.format("₱ %.2f", tax);
		textField_Tax.setText(taxTotal);
		
		String subTotal = String.format("₱ %.2f", cTotal1);
		textField_SubTotal.setText(subTotal);
		
		String netTotal = String.format("₱ %.2f", cTotal1 + tax);
		textField_Total.setText(netTotal);
	}
	public void Change()
	{
		double sum = 0;
		double tax = 12.0;
		double cash = Double.parseDouble(textField_Cash.getText());
		
		for (int i = 0; i < JTable1.getRowCount(); i++) 
		{
			sum = sum + Double.parseDouble(JTable1.getValueAt(i, 2).toString());
		}
		double cTax = (sum*12.0/100);
		double cChange = (cash -(sum + cTax));
		
		String changeGiven = String.format("₱ %.2f", cChange);		
		textField_Change.setText(changeGiven);	
	}
	private void initialize() 
	{
		fOS = new JFrame();
		fOS.getContentPane().setBackground(Color.CYAN);
		fOS.getContentPane().setForeground(Color.CYAN);
		fOS.setForeground(new Color(255, 255, 255));
		fOS.setTitle("Food Ordering System");
		fOS.setBounds(100, 100, 1400, 800);
		fOS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fOS.getContentPane().setLayout(null);

		Panel panel = new Panel();
		panel.setForeground(Color.WHITE);
		panel.setFont(new Font("DialogInput", Font.BOLD, 14));
		panel.setBounds(46, 41, 300, 451);
		fOS.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField_Cash.getText();
				
				if(EnterNumber =="")
				{
					textField_Cash.setText(jbtn7.getText());
				}
				else
				{
					EnterNumber = textField_Cash.getText() + jbtn7.getText();
					textField_Cash.setText(EnterNumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn7.setBounds(10, 11, 75, 85);
		panel.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn8.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn8.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn8.setBounds(113, 11, 75, 85);
		panel.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn9.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn9.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn9.setBounds(215, 11, 75, 85);
		panel.add(jbtn9);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn4.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn4.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn4.setBounds(10, 126, 75, 85);
		panel.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn5.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn5.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn5.setBounds(113, 126, 75, 85);
		panel.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
			
			if(Enternumber == "")
			{
				textField_Cash.setText(jbtn6.getText());
			}
			else 
			{
				Enternumber = textField_Cash.getText() + jbtn6.getText();
				textField_Cash.setText(Enternumber);
			}
			}
		});
		
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn6.setBounds(215, 126, 75, 85);
		panel.add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn1.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn1.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn1.setBounds(10, 235, 75, 85);
		panel.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn2.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn2.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn2.setBounds(113, 235, 75, 85);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn3.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn3.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn3.setBounds(215, 235, 75, 85);
		panel.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Enternumber = textField_Cash.getText();
				
				if(Enternumber =="")
				{
					textField_Cash.setText(jbtn0.getText());
				}
				else
				{
					Enternumber = textField_Cash.getText() + jbtn0.getText();
					textField_Cash.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn0.setBounds(10, 342, 75, 85);
		panel.add(jbtn0);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(! textField_Cash.getText().contains(".")) 
				{
					textField_Cash.setText(textField_Cash.getText() + jbtnDot.getText());
				}
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnDot.setBounds(113, 342, 75, 85);
		panel.add(jbtnDot);
		
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField_Cash.setText("");
				textField_Change.setText("");
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnC.setBounds(215, 342, 75, 85);
		panel.add(jbtnC);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(625, 41, 749, 451);
		fOS.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCoffee = new JButton("");
		btnCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 15.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"JolliCoffee", "1", priceOfItem});
				ItemCost();
			}
		});
		btnCoffee.setIcon(new ImageIcon(MainUI.class.getResource("/Images/coffee.jpg")));
		btnCoffee.setBounds(29, 325, 110, 115);
		panel_1.add(btnCoffee);
		
		JButton btnCake = new JButton("");
		btnCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 50.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"JolliCake", "1", priceOfItem});
				ItemCost();
			}
		});
		btnCake.setIcon(new ImageIcon(MainUI.class.getResource("/Images/cake.jpg")));
		btnCake.setBounds(149, 325, 110, 115);
		panel_1.add(btnCake);
		
		JButton btnMPie = new JButton("");
		btnMPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 45.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Peach Mango Pie", "1", priceOfItem});
				ItemCost();
			}
		});
		btnMPie.setIcon(new ImageIcon(MainUI.class.getResource("/Images/mpie.jpg")));
		btnMPie.setBounds(269, 325, 110, 115);
		panel_1.add(btnMPie);
		
		JButton btnIceCreamCone = new JButton("");
		btnIceCreamCone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 10.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Ice Cream Cone", "1", priceOfItem});
				ItemCost();
			}
		});
		btnIceCreamCone.setBackground(Color.WHITE);
		btnIceCreamCone.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icc.jpg")));
		btnIceCreamCone.setBounds(389, 325, 110, 115);
		panel_1.add(btnIceCreamCone);
		
		JButton btnSundae = new JButton("");
		btnSundae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 30.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Chocolate Sundae", "1", priceOfItem});
				ItemCost();
			}
		});
		btnSundae.setBackground(Color.WHITE);
		btnSundae.setIcon(new ImageIcon(MainUI.class.getResource("/Images/sundae.png")));
		btnSundae.setBounds(509, 325, 110, 115);
		panel_1.add(btnSundae);
		
		JButton btnIcc = new JButton("");
		btnIcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 10.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Vanilla Twirl", "1", priceOfItem});
				ItemCost();
			}
		});
		btnIcc.setIcon(new ImageIcon(MainUI.class.getResource("/Images/icc1.jpg")));
		btnIcc.setBounds(629, 325, 110, 115);
		panel_1.add(btnIcc);
		
		JButton btnCola = new JButton("");
		btnCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 18.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Coca-Cola Coke", "1", priceOfItem});
				ItemCost();
			}
		});
		btnCola.setBackground(Color.WHITE);
		btnCola.setIcon(new ImageIcon(MainUI.class.getResource("/Images/cola1.jpg")));
		btnCola.setBounds(29, 164, 110, 115);
		panel_1.add(btnCola);
		
		JButton btnSprite = new JButton("");
		btnSprite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 19.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Sprite", "1", priceOfItem});
				ItemCost();
			}
		});
		btnSprite.setIcon(new ImageIcon(MainUI.class.getResource("/Images/sprite.jpg")));
		btnSprite.setBounds(149, 164, 110, 115);
		panel_1.add(btnSprite);
		
		JButton btnRootBeer = new JButton("");
		btnRootBeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 25.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Root Beer", "1", priceOfItem});
				ItemCost();
			}
		});
		btnRootBeer.setBackground(Color.WHITE);
		btnRootBeer.setIcon(new ImageIcon(MainUI.class.getResource("/Images/rb.jpg")));
		btnRootBeer.setBounds(269, 164, 110, 115);
		panel_1.add(btnRootBeer);
		
		JButton btnRoyal = new JButton("");
		btnRoyal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 30.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Royal", "1", priceOfItem});
				ItemCost();
			}
		});
		btnRoyal.setIcon(new ImageIcon(MainUI.class.getResource("/Images/royal.jpg")));
		btnRoyal.setBounds(389, 164, 110, 115);
		panel_1.add(btnRoyal);
		
		JButton btnCokeFloat = new JButton("");
		btnCokeFloat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 30.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Coke Float", "1", priceOfItem});
				ItemCost();
			}
		});
		btnCokeFloat.setIcon(new ImageIcon(MainUI.class.getResource("/Images/jollibee_float.jpg")));
		btnCokeFloat.setBounds(509, 164, 110, 115);
		panel_1.add(btnCokeFloat);
		
		JButton btnPepsi = new JButton("");
		btnPepsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 20.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Pepsi", "1", priceOfItem});
				ItemCost();
			}
		});
		btnPepsi.setIcon(new ImageIcon(MainUI.class.getResource("/Images/pepsi.jpg")));
		btnPepsi.setBounds(629, 164, 110, 115);
		panel_1.add(btnPepsi);
		
		JButton btnChicken = new JButton("");
		btnChicken.setBackground(Color.WHITE);
		btnChicken.setIcon(new ImageIcon(MainUI.class.getResource("/Images/chicken.png")));
		btnChicken.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 100.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Chicken w/ Rice", "1", priceOfItem});
				ItemCost();
			}
		});
		
		btnChicken.setBounds(29, 11, 110, 115);
		panel_1.add(btnChicken);
		
		JButton btnBurgerSteak = new JButton("");
		btnBurgerSteak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 89.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"2 Burger Steak w/ Rice", "1", priceOfItem});
				ItemCost();
			}
		});
		btnBurgerSteak.setIcon(new ImageIcon(MainUI.class.getResource("/Images/bs.jpg")));
		btnBurgerSteak.setBounds(149, 11, 110, 115);
		panel_1.add(btnBurgerSteak);
		
		JButton btnSpag = new JButton("");
		btnSpag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 80.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Spaghetti", "1", priceOfItem});
				ItemCost();
			}
		});
		btnSpag.setBackground(Color.WHITE);
		btnSpag.setIcon(new ImageIcon(MainUI.class.getResource("/Images/spag.png")));
		btnSpag.setBounds(269, 11, 110, 115);
		panel_1.add(btnSpag);
		
		JButton btnPepperBeef = new JButton("");
		btnPepperBeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 80.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Beef Pepper Steak", "1", priceOfItem});
				ItemCost();
			}
		});
		btnPepperBeef.setBackground(Color.WHITE);
		btnPepperBeef.setIcon(new ImageIcon(MainUI.class.getResource("/Images/gpb.jpg")));
		btnPepperBeef.setBounds(389, 11, 110, 115);
		panel_1.add(btnPepperBeef);
		
		JButton btnShanghai = new JButton("");
		btnShanghai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 65.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Shanghai w/ Itlog", "1", priceOfItem});
				ItemCost();
			}
		});
		btnShanghai.setBackground(Color.WHITE);
		btnShanghai.setIcon(new ImageIcon(MainUI.class.getResource("/Images/bfast.png")));
		btnShanghai.setBounds(509, 11, 110, 115);
		panel_1.add(btnShanghai);
		
		JButton btnLongadog = new JButton("");
		btnLongadog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double priceOfItem = 65.0;
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.addRow(new Object[] {"Longgadog", "1", priceOfItem});
				ItemCost();
			}
		});
		btnLongadog.setBackground(Color.WHITE);
		btnLongadog.setIcon(new ImageIcon(MainUI.class.getResource("/Images/bfast1.png")));
		btnLongadog.setBounds(629, 11, 110, 115);
		panel_1.add(btnLongadog);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(-579, -3, 296, 454);
		panel_1.add(panel_2_1);
		
		JTable1 = new JTable();
		JTable1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		JTable1.setRowSelectionAllowed(false);
		JTable1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Quantity", "Amount"
			}
		));
		JTable1.setCellSelectionEnabled(true);
		JTable1.setBounds(362, 81, 257, 411);
		fOS.getContentPane().add(JTable1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(46, 521, 1328, 160);
		fOS.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(10, 11, 430, 138);
		panel_2.add(panel_2_2);
		panel_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_2.setLayout(null);
		
		JLabel lblSubTotal = new JLabel("Sub Total :");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(10, 11, 113, 30);
		panel_2_2.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax :");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(10, 54, 113, 30);
		panel_2_2.add(lblTax);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(10, 97, 113, 30);
		panel_2_2.add(lblTotal);
		
		textField_SubTotal = new JTextField();
		textField_SubTotal.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_SubTotal.setBounds(125, 11, 295, 29);
		panel_2_2.add(textField_SubTotal);
		textField_SubTotal.setColumns(10);
		
		textField_Tax = new JTextField();
		textField_Tax.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_Tax.setColumns(10);
		textField_Tax.setBounds(125, 52, 295, 29);
		panel_2_2.add(textField_Tax);
		
		textField_Total = new JTextField();
		textField_Total.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_Total.setColumns(10);
		textField_Total.setBounds(125, 95, 295, 29);
		panel_2_2.add(textField_Total);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_2_1.setBounds(450, 11, 430, 138);
		panel_2.add(panel_2_2_1);
		panel_2_2_1.setLayout(null);
		
		JLabel lblPaymentMode = new JLabel("Payment Mode:");
		lblPaymentMode.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPaymentMode.setBounds(10, 11, 157, 30);
		panel_2_2_1.add(lblPaymentMode);
		
		JLabel lblCash = new JLabel("Cash :");
		lblCash.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCash.setBounds(10, 52, 157, 30);
		panel_2_2_1.add(lblCash);
		
		JLabel lblChange = new JLabel("Change :");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChange.setBounds(10, 93, 157, 30);
		panel_2_2_1.add(lblChange);
		
		textField_Cash = new JTextField();
		textField_Cash.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_Cash.setColumns(10);
		textField_Cash.setBounds(177, 52, 243, 29);
		panel_2_2_1.add(textField_Cash);
		
		textField_Change = new JTextField();
		textField_Change.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_Change.setColumns(10);
		textField_Change.setBounds(177, 93, 243, 29);
		panel_2_2_1.add(textField_Change);
		
		JComboBox comboBox_PaymentMode = new JComboBox();
		comboBox_PaymentMode.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox_PaymentMode.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Master Card", "Visa Card"}));
		comboBox_PaymentMode.setBounds(177, 11, 243, 30);
		panel_2_2_1.add(comboBox_PaymentMode);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_2_1_1.setBounds(890, 11, 430, 138);
		panel_2.add(panel_2_2_1_1);
		panel_2_2_1_1.setLayout(null);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox_PaymentMode.getSelectedItem().equals("Cash"))
				{
					Change();
				}
				else if (comboBox_PaymentMode.getSelectedItem().equals("Master Card")) 
				{
					Change();
				}
				else if (comboBox_PaymentMode.getSelectedItem().equals("Visa Card")) 
				{
					Change();
				}
				else 
				{		
					textField_Change.setText("");
					textField_Cash.setText("");
				}			
			}
		});
		btnPay.setBounds(10, 11, 195, 30);
		panel_2_2_1_1.add(btnPay);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				model.setRowCount(0);
				textField_Change.setText("");
				textField_Tax.setText("");
				textField_SubTotal.setText("");
				textField_Cash.setText("");
				textField_Total.setText("");
			}
		});
		btnReset.setBounds(215, 11, 195, 30);
		panel_2_2_1_1.add(btnReset);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try {
					JTable1.print(JTable.PrintMode.NORMAL, header, footer);
				} catch (Exception e2) {
					System.err.format("No Printer found", e2.getMessage());
				}
			}
		});
		btnPrint.setBounds(10, 52, 195, 30);
		panel_2_2_1_1.add(btnPrint);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel model = (DefaultTableModel)JTable1.getModel();
				int RemoveItem = JTable1.getSelectedRow();
				if(RemoveItem >=0 )
				{
					model.removeRow(RemoveItem);
				}
				ItemCost();
			}
		});
		btnRemove.setBounds(215, 52, 195, 30);
		panel_2_2_1_1.add(btnRemove);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 System.exit(0);
			}
		});
		btnExit.setBounds(120, 93, 195, 30);
		panel_2_2_1_1.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Item");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(370, 40, 45, 25);
		fOS.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(440, 40, 60, 25);
		fOS.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(528, 40, 60, 25);
		fOS.getContentPane().add(lblNewLabel_2);
	}
}
