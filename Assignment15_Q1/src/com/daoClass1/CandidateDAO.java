package com.daoClass1;

import java.util.*;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CandidateDAO implements AutoCloseable{
	private Connection con;
	private PreparedStatement saveSmt;
	private PreparedStatement updateNewSmt;
	private PreparedStatement deleteByIdsmt;
	private PreparedStatement findByIdsmt;
	private PreparedStatement findAllSmt;
	private PreparedStatement findbyPartySmt;
	private PreparedStatement partywiseVotes;
	
	
	
	
	
	public CandidateDAO() throws Exception{
		con = DBUtil.getConnection();
		String qry1 = "INSERT INTO candidates VALUES(default,?,?,?)";
		String qry2 = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
		String qry3 = "DELETE FROM candidates WHERE id=?";
		String qry4 = "SELECT * FROM candidates WHERE id=?";
		String qry5 = "SELECT * FROM candidates WHERE party=?";
		String qry6 = "SELECT * FROM candidates";
		String qry7 = "SELECT party, SUM(votes) 'Total_votes' from candidates GROUP BY party";
		saveSmt = con.prepareStatement(qry1);
		updateNewSmt = con.prepareStatement(qry2);
		deleteByIdsmt = con.prepareStatement(qry3);
		findByIdsmt = con.prepareStatement(qry4);
		findAllSmt = con.prepareStatement(qry6);
		findbyPartySmt = con.prepareStatement(qry5);
		partywiseVotes = con.prepareStatement(qry7);
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(saveSmt != null)
				saveSmt.close();
			
			if(updateNewSmt != null)
				updateNewSmt.close();
			
			if(deleteByIdsmt != null)
				deleteByIdsmt.close();
			
			if(findByIdsmt != null)
				findByIdsmt.close();
			
			if(findAllSmt != null)
				findAllSmt.close();
			
			if(findbyPartySmt != null)
				findbyPartySmt.close();
			
			if(partywiseVotes != null)
				partywiseVotes.close();
			
			if(con != null) {
				con.close();
				}
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		public  int acceptCandidate(CandidatePOJO c) throws Exception{
			saveSmt.setString(1, c.getName());
			saveSmt.setString(2, c.getParty());
			saveSmt.setInt(3, c.getVotes());
			int cnt = saveSmt.executeUpdate();
			return cnt;
		}
		
		public int updateCandidate(CandidatePOJO c) throws Exception{
			updateNewSmt.setString(1, c.getName());
			updateNewSmt.setString(2, c.getParty());
			updateNewSmt.setInt(3, c.getVotes());
			int cnt = updateNewSmt.executeUpdate();
			return cnt;
		}
		
		public int deleteCandidate(int id) throws Exception{
			deleteByIdsmt.setInt(1, id);
			int cnt = deleteByIdsmt.executeUpdate();
			return cnt;
		}
		
		public List<CandidatePOJO> findAllCandid(CandidatePOJO c) throws Exception{
			List<CandidatePOJO> list = new ArrayList<>();
			try(ResultSet rs = findAllSmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					CandidatePOJO c1 = new CandidatePOJO(id, name, party, votes);
					list.add(c1);
					}
					return list;
				}
			}
		
		public CandidatePOJO findByID(int id) throws Exception{
			try(ResultSet rs = findByIdsmt.executeQuery()) {
				CandidatePOJO c1 = new CandidatePOJO();
				if(rs.next()) {
					int id1 = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					c1.setId(id1);
					c1.setName(name);
					c1.setParty(party);
					c1.setVotes(votes);
				}
				return c1;
			}
		}
		
		public List<CandidatePOJO> findByParty(String party) throws Exception{
			List<CandidatePOJO> list = new ArrayList<CandidatePOJO>();
			try(ResultSet rs = findbyPartySmt.executeQuery()) {
				CandidatePOJO c1 = new CandidatePOJO();
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party1 = rs.getString("party");
					int votes = rs.getInt("votes");
					c1.setId(id);
					c1.setName(name);
					c1.setParty(party1);
					c1.setVotes(votes);
					list.add(c1);
				}
				return list;
			}
		}
		
		public List<PartyVotesPOJO> getPartywiseVotes(PartyVotesPOJO c) throws Exception{
			List<PartyVotesPOJO> list = new ArrayList<PartyVotesPOJO>();
			try(ResultSet rs = partywiseVotes.executeQuery()) {
				c = new PartyVotesPOJO();
				while(rs.next()) {
					String party1 = rs.getString("party");
					int votes = rs.getInt("votes");
					c.setParty(party1);
					c.setVotes(votes);
					list.add(c);
				}
				return list;
			}
		}
		
		

}
