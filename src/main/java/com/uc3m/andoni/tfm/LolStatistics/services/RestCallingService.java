package com.uc3m.andoni.tfm.LolStatistics.services;

import constants.Constants;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

@Service
public class RestCallingService {

	public String jsonReturnRestService(String apiCall){
		String result = "";

		RestTemplate restTemplate = new RestTemplate();
		result = restTemplate.getForObject("https://euw1.api.riotgames.com"  + apiCall + Constants.API_KEY, String.class);

		return result;
	}
}
