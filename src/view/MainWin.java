package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;


public class MainWin extends JFrame {

	private SignUpPanelUsers PanelRegistro;
	private LoginPanel PanelAcceso;	
	
	public SignUpPanelUsers getPanelRegistro() {
		return PanelRegistro;
	}

	public LoginPanel getPanelAcceso() {
		return PanelAcceso;
	}	

	/**
	 * Create the frame.
	 */
	public MainWin() {
		setMinimumSize(new Dimension(1020, 760));
		setResizable(false);
		setTitle("Wayne Enterprise Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 760);
		
		PanelRegistro = new SignUpPanelUsers();
		PanelRegistro.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		PanelAcceso = new LoginPanel();
		PanelAcceso.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
	}		

	public void IniPanelSignUpUser()
	{
		//getContentPane().removeAll();
		setContentPane(PanelRegistro);
		PanelRegistro.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
	public void IniPanelLogIn()
	{
		//getContentPane().removeAll();
		setContentPane(PanelAcceso);
		PanelAcceso.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
}
