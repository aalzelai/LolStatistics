package com.uc3m.andoni.tfm.LolStatistics.restConsumer;

import com.uc3m.andoni.tfm.LolStatistics.services.RestCallingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LolStatusV3 {

	@Autowired RestCallingService restCallingService;

	public String getLolStatusData(){
		String result = "";

		result = restCallingService.jsonReturnRestService("/lol/status/v3/shard-data");

		return result;
	}

}
