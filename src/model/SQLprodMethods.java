package model;

/**
 * Clase con los metodos a usar para los productos en
 * la base de datos de MySQL
 * @see: SQLconnection
 * 	 
 */
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
	
	public boolean UpdateProd(Products prod)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "UPDATE products SET proName=?, proCost=?, proDiscount=?, proQuantity=?, proQSold=?, proProfit=? WHERE idProd=?";
		
		try 
		{
			
			ps = con.prepareStatement(sql);
			ps.setString(1, prod.getName());
			ps.setFloat(2, prod.getPrice());
			ps.setInt(3, prod.getDiscount());
			ps.setInt(4, prod.getQtStored());
			ps.setInt(5, prod.getQtSold());
			ps.setFloat(6, prod.getProfit());
			ps.setInt(7, prod.getId());
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
	
	public boolean DeleteProduct(Products prod)
	{
		PreparedStatement ps = null;
		Connection con = getConnection();
		
		String sql = "DELETE FROM products WHERE idProd=?";
		
		try 
		{			
			ps = con.prepareStatement(sql);
			ps.setInt(1, prod.getId());
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
	
	public boolean FindProductName(Products prod)
	{
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = getConnection();
		
		String sql = "SELECT * FROM products WHERE proName=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setString(1, prod.getName());
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
	
	public boolean ModifyProduct(Products prod)
	{
		PreparedStatement ps = null;		
		Connection con = getConnection();
		
		String sql = "UPDATE products SET proQuantity=?, proQSold=?, proProfit=?  WHERE proName=?";
		
		try 
		{
			ps = con.prepareStatement(sql);
			ps.setInt(1, prod.getQtStored());
			ps.setInt(2, prod.getQtSold());
			ps.setFloat(3, prod.getProfit());
			ps.setString(4, prod.getName());
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
