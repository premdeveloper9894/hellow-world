# ***youtube notes***



1\. Need to JDBC driver , So download it from chrome, Search

&nbsp;  Mysql jdbc driver jar download.

2.Configure build path .

&nbsp; \[ add jar file (driver connected successfullu) ]

3.Using try catch block for handle exception.

4\. Add driver 

&nbsp;   Driver d = new com.mysql.cj.jdbc.Driver();

&nbsp;   DriverManager.registerDriver(d);

5\. We have to create the connection.

&nbsp;   Connection con =  DriverManager.getConnection("jdbc:mysql://localhost: 3306/mydatabse", "root" , "root");



6.Create Statement (use to send query to server ,then deliver to that record to me).  



7\. We are store deliver record using resulset keyword.

&nbsp;   ResultSet res = st.executeQuery(Query);

&nbsp;             (or)

&nbsp;   ResultSet res = st.executeQuery(Select\*from emp);



8\. We can do the process using while loop









# ***Kavitha Mam***



Driver d = new com.mysql.cj.jdbc.Driver();

&nbsp;DriverManager.registerDriver(d);



&nbsp;Connection con =  DriverManager.getConnection("jdbc:mysql://localhost: 3306/mydatabse", "root" , "root");

&nbsp;

&nbsp;Statement st =con.createStatement();

&nbsp;String Query = "select \* from emp";

&nbsp;

&nbsp;ResultSet res = st.executeQuery(Query);

&nbsp;System.out.println(res + "row inserted");

