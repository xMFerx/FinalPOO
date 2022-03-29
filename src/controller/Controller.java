package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import model.SQLcstmMethods;
import model.User;
import view.MainWin;

public class Controller implements ActionListener{
	
	private User usr = new User();
	private MainWin VenPrincipal;
	private SQLcstmMethods SQLCustomers = new SQLcstmMethods();
	
	public Controller () {
		VenPrincipal = new MainWin();
		VenPrincipal.setVisible(true);
		VenPrincipal.IniPanelSignUpUser();
		VenPrincipal.getPanelRegistro().getBtnFinish().addActionListener(this);
		//VenPrincipal.IniPanelLogIn();
		//VenPrincipal.getPanelAcceso().getBtnSignUp().addActionListener(this);
				
		System.out.println("Cargando...");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		 * Log In
		 */		
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnSignUp()) {
			VenPrincipal.IniPanelSignUpUser();
		}
		
		/*
		 * Sign up 
		 */		
		if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnFinish())
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
			    	lockAnswers();
			    	if (SQLCustomers.SignUpUser(usr))
					{VenPrincipal.getPanelRegistro().getTxtMessage().setText("Registro Guardado");}
			    	else
			    	{VenPrincipal.getPanelRegistro().getTxtMessage().setText("Error en la base de datos");}
			    	VenPrincipal.getPanelRegistro().getBtnFinish().setText("Continuar");			    	
			    	TimeUnit.SECONDS.sleep(1);
			    	if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnFinish())
			    	{			    		
			    		VenPrincipal.IniPanelLogIn();
			    		VenPrincipal.getPanelAcceso().getBtnSignUp().addActionListener(this);
			    	}
			    }
			}catch(NumberFormatException nfEx)
			{
				VenPrincipal.getPanelRegistro().getTxtMessage().setText("Datos no validos.");
				System.err.println(nfEx);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public void lockAnswers()
	{
		VenPrincipal.getPanelRegistro().getTxtBirthDay().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtCity().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtEmail().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtName().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtTelephone().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtUserName().setEnabled(false);
		VenPrincipal.getPanelRegistro().getPasswordField().setEnabled(false);
	}
	
	//Admin
	
	//User

}
