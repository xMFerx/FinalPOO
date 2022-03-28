package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
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
	 * Launch the application.
	 
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
	}*/

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
		getContentPane().add(PanelRegistro);
		//getContentPane().removeAll();			
		
		/*PanelAcceso = new LoginPanel();
		PanelAcceso.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(PanelAcceso);
		PanelAcceso.setLayout(null);		*/	
	}		
}
