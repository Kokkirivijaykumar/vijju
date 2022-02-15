package com.te.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FetchingJdbc {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hyd_batch";
			String username="root";
			String password="root";
			Connection con = DriverManager.getConnection(url,username,password);
			String query=("select*from room");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+" "+rs.getInt(4));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
