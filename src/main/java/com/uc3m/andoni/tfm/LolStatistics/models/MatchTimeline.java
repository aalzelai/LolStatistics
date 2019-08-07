package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class MatchTimeline {
	List<MatchFrame> frames;
	long frameInterval;

	public List<MatchFrame> getFrames() {
		return frames;
	}

	public void setFrames(List<MatchFrame> frames) {
		this.frames = frames;
	}

	public long getFrameInterval() {
		return frameInterval;
	}

	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}
}
