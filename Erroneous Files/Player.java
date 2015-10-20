/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Player
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;
import java.util.ArrayList;

public class Player {
	String name;
	String color;

	int unplacedArmies;
	int totalArmies;

	ArrayList<Territory> territoriesList;
	ArrayList<Continent> continentsList = new ArrayList<Continent>();



	public Player(String name, String color){
		this.name = name;
		this.color = color;

	}

	/**
	 * @return the Player's name
	 **/
	public String getName() {
		return this.name;
	}
	/**
	*
	*/
	public String getColor(){
		return this.color;
	}

	/**
	 * @return integer representing the number of armies the player has that can be placed
	 **/
	public int getUnplacedArmies() {
		return unplacedArmies;
	}

	/**
	 * @return integer representing the total number of armies a player has on the board
	 **/
	public int getTotalArmies() {
		return totalArmies;
	}

	/**
	 * @return an ArrayList of the territories the player controls
	 **/
	public ArrayList<Territory> getTerritoriesList() {
		return territoriesList;
	}

	/**
	 * @return a possibly empty ArrayList of continents the player controls
	 **/
	public ArrayList<Continent> getContinentsList() {
		return continentsList;
	}

	/**
	 * Used to add territories to the player's list of controlled territories
	 * @param newTerritory a reference to the Territory object the player now controls
	 **/
	public void addTerritory(Continent newContinent) {}

	/**
	 * Used to add a continent to the player's continent list, once all territories on
	 * that continent are controlled by the player
	 * @param newContinent a reference to the Continent object the player now controls
	 **/
	public void addArmies(int newArmies) {}

	/**
	 * Used to increase the number of armies the player has that need to be placed
	 * @param newArmies integer representing the number of armies the player received
	 *  at the beginning of the turn
	 **/
	public void addCard(Card newCard) {}

	/**
	 * Used to give a player a new Card
	 * @param newCard a reference to a Card object the player is being given
	 **/
	public void attack(Territory attacker, Territory defender, int numAttackingArmies) {}
}