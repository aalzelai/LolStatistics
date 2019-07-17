package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerV4 {

    @Autowired
    RestCallingService restCallingService;

    public String getSummonerBySummonerName(String summonerName){
        return restCallingService.jsonReturnRestService("/lol/summoner/v4/summoners/by-name/" + summonerName);
    }

    public String getSummonerByAccountId(String encryptedAccountId){
        return restCallingService.jsonReturnRestService("/lol/summoner/v4/summoners/by-account/" + encryptedAccountId);
    }

    public String getSummonerByPUUID(String encryptedPUUID){
        return restCallingService.jsonReturnRestService("/lol/summoner/v4/summoners/by-puuid/" + encryptedPUUID);
    }

    public String getSummonerBySummonerId(String encryptedSummonerId){
        return restCallingService.jsonReturnRestService("/lol/summoner/v4/summoners/" + encryptedSummonerId);
    }
}
