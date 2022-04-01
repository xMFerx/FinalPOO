package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;

import model.SQLcstmMethods;
import model.User;
import view.MainWin;

public class Controller implements ActionListener{
	
	private User usr = new User();
	private MainWin VenPrincipal;
	private SQLcstmMethods SQLCustomers = new SQLcstmMethods();
	private JButton doubleClick;
	
	
	public Controller () {
		VenPrincipal = new MainWin();
		VenPrincipal.setVisible(true);
		goToLogIn();		
				
		System.out.println("Cargando...");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * Log In Panel
		 */							
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnLogIn()) { //Log In Button	
			
			usr.setUserName(VenPrincipal.getPanelAcceso().getTxtUser().getText());			
			usr.setPassword(String.valueOf(VenPrincipal.getPanelAcceso().getPasswordField().getPassword()));
			if(SQLCustomers.LogInUser(usr))
			{
				VenPrincipal.getPanelAcceso().getTxtMessage().setText("Bienvenidx!");
				Sleep(1);
				goToCatalogue();
			}
			else
			{
				VenPrincipal.getPanelAcceso().getTxtMessage().setText("Verifica tu usuario y contraseña");
			}
		}
		
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnSignUp()) {  //Sign Up Button				
			goToSignUpUsr();
		}
		
		/*
		 * Sign up Panel
		 */		
		if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnFinish()) //Register Button
		{	
			JButton btn = (JButton) e.getSource();
			if (doubleClick == (JButton) e.getSource()) 					//2nd click
			{
				goToLogIn();
				doubleClick = null;
			}
			else
			{						
				VenPrincipal.getPanelRegistro().getTxtMessage().setText("");
				try {				
					usr.setName(VenPrincipal.getPanelRegistro().getTxtName().getText());
					VenPrincipal.getPanelRegistro().getTxtMessage().setText(usr.getName());
					usr.setUserName(VenPrincipal.getPanelRegistro().getTxtUserName().getText());
					usr.setCity(VenPrincipal.getPanelRegistro().getTxtCity().getText());
					usr.setEmail(VenPrincipal.getPanelRegistro().getTxtEmail().getText());
					usr.setTelephone(Long.parseLong(VenPrincipal.getPanelRegistro().getTxtTelephone().getText()));
					usr.setbirthday(Date.valueOf(VenPrincipal.getPanelRegistro().getTxtBirthDay().getText()));
					if(usr.setPassword(String.valueOf(VenPrincipal.getPanelRegistro().getPasswordField().getPassword())))
					{
						VenPrincipal.getPanelRegistro().getTxtMessage().setText("Contraseña invalida");	
					}
				    else
				    {
				    	VenPrincipal.getPanelRegistro().getTxtMessage().setText("Cuenta creada!");
				    	lockAnswersSignUp();
				    	if (SQLCustomers.SignUpUser(usr))
						{VenPrincipal.getPanelRegistro().getTxtMessage().setText("Registro Guardado");}
				    	else
				    	{VenPrincipal.getPanelRegistro().getTxtMessage().setText("Error en la base de datos");}
				    	VenPrincipal.getPanelRegistro().getBtnFinish().setText("Continuar");			    				    	
				    	doubleClick = (JButton) e.getSource();
				    }
				}catch(NumberFormatException nfEx)
				{
					VenPrincipal.getPanelRegistro().getTxtMessage().setText("Datos no validos.");
					System.err.println(nfEx);
				}
			}
		}
		
		/*
		 * Catalog Panel
		 */	
	}

	public void lockAnswersSignUp()
	{
		VenPrincipal.getPanelRegistro().getTxtBirthDay().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtCity().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtEmail().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtName().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtTelephone().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtUserName().setEnabled(false);
		VenPrincipal.getPanelRegistro().getPasswordField().setEnabled(false);	
	}
	
	public void goToLogIn()
	{
		VenPrincipal.IniPanelLogIn();
		VenPrincipal.getPanelAcceso().getBtnSignUp().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnLogIn().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnLogInAdmins().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnPassRecover().addActionListener(this);
	}
	
	public void goToSignUpUsr()
	{
		VenPrincipal.IniPanelSignUpUser();
		VenPrincipal.getPanelRegistro().getBtnFinish().addActionListener(this);
	}
	
	public void goToCatalogue(){
		System.out.println("catalogue");
	}
	
	public void Sleep(int i)
	{
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e1) {				
			e1.printStackTrace();
		}
	}
	
	//Admin
	
	//User

}
