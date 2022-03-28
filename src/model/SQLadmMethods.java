package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLadmMethods extends SQLconnection{
	public boolean SignUpAdmin(Admin adm)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "INSERT INTO administrators (admName, admUserName, admPass, admCity, admEmail, admTel, admBirthday, admRegisterDate) VALUES (?,?,?,?,?,?,?,?)";
		
		try 
		{
			
			ps = con.prepareStatement(sql);
			ps.setString(1, adm.getName());
			ps.setString(2, adm.getUserName());
			ps.setString(3, adm.getPassword());
			ps.setString(4, adm.getCity());
			ps.setString(5, adm.getEmail());
			ps.setLong(6, adm.getTelephone());
			ps.setDate(7,(Date) adm.getbirthday());
			ps.setString(8, adm.getRegisterDate());					
			ps.execute();
			return true;
		}catch(SQLException SQLex)
		{
			System.err.println(SQLex);
			return false;
		}finally
		{
			try 
			{
				con.close();				
			}catch(SQLException SQLex2)
			{
				System.err.println(SQLex2);
			}
		}
		
	}

	public boolean ModifyAdmin(Admin adm)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "UPDATE administrators SET admName=?, admUserName=?, admPass=?, admCity=?, admEmail=?, admTel=?, admBirthday=?, admRegisterDate=? WHERE idadm=?";
		
		try 
		{
			
			ps = con.prepareStatement(sql);
			ps.setString(1, adm.getName());
			ps.setString(2, adm.getUserName());
			ps.setString(3, adm.getPassword());
			ps.setString(4, adm.getCity());
			ps.setString(5, adm.getEmail());
			ps.setLong(6, adm.getTelephone());
			ps.setDate(7, (Date)adm.getbirthday());
			ps.setString(8, adm.getRegisterDate());
			ps.setInt(9, adm.getId());
			ps.execute();
			return true;
		}catch(SQLException SQLex)
		{
			System.err.println(SQLex);
			return false;
		}finally
		{
			try 
			{
				con.close();				
			}catch(SQLException SQLex2)
			{
				System.err.println(SQLex2);
			}
		}
		
	}
	
	public boolean DeleteAdmin(Admin adm)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "DELETE FROM administrators WHERE idadm=?";
		
		try 
		{			
			ps = con.prepareStatement(sql);
			ps.setInt(1, adm.getId());
			ps.execute();
			return true;
		}catch(SQLException SQLex)
		{
			System.err.println(SQLex);
			return false;
		}finally
		{
			try 
			{
				con.close();				
			}catch(SQLException SQLex2)
			{
				System.err.println(SQLex2);
			}
		}
		
	}

	public boolean FindAdmin(Admin adm)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM administrators WHERE admUserName=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, adm.getUserName());
			rs = ps.executeQuery();
			
			if (rs.next())
			{
				adm.setId(rs.getInt("idadm"));
				adm.setName(rs.getString("admName"));
				adm.setUserName(rs.getString("admUserName"));							
				adm.setPassword(rs.getString("admPassword"));
				adm.setCity(rs.getString("admCity"));
				adm.setEmail(rs.getString("admEmail"));
				adm.setTelephone(rs.getInt("admTel"));
				adm.setbirthday(rs.getDate("admBirthday"));
				adm.setRegisterDate(rs.getString("admRegisterDate"));	
				return true;
				
			}
			return false;
		}catch(SQLException SQLex)
		{
			System.err.println(SQLex);
			return false;
		}finally
		{
			try 
			{
				con.close();				
			}catch(SQLException SQLex2)
			{
				System.err.println(SQLex2);
			}
		}
		
	}
}
