package jdbc_connection;

import java.sql.*;
public class JDBC_DEMO {

	public static void main(String[] args) throws SQLException {
		
		//First need to connection
		
		String url ="jdbc:mysql://localhost:3306/JDBC";
		String userName = "root";
		String passWord = "root";
		String query = "select * from JDBC";
		
		Connection con = DriverManager.getConnection(url, userName, passWord);
		
		// second need to statement object is used to exicute our query
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		// Move to next (row) record
		rs.next();
		
		
		// column number is the database table
		System.out.println("Id is " + rs.getInt(1));
		System.out.println("Name is " + rs.getString(2));
		System.out.println("Salary is "+ rs.getInt(3));
		
		con.close();
		
		// 3rd need to jar file [ mean changed java file in jar format ]
	}

}
