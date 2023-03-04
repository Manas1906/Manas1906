package jehe6;

	import java.sql.Connection;
	import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
	import java.sql.Statement;

	public class FetchOrRetrievetheDataFromTheDataBaseInTheRespectiveTable {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe6","root","root");
	System.out.println("Connection established");
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery("Select * from Students");
	while(resultSet.next()){
	System.out.println("S_Id: "+resultSet.getInt(1)+" "+"S_Name: "+resultSet.getString(2)+" "+"S_eid: "+resultSet.getString(3)+" "+"S_Pno: "+resultSet.getInt(4));
	}
	}
	}