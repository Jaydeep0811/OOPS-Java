package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBC_Update_data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String dbname = "testdb";
		List li = Connection_JDBC.connectionDB(dbname);

		Connection con = (Connection) li.get(0);// this con obj
		Statement st = (Statement) li.get(1);
//		 String sqlQuery = "CREATE TABLE employee ("
//              + "id INT PRIMARY KEY, "
//              + "emp_name VARCHAR(50), "
//              + "emp_age INT, "
//              + "emp_gender VARCHAR(10))";

		String sqlQuery = "update employee set emp_name = ?, emp_age = ? where id = ?";

		try {
			PreparedStatement prst = con.prepareStatement(sqlQuery);
			prst.setString(1, "Karan");
			prst.setInt(2, 30);
			prst.setInt(3,103);

			prst.execute();
			System.out.println("updated data in employee table ..");
			
			sqlQuery="select *  from employee ";
		
			
			System.out.println(" ");
			
			System.out.print("Data is: ");
			
			ResultSet rs=st.executeQuery(sqlQuery);
			while(rs.next()) {
				System.out.println(rs.getString("id") +" "+ rs.getString("emp_name") +" " + rs.getInt("emp_age")+" "+rs.getString("emp_gender")+"\n"  );
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO: handle finally clause
			con.close();
		}

	}

}
