package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class CataloguePanel extends JPanel {
	private JButton btnLogIn;
	
	
	/**
	 * Create the panel.
	 */
	public CataloguePanel() {
		setBackground(new Color(231, 235, 197));
		setPreferredSize(new Dimension(1020, 720));
		setLayout(null);
		
		btnLogIn = new JButton("Inicia Sesion");
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setLocation(722, -2);
		btnLogIn.setSize(300, 75);
		btnLogIn.setFont(new Font("Saudagar", Font.BOLD, 18));
		btnLogIn.setBackground(new Color(111, 80, 96));
		btnLogIn.setBorder(null);
		add(btnLogIn);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/MainLogo.png")));
		lblLogo.setFont(new Font("morgenlicht", Font.PLAIN, 26));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(0, 0, 500, 100);
		add(lblLogo);
	}

}
