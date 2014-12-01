package de.tut.action;

import com.opensymphony.xwork2.Action;

import de.stut.service.TutFinderService;

public class TutAction {
	private String bestTut;
	private String language;

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

//	public String execute() {
//		TutFinderService tutObj = new TutFinderService();
//		 
//		setBestTut(tutObj.getBestTutSite(getLanguage()));
//		System.out.println("execute() method is executed!");
//		return Action.SUCCESS;
//	}
//	
	public String getTut() {
//		TutFinderService tutObj = new TutFinderService();
//		 
//		setBestTut(tutObj.getBestTutSite(getLanguage()));
		System.out.println("getTut method is executed!");
		return Action.SUCCESS;
	}
	
	public String addTut(){
		System.out.println("AddTut method is executed!");
		return Action.SUCCESS;
	}

	/**
	 * @return the bestTut
	 */
	public String getBestTut() {
		return bestTut;
	}

	/**
	 * @param bestTut
	 *            the bestTut to set
	 */
	public void setBestTut(String bestTut) {
		this.bestTut = bestTut;
	}

}
