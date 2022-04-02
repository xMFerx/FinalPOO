package view;

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
	private JTextField textField;
	private JTextField txtAddress;
	private JTextField txtEmail;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public UserPanel() {
setLayout(null);
		
		JLabel ProfilePic = new JLabel("");
		ProfilePic.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePic.setIcon(new ImageIcon(AdmPanel.class.getResource("/view/icons/SmallLogo.png")));
		ProfilePic.setBounds(209, 73, 199, 167);
		add(ProfilePic);
		
		JLabel lblNewLabel = 
		new JLabel("Profile");
		lblNewLabel.setFont(new Font("morgenlicht", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(575, 133, 179, 44);
		add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.setBorder(null);
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setText("ChanguaLover69(name)");
		txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 35));
		txtUserName.setEditable(false);
		txtUserName.setBounds(431, 172, 483, 44);
		add(txtUserName);
		txtUserName.setColumns(10);
		
		JButton btnNewButton = new JButton("Purchase history");
		btnNewButton.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(90, 542, 229, 44);
		add(btnNewButton);
		
		JButton btnWishlist = new JButton("Wishlist");
		btnWishlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWishlist.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnWishlist.setBounds(90, 614, 229, 44);
		add(btnWishlist);
		
		JLabel lblId = new JLabel("Id. ");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("morgenlicht", Font.PLAIN, 20));
		lblId.setBounds(275, 279, 105, 44);
		add(lblId);
		
		textField = new JTextField();
		textField.setText("ChanguaLover69");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Saudagar", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(411, 281, 417, 43);
		add(textField);
		
		JLabel lblAddress = new JLabel("Address.");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("morgenlicht", Font.PLAIN, 20));
		lblAddress.setBounds(275, 334, 105, 44);
		add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setText("Av siempre viva #123");
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setFont(new Font("Saudagar", Font.PLAIN, 20));
		txtAddress.setEditable(false);
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBounds(411, 335, 417, 43);
		add(txtAddress);
		
		JLabel lblEmail = new JLabel("Email.");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("morgenlicht", Font.PLAIN, 20));
		lblEmail.setBounds(275, 389, 105, 44);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("heladero00@heladeriasuprer.com");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Saudagar", Font.PLAIN, 20));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(411, 389, 417, 43);
		add(txtEmail);
		
		JButton btnEdit = new JButton("Edit.");
		btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnEdit.setBounds(721, 673, 71, 33);
		add(btnEdit);
		
		JButton btnEdit_1 = new JButton("Delate.");
		btnEdit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit_1.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnEdit_1.setBounds(822, 673, 92, 33);
		add(btnEdit_1);
		
		JLabel lblTel = new JLabel("Tel.");
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTel.setFont(new Font("morgenlicht", Font.PLAIN, 20));
		lblTel.setBounds(275, 444, 105, 44);
		add(lblTel);
		
		textField_1 = new JTextField();
		textField_1.setText("300058466");
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Saudagar", Font.PLAIN, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(411, 446, 417, 43);
		add(textField_1);

	}
}
