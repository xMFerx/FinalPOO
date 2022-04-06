package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLcstmMethods extends SQLconnection{
	
	public boolean SignUpUser(User us)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "INSERT INTO customers (cstmName, cstmUserName, cstmPass, cstmCity, cstmEmail, cstmTel, cstmBirthday, cstmRegisterDate) VALUES (?,?,?,?,?,?,?,?)";
		
		try 
		{
			
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getUserName());
			ps.setString(3, us.getPassword());
			ps.setString(4, us.getCity());
			ps.setString(5, us.getEmail());
			ps.setLong(6, us.getTelephone());
			ps.setDate(7, (Date) us.getbirthday());
			ps.setString(8, us.getRegisterDate());					
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

	public boolean ModifyUser(User us)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "UPDATE customers SET cstmName=?, cstmUserName=?, cstmPass=?, cstmCity=?, cstmEmail=?, cstmTel=?, cstmBirthday=?, cstmRegisterDate=? WHERE idcstm=?";
		
		try 
		{
			
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getUserName());
			ps.setString(3, us.getPassword());
			ps.setString(4, us.getCity());
			ps.setString(5, us.getEmail());
			ps.setLong(6, us.getTelephone());
			ps.setDate(7, (Date) us.getbirthday());
			ps.setString(8, us.getRegisterDate());
			ps.setInt(9, us.getId());
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
	
	public boolean DeleteUser(User us)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "DELETE FROM customers WHERE idcstm=?";
		
		try 
		{			
			ps = con.prepareStatement(sql);
			ps.setInt(1, us.getId());
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

	public boolean FindUser(User us)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM customers WHERE cstmUserName=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getUserName());
			rs = ps.executeQuery();
			
			if (rs.next())
			{
				us.setId(rs.getInt("idcstm"));
				us.setName(rs.getString("cstmName"));
				us.setUserName(rs.getString("cstmUserName"));							
				us.setPassword(rs.getString("cstmPassword"));
				us.setCity(rs.getString("cstmCity"));
				us.setEmail(rs.getString("cstmEmail"));
				us.setTelephone(rs.getInt("cstmTel"));
				us.setbirthday(rs.getDate("cstmBirthday"));
				us.setRegisterDate(rs.getString("cstmRegisterDate"));	
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
	
	public boolean LogInUser(User us)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT idcstm, cstmUserName, cstmPass, cstmEmail, cstmName, cstmCity, cstmRegisterDate, cstmBirthday, cstmTel FROM customers WHERE cstmUserName=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getUserName());
			rs = ps.executeQuery();
			
			if (rs.next())
			{
				if(us.getPassword().equals(rs.getString(3)))
				{
					us.setId(rs.getInt(1));	
					us.setEmail(rs.getString(4));
					us.setName(rs.getString(5));
					us.setCity(rs.getString(6));
					us.setRegisterDate(rs.getString(7));
					us.setbirthday(rs.getDate(8));
					us.setTelephone(rs.getInt(9));					
					return true;
				}
				else
				{
					return false;
				}	
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
