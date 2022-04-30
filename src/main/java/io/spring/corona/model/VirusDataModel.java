package io.spring.corona.model;

public class VirusDataModel {
	
	private String state;
	private int latestTotalCases;
	
	public VirusDataModel (int latestTotalCases,String state) {
		this.latestTotalCases = latestTotalCases;
		this.state            = state;
	}
	
}
