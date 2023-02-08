import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class SignUpUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstName;
	private JLabel lblLastName;
	private JLabel lblAddress;
	private JLabel lblGender;
	private JTextField textFieldLastName;
	private JTextField textFieldAddress;
	private JTextField textFieldEmail;
	private JTextField textFieldContact;
	private JTextField textFieldUserName;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI sUI = new SignUpUI();
					sUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUpUI() {
		
		Connection con = null;
		PreparedStatement pst = null;
		
		setTitle("Sign Up / Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 800, 800));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(40, 39, 73, 41);
		contentPane.add(lblFirstName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(125, 41, 313, 41);
		contentPane.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(450, 30, 73, 58);
		contentPane.add(lblLastName);
		
		lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(40, 126, 73, 41);
		contentPane.add(lblAddress);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(453, 117, 73, 58);
		contentPane.add(lblGender);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(530, 41, 241, 41);
		contentPane.add(textFieldLastName);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(125, 126, 313, 41);
		contentPane.add(textFieldAddress);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBoxGender.setBounds(530, 125, 241, 42);
		contentPane.add(comboBoxGender);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(40, 207, 73, 46);
		contentPane.add(lblEmail);
		
		JLabel lblContact = new JLabel("Contact  # :");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContact.setBounds(453, 201, 89, 58);
		contentPane.add(lblContact);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(125, 212, 313, 41);
		contentPane.add(textFieldEmail);
		
		textFieldContact = new JTextField();
		textFieldContact.setColumns(10);
		textFieldContact.setBounds(530, 212, 241, 41);
		contentPane.add(textFieldContact);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(40, 285, 73, 46);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(450, 285, 73, 46);
		contentPane.add(lblPassword);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setColumns(10);
		textFieldUserName.setBounds(125, 290, 313, 41);
		contentPane.add(textFieldUserName);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(530, 290, 241, 41);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Register ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textFieldFirstName.getText().trim().isEmpty() && textFieldLastName.getText().trim().isEmpty() || textFieldAddress.getText().trim().isEmpty() 
				&& textFieldEmail.getText().isEmpty() || textFieldContact.getText().isEmpty() || textFieldUserName.getText().isEmpty() || passwordField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Please Fill out all fields");
				}
				else 
				{
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
	    			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
	    			String sql = "INSERT INTO `users`(`fname`, `lname`, `addr`, `gender`, `email`, `phone`, `username`, `password`) VALUES (?,?,?,?,?,?,?,?)";
	    			PreparedStatement pst = con.prepareStatement(sql);
	    			pst.setString(1, textFieldFirstName.getText());
	    			pst.setString(2, textFieldLastName.getText());
	    			pst.setString(3, textFieldAddress.getText());
	    			pst.setString(4, comboBoxGender.getSelectedItem().toString());
	    			pst.setString(5, textFieldEmail.getText());
	    			pst.setString(6, textFieldContact.getText());
	    			pst.setString(7, textFieldUserName.getText());
	    			pst.setString(8, passwordField.getText());
	    			pst.executeUpdate();
	    			JOptionPane.showMessageDialog(null, "Registered Successfully");
	    			
				} catch (Exception e2) 
				{
					JOptionPane.showMessageDialog(null, e2);
				}
				}
			}
		});
		btnNewButton.setBounds(180, 380, 190, 65);
		contentPane.add(btnNewButton);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});

		btnQuit.setBounds(405, 380, 190, 65);
		contentPane.add(btnQuit);
	}
}
