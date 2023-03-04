package industry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchTheDataFromTheDataBase {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/industry","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("Select * from it where e_id=?");
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the Employee id");
			int e_id=scanner.nextInt();
			preparedStatement.setInt(1, e_id);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			System.out.println("E_id:"+resultSet.getInt(1)+" E_name:"+resultSet.getString(2)+" E_P.No:"+resultSet.getLong(3)+" E_Sal:"+resultSet.getDouble(4));
			System.out.println("Successfully fetched the data from the respective table");
		}
}