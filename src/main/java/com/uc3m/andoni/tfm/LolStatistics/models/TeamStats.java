package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class TeamStats {
	boolean firstDragon;
	boolean firstInhibitor;
	List<TeamBans> bans;
	int baronKills;
	boolean firstRiftHerald;
	boolean firstBaron;
	int riftHeraldKills;
	boolean firstBlood;
	int teamId;
	boolean firstTower;
	int vilemawKills;
	int towerKills;
	int dominionVictoryScore;
	String win;
	int dragonKills;

	public boolean isFirstDragon() {
		return firstDragon;
	}

	public void setFirstDragon(boolean firstDragon) {
		this.firstDragon = firstDragon;
	}

	public boolean isFirstInhibitor() {
		return firstInhibitor;
	}

	public void setFirstInhibitor(boolean firstInhibitor) {
		this.firstInhibitor = firstInhibitor;
	}

	public List<TeamBans> getBans() {
		return bans;
	}

	public void setBans(List<TeamBans> bans) {
		this.bans = bans;
	}

	public int getBaronKills() {
		return baronKills;
	}

	public void setBaronKills(int baronKills) {
		this.baronKills = baronKills;
	}

	public boolean isFirstRiftHerald() {
		return firstRiftHerald;
	}

	public void setFirstRiftHerald(boolean firstRiftHerald) {
		this.firstRiftHerald = firstRiftHerald;
	}

	public boolean isFirstBaron() {
		return firstBaron;
	}

	public void setFirstBaron(boolean firstBaron) {
		this.firstBaron = firstBaron;
	}

	public int getRiftHeraldKills() {
		return riftHeraldKills;
	}

	public void setRiftHeraldKills(int riftHeraldKills) {
		this.riftHeraldKills = riftHeraldKills;
	}

	public boolean isFirstBlood() {
		return firstBlood;
	}

	public void setFirstBlood(boolean firstBlood) {
		this.firstBlood = firstBlood;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public boolean isFirstTower() {
		return firstTower;
	}

	public void setFirstTower(boolean firstTower) {
		this.firstTower = firstTower;
	}

	public int getVilemawKills() {
		return vilemawKills;
	}

	public void setVilemawKills(int vilemawKills) {
		this.vilemawKills = vilemawKills;
	}

	public int getTowerKills() {
		return towerKills;
	}

	public void setTowerKills(int towerKills) {
		this.towerKills = towerKills;
	}

	public int getDominionVictoryScore() {
		return dominionVictoryScore;
	}

	public void setDominionVictoryScore(int dominionVictoryScore) {
		this.dominionVictoryScore = dominionVictoryScore;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public int getDragonKills() {
		return dragonKills;
	}

	public void setDragonKills(int dragonKills) {
		this.dragonKills = dragonKills;
	}
}
