package industry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertvaluesintotablebyusingpreparedstatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/industry","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into it values(?,?,?,?)");
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the employee id");
    int e_id=scanner.nextInt();
    System.out.println("Enter the employee name");
    String e_name=scanner.next();
    System.out.println("Enter the employee phone number");
    long e_pno=scanner.nextLong();
    System.out.println("Enter the employee salary");
    double e_sal=scanner.nextLong();
    preparedStatement.setInt(1, e_id);
    preparedStatement.setString(2, e_name);
    preparedStatement.setLong(3, e_pno);
    preparedStatement.setDouble(4, e_sal);
    preparedStatement.execute();
    System.out.println("The values are inserted in the respective table");
    }

}
