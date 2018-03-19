package mybasics.session16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDelete {

	public static Connection getMeConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
		return con;
	}

	public static void updateStudent(Students student) {
 
		
		try {
			Connection con = getMeConnection();
			String query = "update students set name=? where id=? ";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(2, student.getId());
			pst.setString(1, student.getName());
			
		//	System.out.println(student.getId());
			int noOfRowsEffected = pst.executeUpdate();
			System.out.println(noOfRowsEffected);
			pst.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static Students getIdOfStudent(int id) {
		Students student =null;
		try {
			Connection con = getMeConnection();
			String query = "select * from students where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				student = new Students();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setDesignation(rs.getString("designation"));
				student.setCity(rs.getString("city"));
				student.setCountry(rs.getString("country"));

			}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return student;
	}

	public static void main(String[] args) {
		Students student = getIdOfStudent(2);
        		
		//System.out.println(student.getCity());
		student.setName("aish");
		//System.out.println(student.getName());
		//newname.setId(2);
		updateStudent(student);

	}

}
