package jehe6;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DropTheTableFromTheDatabase {
		  public static void main(String[] args) throws ClassNotFoundException, SQLException
		  {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe6","root","root");
		System.out.println("Connection established");
		Statement statement=connection.createStatement();
		statement.execute("Drop table Students");
		System.out.println("table is dropped from the database");
		}
		}