package automation.JavaAdvancedConcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnetionExample {

	public static Connection con;
	public static Statement statement;
	public static ResultSet rs;
	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String userName = "root";
		String password = "Valliappan@1996";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,userName,password);
			statement = con.createStatement();
			rs = statement.executeQuery("Select * from employee_info");
			while (rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+
						rs.getString(4)+" "+rs.getString(5));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
