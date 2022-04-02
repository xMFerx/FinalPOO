package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class TestConnectionSQL extends JFrame {

	private JPanel contentPane;
	//Test
	public static final String  URL = "jdbc:mysql://localhost:3306/store";
	public static final String  UserName = "root";
	public static final String  Pass = "";
	private String Message = "123";
	private JTextField txtName;
	private JTextField txtPassword;
	private JTextField txtUserName;
	//End Test

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWin frame = new MainWin();
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
	public TestConnectionSQL() {
		setMinimumSize(new Dimension(1020, 720));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 480);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		//Start test		/*		
		JButton btnAccept = new JButton("Conectar");
		btnAccept.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		
		btnAccept.setBounds(31, 11, 177, 41);
		contentPane.add(btnAccept);
		
		JLabel lblMessage = new JLabel(Message);
		lblMessage.setFont(new Font("Malgun Gothic", Font.PLAIN, 23));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(235, 13, 163, 31);
		contentPane.add(lblMessage);
		contentPane.remove(lblMessage);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(76, 150, 60, 17);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(174, 150, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(174, 192, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(174, 234, 86, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(90, 195, 46, 14);
		contentPane.add(lblPassword);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUserName.setBounds(50, 237, 86, 14);
		contentPane.add(lblUserName);
		
		JButton btnAdd = new JButton("Agregar");
		btnAdd.setBounds(31, 292, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Eliminar");
		btnDelete.setBounds(136, 292, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnChange = new JButton("Modificar");
		btnChange.setBounds(246, 292, 89, 23);
		contentPane.add(btnChange);
				
		
		/*
		 * Actions
		 */
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection con = null;
					con = getConection();
										
					PreparedStatement ps;
					ResultSet res;
					
					ps = con.prepareStatement("SELECT * FROM customers" );
					res = ps.executeQuery();
					
					if(res.next())
					{
						Message = res.getInt("idcustomer") + " - " + res.getString("customerName") + " - " + res.getString("customerUserName");
					}
					else 
					{
						Message = "No existen datos";
					}
					
					con.close();
				}
				catch(Exception btne)
				{
					System.out.println(btne);
				}
			}
		});
		
		//End test		*/
	}
		
	
	public static Connection getConection()
	{
		Connection con = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(URL, UserName, Pass);
			JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
		
		return con;
	}
}