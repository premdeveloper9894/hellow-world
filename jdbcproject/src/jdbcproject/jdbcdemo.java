package jdbcproject;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class jdbcdemo {
	
public static void main(String[] args) throws SQLException {
	
	// 1.step: Register the driver or load the driver
 Driver d = new com.mysql.cj.jdbc.Driver();
 DriverManager.registerDriver(d);

   //2.step establish the connection
 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/prem", "root" , "root");
 System.out.println("Connection created:");
 
 Statement st =con.createStatement();
 String Query = "select * from student where Sname = 'prem'";
 
 ResultSet res = st.executeQuery(Query);	
 //System.out.println(res + "row inserted");
 
 System.out.println("Id is" + res.getInt(1));
	System.out.println("String is" + res.getString(2));
	System.out.println("Id is" + res.getInt(3));
	
	System.out.println(res );

 
 
// System.out.println(res.getInt(1) +" "+res.getString(2)+" "+res.getInt(3));
 
 con.close();
	
}
}
