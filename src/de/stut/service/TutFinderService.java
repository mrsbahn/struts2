package de.stut.service;

public class TutFinderService {
	public String getBestTutSite(String lang) {
		if (lang.toLowerCase().equals("java")) {
			return "Java Me";
		} else {
			return "Language not supported at the moment";
		}

	}
}
