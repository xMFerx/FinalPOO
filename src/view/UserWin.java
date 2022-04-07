package view;

/**
 * Ventana con la información de usuario que se obtiene
 * desde el perfil del administrador, contiene información sensible
 * @see: AdminPanel, controller.Controller
 * 	 
 */

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class UserWin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTextField txtID;
	private JTextField txtBirthday;
	private JTextField txtCity;
	private JTextField txtRegisterDate;
	private JTextField txtPassword;
	private JButton btnPurHistory;
	private JButton btnWishlist;
	private JButton btnEdit;
	private JButton btnSaveEdit;
	private JButton btnDelete;
	private JTextField txtMessage;

	/**
	 * Create the frame.
	 */
	public UserWin() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 900, 666);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		//panel user
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblID = 
				new JLabel("Id #");
				lblID.setFont(new Font("morgenlicht", Font.PLAIN, 25));
				lblID.setHorizontalAlignment(SwingConstants.CENTER);
				lblID.setBounds(373, 36, 95, 45);
				getContentPane().add(lblID, BorderLayout.NORTH);
				
				txtUserName = new JTextField();
				txtUserName.setOpaque(false);
				txtUserName.setBorder(null);
				txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
				txtUserName.setText("ChanguaLover user");
				txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 34));
				txtUserName.setEditable(false);
				txtUserName.setBounds(243, 79, 487, 60);
				getContentPane().add(txtUserName);
				txtUserName.setColumns(10);
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
				lblLogo.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/SmallLogo.png")));
				lblLogo.setBounds(144, 37, 119, 102);
				getContentPane().add(lblLogo, BorderLayout.NORTH);
				
				JLabel lblName = new JLabel("Nombre");
				lblName.setHorizontalAlignment(SwingConstants.CENTER);
				lblName.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblName.setBounds(70, 180, 119, 45);
				getContentPane().add(lblName);
				
				txtName = new JTextField();
				txtName.setOpaque(false);
				txtName.setText("Heladero");
				txtName.setHorizontalAlignment(SwingConstants.LEFT);
				txtName.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtName.setEditable(false);
				txtName.setColumns(10);
				txtName.setBorder(null);
				txtName.setBounds(219, 181, 579, 45);
				getContentPane().add(txtName);
				
				JLabel lblEmail = new JLabel("Email.");
				lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
				lblEmail.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblEmail.setBounds(70, 235, 119, 45);
				getContentPane().add(lblEmail);
				
				JLabel lblTel = new JLabel("Tel.");
				lblTel.setHorizontalAlignment(SwingConstants.CENTER);
				lblTel.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblTel.setBounds(70, 291, 119, 45);
				getContentPane().add(lblTel);
				
				txtEmail = new JTextField();
				txtEmail.setOpaque(false);
				txtEmail.setText("Changua@Lover.com");
				txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
				txtEmail.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtEmail.setEditable(false);
				txtEmail.setColumns(10);
				txtEmail.setBorder(null);
				txtEmail.setBounds(219, 237, 481, 45);
				getContentPane().add(txtEmail);
				
				txtTel = new JTextField();
				txtTel.setOpaque(false);
				txtTel.setText("654211");
				txtTel.setHorizontalAlignment(SwingConstants.LEFT);
				txtTel.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtTel.setEditable(false);
				txtTel.setColumns(10);
				txtTel.setBorder(null);
				txtTel.setBounds(219, 292, 278, 45);
				getContentPane().add(txtTel);
				
				txtID = new JTextField();
				txtID.setOpaque(false);
				txtID.setText("221555");
				txtID.setHorizontalAlignment(SwingConstants.LEFT);
				txtID.setFont(new Font("Saudagar", Font.PLAIN, 27));
				txtID.setEditable(false);
				txtID.setColumns(10);
				txtID.setBorder(null);
				txtID.setBounds(466, 36, 252, 45);
				getContentPane().add(txtID);
				
				JLabel lblBirthday = new JLabel("Nacimiento");
				lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
				lblBirthday.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblBirthday.setBounds(507, 290, 119, 45);
				getContentPane().add(lblBirthday, BorderLayout.CENTER);
				
				txtBirthday = new JTextField();
				txtBirthday.setOpaque(false);
				txtBirthday.setText("6-5-2011");
				txtBirthday.setHorizontalAlignment(SwingConstants.LEFT);
				txtBirthday.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtBirthday.setEditable(false);
				txtBirthday.setColumns(10);
				txtBirthday.setBorder(null);
				txtBirthday.setBounds(648, 292, 173, 45);
				getContentPane().add(txtBirthday);
				
				btnPurHistory = new JButton("Historial de Compras");
				btnPurHistory.setFont(new Font("Saudagar", Font.PLAIN, 20));
				btnPurHistory.setBounds(89, 478, 216, 37);
				getContentPane().add(btnPurHistory, BorderLayout.SOUTH);
				
				btnWishlist = new JButton("Lista de Deseos");
				btnWishlist.setFont(new Font("Saudagar", Font.PLAIN, 20));
				btnWishlist.setBounds(89, 541, 216, 37);
				getContentPane().add(btnWishlist);
				
				btnEdit = new JButton(" Edit");
				btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
				btnEdit.setContentAreaFilled(false);
				btnEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
				btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
				btnEdit.setBounds(718, 423, 116, 60);
				getContentPane().add(btnEdit);
				
				btnSaveEdit = new JButton(" Save");
				btnSaveEdit.setHorizontalAlignment(SwingConstants.LEFT);
				btnSaveEdit.setContentAreaFilled(false);
				btnSaveEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
				btnSaveEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
				btnSaveEdit.setBounds(718, 423, 116, 60);
				btnSaveEdit.setVisible(false);
				getContentPane().add(btnSaveEdit);
				
				btnDelete = new JButton("Delete");
				btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
				btnDelete.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Bin.png")));
				btnDelete.setFont(new Font("Saudagar", Font.PLAIN, 16));
				btnDelete.setContentAreaFilled(false);
				btnDelete.setBounds(718, 493, 119, 60);
				getContentPane().add(btnDelete);
				
				JLabel lblCity = new JLabel("Ciudad");
				lblCity.setHorizontalAlignment(SwingConstants.CENTER);
				lblCity.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblCity.setBounds(70, 347, 119, 45);
				getContentPane().add(lblCity);
				
				txtCity = new JTextField();
				txtCity.setOpaque(false);
				txtCity.setText("Springfield");
				txtCity.setHorizontalAlignment(SwingConstants.LEFT);
				txtCity.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtCity.setEditable(false);
				txtCity.setColumns(10);
				txtCity.setBorder(null);
				txtCity.setBounds(219, 347, 278, 45);
				getContentPane().add(txtCity);
				
				JLabel lblRegistro = new JLabel("Registro");
				lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
				lblRegistro.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblRegistro.setBounds(507, 347, 119, 45);
				contentPane.add(lblRegistro);
				
				txtRegisterDate = new JTextField();
				txtRegisterDate.setText("6-5-2011");
				txtRegisterDate.setOpaque(false);
				txtRegisterDate.setHorizontalAlignment(SwingConstants.LEFT);
				txtRegisterDate.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtRegisterDate.setEditable(false);
				txtRegisterDate.setColumns(10);
				txtRegisterDate.setBorder(null);
				txtRegisterDate.setBounds(648, 347, 173, 45);
				contentPane.add(txtRegisterDate);
				
				JLabel lblPass = new JLabel("Contrase\u00F1a");
				lblPass.setHorizontalAlignment(SwingConstants.CENTER);
				lblPass.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblPass.setBounds(496, 234, 130, 45);
				contentPane.add(lblPass);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBorder(null);
				scrollPane.setOpaque(false);
				scrollPane.setEnabled(false);
				scrollPane.setBounds(645, 235, 229, 45);
				contentPane.add(scrollPane);
				
				txtPassword = new JTextField();
				scrollPane.setViewportView(txtPassword);
				txtPassword.setOpaque(false);
				txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
				txtPassword.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtPassword.setEditable(false);
				txtPassword.setColumns(10);
				txtPassword.setBorder(null);		
				
				txtMessage = new JTextField();
				txtMessage.setOpaque(false);
				txtMessage.setHorizontalAlignment(SwingConstants.RIGHT);
				txtMessage.setFont(new Font("Saudagar", Font.PLAIN, 15));
				txtMessage.setEditable(false);
				txtMessage.setColumns(10);
				txtMessage.setBorder(null);
				txtMessage.setBounds(393, 384, 481, 30);
				contentPane.add(txtMessage);
	}
	

	public JButton getBtnSaveEdit() {
		return btnSaveEdit;
	}

	public JTextField getTxtMessage() {
		return txtMessage;
	}

	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public JTextField getTxtTel() {
		return txtTel;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public JTextField getTxtBirthday() {
		return txtBirthday;
	}

	public JTextField getTxtCity() {
		return txtCity;
	}

	public JTextField getTxtRegisterDate() {
		return txtRegisterDate;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}

	public JButton getBtnPurHistory() {
		return btnPurHistory;
	}

	public JButton getBtnWishlist() {
		return btnWishlist;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}
	
}
