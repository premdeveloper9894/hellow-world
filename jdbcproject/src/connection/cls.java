package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class cls {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student"; // database name
        String username = "root";                      // your MySQL username
        String password = "root";             // your MySQL password

        try {
            // 1. Connect to MySQL
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // 2. Create table if not exists
            String createTable = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "address VARCHAR(100)" +
                    ")";
            Statement stmt = con.createStatement();
            stmt.execute(createTable);
            System.out.println("Table created/verified.");

            // 3. Insert values
            String insert = "INSERT INTO students (id, name, address) VALUES (?, ?, ?)";
          
            PreparedStatement ps = con.prepareStatement(insert);
         
            Object[][] data = {
                {8, "Alice", "New York"},
                {9, "Bob", "California"},
                {10, "Charlie", "Texas"},
                
                {11, "Daisy", "Florida"}
            };

            for (Object[] row : data) {
                ps.setInt(1, (Integer) row[0]);
                ps.setString(2, (String) row[1]);
                ps.setString(3, (String) row[2]);

                try {
                    ps.executeUpdate();
                } catch (Exception e) {
                    // ignores duplicate inserts
                }
            }
            String delete = "DELETE FROM students WHERE id = 8";
            System.out.println("Values inserted (ignored duplicates).");

            // 4. Read & print table data
            String select = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(select);

            System.out.println("\n--- Students Table Data ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("address")
                );
                
   
            }

            con.close();
            System.out.println("\nConnection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }
}

