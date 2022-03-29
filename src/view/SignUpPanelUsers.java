package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class SignUpPanelUsers extends JPanel {
	private JTextField txtUserName;
	private JLabel lblPasswordReq1;
	private JPasswordField passwordField;
	private JTextField txtName;
	private TextPrompt placeholder_1;
	private JTextField txtCity;
	private JTextField txtEmail;
	private JTextField txtTelephone;
	private JTextField txtBirthDay;
	private JLabel lblLogo;
	private JButton btnFinish;
	private JTextField txtMessage;

	/**
	 * Create the panel.
	 */
	public SignUpPanelUsers() {
		setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(SignUpPanelUsers.class.getResource("/view/icons/SmallLogo.png")));
		lblLogo.setBounds(450, 48, 120, 60);
		add(lblLogo);
		
		JLabel lblTitle = new JLabel("Registrate");
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Morgenlitch", Font.BOLD, 25));
		lblTitle.setBounds(357, 125, 306, 43);
		add(lblTitle);
		
		JLabel lblSubtitle = new JLabel("en nuestra tienda...");
		lblSubtitle.setForeground(new Color(0, 0, 0));
		lblSubtitle.setFont(new Font("Malgun Gothic", Font.PLAIN, 11));
		lblSubtitle.setVerticalAlignment(SwingConstants.TOP);
		lblSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtitle.setBounds(357, 165, 306, 14);
		add(lblSubtitle);
		
		txtUserName = new JTextField();
		txtUserName.setBackground(new Color(193, 184, 178));
		txtUserName.setBorder(new LineBorder(new Color(0, 0, 0)));
		TextPrompt placeholder = new TextPrompt("Nombre de Usuario", txtUserName);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
	    txtUserName.setBounds(450, 250, 120, 20);
		add(txtUserName);
		txtUserName.setColumns(10);		
		
		txtName = new JTextField();
		txtName.setBackground(new Color(193, 184, 178));
		txtName.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder = new TextPrompt("Nombre", txtName);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
		txtName.setBounds(450, 210, 120, 20);
		add(txtName);
		txtName.setColumns(10);
				
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(193, 184, 178));
		passwordField.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder_1 = new TextPrompt("Contrase\u00F1a", passwordField);
	    placeholder_1.changeAlpha(0.65f);
	    placeholder_1.changeStyle(Font.ITALIC);
		passwordField.setBounds(450, 290, 120, 20);
		add(passwordField);
		
		lblPasswordReq1 = new JLabel("La contrase\u00F1a debe contener : ");
		lblPasswordReq1.setForeground(new Color(0, 0, 0));
		lblPasswordReq1.setFont(new Font("Malgun Gothic", Font.PLAIN, 12));
		lblPasswordReq1.setBounds(381, 315, 258, 14);
		add(lblPasswordReq1);
		
		JLabel lblPassReq1 = new JLabel("\u2981 Entre 8 y 20 caracteres. ");
		lblPassReq1.setForeground(new Color(0, 0, 0));
		lblPassReq1.setFont(new Font("Malgun Gothic", Font.PLAIN, 12));
		lblPassReq1.setVerticalAlignment(SwingConstants.TOP);
		lblPassReq1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassReq1.setBounds(391, 337, 248, 20);
		add(lblPassReq1);
		
		JLabel lblPassReq2 = new JLabel("\u2981 Al menos una letra en min\u00FAscula. ");
		lblPassReq2.setForeground(new Color(0, 0, 0));
		lblPassReq2.setFont(new Font("Malgun Gothic", Font.PLAIN, 12));
		lblPassReq2.setVerticalAlignment(SwingConstants.TOP);
		lblPassReq2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassReq2.setBounds(391, 357, 248, 20);
		add(lblPassReq2);
		
		JLabel lblPassReq3 = new JLabel("\u2981 Al menos una letra en may\u00FAscula. ");
		lblPassReq3.setForeground(new Color(0, 0, 0));
		lblPassReq3.setFont(new Font("Malgun Gothic", Font.PLAIN, 12));
		lblPassReq3.setVerticalAlignment(SwingConstants.TOP);
		lblPassReq3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassReq3.setBounds(391, 377, 248, 20);
		add(lblPassReq3);

		JLabel lblPassReq4 = new JLabel("\u2981 Al menos un s\u00EDmbolo especial (#@$%&;:'*\u00B0|). ");
		lblPassReq4.setForeground(new Color(0, 0, 0));
		lblPassReq4.setFont(new Font("Malgun Gothic", Font.PLAIN, 12));
		lblPassReq4.setVerticalAlignment(SwingConstants.TOP);
		lblPassReq4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassReq4.setBounds(391, 397, 258, 20);
		add(lblPassReq4);
		
		txtCity = new JTextField();
		txtCity.setBackground(new Color(193, 184, 178));
		txtCity.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder = new TextPrompt("Ciudad", txtCity);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
		txtCity.setBounds(450, 428, 120, 20);
		add(txtCity);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(193, 184, 178));
		txtEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder = new TextPrompt("Email", txtEmail);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
		txtEmail.setBounds(450, 468, 120, 20);
		add(txtEmail);
		
		txtTelephone = new JTextField();
		txtTelephone.setBackground(new Color(193, 184, 178));
		txtTelephone.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder = new TextPrompt("Telefono", txtTelephone);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
		txtTelephone.setBounds(450, 508, 120, 20);
		add(txtTelephone);
		
		txtBirthDay = new JTextField();
		txtBirthDay.setBackground(new Color(193, 184, 178));
		txtBirthDay.setBorder(new LineBorder(new Color(0, 0, 0)));
		placeholder = new TextPrompt("Fecha de Nacimiento", txtBirthDay);
	    placeholder.changeAlpha(0.65f);
	    placeholder.changeStyle(Font.ITALIC);
		txtBirthDay.setBounds(450, 548, 120, 20);
		add(txtBirthDay);
		
		btnFinish = new JButton("Registrarme");
		btnFinish.setBorder(null);
		btnFinish.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		btnFinish.setForeground(new Color(255, 255, 204));
		btnFinish.setBackground(new Color(81, 52, 77));
		btnFinish.setBounds(410, 613, 200, 50);
		add(btnFinish);
		
		txtMessage = new JTextField("");
		txtMessage.setBorder(null);
		txtMessage.setBackground(new Color(158, 144, 134));
		txtMessage.setEditable(false);
		txtMessage.setHorizontalAlignment(SwingConstants.CENTER);
		txtMessage.setFont(new Font("Malgun Gothic", Font.ITALIC, 11));
		txtMessage.setBounds(372, 581, 300, 14);
		add(txtMessage);
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon(SignUpPanelUsers.class.getResource("/view/icons/SignUpBG.png")));
		lblBG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBG.setBounds(0, 0, 1020, 730);
		add(lblBG);

		
	}
	
	

	public void setTxtUserName(JTextField txtUserName) {
		this.txtUserName = txtUserName;
	}



	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}



	public void setTxtCity(JTextField txtCity) {
		this.txtCity = txtCity;
	}



	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}



	public void setTxtTelephone(JTextField txtTelephone) {
		this.txtTelephone = txtTelephone;
	}



	public JTextField getTxtMessage() {
		return txtMessage;
	}

	public void setTxtMessage(JTextField lblMessage) {
		this.txtMessage = lblMessage;
	}

	public JButton getBtnFinish() {
		return btnFinish;
	}

	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public JTextField getTxtCity() {
		return txtCity;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JTextField getTxtTelephone() {
		return txtTelephone;
	}

	public JTextField getTxtBirthDay() {
		return txtBirthDay;
	}

	
}
