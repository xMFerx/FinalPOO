package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class LoginPanel extends JPanel {
	private JTextField txtUser;
	private JPasswordField passwordField;
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
		
		JButton btnLogIn = new JButton("Acceder");
		btnLogIn.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(0, 0, 0)));
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
		
		JButton btnPassRecover = new JButton("Olvid\u00E9 mi contrase\u00F1a ");
		btnPassRecover.setBackground(new Color(167, 134, 130));
		btnPassRecover.setBorder(null);
		btnPassRecover.setForeground(Color.DARK_GRAY);
		btnPassRecover.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnPassRecover.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPassRecover.setBounds(802, 590, 144, 23);
		add(btnPassRecover);
		
		JButton btnSignUp = new JButton("Registrarme ");
		btnSignUp.setBackground(new Color(167, 134, 130));
		btnSignUp.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSignUp.setForeground(Color.DARK_GRAY);
		btnSignUp.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnSignUp.setBorder(null);
		btnSignUp.setBounds(802, 553, 144, 26);
		add(btnSignUp);
		
		JButton btnLogInAdmins = new JButton("Acceso para Administradores ");
		btnLogInAdmins.setBackground(new Color(167, 134, 130));
		btnLogInAdmins.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogInAdmins.setForeground(Color.DARK_GRAY);
		btnLogInAdmins.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		btnLogInAdmins.setBorder(null);
		btnLogInAdmins.setBounds(789, 624, 157, 20);
		add(btnLogInAdmins);
		
	}
}
