package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;
import java.util.Map;

public class MatchFrame {
	long timestamp;
	Map<String, MatchParticipantFrame> participantFrames;
	List<MatchEvent> events;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, MatchParticipantFrame> getParticipantFrames() {
		return participantFrames;
	}

	public void setParticipantFrames(Map<String, MatchParticipantFrame> participantFrames) {
		this.participantFrames = participantFrames;
	}

	public List<MatchEvent> getEvents() {
		return events;
	}

	public void setEvents(List<MatchEvent> events) {
		this.events = events;
	}
}
