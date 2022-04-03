package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class UserWin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField textNum;
	private JTextField txtAddress;
	private JTextField textId;
	private JTextField textDate;
	private JTextField txtCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWin frame = new UserWin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 666);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		//panel user
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = 
				new JLabel("Id #");
				lblNewLabel.setFont(new Font("morgenlicht", Font.PLAIN, 25));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(373, 36, 95, 45);
				getContentPane().add(lblNewLabel, BorderLayout.NORTH);
				
				txtUserName = new JTextField();
				txtUserName.setBorder(null);
				txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
				txtUserName.setText("ChanguaLover user");
				txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 34));
				txtUserName.setEditable(false);
				txtUserName.setBounds(243, 79, 487, 60);
				getContentPane().add(txtUserName);
				txtUserName.setColumns(10);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/SmallLogo.png")));
				lblNewLabel_1.setBounds(144, 37, 119, 102);
				getContentPane().add(lblNewLabel_1, BorderLayout.NORTH);
				
				JLabel lblId = new JLabel("Name.");
				lblId.setHorizontalAlignment(SwingConstants.CENTER);
				lblId.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblId.setBounds(70, 180, 119, 45);
				getContentPane().add(lblId);
				
				txtName = new JTextField();
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
				
				JLabel lblAddress = new JLabel("Address.");
				lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
				lblAddress.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblAddress.setBounds(70, 347, 119, 45);
				getContentPane().add(lblAddress);
				
				txtEmail = new JTextField();
				txtEmail.setText("Changua@Lover.com");
				txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
				txtEmail.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtEmail.setEditable(false);
				txtEmail.setColumns(10);
				txtEmail.setBorder(null);
				txtEmail.setBounds(219, 237, 481, 45);
				getContentPane().add(txtEmail);
				
				textNum = new JTextField();
				textNum.setText("654211");
				textNum.setHorizontalAlignment(SwingConstants.LEFT);
				textNum.setFont(new Font("Saudagar", Font.PLAIN, 20));
				textNum.setEditable(false);
				textNum.setColumns(10);
				textNum.setBorder(null);
				textNum.setBounds(219, 292, 278, 45);
				getContentPane().add(textNum);
				
				txtAddress = new JTextField();
				txtAddress.setText("Av siempre viva #123");
				txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
				txtAddress.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtAddress.setEditable(false);
				txtAddress.setColumns(10);
				txtAddress.setBorder(null);
				txtAddress.setBounds(219, 348, 442, 45);
				getContentPane().add(txtAddress);
				
				textId = new JTextField();
				textId.setText("221555");
				textId.setHorizontalAlignment(SwingConstants.LEFT);
				textId.setFont(new Font("Saudagar", Font.PLAIN, 27));
				textId.setEditable(false);
				textId.setColumns(10);
				textId.setBorder(null);
				textId.setBounds(466, 36, 252, 45);
				getContentPane().add(textId);
				
				JLabel lblBirthday = new JLabel("Birthday.");
				lblBirthday.setHorizontalAlignment(SwingConstants.CENTER);
				lblBirthday.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblBirthday.setBounds(507, 290, 119, 45);
				getContentPane().add(lblBirthday, BorderLayout.CENTER);
				
				textDate = new JTextField();
				textDate.setText("6-5-2011");
				textDate.setHorizontalAlignment(SwingConstants.LEFT);
				textDate.setFont(new Font("Saudagar", Font.PLAIN, 20));
				textDate.setEditable(false);
				textDate.setColumns(10);
				textDate.setBorder(null);
				textDate.setBounds(648, 292, 173, 45);
				getContentPane().add(textDate);
				
				JButton btnPurHistory = new JButton("Purchase history");
				btnPurHistory.setFont(new Font("Saudagar", Font.PLAIN, 20));
				btnPurHistory.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnPurHistory.setBounds(89, 478, 201, 37);
				getContentPane().add(btnPurHistory, BorderLayout.SOUTH);
				
				JButton btnWishlist = new JButton("Wishlist");
				btnWishlist.setFont(new Font("Saudagar", Font.PLAIN, 20));
				btnWishlist.setBounds(89, 541, 201, 37);
				getContentPane().add(btnWishlist);
				
				JButton btnEdit = new JButton(" Edit");
				btnEdit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
				btnEdit.setContentAreaFilled(false);
				btnEdit.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Edit.png")));
				btnEdit.setFont(new Font("Saudagar", Font.PLAIN, 16));
				btnEdit.setBounds(718, 423, 116, 60);
				getContentPane().add(btnEdit);
				
				JButton btnDelate = new JButton("Delate");
				btnDelate.setHorizontalAlignment(SwingConstants.LEFT);
				btnDelate.setIcon(new ImageIcon(UserPanel.class.getResource("/view/icons/Bin.png")));
				btnDelate.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnDelate.setFont(new Font("Saudagar", Font.PLAIN, 16));
				btnDelate.setContentAreaFilled(false);
				btnDelate.setBounds(718, 493, 119, 60);
				getContentPane().add(btnDelate);
				
				JLabel lblCity = new JLabel("City.");
				lblCity.setHorizontalAlignment(SwingConstants.CENTER);
				lblCity.setFont(new Font("morgenlicht", Font.PLAIN, 20));
				lblCity.setBounds(70, 403, 119, 45);
				getContentPane().add(lblCity);
				
				txtCity = new JTextField();
				txtCity.setText("Springfield");
				txtCity.setHorizontalAlignment(SwingConstants.LEFT);
				txtCity.setFont(new Font("Saudagar", Font.PLAIN, 20));
				txtCity.setEditable(false);
				txtCity.setColumns(10);
				txtCity.setBorder(null);
				txtCity.setBounds(219, 404, 278, 45);
				getContentPane().add(txtCity);
		
	}

}
