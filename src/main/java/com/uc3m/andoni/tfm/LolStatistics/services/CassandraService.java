package com.uc3m.andoni.tfm.LolStatistics.services;

import com.datastax.driver.core.Session;
import com.google.gson.internal.LinkedTreeMap;
import com.uc3m.andoni.tfm.LolStatistics.models.ChampionMasteryDTO;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CassandraService {
	CassandraConnector client;
	private static final Logger LOGGER = Logger.getLogger(CassandraService.class.getName());
	public CassandraService(){
		client = new CassandraConnector();
		client.connect("127.0.0.1", 9042);
		this.session = client.getSession();
	}

	private Session session;

	public void insertSummoner(Summoner summoner){


		StringBuilder sb = new StringBuilder("INSERT INTO ")
				.append("dev.summoner").append("(id, accountId, name, profileicon, puuid, revisiondate, summonerlevel) ")
				.append("VALUES ('").append(summoner.getId())
				.append("', '").append(summoner.getAccountId())
				.append("', '").append(summoner.getName())
				.append("', ").append(summoner.getProfileIconId())
				.append(", '").append(summoner.getPuuid())
				.append("', ").append(summoner.getRevisionDate())
				.append(", ").append(summoner.getSummonerLevel())
				.append(");");

		String query = sb.toString();
		session.execute(query);
	}
	public void insertChampionMastery(ChampionMasteryDTO championMastery){


		StringBuilder sb = new StringBuilder("INSERT INTO ")
				.append("dev.championmastery").append("(summonerid, championid, championlevel, championpoints, championpointssincelastlevel, championpointsuntilnextlevel, chestgranted, lastplaytime, tokensearned) ")
				.append("VALUES ('").append(championMastery.getSummonerId())
				.append("', ").append(championMastery.getChampionId())
				.append(", ").append(championMastery.getChampionLevel())
				.append(", ").append(championMastery.getChampionPoints())
				.append(", ").append(championMastery.getChampionPointsSinceLastLevel())
				.append(", ").append(championMastery.getChampionPointsUntilNextLevel())
				.append(", ").append(championMastery.isChestGranted())
				.append(", ").append(championMastery.getLastPlayTime())
				.append(", ").append(championMastery.getTokensEarned())
				.append(");");

		String query = sb.toString();
		session.execute(query);

	}

	public void insertChampionMasteryFromList(LinkedTreeMap championMastery){

		StringBuilder sb = new StringBuilder("INSERT INTO ")
				.append("dev.championmastery").append("(summonerid, championid, championlevel, championpoints, championpointssincelastlevel, championpointsuntilnextlevel, chestgranted, lastplaytime, tokensearned) ")
				.append("VALUES ('").append(championMastery.get("summonerId"))
				.append("', ").append(((Double) championMastery.get("championId")).intValue())
				.append(", ").append(((Double) championMastery.get("championLevel")).intValue())
				.append(", ").append(((Double) championMastery.get("championPoints")).intValue())
				.append(", ").append(((Double) championMastery.get("championPointsSinceLastLevel")).intValue())
				.append(", ").append(((Double) championMastery.get("championPointsUntilNextLevel")).intValue())
				.append(", ").append(championMastery.get("chestGranted"))
				.append(", ").append(((Double)championMastery.get("lastPlayTime")).longValue())
				.append(", ").append(((Double)championMastery.get("tokensEarned")).intValue())
				.append(");");

		String query = sb.toString();
		session.execute(query);
		LOGGER.info(query);
	}
}
