package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.LolStatusData;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.LolStatusV3;
import com.uc3m.andoni.tfm.LolStatistics.services.MappingService;
import constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class LolStatusV3Controller {

	@Autowired
	LolStatusV3 lolStatusV3Consumer;
	@Autowired
	MappingService mappingService;

	private static final Logger LOGGER = Logger.getLogger(ChampionV3Controller.class.getName());

	@GetMapping(path = "/lolStatus")
	public String get() {
		String finalResult = "";
		LolStatusData statusData;
		LOGGER.info("LOL STATUS DATA - GET");
		String result =  lolStatusV3Consumer.getLolStatusData();
		LolStatusData lolStatusData = (LolStatusData) mappingService.map(result, Constants.LOL_STATUS_DATA);
		LOGGER.info("LOL STATUS DATA - GET - OK");
		return lolStatusData.toString();
	}

}
