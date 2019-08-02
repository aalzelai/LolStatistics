package com.uc3m.andoni.tfm.LolStatistics.services;

import constants.Constants;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestCallingService {

	public String jsonReturnRestService(String apiCall){
		String result = "";

		RestTemplate restTemplate = new RestTemplate();
		result = restTemplate.getForObject("https://euw1.api.riotgames.com"  + apiCall + Constants.API_KEY, String.class);

		return result;
	}

	public Integer integerReturnRestService(String apiCall){
		String result = "";

		RestTemplate restTemplate = new RestTemplate();
		result = restTemplate.getForObject("https://euw1.api.riotgames.com"  + apiCall + Constants.API_KEY, String.class);

		return Integer.valueOf(result);
	}
}
