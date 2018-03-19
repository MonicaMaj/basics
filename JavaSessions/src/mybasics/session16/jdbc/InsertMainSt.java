package mybasics.session16.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertMainSt {
	public static void insertStudent(Students students)
	{//stmnt
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
			String query="insert into students(name,age,designation,city,country) values('"+students.getName()+"',"+students.getAge()+",'"+students.getDesignation()+"','"+students.getCity()+"','"+students.getCountry()+"')";
			Statement pst=con.createStatement();
			
			int noOfRowsEffected = pst.executeUpdate(query);
			System.out.println(noOfRowsEffected);
			pst.close();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Students students=new Students();
		students.setName("indu");
		students.setAge(20);
		students.setDesignation("designer");
		students.setCity("karimnagar");
		students.setCountry("india");
		insertStudent(students);
		
	}

}
