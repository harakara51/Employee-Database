package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Controller.*;

public class DatabaseDAO
{
	private static String url = "jdbc:mysql://localhost:3306/companydb";
	private static String username = "student";
	private static String password = "student";
	private static Connection conn;
	private ResultSet rs;
	private ResultSetMetaData rs1;
	private employeeBean employee = new employeeBean();

	private ArrayList<String> row = new ArrayList<>();
	private ArrayList<String> rowhead = new ArrayList<>();
	private ArrayList<ArrayList<String>> table = new ArrayList<>();
	private String query;
	private String Fields;
	private String Table;
	

	public DatabaseDAO()
	{

	}
	public DatabaseDAO(String Fields, String table)
	{
		this.Fields = Fields;
		this.Table= table;
	}

	public ArrayList<ArrayList<String>> openDatabaseConnection() throws SQLException, ClassNotFoundException
	{
		//String query2 = "SELECT" + databaseController.fields + "FROM" + tables";
		query = databaseController.fields;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);

		String sqlText = query;
		Statement stmt = conn.createStatement();

		rs = stmt.executeQuery(sqlText);
		rs1 = rs.getMetaData();
		System.out.println(rs1.getColumnCount());
		
		
		for (int i = 1; (i < rs1.getColumnCount() + 1); i++)
		{
			rowhead.add((rs1.getColumnName(i)));

		}
		table.add(rowhead);
		
		while (rs.next())		
		{
			row = new ArrayList<>();
			for (int i = 1; (i < rs1.getColumnCount() + 1); i++)
			{
				row.add(rs.getString(i));
			}
			ArrayList<String> temp = new ArrayList<>();
			
			table.add(row);
		}
	rs.close();
		conn.close();
		return table; 
	}
	
	
	public void insertToDatabase (String query) throws ClassNotFoundException, SQLException 
	{
		
		System.out.println("inside  insertToDatabase method to send query to database");
		System.out.println();
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, username, password);

		String sqlText = query;
		Statement stmt = conn.createStatement();
		
		System.out.println("going to insert query to database");
		stmt.executeUpdate(sqlText);
		System.out.println("after insert query to database");
		conn.close();
		
		
	}
		
}