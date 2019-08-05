package com.uc3m.andoni.tfm.LolStatistics.models;

public class MiniSeries {
	String progress;
	int loses;
	int target;
	int wins;

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override public String toString() {
		return "MiniSeries{" + "progress='" + progress + '\'' + ", loses=" + loses + ", target=" + target + ", wins=" + wins + '}';
	}
}
