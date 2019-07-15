package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class FreeChampionRotation {

	private List<Integer> freeChampionIds;
	private List<Integer> freeChampionIdsForNewPlayers;
	private Integer maxNewPlayerLevel;

	public List<Integer> getFreeChampionIds() {
		return freeChampionIds;
	}

	public void setFreeChampionIds(List<Integer> freeChampionIds) {
		this.freeChampionIds = freeChampionIds;
	}

	public List<Integer> getFreeChampionIdsForNewPlayers() {
		return freeChampionIdsForNewPlayers;
	}

	public void setFreeChampionIdsForNewPlayers(List<Integer> freeChampionIdsForNewPlayers) {
		this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
	}

	public Integer getMaxNewPlayerLevel() {
		return maxNewPlayerLevel;
	}

	public void setMaxNewPlayerLevel(Integer maxNewPlayerLevel) {
		this.maxNewPlayerLevel = maxNewPlayerLevel;
	}
}
