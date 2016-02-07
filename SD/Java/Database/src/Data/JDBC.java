package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

public class JDBC
{
	private static String url = "jdbc:mysql://localhost:3306/companydb";
	private static String username = "student";
	private static String password = "student";
	private static Connection conn;
	public static ArrayList<String> row = new ArrayList<>();
	public static ArrayList<ArrayList<String>> table= new ArrayList<>();

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);

		String sqlText = "SELECT id, firstname, lastname FROM employees";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(sqlText);
		ResultSetMetaData rs1 = rs.getMetaData();
		System.out.println(rs1.getColumnCount());
		while (rs.next())

		{
			row = new ArrayList<>();
				for (int i =1; (i < rs1.getColumnCount()+1); i++)
				{
				
				row.add(rs.getString(i));
	
				}
				System.out.println("row size after for loop :" + row.size());
				ArrayList<String> temp = new ArrayList<>();
	
				table.add(row);
			
		}
		
//		System.out.println(table.get(0).size());
//for (ArrayList<String> temp : table)
//{
//	for (String string : temp)
//	{
//	System.out.println(string);	
//	}
	
//}
		rs.close();
		conn.close();
	}
}
