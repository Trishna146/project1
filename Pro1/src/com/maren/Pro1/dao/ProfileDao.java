//class profileDao  (trishna146)
package com.maren.Pro1.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.Pro1.controller.Profile;

public class ProfileDao {
//database mysql connection (trishna146)
	public static Connection getConnection()throws ClassNotFoundException,SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "tri@28");
	}
	//save methode for class profile (trishna146)
	public int save(Profile profile) {
		Connection con = null;
		Statement st = null;
		int res = 0;
		//exception handeling (trishna146)
		try {
			//get connected with database (trishna146)
			con = getConnection();
			//create statement (trishna146)
			st = con.createStatement();
			//executing query (trishna146)
			res = st.executeUpdate("INSERT INTO test.profile (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//terminate execution of function and return controll to the calling function (trishna146)
		return res;
	}
	//fetch all remaining row  (trishna146)
	public List<Profile> fetchAll() {
		List<Profile> list=null;
		Connection con = null;
		Statement st = null;
		//exception hendeling
		try {
			//get connected with database (trishna146)
			con = getConnection();
			//create statement (trishna146)
			st = con.createStatement();
			//execute query (trishna146)
			ResultSet rs = st.executeQuery("SELECT * FROM test.profile");
			if(rs != null)
				//create an array  (trishna146)
				list = new ArrayList<>();
			while(rs.next()) {
				Profile pr = new Profile();
				//set methode foe setting value and get methode for get value (trishna146)
				pr.setUserid(rs.getString("userid"));
				pr.setName(rs.getString("name"));
				pr.setEmail(rs.getString("email"));
				pr.setMobile(rs.getLong("mobile"));
				list.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			//print a stack trace for throwable object on the standard error output stream (trishna146)
				}
		}
		return list;
	}
	//main function  (trishna146)
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		//exception handeling (trishna146)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "tri@28");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM test.profile");
			while(rs.next()) {
				String id = rs.getString("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long mobile = rs.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
