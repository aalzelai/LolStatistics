package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.Match;
import com.uc3m.andoni.tfm.LolStatistics.models.MatchList;
import com.uc3m.andoni.tfm.LolStatistics.models.MatchTimeline;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.MatchV4;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.SummonerV4;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class MatchV4Controller {

	@Autowired MatchV4 matchV4Consumer;
	@Autowired SummonerV4 summonerV4;
	@Autowired MappingService mappingService;

	private static final Logger LOGGER = Logger.getLogger(SummonerV4Controller.class.getName());

	@GetMapping(path = "getMatchById/{matchId}")
	public String getMatchById(@PathVariable String matchId){
		LOGGER.info("GET MATCH BY MATCH ID");
		String result = matchV4Consumer.getMatchById(matchId);
		Match matchObj = (Match) mappingService.map(result, Constants.GET_MATCH);
		return matchObj.toString();
	}

	@GetMapping(path = "getMatchListsByAccount/{summonerId}")
	public String getMatchListByAccount(String summonerId){
		Summoner summonerObj = (Summoner) mappingService.map(summonerV4.getSummonerBySummonerName(summonerId), Constants.GET_SUMMONER_NAME);
		LOGGER.info("MATCH HISTORY FOR SUMMONER - " + summonerObj.getName());
		MatchList matchList = (MatchList) mappingService.map(matchV4Consumer.getMatchListForSummoner(summonerObj.getAccountId()), Constants.GET_MATCH_LIST);
		return matchList.toString();


	}

	@GetMapping(path = "getMatchTimeline/{matchId}")
	public String getMatchTimelineByMatchId(String matchId){
		LOGGER.info("MATCH TIMELINE FOR MATCH - " + matchId);
		MatchTimeline matchTimeline = (MatchTimeline) mappingService.map(matchV4Consumer.getMatchTimelineByMatchId(matchId), Constants.GET_MATCH_TIMELINE);
		return  matchTimeline.toString();
	}
}
