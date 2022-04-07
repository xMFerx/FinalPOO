package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
/**
 * Panel de inicio de sesión
 * @see: MainWin	
 * 
 */
public class LoginPanel extends JPanel {
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JButton btnLogIn;
	private JButton btnPassRecover;
	private JButton btnSignUp;
	private JButton btnLogInAdmins; 
	private JTextField txtMessage;
	
	public LoginPanel() {
		setBackground(new Color(167, 134, 130));
		setLayout(null);
		
		JLabel userLabel = new JLabel("Usuario");
		userLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		userLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		userLabel.setBounds(791, 218, 57, 16);
		add(userLabel);
		
		txtUser = new JTextField();
		txtUser.setBorder(new LineBorder(Color.BLACK));
		txtUser.setBounds(860, 218, 86, 20);
		add(txtUser);
		txtUser.setColumns(10);
		
		JLabel passLabel = new JLabel("Contraseña");
		passLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		passLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		passLabel.setBounds(776, 262, 72, 16);
		add(passLabel);
				
		JLabel TitleLabel = new JLabel("Inicia sesi\u00F3n");
		TitleLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		TitleLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 32));
		TitleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TitleLabel.setBounds(713, 57, 237, 98);
		add(TitleLabel);
		
		btnLogIn = new JButton("Acceder");
		btnLogIn.setBorder(null);
		btnLogIn.setForeground(Color.LIGHT_GRAY);
		btnLogIn.setBackground(new Color(81, 52, 77));
		btnLogIn.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		btnLogIn.setBounds(776, 313, 173, 44);
		add(btnLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new LineBorder(Color.BLACK));
		passwordField.setBounds(860, 262, 86, 20);
		add(passwordField);
		
		JLabel TitleLabel2 = new JLabel("con tus credenciales");
		TitleLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		TitleLabel2.setVerticalAlignment(SwingConstants.TOP);
		TitleLabel2.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		TitleLabel2.setBounds(742, 155, 202, 36);
		add(TitleLabel2);
		
		JLabel lblCompanyLogo = new JLabel("");
		lblCompanyLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyLogo.setIcon(new ImageIcon(LoginPanel.class.getResource("/view/icons/MainScreenLogo.png")));
		lblCompanyLogo.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		lblCompanyLogo.setBounds(0, 0, 730, 720);
		add(lblCompanyLogo);
		
		btnPassRecover = new JButton("Olvid\u00E9 mi contrase\u00F1a ");
		btnPassRecover.setBackground(new Color(167, 134, 130));
		btnPassRecover.setBorder(null);
		btnPassRecover.setForeground(Color.DARK_GRAY);
		btnPassRecover.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnPassRecover.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPassRecover.setBounds(802, 590, 144, 23);
		add(btnPassRecover);
		
		btnSignUp = new JButton("Registrarme ");
		btnSignUp.setBackground(new Color(167, 134, 130));
		btnSignUp.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnSignUp.setBorder(null);
		btnSignUp.setBounds(802, 553, 144, 26);
		add(btnSignUp);
		
		btnLogInAdmins = new JButton("Acceso para Administradores ");
		btnLogInAdmins.setBackground(new Color(167, 134, 130));
		btnLogInAdmins.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogInAdmins.setForeground(Color.DARK_GRAY);
		btnLogInAdmins.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnLogInAdmins.setBorder(null);
		btnLogInAdmins.setBounds(789, 624, 157, 20);
		add(btnLogInAdmins);
		
		txtMessage = new JTextField("");
		txtMessage.setBorder(null);
		txtMessage.setBackground(new Color(167, 134, 130));
		txtMessage.setEditable(false);
		txtMessage.setEnabled(false);
		txtMessage.setHorizontalAlignment(SwingConstants.CENTER);
		txtMessage.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		txtMessage.setBounds(760, 368, 230, 20);
		add(txtMessage);		
		
	}

	
	public JTextField getTxtMessage() {
		return txtMessage;
	}


	public void setTxtMessage(JTextField txtMessage) {
		this.txtMessage = txtMessage;
	}


	public JTextField getTxtUser() {
		return txtUser;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public JButton getBtnPassRecover() {
		return btnPassRecover;
	}

	public JButton getBtnSignUp() {
		return btnSignUp;
	}

	public JButton getBtnLogInAdmins() {
		return btnLogInAdmins;
	}
}
