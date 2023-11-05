package com.jdbcPrac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class DbConnector {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String qry1 = "INSERT INTO candidates VALUES (default, ?, ?, ?)";
		String qry2 = "SELECT * FROM candidates";
		String qry3 = "UPDATE candidates SET votes = votes + 1 WHERE id = ?";
		String qry4 = "DELETE FROM candidates WHERE id = ?";
		String qry5 = "SELECT * FROM candidates WHERE id = ?";
		String qry6 = "SELECT * FROM candidates WHERE party = ?";
		String qry7 = "SELECT party, SUM(votes) 'TOTAL_VOTES'FROM candidates GROUP BY party";
		
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){
			String sql = "";
			int choice = -1;
			while(choice != 0) {
				System.out.println("0. Exit");
				System.out.println("1. Insert new candidate.");
				System.out.println("2. Display all candidates.");
				System.out.println("3. Increment votes of candidate with given id.");
				System.out.println("4. Delete candidate with given id.");
				System.out.println("5. Find candidate of given id.");
				System.out.println("6. Find candidates of given party.");
				System.out.println("7. Display total votes for each party.");
				System.out.println("Enter your choice.");
				choice = sc.nextInt();
	
		
				switch(choice) {
				case 1:
					sql = qry1;
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter party: ");
						String party = sc.next();
						
						System.out.println("Enter Name: ");
						String name = sc.next();

						System.out.println("Enter votes: ");
						int votes = sc.nextInt();
						
						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: " + count);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					break;
				case 2:
					sql = qry2;
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
					break;
				
					case 3:
						sql = qry3;
						try(PreparedStatement stmt = con.prepareStatement(sql)){
							System.out.println("Enter the id of the candidate: ");
							int id3 = sc.nextInt();
							
							stmt.setInt(1, id3);
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
						break;
				
					case 4: 
						sql = qry4;
						try(PreparedStatement stmt = con.prepareStatement(sql)){
							System.out.println("Enter the id of the candidate: ");
							int id4 = sc.nextInt();
							
							stmt.setInt(1, id4);
							
							int count = stmt.executeUpdate();
							System.out.println("Rows Affected: " + count);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
						break;
				
					case 5:
						sql = qry5;
						try(PreparedStatement stmt = con.prepareStatement(sql)){
							System.out.println("Enter candidate id: ");
							int id5 = sc.nextInt();
							stmt.setInt(1, id5);
							try(ResultSet rs = stmt.executeQuery()) {
								while(rs.next()) {
									int id = rs.getInt("id");
									String name = rs.getString("name");
									String party = rs.getString("party");
									int votes = rs.getInt("votes");
									System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
								}
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					}
						break;
				case 6:
					sql = qry6;
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.println("Enter party name: ");
						String party6 = sc.next();
						stmt.setString(1, party6);
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
					
					break;
				case 7:
					sql = qry7;
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						try(ResultSet rs = stmt.executeQuery()) {
							while(rs.next()) {
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%s, %d\n",party, votes);
							}
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
					
					break;
				}
			
			}
				
			System.out.println("Thank you for using this app.");
			}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
