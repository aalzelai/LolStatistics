package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.SummonerV4;
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

    private static final Logger LOGGER = Logger.getLogger(SummonerV4Controller.class.getName());

    @GetMapping(path = "/getSummoner/{summoner}")
        public String get(@PathVariable String summoner) {
        String finalResult = "";
        LOGGER.info("FREE CHAMPION ROTATION - GET");
        String result = summonerV4Consumer.getChampionRotationInfo(summoner);
        Summoner summonerObj = (Summoner) mappingService.map(result, Constants.GET_SUMMONER_NAME);
        return finalResult;
    }

}
