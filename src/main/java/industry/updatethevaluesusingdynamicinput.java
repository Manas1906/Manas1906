package industry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updatethevaluesusingdynamicinput {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/industry","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update it set e_name=?, e_sal=? where e_id=?");
			Scanner scanner=new Scanner(System.in);
		    System.out.println("Enter the employee name");
		    String e_name=scanner.next();
		    System.out.println("Enter the employee salary");
		    double e_sal=scanner.nextLong();
		    System.out.println("Enter the employee id");
		    int e_id=scanner.nextInt();
		    preparedStatement.setString(1, e_name);
		    preparedStatement.setDouble(2, e_sal);
		    preparedStatement.setInt(3, e_id);
		    preparedStatement.execute();
		    System.out.println("The values are updated in the respective table");
		    }

		}
