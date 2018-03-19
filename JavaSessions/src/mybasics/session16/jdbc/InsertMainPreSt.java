package mybasics.session16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMainPreSt {

	public static void insertStudent(Students students)
	{//prepared stmnt
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
			String query="insert into students(name,age,designation,city,country) values(?,?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, students.getName());
			pst.setInt(2,students.getAge());
			pst.setString(3,students.getDesignation());
			pst.setString(4,students.getCity());
			pst.setString(5,students.getCountry());
			int noOfRowsEffected = pst.executeUpdate();
			System.out.println(noOfRowsEffected);
			pst.close();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Students students=new Students();
		students.setName("anusha");
		students.setAge(20);
		students.setDesignation("married");
		students.setCity("kolkatta");
		students.setCountry("india");
		insertStudent(students);
		
	}
	
}
