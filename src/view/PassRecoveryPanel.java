package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PassRecoveryPanel extends JPanel {
	private JTextField textField;
	private JTextField textField2;

	/**
	 * Create the panel.
	 */
	public PassRecoveryPanel() {
		setLayout(null);
		
		JLabel lblRecuperaTuCuenta = new JLabel("Recupera tu cuenta");
		lblRecuperaTuCuenta.setHorizontalTextPosition(SwingConstants.CENTER);
		lblRecuperaTuCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecuperaTuCuenta.setFont(new Font("morgenlicht", Font.PLAIN, 26));
		lblRecuperaTuCuenta.setBounds(140, 61, 277, 30);
		add(lblRecuperaTuCuenta);
		
		JLabel lbText1 = new JLabel("Ingresa tu correo electronico para buscar tu cuenta ");
		lbText1.setFont(new Font("Saudagar", Font.PLAIN, 18));
		lbText1.setBounds(176, 121, 575, 30);
		add(lbText1);
		
		textField = new JTextField();
		textField.setFont(new Font("Saudagar", Font.PLAIN, 18));
		textField.setBounds(176, 156, 596, 39);
		add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Buscar");
		btnSearch.setBackground(Color.GRAY);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("Saudagar", Font.PLAIN, 18));
		btnSearch.setBounds(661, 224, 111, 39);
		add(btnSearch);
		
		JTextArea txtrSiHaOlvidado = new JTextArea();
		txtrSiHaOlvidado.setFont(new Font("Saudagar", Font.PLAIN, 18));
		txtrSiHaOlvidado.setText("Ingrese el Email con el que accede al \u00E5rea de clientes  y pulse el bot\u00F3n Recuperar.\r\r\r\n\rEn un momento le remitiremos su nueva contrase\u00F1a de acceso al Email\r.");
		txtrSiHaOlvidado.setBounds(164, 361, 627, 72);
		add(txtrSiHaOlvidado);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Saudagar", Font.PLAIN, 18));
		textField2.setColumns(10);
		textField2.setBounds(176, 444, 596, 39);
		add(textField2);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.setForeground(Color.BLACK);
		btnRecuperar.setFont(new Font("Saudagar", Font.PLAIN, 18));
		btnRecuperar.setBackground(Color.GRAY);
		btnRecuperar.setBounds(661, 514, 111, 39);
		add(btnRecuperar);

	}
}
