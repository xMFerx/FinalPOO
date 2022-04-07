package view;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


public class MainWin extends JFrame {

	private SignUpPanelUsers PanelRegistro;
	private LoginPanel PanelAcceso;	
	private CataloguePanel PanelCatalogo;
	private JScrollPane ScrollablePanel;
	private MainCartPanel cart;
	private AdminPanel PanelAdmin;
	private UserPanel PanelUsuario; 
	private PassRecoveryPanel PanelRecPass;
	
	
	public PassRecoveryPanel getPanelRecPass() {
		return PanelRecPass;
	}

	public MainCartPanel getCart() {
		return cart;
	}

	public SignUpPanelUsers getPanelRegistro() {
		return PanelRegistro;
	}

	public LoginPanel getPanelAcceso() {
		return PanelAcceso;
	}	
	
	public CataloguePanel getPanelCatalogo() {
		return PanelCatalogo;
	}

	public AdminPanel getPanelAdmin() {
		return PanelAdmin;
	}

	public UserPanel getPanelUsuario() {
		return PanelUsuario;
	}

	/**
	 * Create the frame.
	 */
	public MainWin() {
		setMinimumSize(new Dimension(1035, 760));
		setResizable(false);
		setTitle("Wayne Enterprise Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//setBounds(100, 100, 1020, 760);
		
		//Look and Feel
		try{
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		PanelRegistro = new SignUpPanelUsers();
		PanelRegistro.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		PanelAcceso = new LoginPanel();
		PanelAcceso.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		PanelAdmin = new AdminPanel();
		
		PanelUsuario = new UserPanel(); 
		
		PanelRecPass = new PassRecoveryPanel();
		
		PanelCatalogo = new CataloguePanel();
		ScrollablePanel = new JScrollPane();
		ScrollablePanel.setBounds(5,5,1020,720);
		ScrollablePanel.setViewportView(PanelCatalogo);
		ScrollablePanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		ScrollablePanel.getVerticalScrollBar().setUnitIncrement(16);
		
		cart = new MainCartPanel();		
	}	
	
	public void IniPanelRecPass()
	{
		setContentPane(PanelRecPass);
		PanelRecPass.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
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
	
	public void IniPanelCatalogue()
	{
		//getContentPane().removeAll();		
		setContentPane(ScrollablePanel);
		ScrollablePanel.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
	public void IniPanelCart()
	{
		//getContentPane().removeAll();		
		setContentPane(cart);
		cart.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
	public void IniUserPanel()
	{
		//getContentPane().removeAll();		
		setContentPane(PanelUsuario);
		PanelUsuario.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
	public void IniAdmPanel()
	{
		//getContentPane().removeAll();		
		setContentPane(PanelAdmin);
		PanelAdmin.setLayout(null);
		this.invalidate();
		this.validate();
		this.repaint();
	}
	
}
