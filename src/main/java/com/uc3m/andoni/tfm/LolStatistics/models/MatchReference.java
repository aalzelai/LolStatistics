package com.uc3m.andoni.tfm.LolStatistics.models;

public class MatchReference {
	String lane;
	long gameId;
	int champion;
	String platformId;
	int season;
	int queue;
	String role;
	long timestamp;

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public int getChampion() {
		return champion;
	}

	public void setChampion(int champion) {
		this.champion = champion;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getQueue() {
		return queue;
	}

	public void setQueue(int queue) {
		this.queue = queue;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override public String toString() {
		return "MatchReference{" + "lane='" + lane + '\'' + ", gameId=" + gameId + ", champion=" + champion + ", platformId='" + platformId
				+ '\'' + ", season=" + season + ", queue=" + queue + ", role='" + role + '\'' + ", timestamp=" + timestamp + '}';
	}
}
