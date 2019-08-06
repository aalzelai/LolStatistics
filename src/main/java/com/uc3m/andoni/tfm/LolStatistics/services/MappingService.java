package com.uc3m.andoni.tfm.LolStatistics.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.uc3m.andoni.tfm.LolStatistics.models.*;
import constants.Constants;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

@Service
public class MappingService {

    Map<Integer, Champion> championMap = new HashMap<>();
    Map<String, Champion> championNameMap = new HashMap<>();
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
                championNameMap.put(championI.getName(), championI);
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

            case Constants.LOL_STATUS_DATA:
                LolStatusData lolStatusData = gson.fromJson(input, LolStatusData.class);
                return lolStatusData;

            case Constants.GET_CHAMPION_MASTERY:
                Type listType = new TypeToken<ChampionMasteryDTO>(){}.getType();
                List<ChampionMasteryDTO> championMasteryDTOs = gson.fromJson(input, List.class);
                return championMasteryDTOs;

            case Constants.GET_CHAMPION_MASTERY_BY_CHAMPION:
                ChampionMasteryDTO championMasteryDTO = gson.fromJson(input, ChampionMasteryDTO.class);
                return championMasteryDTO;
            case Constants.GET_CHALLENGER_LEAGUE:
                LeagueList leagueList = gson.fromJson(input, LeagueList.class);
                return leagueList;
            case Constants.ENTRIES_BY_SUMMONER:
                Set<LeagueEntry> entries = gson.fromJson(input, Set.class);
                return entries;
            case Constants.GET_MATCH:
                Match match = gson.fromJson(input, Match.class);
                return match;
            case Constants.GET_MATCH_LIST:
                MatchList matchList = gson.fromJson(input, MatchList.class);
                return matchList;
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

    public Map<String, Champion> getChampionNameMap() {
        return championNameMap;
    }

    public void setChampionNameMap(Map<String, Champion> championNameMap) {
        this.championNameMap = championNameMap;
    }
}
