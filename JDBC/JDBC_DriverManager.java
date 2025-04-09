package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBC_DriverManager {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbName="testdb";
		List li= Connection_JDBC.connectionDB(dbName);
		Connection con=(Connection) li.get(0);
		Statement st=(Statement) li.get(1);
		
		try {

			String sql="select * from students";
		
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("name") +" "+ rs.getInt("id") +" " + rs.getInt("age") );
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			con.close();
			System.out.println("Connection closed......");
		}
		
	}

}
