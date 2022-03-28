package model;

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
			return "Error, las contraseñas no coinciden";
		}			
	}
}
