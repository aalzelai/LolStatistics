package com.uc3m.andoni.tfm.LolStatistics.models;

public class LeagueEntry {

	String queueType;
	String summonerName;
	boolean hotStreak;
	MiniSeries miniSeries;
	int wins;
	boolean veteran;
	int loses;
	String rank;
	String leagueId;
	boolean inactive;
	boolean freshBlood;
	String tier;
	String summonerId;
	int leaguePoints;

	public String getQueueType() {
		return queueType;
	}

	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}

	public String getSummonerName() {
		return summonerName;
	}

	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}

	public boolean isHotStreak() {
		return hotStreak;
	}

	public void setHotStreak(boolean hotStreak) {
		this.hotStreak = hotStreak;
	}

	public MiniSeries getMiniSeries() {
		return miniSeries;
	}

	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public boolean isVeteran() {
		return veteran;
	}

	public void setVeteran(boolean veteran) {
		this.veteran = veteran;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public boolean isFreshBlood() {
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood) {
		this.freshBlood = freshBlood;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public void setSummonerId(String summonerId) {
		this.summonerId = summonerId;
	}

	public int getLeaguePoints() {
		return leaguePoints;
	}

	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}

	@Override public String toString() {
		return "LeagueEntry{" + "queueType='" + queueType + '\'' + ", summonerName='" + summonerName + '\'' + ", hotStreak=" + hotStreak
				+ ", miniSeries=" + miniSeries + ", wins=" + wins + ", veteran=" + veteran + ", loses=" + loses + ", rank='" + rank + '\''
				+ ", leagueId='" + leagueId + '\'' + ", inactive=" + inactive + ", freshBlood=" + freshBlood + ", tier='" + tier + '\''
				+ ", summonerId='" + summonerId + '\'' + ", leaguePoints=" + leaguePoints + '}';
	}
}
