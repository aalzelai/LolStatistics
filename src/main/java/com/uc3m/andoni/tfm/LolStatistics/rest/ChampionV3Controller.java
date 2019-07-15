package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.FreeChampionRotation;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionV3;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import java.util.logging.Logger;


@RestController
public class ChampionV3Controller {

	@Autowired
    ChampionV3 championV3Consumer;
	@Autowired
	MappingService mappingService;

	private static final Logger LOGGER = Logger.getLogger(ChampionV3Controller.class.getName());

	@GetMapping(path = "/championRotation")
	public String get() {
		String finalResult = "";
        LOGGER.info("FREE CHAMPION ROTATION - GET");
        String result =  championV3Consumer.getChampionRotationInfo();
        finalResult = mappingService.map(result, Constants.FREE_CHAMPION_ROTATION);
        LOGGER.info("FREE CHAMPION ROTATION - GET - OK");
		return finalResult;
	}
}
