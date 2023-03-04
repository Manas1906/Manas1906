package jehe6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqldatabaseapplication {
  public static void main(String[] args) throws ClassNotFoundException, SQLException
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
System.out.println("Connection established");
Statement statement=connection.createStatement();
statement.execute("create database Jehe6");
System.out.println("database created succesfully");
}
}