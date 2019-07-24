package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.ChampionMasteryDTO;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionMasteryV4;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionV3;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.SummonerV4;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class ChampionMasteryV4Controller {

    @Autowired
    ChampionMasteryV4 championV4Consumer;

    @Autowired SummonerV4 summonerV4;

    @Autowired
    MappingService mappingService;

    private static final Logger LOGGER = Logger.getLogger(ChampionMasteryV4Controller.class.getName());

    @GetMapping(path = "/getChampionMasteriesFromSummonerId/{summoner}")
    public String getChampionMasteriesFromSummonerId(@PathVariable String summoner) {
        Summoner summonerObj = (Summoner) mappingService.map(summonerV4.getSummonerBySummonerName(summoner), Constants.GET_SUMMONER_NAME);

        LOGGER.info("CHAMPION MASTERIES FOR SUMMONER - " + summonerObj.getId());
        List<ChampionMasteryDTO> championMasteryDTO = (List<ChampionMasteryDTO>) mappingService.map(championV4Consumer.getChampionMasteriesFromSummonerId(summonerObj.getId()), Constants.GET_CHAMPION_MASTERY);

        return championMasteryDTO.toString();
    }

    @GetMapping(path = "/getChampionMasteriesFromSummonerAndChampionId/{summoner}/{champion}")
    public String getChampionMasteriesFromSummonerAndChampionId(@PathVariable String summoner, @PathVariable String champion) {
        Summoner summonerObj = (Summoner) mappingService.map(summonerV4.getSummonerBySummonerName(summoner), Constants.GET_SUMMONER_NAME);

        LOGGER.info("CHAMPION MASTERIES FOR SUMMONER - " + summonerObj.getId());


        ChampionMasteryDTO championMasteryDTO = (ChampionMasteryDTO) mappingService.map(championV4Consumer.getChampionMasteriesFromSummonerAndChampionId(summonerObj.getId(), mappingService.getChampionNameMap().get(champion).getKey()), Constants.GET_CHAMPION_MASTERY_BY_CHAMPION);

        return championMasteryDTO.toString();
    }
}
