package JDBC;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connection_JDBC {



   static List connectionDB(String db_name) throws SQLException ,ClassNotFoundException {
	   Class.forName("com.mysql.cj.jdbc.Driver");
       	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ db_name ,"root","root");
       	 
     	Statement st= con.createStatement();
         List li = new ArrayList();
         li.add(con);
         li.add(st);
         

    	 return li;
    }
   
	
}
