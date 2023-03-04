package Facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PerformCrudOperationsUsingSwitchCase {

	static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "root");
	boolean b= true;
	while (b) {
	System.out.println("Select 1. Insert 2. Update 3. Retrieve 4. Delete 5. Recieve based on ID 6. Exit");
	int a=scn.nextInt();
	switch (a) {
	case 1: {
	PreparedStatement preparedStatement = con.prepareStatement("insert into manas values(?,?,?,?,?,?)");
	System.out.println("enter your User_id");
	int User_id= scn.nextInt();
	System.out.println("enter your first name");
	String FirstName= scn.next();
	System.out.println("enter your last name");
	String LastName= scn.next();
	System.out.println("enter your password");
	String Password=scn.next();
	System.out.println("enter your email id");
	String Email_id=scn.next();
	System.out.println("enter your phone no");
	int Phone_no=scn.nextInt();
	preparedStatement.setInt(1, User_id);
	preparedStatement.setString(2, FirstName);
	preparedStatement.setString(3, LastName);
	preparedStatement.setString(4, Password);
	preparedStatement.setString(5, Email_id);
	preparedStatement.setInt(6, Phone_no);
	preparedStatement.execute();
	System.out.println("Succefully saved");
	break;
}
	
	case 2:{
		System.out.println("enter id which is to be updated");
		PreparedStatement preparedStatement=con.prepareStatement("update manas set FirstName=? where User_id=?");
		System.out.println("enter user id");
		Scanner scn=new Scanner(System.in);
		int User_id=scn.nextInt();
		System.out.println("Enter First name");
		String FirstName=scn.next();
		preparedStatement.setInt(1, User_id);
		preparedStatement.setString(2, FirstName);
		preparedStatement.execute();
		System.out.println("Succefully done");
		break;
	}
	
	case 4:{
		System.out.println("enter user id to delete from manas");
		PreparedStatement preparedStatement=con.prepareStatement("delete from manas where User_id=?");
		int User_id=scn.nextInt();
		preparedStatement.setInt(1, User_id);
		preparedStatement.execute();
		System.out.println("Succefully deleted");
		break;
	}
	
	case 5:{
		System.out.println("enter id to fetch details");
		PreparedStatement preparedStatement=con.prepareStatement("Select * from manas where User_id=?");
		int User_id=scn.nextInt();
		preparedStatement.setInt(1, User_id);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getInt(6));
		}
		break;
	}
	
	case 3:{
		PreparedStatement preparedStatement=con.prepareStatement("Select * from manas");
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getInt(6));
		}
		break;
	}
	
	case 6: {
		System.out.println("********Thank You*********");
		b=false;
	}
	}
	}
	con.close();
	}
	}