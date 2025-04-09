package JDBC;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) throws ClassNotFoundException  {
		
		String url = "jdbc:mysql://localhost:3306/testdb";

	        String user = "root";
	        String password = "root";
	        
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("MySQL JDBC Driver Registered!");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Error: MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        }

	        try {
	       
	        	Connection con= DriverManager.getConnection(url,user,password);
	        	String queryCreate= "CREATE TABLE student(id int(10),name varchar(45),class varchar(45))";
	            
	        	Statement st=con.createStatement();
	           	System.out.println("Student Table is created");
	        	
	           	String queryInsert= "insert into student values(1 ,'arti','12th')";
	         
	        	System.out.println("Student Data is inserted");
	           	String select= "select * from student";
	        	System.out.println("--- Student Data ---");
	         	ResultSet rs= st.executeQuery(select);
	 
	         	while(rs.next()) {
	         		System.out.println(rs.getInt("id") +" "+rs.getString("name") +" "+ rs.getString("class")  );
	         	}
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

      
		
	}
}
