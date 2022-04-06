package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLprodMethods extends SQLconnection{

	public boolean FindProduct(Products prod)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM products WHERE idProd=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setInt(1, prod.getId());
			rs = ps.executeQuery();
			
			if (rs.next())
			{
				prod.setId(rs.getInt("idProd"));
				prod.setName(rs.getString("proName"));
				prod.setPrice(rs.getFloat("proCost"));
				prod.setDiscount(rs.getInt("proDiscount"));
				prod.setQtStored(rs.getInt("proQuantity"));
				prod.setQtSold(rs.getInt("proQSold"));
				prod.setProfit(rs.getFloat("proProfit"));
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
