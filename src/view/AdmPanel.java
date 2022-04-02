package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AdmPanel extends JPanel {
	private JTextField txtUserName;

	/**
	 * Create the panel.
	 */
	public AdmPanel() {
		setLayout(null);
		
		JLabel ProfilePic = new JLabel("");
		ProfilePic.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePic.setIcon(new ImageIcon(AdmPanel.class.getResource("/view/icons/SmallLogo.png")));
		ProfilePic.setBounds(93, 106, 199, 167);
		add(ProfilePic);
		
		JLabel lblNewLabel = 
		new JLabel("Admin");
		lblNewLabel.setFont(new Font("morgenlicht", Font.PLAIN, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(485, 123, 179, 68);
		add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.setBorder(null);
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setText("zorra69");
		txtUserName.setFont(new Font("Saudagar", Font.PLAIN, 24));
		txtUserName.setEditable(false);
		txtUserName.setBounds(456, 188, 257, 36);
		add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdmPanel.class.getResource("/view/icons/SignUpBG.png")));
		lblNewLabel_1.setBounds(21, -51, 589, 619);
		add(lblNewLabel_1);

	}
}
