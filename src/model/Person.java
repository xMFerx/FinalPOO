package model;


import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {

	protected int id;	
	protected String name;
	protected String userName;
	protected String password;
	protected String city;
	protected String email;
	protected long telephone;
	protected Date birthday;
	protected String RegisterDate;
	protected Date today = new Date(System.currentTimeMillis());
	protected String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[#@$%&;:'*°|]).{8,20}$";
	protected boolean validPassword;
	
	public Person() {		
		
	}
	
	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelephone() {
		return telephone;
	}
	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}
	public Date getbirthday() {
		return birthday;
	}
	public void setbirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public String getRegisterDate() {
		return RegisterDate;
	}

	public void setRegisterDate(String registerDate) {
		RegisterDate = registerDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;		
	}
	public String getPassword() {
		return password;
	}
	public boolean setPassword(String password) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		
		validPassword =  matcher.matches();
		
		if(validPassword)
		{
			this.password = password;
			return false;
		}
		else
		{
			return true;
		}		
	}
	
}
