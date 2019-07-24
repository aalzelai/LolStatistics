package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChampionMasteryV4 {

    @Autowired
    RestCallingService restCallingService;

    public String getChampionMasteriesFromSummonerId(String summonerName){
        return restCallingService.jsonReturnRestService("/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summonerName);
    }

    public String getChampionMasteriesFromSummonerAndChampionId(String summonerName, String champion){
        return restCallingService.jsonReturnRestService("/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summonerName + "/by-champion/" + champion);
    }

}
