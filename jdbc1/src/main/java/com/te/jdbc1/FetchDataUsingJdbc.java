package com.te.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchDataUsingJdbc {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// Creating a connection
			String url = "jdbc:mysql://localhost:3306/hyd_batch";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			// Create a query
			String query = "SELECT * FROM mybatchdetails Where traineeId = ?";

			 Scanner scan=new Scanner(System.in);
			 System.out.println("Please enter the Trainee ID: ");

			int traineeId = Integer.parseInt(scan.next());
			// Get the PreparedStatement Object and set the data
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, traineeId);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int tid = rs.getInt(1);
				String name = rs.getString("traineeName");
				int age = rs.getInt(3);
				String city = rs.getString("traineeCity");
				String gender = rs.getString("traineeGender");
				System.out.println(tid + " -------- " + name + " -------- " + age + " -------- " + gender + " -------- "
						+ "-------- " + city);

			}

			// Close the connection
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
