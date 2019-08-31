import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class Login {

	private JFrame frmLogin;
	private JTextField textUsername;
	private JPasswordField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setType(Type.POPUP);
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		frmLogin.getContentPane().setBackground(new Color(204, 255, 102));
		frmLogin.setBounds(235,100, 621, 361);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel Canteen = new JLabel("Canteen Management System");
		Canteen.setBounds(117, 0, 388, 48);
		Canteen.setHorizontalAlignment(SwingConstants.CENTER);
		Canteen.setFont(new Font("Arial Black", Font.BOLD, 16));
		Canteen.setForeground(new Color(0, 0, 0));
		frmLogin.getContentPane().add(Canteen);
		
		JLabel Username = new JLabel("Username");
		Username.setBounds(136, 91, 99, 20);
		Username.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmLogin.getContentPane().add(Username);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(136, 142, 99, 20);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frmLogin.getContentPane().add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setBounds(264, 92, 178, 20);
		frmLogin.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(264, 143, 178, 20);
		frmLogin.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(416, 212, 89, 23);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtPassword.getText();
				String username = textUsername.getText();
				
				if(password.contains("admin")&& username.contains("admin")) {
					txtPassword.setText(null);
					textUsername.setText(null);
					Welcomescreen info = new Welcomescreen();
					Welcomescreen.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Username and Password","Login Alert",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					textUsername.setText(null);
				}
			

			}
		});
		frmLogin.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(173, 212, 89, 23);
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnExit.setBackground(SystemColor.desktop);
		btnExit.addActionListener(new ActionListener() {
			private JFrame LoginSystem;

			public void actionPerformed(ActionEvent e) {
				LoginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(LoginSystem,"Are Sure to Exit","Canteen Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		frmLogin.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(115, 182, 421, 2);
		separator.setBackground(Color.RED);
		frmLogin.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 62, 605, 2);
		separator_1.setBackground(Color.RED);
		frmLogin.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 265, 595, 2);
		separator_2.setBackground(Color.RED);
		frmLogin.getContentPane().add(separator_2);
		
		JLabel ButtomLevel = new JLabel("Copyright \u00A9 2019 Canteen Management System");
		ButtomLevel.setBounds(30, 278, 565, 33);
		ButtomLevel.setHorizontalAlignment(SwingConstants.CENTER);
		ButtomLevel.setFont(new Font("Arial", Font.ITALIC, 14));
		frmLogin.getContentPane().add(ButtomLevel);
		
		}
}
