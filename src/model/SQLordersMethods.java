package model;

/**
 * Clase con los metodos a usar para las ventas en
 * la base de datos de MySQL
 * @see: SQLconnection
 * 	 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLordersMethods extends SQLconnection{
	
	public boolean RegisterOrder(Orders ord)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "INSERT INTO orders (Date, ordTotal, fkidCstm) VALUES (?,?,?)";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setDate(1, ord.getToday());		
			ps.setFloat(2, ord.getTotal());
			ps.setInt(3, ord.getIdCstm());
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
	
	public boolean FindOrder(Orders ord)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM orders WHERE Date=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setDate(1, ord.getToday());
			rs = ps.executeQuery();
			
			if (rs.next())
			{
				ord.setToday(rs.getDate("Date"));
				ord.setIdOrder(rs.getInt("idOrder"));
				ord.setTotal(rs.getFloat("ordTotal"));
				ord.setIdCstm(rs.getInt("fkidCstm"));
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
