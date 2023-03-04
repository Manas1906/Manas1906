package jehe6;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class InsertTheDataIntoTheTable {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe6","root","root");
	System.out.println("Connection established");
	Statement statement=connection.createStatement();
	statement.execute("insert into Students values(2,'vikas','vikas@gmail.com',1234567890)");
	statement.execute("insert into Students values(3,'shivu','shivu@gmail.com',1334567890)");
	statement.execute("insert into Students values(4,'amulya','amulya@gmail.com',1344567890)");
	statement.execute("insert into Students values(5,'tejas','tejas@gmail.com',1364567890)");
	statement.execute("insert into Students values(6,'bhavna','bhavna@gmail.com',1334867890)");
	System.out.println("database created succesfully");
	}
	}