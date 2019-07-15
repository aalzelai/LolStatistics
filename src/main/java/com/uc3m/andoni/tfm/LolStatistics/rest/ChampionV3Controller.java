package com.uc3m.andoni.tfm.LolStatistics.rest;

import com.uc3m.andoni.tfm.LolStatistics.models.Champion;
import com.uc3m.andoni.tfm.LolStatistics.models.Champion_nah;
import com.uc3m.andoni.tfm.LolStatistics.models.FreeChampionRotation;
import com.uc3m.andoni.tfm.LolStatistics.restConsumer.ChampionV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

@RestController
public class ChampionV3Controller {

	@Autowired ChampionV3 championV3Consumer;

	final Gson gson = new Gson();

	@GetMapping(path = "/championRotation")
	public String get() {
		String finalResult = "";
		try {
			Map<Integer, Champion> championMap = new HashMap<>();
			List<Champion> champions;
			Type listType = new TypeToken<List<Champion>>(){
			}.getType();
			champions = gson.fromJson(new FileReader("data/es_ES/champion.json"), listType);
			for(Champion championI : champions) {
				System.out.println(championI.getName() + " " + championI.getKey());
				championMap.put(Integer.valueOf(championI.getKey()), championI);
			}

			String result =  championV3Consumer.getChampionRotationInfo();
			FreeChampionRotation freeChampionRotation = gson.fromJson(result, FreeChampionRotation.class);
			/*Type listTypeInteger = new TypeToken<List<Integer>>(){
			}.getType();
			List<Integer> listChampionRotation = gson.fromJson(freeChampionRotation.getFreeChampionIds(), listTypeInteger);
*/

			for(int i : freeChampionRotation.getFreeChampionIds()){
				System.out.print(championMap.get(i).getKey() + "-" + championMap.get(i).getName() + "\t");
				finalResult += championMap.get(i).getKey() + "-" + championMap.get(i).getName() + "\t";
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		//JsonParser jsonParser = new JsonP



		return finalResult;
	}
}
