package com.uc3m.andoni.tfm.LolStatistics.models;

import java.util.List;

public class LolStatusData {

	String name;
	String region_tag;
	String hostname;
	List<Service> services;
	String slug;
	List<String> locales;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion_tag() {
		return region_tag;
	}

	public void setRegion_tag(String region_tag) {
		this.region_tag = region_tag;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public List<String> getLocales() {
		return locales;
	}

	public void setLocales(List<String> locales) {
		this.locales = locales;
	}

	@Override public String toString() {
		String result =  "League of Legends " + this.name +" Status: " + "<br/>";
		result += "Services: " +services.get(0).getStatus() + "<br/>";
		for (Service service : services){
			result +=  (service.getIncidents().size() > 0 ? "- " + service.getIncidents().get(0).getUpdates().get(0).getTranslations().get(3).getContent() + "<br/>" : "");
		}
		return result;
	}
}
