package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.models.Champion;
import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ChampionV3 {

	@Autowired
	RestCallingService restCallingService;

	public String getChampionRotationInfo(){
		String result = "";

		result = restCallingService.jsonReturnRestService("/lol/platform/v3/champion-rotations");

		return result;
	}
}
