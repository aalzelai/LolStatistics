package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.SummonerV4;
import com.uc3m.andoni.tfm.LolStatistics.services.CassandraService;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class SummonerV4Controller {

    @Autowired
    SummonerV4 summonerV4Consumer;
    @Autowired
    MappingService mappingService;
    @Autowired CassandraService cassandraService;

    private static final Logger LOGGER = Logger.getLogger(SummonerV4Controller.class.getName());

    @GetMapping(path = "/getSummonerByName/{summoner}")
        public String get(@PathVariable String summoner) {
        LOGGER.info("SUMMONER BY SUMMONER NAME - GET");
        String result = summonerV4Consumer.getSummonerBySummonerName(summoner);
        Summoner summonerObj = (Summoner) mappingService.map(result, Constants.GET_SUMMONER_NAME);
        cassandraService.insertSummoner(summonerObj);
        return summonerObj.toString();
    }

    @GetMapping(path = "/getSummonerByAccountId/{encryptedAccountId}")
    public String getSummonerByAccountId(@PathVariable String encryptedAccountId) {
        LOGGER.info("SUMMONER BY ACCOUNT ID - GET");
        String result = summonerV4Consumer.getSummonerByAccountId(encryptedAccountId);
        Summoner summonerObj = (Summoner) mappingService.map(result, Constants.GET_SUMMONER_NAME);
        cassandraService.insertSummoner(summonerObj);
        return summonerObj.toString();
    }

    @GetMapping(path = "/getSummonerByPUUID/{encryptedPUUID}")
    public String getSummonerByPUUID(@PathVariable String encryptedPUUID) {
        LOGGER.info("SUMMONER BY PUUID - GET");
        String result = summonerV4Consumer.getSummonerByPUUID(encryptedPUUID);
        Summoner summonerObj = (Summoner) mappingService.map(result, Constants.GET_SUMMONER_NAME);
        cassandraService.insertSummoner(summonerObj);
        return summonerObj.toString();
    }

    @GetMapping(path = "/getSummonerBySummonerId/{encryptedSummonerId}")
    public String getSummonerBySummonerId(@PathVariable String encryptedSummonerId) {
        LOGGER.info("SUMMONER BY SUMMONER ID - GET");
        String result = summonerV4Consumer.getSummonerBySummonerId(encryptedSummonerId);
        Summoner summonerObj = (Summoner) mappingService.map(result, Constants.GET_SUMMONER_NAME);
        cassandraService.insertSummoner(summonerObj);
        return summonerObj.toString();
    }

}
