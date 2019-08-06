package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class MatchList {
	List<MatchReference> matches;
	int totalGames;
	int startIndex;
	int endIndex;

	public List<MatchReference> getMatches() {
		return matches;
	}

	public void setMatches(List<MatchReference> matches) {
		this.matches = matches;
	}

	public int getTotalGames() {
		return totalGames;
	}

	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	@Override public String toString() {
		return "MatchList{" + "matches=" + matches + ", totalGames=" + totalGames + ", startIndex=" + startIndex + ", endIndex=" + endIndex
				+ '}';
	}
}
