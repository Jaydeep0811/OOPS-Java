package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBC_Get_Data {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		String dbName="testdb";
		List li= Connection_JDBC.connectionDB(dbName);
		Connection con=(Connection) li.get(0);
		Statement st=(Statement) li.get(1);
		
		
		
		try {

			String sql="select * from employee";
		
			ResultSet rs= st.executeQuery(sql);
			System.out.println(".......Empolyee Data......");
			while(rs.next()) {
				System.out.println(rs.getString("id") +" "+ rs.getString("emp_name") +" " + rs.getInt("emp_age")+" "+rs.getString("emp_gender")+"\n"  );
			}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		con.close();
		
	}
	}

}
