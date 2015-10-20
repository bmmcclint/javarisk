/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Continent
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgamegui;


import java.util.ArrayList;

public class Continent {
	String name;
	Player owner;
	int numBonusArmies;
	ArrayList<Territory> territories;

	/**
	 * Instantiates a new continent.
	 *
	 * @param name 
	 */
	public Continent (String name ) {
		name = this.name;
		this.territories = new ArrayList<Territory>(); //territories in continent
		this.owner = null;
	} // end of Continent

	/**
	 * @return the name of the continent as a String
	 **/
	public String getName() {
		return this.name;
	} // end of getName

	/**
	 * If no player owns all  territories on a continent then this method should 
	 * return null
	 * @return a reference to the Player object that currently owns this continent
	 **/
	public Player getOccupant() {
		return this.owner;
	} //end of getOccupant

	/**
	 * @return the number of additional armies a player gets for owning this continent
	 **/
	public int getNumBonusArmies() {
		return this.numBonusArmies;
	} //end of getNumBonusArmies

	/**
	 * Sets which player owns a continent, if any. 
	 * Change to null/ disowned.
	 * @param occupant a reference to the Player object that now owns this continent
	 **/
	public void setOccupant(Player occupant) {
		this.owner = occupant;
	} //end of setOccupant

	/**
	 * @return true if there is a player that owns all the territories on this continent
	 **/
	public boolean isOccupied() {
		boolean result = false; 
				if (this.owner != null){
					result = true;
				}
		return result;
	} // end of isOccupied

	/**
	 * @return an ArrayList of all the territories on the continent
	 **/
	public ArrayList<Territory> getTerritories() {
		return this.territories;
	} // end of getTerritories
	
	/**
	 * Set a continent's territories. 
	 * @param inContTer 
	 */
	public void setTerritories( ArrayList<Territory> inContTer){
		this.territories = inContTer; 
	} // end of setTerritories
	
} // end of Continent
