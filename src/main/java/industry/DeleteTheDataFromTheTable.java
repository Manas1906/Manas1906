package industry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTheDataFromTheTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/industry","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("Delete from it where e_id=?");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Employee id");
		int e_id=scanner.nextInt();
		preparedStatement.setInt(1, e_id);
		preparedStatement.execute();
		System.out.println("The data is deleted successfully from the table");
	}
}