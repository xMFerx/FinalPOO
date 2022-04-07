package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * Panel de administrador desde el cual se puede editar la
 * información en la base de datos con la aplicación en ejecución
 * 
 * @see: MainWin, UserWin, UserPanel
 * 
 */
public class AdminPanel extends JPanel {
	private JTextField txtUserName;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtTel;
	private JButton btnDelete;
	private JButton btnUsersList;
	private JButton btnProducts;
	private JButton btnEdit;
	private JButton btnSaveEdit;
	private JButton btnSales;
	private JTable tables;
	private JTextField txtMessage;
	private JButton btnGoBack;
	private JButton btnTotals;


	/**
	 * Create the panel.
	 */
	public AdminPanel() {
		setMinimumSize(new Dimension(1020, 720));
		setLayout(null);
		
		JLabel lblTitle = 
		new JLabel("Admin.");
		lblTitle.setFont(new Font("morgenlicht", Font.PLAIN, 26));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(565, 107, 133, 45);
		add(lblTitle);
		
		txtUserName = new JTextField();
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
		JLabel lblName = new JLabel("Nombre");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblName.setBounds(90, 234, 119, 45);
		add(lblName);
		
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
		
		btnUsersList = new JButton("Usuarios");
		btnUsersList.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnUsersList.setBounds(33, 433, 201, 37);
		add(btnUsersList);
		
		btnProducts = new JButton("Productos");
		btnProducts.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnProducts.setBounds(33, 496, 201, 37);
		add(btnProducts);
		
		btnEdit = new JButton("Editar");
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
		btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnEdit.setBounds(852, 234, 133, 60);
		add(btnEdit);
		
		btnSaveEdit = new JButton("Guardar");
		btnSaveEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnSaveEdit.setContentAreaFilled(false);
		btnSaveEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
		btnSaveEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnSaveEdit.setBounds(852, 234, 133, 60);
		btnSaveEdit.setVisible(false);
		add(btnSaveEdit);
		
		btnDelete = new JButton("Eliminar");
		btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Bin.png")));
		btnDelete.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(852, 305, 133, 60);
		add(btnDelete);
		
		btnSales = new JButton("Ventas");
		btnSales.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnSales.setBounds(33, 563, 201, 37);
		add(btnSales);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(265, 433, 720, 255);
		add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		tables = new JTable(model);
		scrollPane.setViewportView(tables);
		
		txtMessage = new JTextField();
		txtMessage.setOpaque(false);
		txtMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMessage.setFont(new Font("Saudagar", Font.PLAIN, 15));
		txtMessage.setEditable(false);
		txtMessage.setColumns(10);
		txtMessage.setBorder(null);
		txtMessage.setBounds(585, 376, 400, 45);
		add(txtMessage);
		
		btnGoBack = new JButton("Volver al catalogo\r\n");
		btnGoBack.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/GoBackIcon.png")));
		btnGoBack.setHorizontalAlignment(SwingConstants.LEFT);
		btnGoBack.setFont(new Font("Saudagar", Font.PLAIN, 15));
		btnGoBack.setBorder(null);
		btnGoBack.setContentAreaFilled(false);
		btnGoBack.setBounds(46, 30, 187, 52);
		add(btnGoBack);
		
		btnTotals = new JButton("Ver Totales");
		btnTotals.setFont(new Font("Saudagar", Font.PLAIN, 18));
		btnTotals.setBounds(107, 621, 127, 29);
		btnTotals.setVisible(false);
		add(btnTotals);
		
		
	}

	

	public JButton getBtnTotals() {
		return btnTotals;
	}



	public void setBtnTotals(JButton btnTotals) {
		this.btnTotals = btnTotals;
	}



	public JButton getBtnSaveEdit() {
		return btnSaveEdit;
	}



	public void setBtnSaveEdit(JButton btnSaveEdit) {
		this.btnSaveEdit = btnSaveEdit;
	}



	public JTable getTables() {
		return tables;
	}



	public void setTables(JTable tables) {
		this.tables = tables;
	}



	public JButton getBtnGoBack() {
		return btnGoBack;
	}



	public void setBtnGoBack(JButton btnGoBack) {
		this.btnGoBack = btnGoBack;
	}

    /**
     *
     * @return
     */
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


	public JButton getBtnDelete() {
		return btnDelete;
	}


	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}


	public JButton getBtnUsersList() {
		return btnUsersList;
	}


	public void setBtnUsersList(JButton btnUsersList) {
		this.btnUsersList = btnUsersList;
	}


	public JButton getBtnProducts() {
		return btnProducts;
	}


	public void setBtnProducts(JButton btnProducts) {
		this.btnProducts = btnProducts;
	}


	public JButton getBtnEdit() {
		return btnEdit;
	}


	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}


	public JButton getBtnSales() {
		return btnSales;
	}


	public void setBtnSales(JButton btnSales) {
		this.btnSales = btnSales;
	}
}
