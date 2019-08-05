package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.LeagueEntry;
import com.uc3m.andoni.tfm.LolStatistics.models.LeagueList;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.LeagueV4;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.SummonerV4;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.logging.Logger;

@RestController
public class LeagueV4Controller {

	@Autowired LeagueV4 leagueV4Consumer;

	@Autowired SummonerV4 summonerV4;

	@Autowired MappingService mappingService;

	private static final Logger LOGGER = Logger.getLogger(LeagueV4Controller.class.getName());

	@GetMapping("/challengerleagues/by-queue/{queue}")
	public String getChallengerLeaguesByQueue(@PathVariable String queue){
		LOGGER.info("CHALLENGER LEAGUE FOR QUEUE - " + queue);
		LeagueList leagueList = (LeagueList) mappingService.map(leagueV4Consumer.getChallengerLeaguesByQueue(queue), Constants.GET_CHALLENGER_LEAGUE);
		return leagueList.toString();
	}

	@GetMapping("/getEntries/by-summoner/{summoner}")
	public String getEntriesBySummoner(@PathVariable String summoner){
		Summoner summonerObj = (Summoner) mappingService.map(summonerV4.getSummonerBySummonerName(summoner), Constants.GET_SUMMONER_NAME);
		LOGGER.info("ENTRIES FOR SUMMONER - " + summonerObj.getName());
		Set<LeagueEntry> entries = (Set) mappingService.map(leagueV4Consumer.getEntriesBySummoner(summonerObj.getId()), Constants.ENTRIES_BY_SUMMONER);
		return entries.toString();
	}

	@GetMapping("/getAllTheLeagueEntries/{queue}/{tier}/{division}")
	public String getAllLeagueEntries(@PathVariable String division, @PathVariable String tier, @PathVariable String queue){
		LOGGER.info("GETTING LEAGUE INFO FOR - " + tier + division + " on " + queue);
		Set<LeagueEntry> entries = (Set) mappingService.map(leagueV4Consumer.getAllLeagueEntries(division, tier, queue), Constants.ENTRIES_BY_SUMMONER);
		return entries.toString();
	}

	@GetMapping("/grandmasterleagues/by-queue/{queue}")
	public String getGrandmasterLeaguesByQueue(@PathVariable String queue){
		LOGGER.info("GRANDMASTER LEAGUE FOR QUEUE - " + queue);
		LeagueList leagueList = (LeagueList) mappingService.map(leagueV4Consumer.getGrandmasterLeaguesByQueue(queue), Constants.GET_CHALLENGER_LEAGUE);
		return leagueList.toString();
	}

	@GetMapping("/getLeagueInfo/{leagueId}")
	public String getLeagueInfo(@PathVariable String leagueId){
		LOGGER.info("GET LEAGUE INFO FOR - " + leagueId);
		LeagueList leagueList = (LeagueList) mappingService.map(leagueV4Consumer.getLeagueInfo(leagueId), Constants.GET_CHALLENGER_LEAGUE);
		return leagueList.toString();
	}


	@GetMapping("/masterleagues/by-queue/{queue}")
	public String getMasterLeaguesByQueue(@PathVariable String queue){
		LOGGER.info("GRANDMASTER LEAGUE FOR QUEUE - " + queue);
		LeagueList leagueList = (LeagueList) mappingService.map(leagueV4Consumer.getMasterLeaguesByQueue(queue), Constants.GET_CHALLENGER_LEAGUE);
		return leagueList.toString();
	}

}
