package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class LeagueList {

	String leagueId;
	String tier;
	List<LeagueItem> entries;
	String queue;
	String name;

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public List<LeagueItem> getEntries() {
		return entries;
	}

	public void setEntries(List<LeagueItem> entries) {
		this.entries = entries;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public String toString() {
		return "LeagueList{" + "leagueId='" + leagueId + '\'' + ", tier='" + tier + '\'' + ", entries=" + entries + ", queue='" + queue
				+ '\'' + ", name='" + name + '\'' + '}';
	}
}
