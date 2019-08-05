package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class Match {
	int seasonId;
	int queueId;
	int gameId;
	List<ParticipantIdentity> participantIdentities;
	String gameVersion;
	String platformId;
	String gameMode;
	String mapId;
	String gameType;
	List<TeamStats> teams;
	List<Participant> participants;
	long gameDuration;
	long gameCreation;

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public int getQueueId() {
		return queueId;
	}

	public void setQueueId(int queueId) {
		this.queueId = queueId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public List<ParticipantIdentity> getParticipantIdentities() {
		return participantIdentities;
	}

	public void setParticipantIdentities(List<ParticipantIdentity> participantIdentities) {
		this.participantIdentities = participantIdentities;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public String getMapId() {
		return mapId;
	}

	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public List<TeamStats> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamStats> teams) {
		this.teams = teams;
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	public long getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(long gameDuration) {
		this.gameDuration = gameDuration;
	}

	public long getGameCreation() {
		return gameCreation;
	}

	public void setGameCreation(long gameCreation) {
		this.gameCreation = gameCreation;
	}
}
