package mybasics.session16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetId {

	public static Connection getMeConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
		return con;
	}

	public static Students getIdOfStudent(int id) {
		Students stu=null;
		try {
			Connection con = getMeConnection();
			String query = "select * from students where id = ?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				stu = new Students();
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				stu.setDesignation(rs.getString("designation"));
				stu.setCity(rs.getString("city"));
				stu.setCountry(rs.getString("country"));

			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return stu;
	}
		public static void main(String[] args) {
			Students newid=getIdOfStudent(2);
			System.out.println(newid.getName());
			
		}
	
	
}
