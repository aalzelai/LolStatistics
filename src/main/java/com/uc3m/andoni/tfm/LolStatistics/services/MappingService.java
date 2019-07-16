package com.uc3m.andoni.tfm.LolStatistics.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.uc3m.andoni.tfm.LolStatistics.models.Champion;
import com.uc3m.andoni.tfm.LolStatistics.models.FreeChampionRotation;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import constants.Constants;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Service
public class MappingService {

    Map<Integer, Champion> championMap = new HashMap<>();
    final Gson gson = new Gson();
    private static final Logger LOGGER = Logger.getLogger(MappingService.class.getName());

    public MappingService (){
        try {
            List<Champion> champions;
            Type listType = new TypeToken<List<Champion>>() {
            }.getType();
            champions = gson.fromJson(new FileReader(Constants.CHAMPION_JSON_LOCATION), listType);
            for (Champion championI : champions) {
                championMap.put(Integer.valueOf(championI.getKey()), championI);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object map (String input, String service){
        String finalResult = "";
        switch (service){
            case Constants.FREE_CHAMPION_ROTATION:

                /* Free champion rotation mapping service */
                FreeChampionRotation freeChampionRotation = gson.fromJson(input, FreeChampionRotation.class);
                for(int i : freeChampionRotation.getFreeChampionIds()) {
                    try {
                        finalResult += championMap.get(i).getKey() + "-" + championMap.get(i).getName() + "\t";
                    } catch (NullPointerException e) {
                        LOGGER.warning("Champion " + i + " not found");
                    }
                }
                return finalResult;
            case Constants.GET_SUMMONER_NAME:
                Summoner summoner = gson.fromJson(input, Summoner.class);
                return summoner;


            default:
                break;

        }
        return null;
    }

    public Map<Integer, Champion> getChampionMap() {
        return championMap;
    }

    public void setChampionMap(Map<Integer, Champion> championMap) {
        this.championMap = championMap;
    }
}
