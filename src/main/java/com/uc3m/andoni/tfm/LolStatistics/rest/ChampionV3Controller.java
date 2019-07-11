package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uc3m.andoni.tfm.LolStatistics.models.Champion;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class ChampionV3Controller {

	@Autowired ChampionV3 championV3Consumer;

	@GetMapping(path = "/championRotation")
	public String get() {
		try {

			byte[] jsonData = Files.readAllBytes(Paths.get("data/es_ES/champion.json"));

			ObjectMapper objectMapper = new ObjectMapper();
			JSON
			Champion champion = objectMapper.readValue(jsonData, Champion.class);
			System.out.println(champion.getName() + " " + champion.getKey());
		} catch (IOException e) {
			e.printStackTrace();
		}

		//JsonParser jsonParser = new JsonP

		String result =  championV3Consumer.getChampionRotationInfo();

		return result;
	}
}
