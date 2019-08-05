package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueV4 {

	@Autowired RestCallingService restCallingService;

	public String getChallengerLeaguesByQueue(String queue){
		return restCallingService.jsonReturnRestService("/lol/league/v4/challengerleagues/by-queue/" + queue);
	}

	public String getEntriesBySummoner(String summoner){
		return restCallingService.jsonReturnRestService("/lol/league/v4/entries/by-summoner/" + summoner);
	}

	public String getAllLeagueEntries(String division, String tier, String queue){
		return restCallingService.jsonReturnRestService("/lol/league/v4/entries/" + queue + "/" + tier + "/" + division);
	}

	public String getGrandmasterLeaguesByQueue(String queue){
		return restCallingService.jsonReturnRestService("/lol/league/v4/grandmasterleagues/by-queue/" + queue);
	}

	public String getLeagueInfo(String leagueId){
		return restCallingService.jsonReturnRestService("/lol/league/v4/leagues/" + leagueId);
	}

	public String getMasterLeaguesByQueue(String queue){
		return restCallingService.jsonReturnRestService("/lol/league/v4/masterleagues/by-queue/" + queue);
	}
}
