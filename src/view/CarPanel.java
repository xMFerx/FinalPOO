package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CarPanel extends JPanel {
	private JTextField txtShoppingCart;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public CarPanel() {
		setLayout(null);
		
		txtShoppingCart = new JTextField();
		txtShoppingCart.setBorder(null);
		txtShoppingCart.setBounds(381, 54, 236, 42);
		txtShoppingCart.setFont(new Font("morgenlicht", Font.PLAIN, 24));
		txtShoppingCart.setText("Shopping Cart");
		txtShoppingCart.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtShoppingCart);
		txtShoppingCart.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(111, 112, 792, 300);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Products", "Price", "Quantity", "Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Long.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(0).setMinWidth(25);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setMinWidth(25);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMinWidth(25);
		scrollPane.setViewportView(table);
		
		JButton btnConShopping = new JButton("Continue shopping");
		btnConShopping.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnConShopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConShopping.setBounds(474, 510, 197, 36);
		add(btnConShopping);
		
		JButton btnCheck = new JButton("Checkout");
		btnCheck.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnCheck.setBounds(750, 510, 153, 36);
		add(btnCheck);
		
		JLabel IconPaymentMethod = new JLabel("");
		IconPaymentMethod.setIcon(new ImageIcon("C:\\Users\\mfper\\OneDrive\\Escritorio\\POO FINAL\\FinalProjectPOO\\src\\view\\icons\\PaymentMethod.png"));
		IconPaymentMethod.setBounds(98, 569, 805, 85);
		add(IconPaymentMethod);

	}
}
