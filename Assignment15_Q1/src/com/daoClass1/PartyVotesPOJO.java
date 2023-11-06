package com.daoClass1;

public class PartyVotesPOJO {
	private String party;
	private int votes;
	
	public PartyVotesPOJO() {
		// TODO Auto-generated constructor stub
	}

	public PartyVotesPOJO(String party, int votes) {
		this.party = party;
		this.votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "PartyVotesPOJO [party=" + party + ", votes=" + votes + "]";
	}
	
	
	
	
}
