package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.Renderer;

import java.awt.Dimension;

public class MainCartPanel extends JPanel {
	private JTextField txtShoppingCart;
	private JButton btnConShopping;
	private JButton btnCheck;
	private JPanel panelFinalMessage;
	private JButton btnGoBack;
	private JLabel txtThankYou;
	private JTextPane txtGoodbye;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField txtTotal;
	private JLabel lblTotal;
	private DefaultTableModel model;
	/**
	 * Create the panel.
	 */
	public MainCartPanel() {
setLayout(null);
		
		txtShoppingCart = new JTextField();
		txtShoppingCart.setEditable(false);
		txtShoppingCart.setOpaque(false);
		txtShoppingCart.setBorder(null);
		txtShoppingCart.setBounds(381, 54, 236, 42);
		txtShoppingCart.setFont(new Font("morgenlicht", Font.PLAIN, 24));
		txtShoppingCart.setText("Shopping Cart");
		txtShoppingCart.setHorizontalAlignment(SwingConstants.CENTER);
		add(txtShoppingCart);
		txtShoppingCart.setColumns(10);
		
		btnConShopping = new JButton("Continue shopping");
		btnConShopping.setBorder(null);
		btnConShopping.setOpaque(false);
		btnConShopping.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnConShopping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConShopping.setBounds(474, 510, 197, 36);
		add(btnConShopping);
		
		btnCheck = new JButton("Checkout");
		btnCheck.setBorder(null);
		btnCheck.setOpaque(false);
		btnCheck.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnCheck.setBounds(750, 510, 153, 36);
		add(btnCheck);
		
		JLabel IconPaymentMethod = new JLabel("");
		IconPaymentMethod.setIcon(new ImageIcon("C:\\Users\\mfper\\OneDrive\\Escritorio\\POO FINAL\\FinalProjectPOO\\src\\view\\icons\\PaymentMethod.png"));
		IconPaymentMethod.setBounds(98, 569, 805, 85);
		add(IconPaymentMethod);
		
		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setBounds(111, 112, 792, 300);		
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Saudagar", Font.PLAIN, 20));
		table.setRowSelectionAllowed(false);
		table.setFocusable(false);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setShowGrid(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(30);
		table.setOpaque(false);
		table.setBorder(null);
		
		model = new DefaultTableModel(new Object[][] {},
			new String[] {
				"Producto", "Cantidad", "Precio","Add","Remove","Delete"
			}
		) 
		{
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, JButton.class, JButton.class, JButton.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			public boolean isCellEditable(int row, int column)
			{				
				return false;
			}	
		};
		table.setModel(model);
		table.setDefaultRenderer(JButton.class, new TableCellRenderer()
		{
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
				return (Component)value;
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(322);
		table.getColumnModel().getColumn(3).setPreferredWidth(10);
		table.getColumnModel().getColumn(4).setPreferredWidth(10);
		table.getColumnModel().getColumn(5).setPreferredWidth(10);
		((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
		((DefaultTableCellRenderer)table.getDefaultRenderer(Integer.class)).setOpaque(false);
		table.getTableHeader().setVisible(false);
		scrollPane.setViewportView(table);
		
		
		
		panelFinalMessage = new JPanel();
		panelFinalMessage.setBounds(111, 112, 792, 300);
		//panelFinalMessage.setVisible(false);
		add(panelFinalMessage);
		panelFinalMessage.setLayout(null);
		
		btnGoBack = new JButton("Go back to Catalogue");
		btnGoBack.setOpaque(false);
		btnGoBack.setFont(new Font("Saudagar", Font.PLAIN, 20));
		btnGoBack.setBorder(null);
		btnGoBack.setBounds(296, 230, 197, 36);
		panelFinalMessage.add(btnGoBack);
		
		txtThankYou = new JLabel();
		txtThankYou.setText("Thank you!");
		txtThankYou.setOpaque(false);
		txtThankYou.setHorizontalAlignment(SwingConstants.CENTER);
		txtThankYou.setFont(new Font("morgenlicht", Font.PLAIN, 20));
		txtThankYou.setBorder(null);
		txtThankYou.setBounds(278, 25, 236, 42);
		panelFinalMessage.add(txtThankYou);
		
		txtGoodbye = new JTextPane();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		txtGoodbye.setParagraphAttributes(center, false);
		txtGoodbye.setFont(new Font("Saudagar", Font.PLAIN, 17));
		txtGoodbye.setText("Enjoy your products! \r\nAnd come back soon :D ");
		txtGoodbye.setOpaque(false);
		txtGoodbye.setBorder(null);
		txtGoodbye.setEditable(false);
		txtGoodbye.setBounds(256, 78, 280, 141);
		panelFinalMessage.add(txtGoodbye);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setBorder(null);
		txtTotal.setOpaque(false);
		txtTotal.setFont(new Font("Saudagar", Font.PLAIN, 20));
		txtTotal.setBounds(687, 433, 216, 29);
		add(txtTotal);
		txtTotal.setColumns(10);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Saudagar", Font.PLAIN, 20));
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setBounds(582, 434, 95, 29);
		add(lblTotal);

	}
	
	
	
	public DefaultTableModel getModel() {
		return model;
	}



	public void setModel(DefaultTableModel model) {
		this.model = model;
	}



	public JLabel getTxtThankYou() {
		return txtThankYou;
	}



	public JTextField getTxtTotal() {
		return txtTotal;
	}



	public JScrollPane getScrollPane() {
		return scrollPane;
	}



	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}



	public JButton getBtnGoBack() {
		return btnGoBack;
	}



	public JPanel getPanelFinalMessage() {
		return panelFinalMessage;
	}

	public JTextField getTxtShoppingCart() {
		return txtShoppingCart;
	}
	public JTable getTable() {
		return table;
	}
	public JButton getBtnConShopping() {
		return btnConShopping;
	}
	public JButton getBtnCheck() {
		return btnCheck;
	}
}
