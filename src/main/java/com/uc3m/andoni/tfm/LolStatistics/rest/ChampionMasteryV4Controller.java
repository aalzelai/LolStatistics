package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionMasteryV4;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

public class ChampionMasteryV4Controller {

    @Autowired
    ChampionMasteryV4 championV4Consumer;
    @Autowired
    MappingService mappingService;

    private static final Logger LOGGER = Logger.getLogger(ChampionMasteryV4Controller.class.getName());

    @GetMapping(path = "/dfgsdfgsfg")
    public String get() {
        String finalResult = "";
        return finalResult;
        //LOGGER.info("FREE CHAMPION ROTATION - GET");
    }
}
