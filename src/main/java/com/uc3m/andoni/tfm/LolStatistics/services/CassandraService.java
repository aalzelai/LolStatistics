package com.uc3m.andoni.tfm.LolStatistics.services;

import com.datastax.driver.core.Session;
import com.uc3m.andoni.tfm.LolStatistics.models.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CassandraService {

	private Session session;

	public void insertSummoner(Summoner summoner){
		CassandraConnector client = new CassandraConnector();
		client.connect("127.0.0.1", 9042);
		this.session = client.getSession();

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
}
