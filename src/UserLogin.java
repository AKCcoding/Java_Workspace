import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class UserLogin extends JFrame {

  private JPanel contentPane;
  private JTextField txtUserName;
  private JPasswordField passwordField;

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          UserLogin userLogin = new UserLogin();
          userLogin.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public UserLogin() {
    setTitle("Food Ordering");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 375, 403);
    contentPane = new JPanel();
    contentPane.setBackground(Color.CYAN);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblUserName = new JLabel("Username :");
    lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblUserName.setBounds(84, 95, 88, 41);
    contentPane.add(lblUserName);

    JLabel lblPassword = new JLabel("Password:");
    lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
    lblPassword.setBounds(95, 165, 77, 22);
    contentPane.add(lblPassword);

    txtUserName = new JTextField();
    txtUserName.setBounds(182, 101, 144, 32);
    contentPane.add(txtUserName);
    txtUserName.setColumns(10);
    
    JLabel userNameEmp = new JLabel("");
    userNameEmp.setBounds(182, 137, 144, 14);
    contentPane.add(userNameEmp);
    
    JLabel passWordEmp = new JLabel("");
    passWordEmp.setBounds(182, 205, 144, 14);
    contentPane.add(passWordEmp);
 
    JLabel lblTitle = new JLabel("Food Ordering System\r\n");
    lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    lblTitle.setBounds(10, 26, 250, 41);
    contentPane.add(lblTitle);

    passwordField = new JPasswordField();
    passwordField.setBounds(182, 162, 144, 32);
    contentPane.add(passwordField);
    
    JLabel lblNewLabel = new JLabel("");
    lblNewLabel.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/user.png")));
    lblNewLabel.setBounds(10, 78, 77, 80);
    contentPane.add(lblNewLabel);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/key.png")));
    lblNewLabel_1.setBounds(30, 165, 55, 47);
    contentPane.add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("");
    lblNewLabel_2.setIcon(new ImageIcon(UserLogin.class.getResource("/Images/1.jpg")));
    lblNewLabel_2.setForeground(Color.CYAN);
    lblNewLabel_2.setBackground(Color.CYAN);
    lblNewLabel_2.setBounds(261, 11, 88, 79);
    contentPane.add(lblNewLabel_2);
    
    
    JButton btnLogin = new JButton("Login");
    btnLogin.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) 
    	{
    		if(txtUserName.getText().trim().isEmpty() && passwordField.getText().trim().isEmpty())
    		{
    			userNameEmp.setText("Username is Empty");
    			passWordEmp.setText("Password is Empty");
    		}
    		else if (txtUserName.getText().trim().isEmpty()) 
    		{
    			userNameEmp.setText("Username is Empty");
			}
    		else if (passwordField.getText().trim().isEmpty())
    		{
    			passWordEmp.setText("Password is Empty");
			}
    		else 
    		{
    		try
    		{
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
    			String sql = "SELECT * from users where username=? and password=?";
    			PreparedStatement pst = con.prepareStatement(sql);
    			pst.setString(1, txtUserName.getText());
    			pst.setString(2, passwordField.getText());
    			ResultSet rs = pst.executeQuery();
    			
    			if (rs.next())
    			{
    				JOptionPane.showMessageDialog(null, "Hello " + txtUserName.getText().toUpperCase() + " Welcome");
    				MainUI window = new MainUI();
					window.fOS.setVisible(true);
    			}
    			else {
    				JOptionPane.showMessageDialog(null, "Username and Password Doesn't Match");
    				txtUserName.setText("");
    				passwordField.setText("");
    			}
    			con.close();
    			
    		}
    		catch (Exception e2) 
    		{
				JOptionPane.showMessageDialog(btnLogin, e);
			}
    		}
    	}
    });
    btnLogin.setBounds(10, 230, 339, 56);
    contentPane.add(btnLogin);

    JButton btnSignUp = new JButton("Sign Up");
    btnSignUp.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) 
    	{ 
    		SignUpUI sUI = new SignUpUI();
			sUI.setVisible(true);
    	}
    });
    btnSignUp.setBounds(10, 297, 339, 56);
    contentPane.add(btnSignUp);
  }
}