package controller;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import model.Admin;
import model.Orders;
import model.Products;
import model.SQLadmMethods;
import model.SQLcstmMethods;
import model.SQLordersMethods;
import model.SQLprodMethods;
import model.User;
import view.CataloguePanel;
import view.MainWin;
import view.ProWin;
import view.UserWin;

/**
 * Clase controlador principal de la aplicación, realiza las conexiones de los
 * paneles con las clases y metodos de SQL además del comportamiento de los botones
 * @author: Sam Carrillo - Fernanda Pérez
 * 	 
 */

public class Controller implements ActionListener{
	
	private User usr = new User();
	private Admin adm = new Admin();
	private Products prod = new Products();
	private Orders ord = new Orders();
	private MainWin VenPrincipal;
	private UserWin VenUsuario;
	private ProWin VenProducto;
	private SQLcstmMethods SQLCustomers = new SQLcstmMethods();
	private SQLadmMethods SQLAdmins = new SQLadmMethods();
	private SQLprodMethods SQLProducts = new SQLprodMethods();
	private SQLordersMethods SQLorder = new SQLordersMethods();
	private JButton doubleClick;
	private boolean isAdmin = false;
	private int AdmTables = 0;
	private int BannerStatus = 1;
	private int LoginID = 0;
	
	
	public Controller () {
		VenPrincipal = new MainWin();
		VenPrincipal.setVisible(true);
		VenUsuario = new UserWin();
		VenProducto = new ProWin();
		goToCatalogue();
				
		System.out.println("Cargando...");		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		/*
		 * Log In Panel
		 */							
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnLogIn()) { //Log In Button	
			
			if(isAdmin)
			{
				adm.setUserName(VenPrincipal.getPanelAcceso().getTxtUser().getText());			
				adm.setPassword(String.valueOf(VenPrincipal.getPanelAcceso().getPasswordField().getPassword()));
				if(SQLAdmins.LogInAdmin(adm))
				{
					VenPrincipal.getPanelAcceso().getTxtMessage().setText("Bienvenidx!");
					//Sleep(1);
					VenPrincipal.getPanelCatalogo().getBtnLogIn().setVisible(false);
					VenPrincipal.getPanelCatalogo().getBtnMyProfile().setVisible(true);
					isAdmin = true;
					goToCatalogue();
				}
				else
				{
					VenPrincipal.getPanelAcceso().getTxtMessage().setText("Verifica tu usuario y contraseï¿½a");
				}
			}else
			{
				usr.setUserName(VenPrincipal.getPanelAcceso().getTxtUser().getText());			
				usr.setPassword(String.valueOf(VenPrincipal.getPanelAcceso().getPasswordField().getPassword()));
				if(SQLCustomers.LogInUser(usr))
				{
					VenPrincipal.getPanelAcceso().getTxtMessage().setText("Bienvenidx!");
					//Sleep(1);
					VenPrincipal.getPanelCatalogo().getBtnLogIn().setVisible(false);
					VenPrincipal.getPanelCatalogo().getBtnMyProfile().setVisible(true);
					isAdmin = false;
					LoginID = usr.getId();					
					goToCatalogue();
				}
				else
				{
					VenPrincipal.getPanelAcceso().getTxtMessage().setText("Verifica tu usuario y contraseï¿½a");
				}
			}
		}		
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnSignUp()) {  //Sign Up Button				
			goToSignUpUsr();
		}
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnPassRecover())//Password Recover 
		{
			goToPanelRecPass();			
		}
		if(e.getSource() == VenPrincipal.getPanelAcceso().getBtnLogInAdmins())//Admin Log In
		{			
			VenPrincipal.getPanelAcceso().getTxtMessage().setText("Modo ADMIN");
			VenPrincipal.getPanelAcceso().getBtnLogInAdmins().setVisible(false);
			isAdmin = true;
		}
		
		/*
		 * Sign up Panel
		 */		
		if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnBack())
		{
			goToLogIn();
		}
		if(e.getSource() == VenPrincipal.getPanelRegistro().getBtnFinish()) //Register Button
		{					
			if (doubleClick ==  VenPrincipal.getPanelRegistro().getBtnFinish())//2nd click
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
					usr.setRegisterDate(usr.getToday().toString());
					if(usr.setPassword(String.valueOf(VenPrincipal.getPanelRegistro().getPasswordField().getPassword())))
					{
						VenPrincipal.getPanelRegistro().getTxtMessage().setText("Contraseï¿½a invalida");	
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
				    	doubleClick = VenPrincipal.getPanelRegistro().getBtnFinish();
				    }
				}catch(NumberFormatException nfEx)
				{
					VenPrincipal.getPanelRegistro().getTxtMessage().setText("Datos no validos.");
					System.err.println(nfEx);
				}
			}
		}
		
		/*
		 * Password Recovery Panel
		 */
		if(e.getSource() == VenPrincipal.getPanelRecPass().getBtnGoBack()) {
			goToLogIn();
		}
		/*
		 * Catalog Panel
		 */	
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnLogIn())
		{
			goToLogIn();		
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnBannerOp1())
		{
			VenPrincipal.getPanelCatalogo().getLblBanner().setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/BannerOpt1.png")));
			prod.setId(1);
			SQLProducts.FindProduct(prod);
			VenPrincipal.getPanelCatalogo().getTxtBannerName().setText(prod.getName());
			if(prod.getDiscount()>0)
			{
				VenPrincipal.getPanelCatalogo().getTxtDiscount().setText(String.valueOf(prod.getDiscount())+"%");
			}
			VenPrincipal.getPanelCatalogo().getTxtPrice().setText("$"+String.valueOf(prod.getPrice()));
			BannerStatus = 1;
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnBannerOp2())
		{
			VenPrincipal.getPanelCatalogo().getLblBanner().setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/BannerOpt2.png")));
			prod.setId(2);
			SQLProducts.FindProduct(prod);
			VenPrincipal.getPanelCatalogo().getTxtBannerName().setText(prod.getName());
			if(prod.getDiscount()>0)
			{
				VenPrincipal.getPanelCatalogo().getTxtDiscount().setText(String.valueOf(prod.getDiscount())+"%");
			}
			VenPrincipal.getPanelCatalogo().getTxtPrice().setText("$"+String.valueOf(prod.getPrice()));
			BannerStatus = 2;
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnBannerOp3())
		{
			VenPrincipal.getPanelCatalogo().getLblBanner().setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/BannerOpt3.png")));
			prod.setId(3);
			SQLProducts.FindProduct(prod);
			VenPrincipal.getPanelCatalogo().getTxtBannerName().setText(prod.getName());
			if(prod.getDiscount()>0)
			{
				VenPrincipal.getPanelCatalogo().getTxtDiscount().setText(String.valueOf(prod.getDiscount())+"%");
			}
			VenPrincipal.getPanelCatalogo().getTxtPrice().setText("$"+String.valueOf(prod.getPrice()));
			BannerStatus = 3;
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnBanner())
		{			
			switch(BannerStatus)
			{
			case 1:
				addToCart(1);
				break;
			case 2:
				addToCart(2);
				break;
			case 3:
				addToCart(3);
				break;
			}
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnMyProfile())
		{
			if(isAdmin)
			{
				goToAdmPanel();
				VenPrincipal.getPanelAdmin().getTxtEmail().setText(adm.getEmail());
				VenPrincipal.getPanelAdmin().getTxtName().setText(adm.getName());
				VenPrincipal.getPanelAdmin().getTxtTel().setText(String.valueOf(adm.getTelephone()));
				VenPrincipal.getPanelAdmin().getTxtUserName().setText(adm.getUserName());
			}else
			{
				goToUserPanel();
				VenPrincipal.getPanelUsuario().getTxtBirthday().setText(usr.getbirthday().toString());
				VenPrincipal.getPanelUsuario().getTxtCity().setText(usr.getCity());
				VenPrincipal.getPanelUsuario().getTxtEmail().setText(usr.getEmail());
				VenPrincipal.getPanelUsuario().getTxtId().setText(String.valueOf(usr.getId()));
				VenPrincipal.getPanelUsuario().getTxtName().setText(usr.getName());
				VenPrincipal.getPanelUsuario().getTxtTel().setText(String.valueOf(usr.getTelephone()));
				VenPrincipal.getPanelUsuario().getTxtUserName().setText(usr.getUserName());					
			}
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B1()) {
			addToCart(4);
		}		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B2()) {
			addToCart(5);
		}		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B3()) {
			addToCart(6);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B4()) {
			addToCart(7);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B5()) {
			addToCart(8);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B6()) {
			addToCart(9);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC1B7()) {
			addToCart(10);
		}
		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B1()) {
			addToCart(11);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B2()) {
			addToCart(12);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B3()) {
			addToCart(13);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B4()) {
			addToCart(14);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B5()) {
			addToCart(15);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC2B6()) {
			addToCart(16);
		}
		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC3B1()) {
			addToCart(17);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC3B2()) {
			addToCart(18);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC3B3()) {
			addToCart(19);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC3B4()) {
			addToCart(20);
		}
		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B1()) {
			addToCart(21);
		}		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B2()) {
			addToCart(22);
		}		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B3()) {
			addToCart(23);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B4()) {
			addToCart(24);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B5()) {
			addToCart(25);
		}
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnC4B6()) {
			addToCart(26);
		}
		
		if(e.getSource() == VenPrincipal.getPanelCatalogo().getBtnCart())
		{
			if (LoginID != 0)
			{
				goToCartPanel();
			}
			else
			{
				goToLogIn();
			}		
		}
		
		/*
		 * Admin Panel 
		 */
		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnGoBack())
		{
			goToCatalogue();
		}
		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnEdit())
		{			
			VenPrincipal.getPanelAdmin().getTxtEmail().setEditable(true);
			VenPrincipal.getPanelAdmin().getTxtName().setEditable(true);
			VenPrincipal.getPanelAdmin().getTxtTel().setEditable(true);
			VenPrincipal.getPanelAdmin().getTxtUserName().setEditable(true);				
			VenPrincipal.getPanelAdmin().getBtnEdit().setVisible(false);
			VenPrincipal.getPanelAdmin().getBtnSaveEdit().setVisible(true);
			
		}
		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnSaveEdit())
		{
			try
			{
				VenPrincipal.getPanelAdmin().getBtnEdit().setText("Editar");
				VenPrincipal.getPanelAdmin().getTxtEmail().setEditable(false);
				VenPrincipal.getPanelAdmin().getTxtName().setEditable(false);
				VenPrincipal.getPanelAdmin().getTxtTel().setEditable(false);
				VenPrincipal.getPanelAdmin().getTxtUserName().setEditable(false);
				
				adm.setUserName(VenPrincipal.getPanelAdmin().getTxtUserName().getText().toString());
				adm.setEmail(VenPrincipal.getPanelAdmin().getTxtEmail().getText().toString());
				adm.setName(VenPrincipal.getPanelAdmin().getTxtName().getText().toString());
				adm.setTelephone(Long.parseLong(VenPrincipal.getPanelAdmin().getTxtTel().getText().toString()));			
				if(SQLAdmins.ModifyAdmin(adm))
				{
					VenPrincipal.getPanelAdmin().getTxtMessage().setText("Datos modificados!");			
					//Sleep(1);
					VenPrincipal.getPanelAdmin().getTxtMessage().setText("");
					VenPrincipal.getPanelAdmin().getBtnEdit().setVisible(true);
					VenPrincipal.getPanelAdmin().getBtnSaveEdit().setVisible(false);
				}
				else
				{
					VenPrincipal.getPanelAdmin().getTxtMessage().setText("Error en la base de datos");
				}
			}catch(Exception ex)
			{
				VenPrincipal.getPanelAdmin().getTxtMessage().setText("Verifica los datos");					
				System.err.println(ex);					
			}
		}
		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnUsersList())
		{
			AdmTables =1;
			DefaultTableModel model = SQLAdmins.getUsers();
			TableUsers(model);
			VenPrincipal.getPanelAdmin().getTables().setAutoCreateRowSorter(true);
			VenPrincipal.getPanelAdmin().getTables().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
		        public void valueChanged(ListSelectionEvent event) {	            
		        	if (!event.getValueIsAdjusting() && VenPrincipal.getPanelAdmin().getTables().getSelectedRow() != -1 && AdmTables == 1)
		        	{		        		
		        		usr.setId(Integer.parseInt(VenPrincipal.getPanelAdmin().getTables().getValueAt(VenPrincipal.getPanelAdmin().getTables().getSelectedRow(), 0).toString()));
		        		usr = SQLCustomers.FindUser(usr);		        		
		        		VenUsuario = new UserWin();
		        		VenUsuario.getTxtID().setText(String.valueOf(usr.getId()));
		        		VenUsuario.getTxtName().setText(usr.getName());
		        		VenUsuario.getTxtUserName().setText(usr.getUserName());
		        		VenUsuario.getTxtBirthday().setText(usr.getbirthday().toString());
		        		VenUsuario.getTxtCity().setText(usr.getCity());
		        		VenUsuario.getTxtEmail().setText(usr.getEmail());
		        		VenUsuario.getTxtPassword().setText(usr.getPassword());
		        		VenUsuario.getTxtRegisterDate().setText(usr.getRegisterDate());
		        		VenUsuario.getTxtTel().setText(String.valueOf(usr.getTelephone()));		        		
		        		VenUsuario.setVisible(true);
		        		OpenUserProfileWin();
		        	}
		        }
		    });
		}
		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnProducts())
		{
			AdmTables =2;
			DefaultTableModel model = SQLAdmins.getProducts();
			TableUsers(model);
			VenPrincipal.getPanelAdmin().getTables().setAutoCreateRowSorter(true);
			VenPrincipal.getPanelAdmin().getTables().getSelectionModel().addListSelectionListener(new ListSelectionListener(){
		        public void valueChanged(ListSelectionEvent event) {	            
		        	if (!event.getValueIsAdjusting() && VenPrincipal.getPanelAdmin().getTables().getSelectedRow() != -1 && AdmTables == 2)
		        	{		        		
		        		prod.setId(Integer.parseInt(VenPrincipal.getPanelAdmin().getTables().getValueAt(VenPrincipal.getPanelAdmin().getTables().getSelectedRow(), 0).toString()));
		        		SQLProducts.FindProduct(prod);   		
		        		VenProducto = new ProWin();
		        		VenProducto.getTxtCost().setText(String.valueOf(prod.getPrice()));
		        		VenProducto.getTxtdiscount().setText(String.valueOf(prod.getDiscount()));
		    			VenProducto.getTxtID().setText(String.valueOf(prod.getId()));
		    			VenProducto.getTxtNamePro().setText(prod.getName());
		    			VenProducto.getTxtProfits().setText(String.valueOf(prod.getProfit()));
		    			VenProducto.getTxtQuantity().setText(String.valueOf(prod.getQtStored()));
		    			VenProducto.getTxtSold().setText(String.valueOf(prod.getQtSold()));
		        		VenProducto.setVisible(true);
		        		OpenProductWin();
		        	}
		        }
		    });
		}		
		if(e.getSource() == VenPrincipal.getPanelAdmin().getBtnSales())
		{
			AdmTables=3;
			DefaultTableModel model = SQLAdmins.getSales();
			TableUsers(model);
			VenPrincipal.getPanelAdmin().getTables().setAutoCreateRowSorter(true);			
		}
		
		/*
		 * Product Details Window
		 */
		if(e.getSource() == VenProducto.getBtnEdit())
		{
			VenProducto.getTxtCost().setEditable(true);
			VenProducto.getTxtdiscount().setEditable(true);
			VenProducto.getTxtID().setEditable(true);
			VenProducto.getTxtNamePro().setEditable(true);
			VenProducto.getTxtProfits().setEditable(true);
			VenProducto.getTxtQuantity().setEditable(true);
			VenProducto.getTxtSold().setEditable(true);
			VenProducto.getBtnEdit().setVisible(false);
			VenProducto.getBtnSaveEdit().setVisible(true);
		}
		if(e.getSource() == VenProducto.getBtnSaveEdit())
		{
			try
			{
				VenProducto.getTxtCost().setEditable(false);
				VenProducto.getTxtdiscount().setEditable(false);
				VenProducto.getTxtID().setEditable(false);
				VenProducto.getTxtNamePro().setEditable(false);
				VenProducto.getTxtProfits().setEditable(false);
				VenProducto.getTxtQuantity().setEditable(false);
				VenProducto.getTxtSold().setEditable(false);
				
				prod.setPrice(Float.parseFloat(VenProducto.getTxtCost().getText()));
				prod.setDiscount(Integer.parseInt(VenProducto.getTxtdiscount().getText()));
				prod.setName(VenProducto.getTxtNamePro().getText());
				prod.setProfit(Float.parseFloat(VenProducto.getTxtProfits().getText()));
				prod.setQtStored(Integer.parseInt(VenProducto.getTxtQuantity().getText()));
				prod.setQtSold(Integer.parseInt(VenProducto.getTxtSold().getText()));
				
				if(SQLProducts.UpdateProd(prod))
				{
					VenProducto.getTxtMessage().setText("Datos modificados!");
					//Sleep(1);
					VenProducto.getTxtMessage().setText("");
					VenProducto.getBtnEdit().setVisible(true);
					VenProducto.getBtnSaveEdit().setVisible(false);					
				}
				else
				{
					VenProducto.getTxtMessage().setText("Error en la base de datos");
				}
				
			}catch(Exception ex)
			{
				VenProducto.getTxtMessage().setText("Verifica los datos");					
				System.err.println(ex);					
			}
		}
		if(e.getSource() == VenProducto.getBtnDelete())
		{
			SQLProducts.DeleteProduct(prod);
			VenProducto.dispose();
		}
		
		/*		 
		 * User Profile Window 
		 */		
		
		if(e.getSource() == VenUsuario.getBtnEdit())
		{			
			VenUsuario.getTxtEmail().setEditable(true);
			VenUsuario.getTxtName().setEditable(true);
			VenUsuario.getTxtTel().setEditable(true);
			VenUsuario.getTxtUserName().setEditable(true);
			VenUsuario.getTxtCity().setEditable(true);			
			VenUsuario.getTxtBirthday().setEditable(true);
			VenUsuario.getTxtPassword().setEditable(true);
			VenUsuario.getTxtTel().setEditable(true);
			VenUsuario.getBtnEdit().setVisible(false);
			VenUsuario.getBtnSaveEdit().setVisible(true);
		}			
		
		if(e.getSource() == VenUsuario.getBtnSaveEdit())
		{
			try
			{
				VenUsuario.getTxtEmail().setEditable(false);
				VenUsuario.getTxtName().setEditable(false);
				VenUsuario.getTxtTel().setEditable(false);
				VenUsuario.getTxtUserName().setEditable(false);
				VenUsuario.getTxtCity().setEditable(false);
				VenUsuario.getTxtBirthday().setEditable(false);
				VenUsuario.getTxtPassword().setEditable(false);
				VenUsuario.getTxtTel().setEditable(false);
				
				usr.setUserName(VenUsuario.getTxtUserName().getText().toString());
				usr.setEmail(VenUsuario.getTxtEmail().getText().toString());
				usr.setName(VenUsuario.getTxtName().getText().toString());
				usr.setTelephone(Long.parseLong(VenUsuario.getTxtTel().getText().toString()));	
				usr.setCity(VenUsuario.getTxtCity().getText());
				usr.setbirthday(Date.valueOf(VenUsuario.getTxtBirthday().getText()));
				if(usr.setPassword(VenUsuario.getTxtPassword().getText()))
				{
					VenUsuario.getTxtMessage().setText("Contraseï¿½a Invalida");
				}else {
					if(SQLCustomers.ModifyUser(usr))
					{
						VenUsuario.getTxtMessage().setText("Datos modificados!");
						//Sleep(1);
						VenUsuario.getTxtMessage().setText("");
						VenUsuario.getBtnEdit().setVisible(true);
						VenUsuario.getBtnSaveEdit().setVisible(false);					
					}
					else
					{
						VenUsuario.getTxtMessage().setText("Error en la base de datos");
					}
				}
			}catch(Exception ex)
			{
				VenUsuario.getTxtMessage().setText("Verifica los datos");					
				System.err.println(ex);					
			}
		}
		
		if(e.getSource() == VenUsuario.getBtnDelete())
		{
			SQLCustomers.DeleteUser(usr);
			VenUsuario.dispose();
		}
		
		
		/*
		 * User Panel 
		 */
		if(e.getSource() == VenPrincipal.getPanelUsuario().getBtnGoBack())
		{
			goToCatalogue();
		}
		
		if(e.getSource() == VenPrincipal.getPanelUsuario().getBtnEdit())
		{			
			VenPrincipal.getPanelUsuario().getTxtEmail().setEditable(true);
			VenPrincipal.getPanelUsuario().getTxtName().setEditable(true);
			VenPrincipal.getPanelUsuario().getTxtTel().setEditable(true);
			VenPrincipal.getPanelUsuario().getTxtUserName().setEditable(true);
			VenPrincipal.getPanelUsuario().getTxtCity().setEditable(true);
			VenPrincipal.getPanelUsuario().getBtnEdit().setVisible(false);
			VenPrincipal.getPanelUsuario().getBtnSaveEdit().setVisible(true);
		}			
		
		if(e.getSource() == VenPrincipal.getPanelUsuario().getBtnSaveEdit())
		{
			try
			{
				VenPrincipal.getPanelUsuario().getBtnEdit().setText("Editar");
				VenPrincipal.getPanelUsuario().getTxtEmail().setEditable(false);
				VenPrincipal.getPanelUsuario().getTxtName().setEditable(false);
				VenPrincipal.getPanelUsuario().getTxtTel().setEditable(false);
				VenPrincipal.getPanelUsuario().getTxtUserName().setEditable(false);
				VenPrincipal.getPanelUsuario().getTxtCity().setEditable(false);
				
				usr.setUserName(VenPrincipal.getPanelUsuario().getTxtUserName().getText().toString());
				usr.setEmail(VenPrincipal.getPanelUsuario().getTxtEmail().getText().toString());
				usr.setName(VenPrincipal.getPanelUsuario().getTxtName().getText().toString());
				usr.setTelephone(Long.parseLong(VenPrincipal.getPanelUsuario().getTxtTel().getText().toString()));			
				if(SQLCustomers.ModifyUser(usr))
				{
					VenPrincipal.getPanelUsuario().getTxtMessage().setText("Datos modificados!");			
					//Sleep(1);
					VenPrincipal.getPanelUsuario().getTxtMessage().setText("");
					VenPrincipal.getPanelUsuario().getBtnEdit().setVisible(false);
					VenPrincipal.getPanelUsuario().getBtnSaveEdit().setVisible(true);					
				}
				else
				{
					VenPrincipal.getPanelUsuario().getTxtMessage().setText("Error en la base de datos");
				}
			}catch(Exception ex)
			{
				VenPrincipal.getPanelUsuario().getTxtMessage().setText("Verifica los datos");					
				System.err.println(ex);					
			}
		}
		
		if(e.getSource() == VenPrincipal.getPanelUsuario().getBtnDelete())
		{
			SQLCustomers.DeleteUser(usr);
			goToCatalogue();
		}
		
		/*
		 * Cart Panel
		 */
		
		if(e.getSource() == VenPrincipal.getCart().getBtnGoBack())
		{
			goToCatalogue();
		}
		if(e.getSource() == VenPrincipal.getCart().getBtnCheck())			
		{
			VenPrincipal.getCart().getScrollPane().setVisible(false);
			VenPrincipal.getCart().getPanelFinalMessage().setVisible(true);
			VenPrincipal.getCart().getBtnCheck().setVisible(false);
			VenPrincipal.getCart().getBtnConShopping().setVisible(false);
			addProfits();
		}
		if(e.getSource() == VenPrincipal.getCart().getBtnConShopping())
		{
			goToCatalogue();
		}
	}

	
	/*
	 * Initialize components 
	 */

    /**
     *
     */

	public void goToPanelRecPass()
	{
		VenPrincipal.IniPanelRecPass();
		VenPrincipal.getPanelRecPass().getBtnGoBack().addActionListener(this);		
	}
	
	public void goToLogIn()
	{
		VenPrincipal.IniPanelLogIn();
		VenPrincipal.getPanelAcceso().getBtnSignUp().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnLogIn().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnLogInAdmins().addActionListener(this);
		VenPrincipal.getPanelAcceso().getBtnPassRecover().addActionListener(this);//not coded
	}
	
	public void goToSignUpUsr()
	{
		VenPrincipal.IniPanelSignUpUser();
		VenPrincipal.getPanelRegistro().getBtnFinish().addActionListener(this);
		VenPrincipal.getPanelRegistro().getBtnBack().addActionListener(this);
	}
	
	public void goToCatalogue()
	{
		VenPrincipal.IniPanelCatalogue();
		prod.setId(1);
		SQLProducts.FindProduct(prod);
		VenPrincipal.getPanelCatalogo().getTxtBannerName().setText(prod.getName());
		if(prod.getDiscount()>0)
		{
			VenPrincipal.getPanelCatalogo().getTxtDiscount().setText(String.valueOf(prod.getDiscount())+"%");
		}
		VenPrincipal.getPanelCatalogo().getTxtPrice().setText("$"+String.valueOf(prod.getPrice()));
		VenPrincipal.getPanelCatalogo().getBtnLogIn().addActionListener(this); 
		VenPrincipal.getPanelCatalogo().getBtnMyProfile().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnBanner().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnBannerOp1().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnBannerOp2().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnBannerOp3().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B1().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B2().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B3().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B4().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B5().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B6().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC1B7().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B1().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B2().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B3().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B4().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B5().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC2B6().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC3B1().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC3B2().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC3B3().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC3B4().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B1().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B2().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B3().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B4().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B5().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnC4B6().addActionListener(this);
		VenPrincipal.getPanelCatalogo().getBtnCart().addActionListener(this);
	}
	
	public void goToCartPanel()
	{
		VenPrincipal.IniPanelCart();
		VenPrincipal.getCart().getBtnCheck().setVisible(true);
		VenPrincipal.getCart().getBtnConShopping().setVisible(true);
		VenPrincipal.getCart().getScrollPane().setVisible(true);
		VenPrincipal.getCart().getPanelFinalMessage().setVisible(false);
		VenPrincipal.getCart().getBtnCheck().addActionListener(this);
		VenPrincipal.getCart().getBtnConShopping().addActionListener(this);
		VenPrincipal.getCart().getBtnGoBack().addActionListener(this);
		calculateTotal();
		VenPrincipal.getCart().getTable().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				String newQuantity = "";
				if(VenPrincipal.getCart().getTable().getSelectedRow() != -1)
				{
					int row = VenPrincipal.getCart().getTable().getSelectedRow();
					int column = VenPrincipal.getCart().getTable().getSelectedColumn();
					newQuantity = VenPrincipal.getCart().getTable().getModel().getValueAt(row, 1).toString();
					prod.setName(VenPrincipal.getCart().getTable().getModel().getValueAt(row, 0).toString());
					SQLProducts.FindProductName(prod);					
					float fPrice = prod.getPrice();
					int Quantity = 0;
					
										
					if(column == 3)
					{
						Quantity = Integer.parseInt(newQuantity)+1;				
						VenPrincipal.getCart().getTable().getModel().setValueAt(Quantity,row,1);
						fPrice*=Quantity;
						VenPrincipal.getCart().getTable().getModel().setValueAt(fPrice,row,2);
					}else if(column == 4)
					{
						Quantity = Integer.parseInt(newQuantity)-1;
						VenPrincipal.getCart().getTable().getModel().setValueAt(Quantity,row, 1);
						fPrice*=Quantity;
						VenPrincipal.getCart().getTable().getModel().setValueAt(fPrice,row,2);
						if(VenPrincipal.getCart().getTable().getModel().getValueAt(row, 1).equals(0)) {
							((DefaultTableModel) VenPrincipal.getCart().getTable().getModel()).removeRow(row);
						}
					}else if(column == 5)
					{					
						((DefaultTableModel) VenPrincipal.getCart().getTable().getModel()).removeRow(row);					
					}
					calculateTotal();
				}
				
			}
		});		
	}	
	
	public void OpenUserProfileWin() 
	{
		VenUsuario.getBtnDelete().addActionListener(this);
		VenUsuario.getBtnEdit().addActionListener(this);
		VenUsuario.getBtnPurHistory().addActionListener(this);
		VenUsuario.getBtnSaveEdit().addActionListener(this);
		VenUsuario.getBtnWishlist().addActionListener(this);		
	}
	
	public void OpenProductWin() 
	{
		VenProducto.getBtnDelete().addActionListener(this);
		VenProducto.getBtnEdit().addActionListener(this);
		VenProducto.getBtnSaveEdit().addActionListener(this);		
	}
	
	public void goToAdmPanel()
	{
		VenPrincipal.IniAdmPanel();
		VenPrincipal.getPanelAdmin().getBtnDelete().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnEdit().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnProducts().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnSales().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnUsersList().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnSaveEdit().addActionListener(this);
		VenPrincipal.getPanelAdmin().getBtnGoBack().addActionListener(this);
	}
	
	public void goToUserPanel()
	{
		VenPrincipal.IniUserPanel();
		VenPrincipal.getPanelUsuario().getBtnDelete().addActionListener(this);
		VenPrincipal.getPanelUsuario().getBtnEdit().addActionListener(this);
		VenPrincipal.getPanelUsuario().getBtnPurHistory().addActionListener(this);
		VenPrincipal.getPanelUsuario().getBtnWishlist().addActionListener(this);//not coded		
		VenPrincipal.getPanelUsuario().getBtnSaveEdit().addActionListener(this);
		VenPrincipal.getPanelUsuario().getBtnGoBack().addActionListener(this);
	}
	
	/*
	 * Utilities
	 */
	
	public void addProfits() {
		for(int i=0; i < VenPrincipal.getCart().getTable().getRowCount(); i++)
		{			
			prod.setName(VenPrincipal.getCart().getTable().getValueAt(i, 0).toString());
			SQLProducts.FindProductName(prod);
			prod.setQtStored(prod.getQtStored()-Integer.parseInt(VenPrincipal.getCart().getTable().getValueAt(i,1).toString()));
			prod.setQtSold(prod.getQtSold()+Integer.parseInt(VenPrincipal.getCart().getTable().getValueAt(i,1).toString()));
			prod.setProfit(prod.getProfit()+Float.parseFloat(VenPrincipal.getCart().getTable().getValueAt(i,2).toString()));
			SQLProducts.ModifyProduct(prod);
			ord = new Orders();			
			ord.setTotal(Float.parseFloat(VenPrincipal.getCart().getTxtTotal().getText()));
			SQLorder.RegisterOrder(ord);
		}		
	}
	
	public void TableUsers(DefaultTableModel model) {
		VenPrincipal.getPanelAdmin().getTables().setModel(model);
	}
	public void TableProducts(DefaultTableModel model) {
		VenPrincipal.getPanelAdmin().getTables().setModel(model);
	}
	
	public void addToCart(int id)
	{		
		boolean inCart = false;
		JButton Add= new JButton("+");	
		Add.setFont(new Font("Saudagar", Font.PLAIN, 30));
		Add.setContentAreaFilled(false);
		JButton Remove= new JButton("-");
		Remove.setContentAreaFilled(false);
		Remove.setFont(new Font("Saudagar", Font.PLAIN, 30));
		JButton Delete= new JButton("x");
		Delete.setContentAreaFilled(false);
		Delete.setFont(new Font("Saudagar", Font.PLAIN, 30));		
		
		prod.setId(id);
		SQLProducts.FindProduct(prod);
		for(int i=0; i < VenPrincipal.getCart().getTable().getRowCount(); i++ ) {
			if(prod.getName().equals(VenPrincipal.getCart().getTable().getValueAt(i, 0)))
			{				
				inCart=true;
			}		
			
		}
		if(!inCart)
		{			
			VenPrincipal.getCart().getModel().addRow(new Object[] {
					prod.getName(),					
					1,
					prod.getPrice()-prod.getPrice()*prod.getDiscount()/100,
					Add,Remove,Delete});
		}
		
	}
	public void calculateTotal() {
		float total=0;
		for(int i=0; i < VenPrincipal.getCart().getTable().getRowCount(); i++ ) {
			if (VenPrincipal.getCart().getTable().getValueAt(i, 2) != null)
			{		
				
				total += (float)VenPrincipal.getCart().getTable().getValueAt(i, 2);
				
			}					
		}
		VenPrincipal.getCart().getTxtTotal().setText(String.valueOf(total));;
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
	
	public void Sleep(int i)
	{
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e1) {				
			e1.printStackTrace();
		}
	}

}
