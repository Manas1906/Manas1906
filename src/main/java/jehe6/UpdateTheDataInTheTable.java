package jehe6;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class UpdateTheDataInTheTable {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe6","root","root");
	System.out.println("Connection established");
	Statement statement=connection.createStatement();
	statement.execute("update Students set S_Name='Amulya',S_eId='amulya@gmail.com' where S_Id=2");
	System.out.println("data updated succesfully in the respective role in the table which is present in the database");
	}
	}