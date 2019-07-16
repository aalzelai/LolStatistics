package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerV4 {

    @Autowired
    RestCallingService restCallingService;

    public String getChampionRotationInfo(String summonerName){
        String result = "";

        result = restCallingService.jsonReturnRestService("/lol/summoner/v4/summoners/by-name/" + summonerName);

        return result;
    }
}
