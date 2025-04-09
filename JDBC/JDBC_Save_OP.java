package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBC_Save_OP {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbname ="testdb";
		   List li= Connection_JDBC.connectionDB(dbname);
		   
			Connection con=(Connection) li.get(0);// this con obj
			Statement st= (Statement) li.get(1);
//		 String sqlQuery = "CREATE TABLE employee ("
//                 + "id INT PRIMARY KEY, "
//                 + "emp_name VARCHAR(50), "
//                 + "emp_age INT, "
//                 + "emp_gender VARCHAR(10))";
		
		
		 String sqlQuery  ="insert into  employee values(?,?,?,?)";
		 
		 PreparedStatement prst= con.prepareStatement(sqlQuery);
		 prst.setInt(1,103);
		 prst.setString(2,"Kartik");
		 prst.setInt(3,29);
		 prst.setString(4,"Male");
		

	  prst.execute();
	   System.out.println("inserted values in employee table ..");
		
		
	}

}
