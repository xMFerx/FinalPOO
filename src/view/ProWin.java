package view;

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

public class ProWin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNamePro;
	private JTextField txtCost;
	private JTextField txtQuantity;
	private JTextField txtSold;
	private JTextField txtID;
	private JTextField txtdiscount;
	private JTextField txtProfits;
	private JButton btnEdit;
	private JButton btnSaveEdit;
	private JButton btnDelete;
	private JTextField txtMessage;

	/**
	 * Create the frame. 
	 */
	public ProWin() {
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
				
				txtNamePro = new JTextField();
				txtNamePro.setOpaque(false);
				txtNamePro.setBorder(null);
				txtNamePro.setHorizontalAlignment(SwingConstants.CENTER);
				txtNamePro.setText("NameProduct");
				txtNamePro.setFont(new Font("Saudagar", Font.PLAIN, 34));
				txtNamePro.setEditable(false);
				txtNamePro.setBounds(243, 79, 487, 60);
				getContentPane().add(txtNamePro);
				txtNamePro.setColumns(10);
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
				lblLogo.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/SmallLogo.png")));
				lblLogo.setBounds(144, 37, 119, 102);
				getContentPane().add(lblLogo, BorderLayout.NORTH);
				
				JLabel lblCost = new JLabel("Cost");
				lblCost.setHorizontalAlignment(SwingConstants.CENTER);
				lblCost.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblCost.setBounds(219, 180, 119, 45);
				getContentPane().add(lblCost);
				
				txtCost = new JTextField();
				txtCost.setOpaque(false);
				txtCost.setText("55");
				txtCost.setHorizontalAlignment(SwingConstants.LEFT);
				txtCost.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtCost.setEditable(false);
				txtCost.setColumns(10);
				txtCost.setBorder(null);
				txtCost.setBounds(373, 181, 278, 45);
				getContentPane().add(txtCost);
				
				JLabel lblQuant = new JLabel("Quantity");
				lblQuant.setHorizontalAlignment(SwingConstants.CENTER);
				lblQuant.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblQuant.setBounds(219, 236, 119, 45);
				getContentPane().add(lblQuant);
				
				JLabel lblSold = new JLabel("Sold");
				lblSold.setHorizontalAlignment(SwingConstants.CENTER);
				lblSold.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblSold.setBounds(219, 292, 119, 45);
				getContentPane().add(lblSold);
				
				txtQuantity = new JTextField();
				txtQuantity.setOpaque(false);
				txtQuantity.setHorizontalAlignment(SwingConstants.LEFT);
				txtQuantity.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtQuantity.setEditable(false);
				txtQuantity.setColumns(10);
				txtQuantity.setBorder(null);
				txtQuantity.setBounds(373, 237, 278, 45);
				getContentPane().add(txtQuantity);
				
				txtSold = new JTextField();
				txtSold.setOpaque(false);
				txtSold.setText("654211");
				txtSold.setHorizontalAlignment(SwingConstants.LEFT);
				txtSold.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtSold.setEditable(false);
				txtSold.setColumns(10);
				txtSold.setBorder(null);
				txtSold.setBounds(373, 292, 278, 45);
				getContentPane().add(txtSold);
				
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
				
				JLabel lblDiscount = new JLabel("Discount");
				lblDiscount.setHorizontalAlignment(SwingConstants.CENTER);
				lblDiscount.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblDiscount.setBounds(219, 409, 119, 45);
				getContentPane().add(lblDiscount, BorderLayout.CENTER);
				
				txtdiscount = new JTextField();
				txtdiscount.setOpaque(false);
				txtdiscount.setText("5541");
				txtdiscount.setHorizontalAlignment(SwingConstants.LEFT);
				txtdiscount.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtdiscount.setEditable(false);
				txtdiscount.setColumns(10);
				txtdiscount.setBorder(null);
				txtdiscount.setBounds(373, 410, 249, 45);
				getContentPane().add(txtdiscount);
				
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
				
				JLabel lblProfits = new JLabel("Profits");
				lblProfits.setHorizontalAlignment(SwingConstants.CENTER);
				lblProfits.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblProfits.setBounds(219, 347, 119, 45);
				getContentPane().add(lblProfits);
				
				txtProfits = new JTextField();
				txtProfits.setOpaque(false);
				txtProfits.setText("5566");
				txtProfits.setHorizontalAlignment(SwingConstants.LEFT);
				txtProfits.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtProfits.setEditable(false);
				txtProfits.setColumns(10);
				txtProfits.setBorder(null);
				txtProfits.setBounds(373, 348, 278, 45);
				getContentPane().add(txtProfits);
				
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

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTxtNamePro() {
		return txtNamePro;
	}

	public JTextField getTxtCost() {
		return txtCost;
	}

	public JTextField getTxtQuantity() {
		return txtQuantity;
	}

	public JTextField getTxtSold() {
		return txtSold;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public JTextField getTxtdiscount() {
		return txtdiscount;
	}

	public JTextField getTxtProfits() {
		return txtProfits;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnSaveEdit() {
		return btnSaveEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JTextField getTxtMessage() {
		return txtMessage;
	}
	

	
	
}
