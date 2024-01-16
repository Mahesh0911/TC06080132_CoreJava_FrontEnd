package database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DBDemo {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found.");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tns","root","Mahesh@09");
		System.out.println("Established Connection.");
		
		
		/*
		PreparedStatement preparedStatement=conn.prepareStatement("insert into employee values(?,?,?)");				

		int id;
		String nameString;
		float salary;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ID :");
		id=scanner.nextInt();
		System.out.println("Enter Name :");
		nameString=scanner.next();
		System.out.println("Enter Salary :");
		salary=scanner.nextFloat();
	
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, nameString);
		preparedStatement.setFloat(3, salary);
		
		//executeUpdate() returns the 1 if query runs successfully.
		int output=preparedStatement.executeUpdate();
		if(output > 0) {
			System.out.println("Employee record is inserted successfully .");			
		}else {
			System.out.println("Insertion Failed.");
		}
		
		*/
		
		PreparedStatement pstmt1=conn.prepareStatement("select * from employee");
		ResultSet rs=pstmt1.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " "+ rs.getString(2)+" "+rs.getFloat(3));
		}
	}

}

/*
 * 	JDBC : Java Database Connectivity
 * 	MySQL
 * 	JDBC API
 * 	DRIVER : Thin Driver - Type IV - Fully Written Java
 * 	MYSQL Driver
 * 	
 * 	Steps :
 * 		1. Register the Driver
 * 		2. Establish the connection
 * 		3. Prepare Statement
 * 		4. Execute the Query
 * 		5. ResultSet
 * 		6. Close the connection
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */