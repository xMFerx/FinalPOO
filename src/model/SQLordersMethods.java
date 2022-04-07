package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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

}
