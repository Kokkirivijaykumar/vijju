package com.te.jdbc1;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class Storageprocesure {

	public static void main(String[] args) {  //throws ClassNotFoundException, SQLException
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/hyd_batch";
			String username = "root";
			String password = "root";

			Connection con = DriverManager.getConnection(url, username, password);

			String query = "{call getinfo(?)}";
			Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name :");
		CallableStatement call = con.prepareCall(query);
		call.setString(1, sc.next());
		ResultSet st= call.executeQuery();
		while(st.next()) {
			int i = st.getInt(1);
			String str = st.getString("traineeName");
			int age = st.getInt(3);
			String gender = st.getString("traineeGender");
			String city = st.getString("traineeCity");
			
			System.out.println(i+" "+str+" "+age+" "+gender+" "+city);
		}
		con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
