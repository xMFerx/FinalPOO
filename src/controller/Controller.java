package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.SQLcstmMethods;
import model.User;
import view.MainWin;

public class Controller implements ActionListener{
	
	private User usr;
	private MainWin VenPrincipal;
	private SQLcstmMethods SQLCustomers;
	
	public Controller () {
		//this.SQLCustomers = SQLCustomers;
		//this.usr = usr;
		//this.VenPrincipal = VenPrincipal;
		VenPrincipal = new MainWin();
		VenPrincipal.setVisible(true);
		usr = new User();
		this.VenPrincipal.getPanelRegistro().getBtnFinish().addActionListener(this);	
		
		System.out.println("Cargando...");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * Sign up 
		 */		
		if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnFinish())
		{
			VenPrincipal.getPanelRegistro().getTxtMessage().setText("");
			usr.setName(VenPrincipal.getPanelRegistro().getTxtName().getText());			
			usr.setUserName(VenPrincipal.getPanelRegistro().getTxtUserName().getText());
		    if(usr.setPassword(String.valueOf(VenPrincipal.getPanelRegistro().getPasswordField().getPassword())))
			{
				VenPrincipal.getPanelRegistro().getTxtMessage().setText("Contraseña invalida");	
			}
		    else {
		    	VenPrincipal.getPanelRegistro().getTxtMessage().setText("Contraseña valida");
		    }		    			
			usr.setCity(VenPrincipal.getPanelRegistro().getTxtCity().getText());
			usr.setEmail(VenPrincipal.getPanelRegistro().getTxtEmail().getText());
			usr.setTelephone(Long.parseLong(VenPrincipal.getPanelRegistro().getTxtTelephone().getText()));
			usr.setbirthday(Date.valueOf(VenPrincipal.getPanelRegistro().getTxtBirthDay().getText()));		
			
			//imprimir usr todos los datos, revisar q falla (sugerencia: Date)
			
			if (SQLCustomers.SignUpUser(usr))
			{
				VenPrincipal.getPanelRegistro().getTxtMessage().setText("Registro Guardado");
				lockAnswers();
			}else
			{
				VenPrincipal.getPanelRegistro().getTxtMessage().setText("Error encontrado");
			}
		}
	}
	
	/*
	 * 
	 * Sign up 
	 * 
	 */
	public void lockAnswers()
	{
		VenPrincipal.getPanelRegistro().getTxtBirthDay().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtCity().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtEmail().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtName().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtTelephone().setEnabled(false);
		VenPrincipal.getPanelRegistro().getTxtUserName().setEnabled(false);
	}
	
	//Login (if for changePassword())
	
	//Admin
	
	//User

}
