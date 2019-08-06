package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchV4 {

	@Autowired RestCallingService restCallingService;

	public String getMatchById(String matchId){
		return restCallingService.jsonReturnRestService("/lol/match/v4/matches/" + matchId);
	}

	public String getMatchListForSummoner(String accountId){
		return restCallingService.jsonReturnRestService("/lol/match/v4/matchlists/by-account/" + accountId);
	}
}
