package mybasics.session17.jdbc.relationships;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManyToManyDemo {

	public static Connection getMeConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "2525");
		return con;
	}
	
	public static Recepie getRec_Ing(int id) throws SQLException {
		Recepie recobj = new Recepie();
	//	List<Recepie> reclist = new ArrayList<>();
		List<Ingredients> inglist = new ArrayList<>();
		try {
			
			Connection con = getMeConnection();
			String query = "select rec_name,ing_name from recepie r join rec_ing ri on r.rec_id=ri.rec_id join ingredients i on i.ing_id=ri.ing_id where r.rec_id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (recobj.getRec_name() == null) {
				recobj.setRec_name(rs.getString("rec_name"));
					}
				Ingredients ingobj = new Ingredients();
				ingobj.setIng_name(rs.getString("ing_name"));
				recobj.setInglist(inglist);
				inglist.add(ingobj);
		       
			}
		
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return recobj;

	}
	public static Ingredients getRec_Ing2(int id) throws SQLException {
		Ingredients ingobj = new Ingredients();
		List<Recepie> reclist = new ArrayList<>();
	//	List<Ingredients> inglist = new ArrayList<>();
		try {
			
			Connection con = getMeConnection();
			String query = "select rec_name,ing_name from recepie r join rec_ing ri on r.rec_id=ri.rec_id join ingredients i on i.ing_id=ri.ing_id where i.ing_id=?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (ingobj.getIng_name() == null) {
					ingobj.setIng_name(rs.getString("ing_name"));
					}
				Recepie recobj = new Recepie();
				recobj.setRec_name(rs.getString("rec_name"));
				ingobj.setReclist(reclist);
				reclist.add(recobj);
		       
			}
		
			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ingobj;

	}



	public static void main(String[] args) throws SQLException {
		Recepie r1 = getRec_Ing(1);
		//System.out.println(r1);
		System.out.println(r1.getRec_name());
		r1.getInglist().forEach(l -> System.out.println(l.getIng_name()));
	
		Ingredients i1 = getRec_Ing2(1);
		//System.out.println(r1);
		System.out.println(i1.getIng_name());
		i1.getReclist().forEach(l -> System.out.println(l.getRec_name()));
	

	}

}
