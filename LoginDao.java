package com.quinnox.basics.DAO;
import java.sql.*;
public class LoginDao {
public static boolean validate(String email,String pass)
{
	boolean status=false;
	try
	{
		Connection con=CustomerDAO.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from users100 where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2,pass);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
	}catch(Exception e){System.out.println(e);}
	return status;
	
}
}
