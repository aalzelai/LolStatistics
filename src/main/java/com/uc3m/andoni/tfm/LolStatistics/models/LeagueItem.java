package com.uc3m.andoni.tfm.LolStatistics.models;

public class LeagueItem {
	String summonerName;
	boolean hotStreak;
	MiniSeries miniSeries;
	int wins;
	int loses;
	boolean freshBlood;
	boolean inactive;
	String rank;
	String summonerId;
	int leaguePoints;

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

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public boolean isFreshBlood() {
		return freshBlood;
	}

	public void setFreshBlood(boolean freshBlood) {
		this.freshBlood = freshBlood;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
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
		return "LeagueItem{" + "summonerName='" + summonerName + '\'' + ", hotStreak=" + hotStreak + ", miniSeries=" + miniSeries
				+ ", wins=" + wins + ", loses=" + loses + ", freshBlood=" + freshBlood + ", inactive=" + inactive + ", rank='" + rank + '\''
				+ ", summonerId='" + summonerId + '\'' + ", leaguePoints=" + leaguePoints + '}';
	}
}
