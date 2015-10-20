/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class GameBoard
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;

public interface GameBoard {
	ArrayList<Territory> territoryList = new ArrayList<Territory>();
	ArrayList<Continent> continentList = new ArrayList<Continent>();
	ArrayList<Territory> territoryByName = new ArrayList<Territory>();
	ArrayList<Continent> continentByName = new ArrayList<Continent>();
	/**
	 * Returns a list of all the territories on the board
	 * @return ArrayList of Territory references
	 **/
	ArrayList<Territory> getTerritoriesList() {
		return territoryList;
	}
	
	/**
	 * Returns a list of all the continents on the board
	 * @return ArrayList of Continent references
	 **/
	ArrayList<Continent> getContinentsList() {
		return continentList;
	}
	
	/**
	 * Retrieves a reference to a territory by name
	 * @param the String containing the name of the territory to get
	 * @return a reference to the specified territory
	 **/
	Territory getTerritoryByName( String territoryName ) {
		return territoryByName;
	}
	
	/**
	 * Retrieves a reference to a continent by name
	 * @param the String containing the name of the continent to get
	 * @return a reference to the specified continent
	 **/
	Continent getContinentByName( String continentName ) {
		return continentByName;
	}
}