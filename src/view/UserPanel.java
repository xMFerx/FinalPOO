package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserPanel extends JPanel {

	private JTextField txtUserName;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JTextField txtId;
	private JTextField txtBirthday;
	private JTextField txtCity;
	private JButton btnPurHistory;
	private JButton btnWishlist;
	private JButton btnEdit;
	private JButton btnSaveEdit;
	private JButton btnDelete;
	private JTextField txtMessage;
	private JButton btnGoBack;

	public UserPanel() {
		setMinimumSize(new Dimension(1020, 720));
		setLayout(null);
		
		JLabel lblID = 
		new JLabel("Id #");
		lblID.setFont(new Font("morgenlicht", Font.PLAIN, 30));
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setBounds(438, 108, 95, 45);
		add(lblID);
		
		txtUserName = new JTextField();
		txtUserName.setOpaque(false);
		txtUserName.setBorder(null);
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setText("ChanguaLover user");
		txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 40));
		txtUserName.setEditable(false);
		txtUserName.setBounds(380, 152, 503, 60);
		add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/SmallLogo.png")));
		lblLogo.setBounds(192, 93, 133, 131);
		add(lblLogo);
		
		JLabel lblId = new JLabel("Nombre");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblId.setBounds(90, 234, 119, 45);
		add(lblId);
		
		txtName = new JTextField();
		txtName.setOpaque(false);
		txtName.setText("Heladero");
		txtName.setHorizontalAlignment(SwingConstants.LEFT);
		txtName.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtName.setEditable(false);
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBounds(233, 235, 579, 45);
		add(txtName);
		
		JLabel lblEmail = new JLabel("Email.");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblEmail.setBounds(90, 290, 119, 45);
		add(lblEmail);
		
		JLabel lblTel = new JLabel("Tel.");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblTel.setBounds(90, 346, 119, 45);
		add(lblTel);
		
		txtEmail = new JTextField();
		txtEmail.setOpaque(false);
		txtEmail.setText("Changua@Lover.com");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(233, 291, 481, 45);
		add(txtEmail);
		
		txtTel = new JTextField();
		txtTel.setOpaque(false);
		txtTel.setText("654211");
		txtTel.setHorizontalAlignment(SwingConstants.LEFT);
		txtTel.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtTel.setEditable(false);
		txtTel.setColumns(10);
		txtTel.setBorder(null);
		txtTel.setBounds(233, 346, 278, 45);
		add(txtTel);
		
		txtId = new JTextField();
		txtId.setOpaque(false);
		txtId.setText("221555");
		txtId.setHorizontalAlignment(SwingConstants.LEFT);
		txtId.setFont(new Font("Saudagar", Font.PLAIN, 32));
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBorder(null);
		txtId.setBounds(529, 108, 313, 45);
		add(txtId);
		
		JLabel lblBirthday = new JLabel("Nacimiento");
		lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
		lblBirthday.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblBirthday.setBounds(529, 234, 146, 45);
		add(lblBirthday);
		
		txtBirthday = new JTextField();
		txtBirthday.setOpaque(false);
		txtBirthday.setText("6-5-2011");
		txtBirthday.setHorizontalAlignment(SwingConstants.LEFT);
		txtBirthday.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtBirthday.setEditable(false);
		txtBirthday.setColumns(10);
		txtBirthday.setBorder(null);
		txtBirthday.setBounds(692, 235, 173, 45);
		add(txtBirthday);
		
		btnPurHistory = new JButton("Historial de Compras");
		btnPurHistory.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnPurHistory.setBounds(90, 541, 223, 37);
		add(btnPurHistory);
		
		btnWishlist = new JButton("Lista de Deseos");
		btnWishlist.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnWishlist.setBounds(90, 612, 223, 37);
		add(btnWishlist);
		
		btnEdit = new JButton("Editar");
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
		btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnEdit.setBounds(819, 529, 133, 60);
		add(btnEdit);
		
		btnSaveEdit = new JButton("Guardar");
		btnSaveEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnSaveEdit.setContentAreaFilled(false);
		btnSaveEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
		btnSaveEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnSaveEdit.setBounds(819, 529, 133, 60);
		btnSaveEdit.setVisible(false);
		add(btnSaveEdit);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Bin.png")));
		btnDelete.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(819, 600, 133, 60);
		add(btnDelete);
		
		JLabel lblCity = new JLabel("Ciudad");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblCity.setBounds(90, 402, 119, 45);
		add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setOpaque(false);
		txtCity.setText("Springfield");
		txtCity.setHorizontalAlignment(SwingConstants.LEFT);
		txtCity.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtCity.setEditable(false);
		txtCity.setColumns(10);
		txtCity.setBorder(null);
		txtCity.setBounds(233, 402, 278, 45);
		add(txtCity);
		
		txtMessage = new JTextField();
		txtMessage.setOpaque(false);
		txtMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMessage.setFont(new Font("Saudagar", Font.PLAIN, 15));
		txtMessage.setEditable(false);
		txtMessage.setColumns(10);
		txtMessage.setBorder(null);
		txtMessage.setBounds(529, 440, 481, 45);
		add(txtMessage);
		
		btnGoBack = new JButton("Volver al catalogo\r\n");
		btnGoBack.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/GoBackIcon.png")));
		btnGoBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnGoBack.setFont(new Font("Saudagar", Font.PLAIN, 15));
		btnGoBack.setBorder(null);
		btnGoBack.setContentAreaFilled(false);
		btnGoBack.setBounds(46, 30, 187, 52);
		add(btnGoBack);
	}
	
	

	public JButton getBtnSaveEdit() {
		return btnSaveEdit;
	}



	public void setBtnSaveEdit(JButton btnSaveEdit) {
		this.btnSaveEdit = btnSaveEdit;
	}



	public JButton getBtnGoBack() {
		return btnGoBack;
	}



	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}



	public JTextField getTxtMessage() {
		return txtMessage;
	}



	public void setTxtMessage(JTextField txtMessage) {
		this.txtMessage = txtMessage;
	}



	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(JTextField txtUserName) {
		this.txtUserName = txtUserName;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtTel() {
		return txtTel;
	}

	public void setTxtTel(JTextField txtTel) {
		this.txtTel = txtTel;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JTextField getTxtBirthday() {
		return txtBirthday;
	}

	public void setTxtBirthday(JTextField txtBirthday) {
		this.txtBirthday = txtBirthday;
	}

	public JTextField getTxtCity() {
		return txtCity;
	}

	public void setTxtCity(JTextField txtCity) {
		this.txtCity = txtCity;
	}

	public JButton getBtnPurHistory() {
		return btnPurHistory;
	}

	public void setBtnPurHistory(JButton btnPurHistory) {
		this.btnPurHistory = btnPurHistory;
	}

	public JButton getBtnWishlist() {
		return btnWishlist;
	}

	public void setBtnWishlist(JButton btnWishlist) {
		this.btnWishlist = btnWishlist;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}
	
}
