package model;

/**
 * Clase para los usuarios o clientes  
 * @see: clase Person
 * 	 
 */
public class User extends Person{
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String verifyPassword(String Password)
	{
		if(Password.matches(super.getPassword()))
		{
			return "";
		}
		else 
		{
			return "Error, las contraseņas no coinciden";
		}			
	}
}
