package com.jdbcTask2;

import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DataBaseConnect2 {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/pune";
	public static final String DB_USER = "D5-80364-ShaunakKhare";
	public static final String DB_PASSWORD = "Sunbeam";
	
	static {
		try {
		Class.forName(DB_DRIVER);
		}catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	
	
	public static void insertData(Connection con){
		//id, fname, lastname, email, password, dob, status, role
		String sql = "INSERT INTO users VALUES (default, ?, ?, ?, ?, ?, ?, ?)";
		Scanner sc = new Scanner(System.in);
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			System.out.println("Enter first name: ");
			String fname= sc.next();
			
			System.out.println("Enter Last Name: ");
			String lname = sc.next();

			System.out.println("Enter email id: ");
			String email = sc.next();
			
			System.out.println("Enter password: ");
			String password = sc.next();
			
			System.out.println("Enter date of birth: ");
			String dateStr = sc.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date uDate = sdf.parse(dateStr);
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			
			
			System.out.println("Enter status:");
			int status = sc.nextInt();
			
			System.out.println("Enter role:");
			String role = sc.next();
			
			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, email);
			stmt.setString(4, password);
			stmt.setDate(5, sDate);
			
			
			int count = stmt.executeUpdate();
			System.out.println("Rows Affected: " + count);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void display(Connection con) {
		String sql = "SELECT * FROM users";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("fname");
					String lname = rs.getString("lname");
					String  email = rs.getString("")
					int votes = rs.getInt("votes");
					System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}

	public static void deleteVoters(Connection con) throws SQLException {
		String sql = "DELETE FROM users WHERE role = 'voter' and id = ?";
		Scanner sc = new Scanner(System.in);
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			System.out.println("Enter id of the voter you want to delete:");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			int count  = pstmt.executeUpdate();
			System.out.println("Rows Affected: " + count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeStatus(Connection con) throws SQLException{
		String sql = "UPDATE users SET status = 1 WHERE role = 'voter' and id = ?";
		Scanner sc = new Scanner(System.in);
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			System.out.println("Enter id of the voter you want to delete:");
			int id = sc.nextInt();
			stmt.setInt(1, id);
			int count  = stmt.executeUpdate();
			System.out.println("Rows Affected: " + count);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeNameAndDob(Connection con) throws SQLException{
		String sql = "UPDATE users SET first_name = ?, last_name = ?, dob = ? WHERE role = 'voter'"
				+ "and id = ?";
		Scanner sc = new Scanner(System.in);
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			System.out.println();
		}
	}
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
