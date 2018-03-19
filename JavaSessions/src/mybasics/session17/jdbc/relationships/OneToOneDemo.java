package mybasics.session17.jdbc.relationships;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OneToOneDemo {
	public static Connection getMeConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
		return con;
	}

	public static Citizen getCitizenData(int id) throws SQLException {
		Citizen citizen = new Citizen();
		try {

			Connection con = getMeConnection();
			String query = "select c.cname,c.cage, i.type from javatraining.citizen c join  javatraining.identity i on c.cid=i.cid where c.cid=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				citizen.setCname(rs.getString("cname"));
				citizen.setCage(rs.getString("cage"));
				Identity identity = new Identity();
				identity.setType(rs.getString("type"));
				citizen.setIdinfo(identity);
				}
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return citizen;

	}
	public static void main(String[] args) throws SQLException {
		Citizen citi=getCitizenData(1);
		System.out.println(citi.getCname());
		System.out.println(citi.getIdinfo().getType());
	}

}
