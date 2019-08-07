package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class Participant {
	ParticipantStats stats;
	int participantId;
	List<Rune> runes;
	ParticipantTimeline timeline;
	int teamId;
	int spell2Id;
	List<Mastery> masteries;
	String highestAchievedSeasonTier;
	int spell1Id;
	int championId;

	public ParticipantStats getStats() {
		return stats;
	}

	public void setStats(ParticipantStats stats) {
		this.stats = stats;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public List<Rune> getRunes() {
		return runes;
	}

	public void setRunes(List<Rune> runes) {
		this.runes = runes;
	}

	public ParticipantTimeline getTimeline() {
		return timeline;
	}

	public void setTimeline(ParticipantTimeline timeline) {
		this.timeline = timeline;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getSpell2Id() {
		return spell2Id;
	}

	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}

	public List<Mastery> getMasteries() {
		return masteries;
	}

	public void setMasteries(List<Mastery> masteries) {
		this.masteries = masteries;
	}

	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}

	public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
		this.highestAchievedSeasonTier = highestAchievedSeasonTier;
	}

	public int getSpell1Id() {
		return spell1Id;
	}

	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}

	public int getChampionId() {
		return championId;
	}

	public void setChampionId(int championId) {
		this.championId = championId;
	}
}
