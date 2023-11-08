package com.daoClass1;

import java.util.*;

import java.sql.*;

public class Tester {
	public static CandidatePOJO accept(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		CandidatePOJO c = new CandidatePOJO(id, name, party, votes);	
		return c;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		
		
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Insert candidates.");
			System.out.println("2. Update candidate by candidate id.");
			System.out.println("3. Delete candidate by id.");
			System.out.println("4. find candidates by id.");
			System.out.println("5. find candidates by party.");
			System.out.println("6. find all candidates.");
			System.out.println("7. total votes partywise");
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("Enter candidate info:");
				try(CandidateDAO cd = new CandidateDAO()){
					CandidatePOJO cd1 = new CandidatePOJO();
					cd1 = accept(sc);
					int noOfRows = cd.acceptCandidate(cd1);
					System.out.println("Rows affected:" + noOfRows);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			
			case 2:
				System.out.println("Enter candidate info:");
				try(CandidateDAO cd = new CandidateDAO()){
					CandidatePOJO c2 = new CandidatePOJO();
					c2 = accept(sc);
					int noOfRows = cd.updateCandidate(c2);
					System.out.println("Rows affected:" + noOfRows);
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 3:
				try(CandidateDAO cd = new CandidateDAO()){
				System.out.println("Enter id:");
				int id3 = sc.nextInt();
				int noOfRows1 = cd.deleteCandidate(id3);
				System.out.println("Rows affected" + noOfRows1);
				}catch(Exception e2) {
					e2.printStackTrace();
					
				}
				break;
				
			case 4:
				try(CandidateDAO cd = new CandidateDAO()) {
					//CandidatePOJO c4 = new CandidatePOJO();
					System.out.println("Enter id:");
					int id4 = sc.nextInt();
					CandidatePOJO c4 = cd.findByID(id4);
					System.out.println(c4.toString());
					} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			
			case 5:
				try(CandidateDAO cd = new CandidateDAO()){
					List<CandidatePOJO> listCd;
					System.out.println("Enter party name:");
					String party5 = sc.next();
					listCd = cd.findByParty(party5);
					listCd.forEach(c -> System.out.println(c));
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 6:
				try(CandidateDAO cd = new CandidateDAO()){
					List<CandidatePOJO> listAll;
					
					
				}
				
				break;
				
			case 7:
				break;
			

			default:
				break;
			}
		}while(choice != 0);
		System.out.println("Thank you!");
	}

}
