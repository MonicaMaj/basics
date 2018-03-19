package mybasics.session16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectNameUsingList {
	
	public static List<Students> getStudentsByName()
	{
		List<Students> students=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
			String query="select * from students";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				//System.out.println(rs.getString("name"));
				Students stu=new Students();
				stu.setName(rs.getString("name"));
				stu.setAge(rs.getInt("age"));
				stu.setDesignation(rs.getString("designation"));
				stu.setCity(rs.getString("city"));
				stu.setCountry(rs.getString("country"));
				students.add(stu);
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return students;
		
	}
	public static void main(String[] args) {
		List<Students> students=getStudentsByName();
		students.forEach(stu -> System.out.println(stu.getName()));
		students.forEach(stu -> System.out.println(stu.getAge()));
		students.forEach(stu -> System.out.println(stu.getDesignation()));
	}
	

}
