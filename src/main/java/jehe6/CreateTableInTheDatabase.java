package jehe6;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class CreateTableInTheDatabase {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe6","root","root");
	System.out.println("Connection established");
	Statement statement=connection.createStatement();
	statement.execute("Create Table Students(S_Id integer primary key,S_Name varchar(20) not null,S_eId varchar(30) not null,S_Pno Bigint)");
	System.out.println("table created succesfully in the database");
	}
	}