package view;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdminPanel extends JPanel {
	private JTextField txtUserName;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField textNum;


	/**
	 * Create the panel.
	 */
	public AdminPanel() {
		setMinimumSize(new Dimension(1020, 720));
		setLayout(null);
		
		JLabel lblNewLabel = 
		new JLabel("Admin.");
		lblNewLabel.setFont(new Font("morgenlicht", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(565, 107, 133, 45);
		add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.setBorder(null);
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setText("ChanguaLover user");
		txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 40));
		txtUserName.setEditable(false);
		txtUserName.setBounds(380, 152, 503, 60);
		add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/SmallLogo.png")));
		lblNewLabel_1.setBounds(192, 93, 133, 131);
		add(lblNewLabel_1);
		JLabel lblId = new JLabel("Name.");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("morgenlicht", Font.PLAIN, 22));
		lblId.setBounds(90, 234, 119, 45);
		add(lblId);
		
		txtName = new JTextField();
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
		txtEmail.setText("Changua@Lover.com");
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(233, 291, 481, 45);
		add(txtEmail);
		
		textNum = new JTextField();
		textNum.setText("654211");
		textNum.setHorizontalAlignment(SwingConstants.LEFT);
		textNum.setFont(new Font("Saudagar", Font.PLAIN, 24));
		textNum.setEditable(false);
		textNum.setColumns(10);
		textNum.setBorder(null);
		textNum.setBounds(233, 346, 278, 45);
		add(textNum);
		
		JButton btnPurHistory = new JButton("Purchase history");
		btnPurHistory.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnPurHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPurHistory.setBounds(106, 489, 201, 37);
		add(btnPurHistory);
		
		JButton btnWishlist = new JButton("Wishlist");
		btnWishlist.setFont(new Font("Saudagar", Font.PLAIN, 22));
		btnWishlist.setBounds(90, 612, 201, 37);
		add(btnWishlist);
		
		JButton btnEdit = new JButton(" Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setContentAreaFilled(false);
		btnEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
		btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnEdit.setBounds(836, 529, 116, 60);
		add(btnEdit);
		
		JButton btnDelate = new JButton("Delate");
		btnDelate.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelate.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Bin.png")));
		btnDelate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelate.setFont(new Font("Saudagar", Font.PLAIN, 16));
		btnDelate.setContentAreaFilled(false);
		btnDelate.setBounds(833, 600, 119, 60);
		add(btnDelate);

	}

}
