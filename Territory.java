/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Territory
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/

package riskgamegui;


import java.util.ArrayList;

/**
 * 	Models a Territory in Risk Game.
 */

public class Territory {

	// Instance variables
	/** The name. */
	String name;
	
	/** The neighbors. */
	ArrayList<Territory> neighbors = new ArrayList<Territory>();
	
	/** The occupant. */
	Player occupant;
	
	/** The number of armies. */
	int numArmies;
	
	/** The continent. */
	Continent cont; 

	
	
	/**
	 * Instantiates a new territory.
	 *
	 * @param name
	 */
	public Territory(String name){
		this.name = name;
		this.cont = null;
		this.neighbors = null;
		this.numArmies = 0;
		this.occupant = null;
	} // end of simple Territory

	/**
	 * Instantiates a new territory.
	 *
	 * @param name
	 * @param cont
	 */
	public Territory(String name, Continent cont) {
		this.name = name;
		this.cont = cont; 
		this.neighbors = null; 
		this.numArmies = 0;
		this.occupant = null; 
		
	} //end of overload Territory
	
	/**
	 * Sets the continent for Territory.
	 *
	 * @param newCont the new continent
	 */
	public void setContinent(Continent newCont){
		this.cont = newCont;
	} // end of setContinent

	/**
	 * Gets the name.
	 *
	 * @return the name of the territory
	 */
	public String getName() {
		return name;
	} // end of getName
	
	/**
	 * Gets the continent.
	 *
	 * @return the continent
	 */
	public Continent getContinent(){
		return cont; 
	} //end of getContinent

	/**
	 * Gets the neighbors.
	 *
	 * @return an ArrayList of all territories it shares a border with
	 */
	public ArrayList<Territory> getNeighbors() {
		return this.neighbors;
	} // end of getNeighbors

	/**
	 * Gets the occupant.
	 *
	 * @return a reference to the that currently owns this territory
	 */
	public Player getOccupant() {
		return this.occupant;
	} // end of getOccupant

	/**
	 * Gets the num armies.
	 *
	 * @return the number of armies the occupying player has in the territory
	 */
	public int getNumArmies() {
		return this.numArmies;
	} // end of getNumArmies.

	/**
	 * 	Used to set the new occupying player of the territory.
	 *
	 * @param occupant reference to the Player object who now occupies the territory
	 */
	public void setOccupant(Player occupant) {
		this.occupant = occupant;
	} // end of setOccupant

	/**
	 * 	Used by the occupying player to add armies to a territory.
	 *
	 * @param numArmies the number of armies to be placed into the territory
	 */
	public void setNumArmies(int numArmies) {
		this.numArmies = numArmies;
	} // end of setNumArmies
	
	/**
	 * Sets the neighbors.
	 *
	 * @param newNeighbors the new neighbors
	 */
	public void setNeighbors(ArrayList<Territory> newNeighbors){
		this.neighbors = newNeighbors; 
	} // end of setNeighbors
	/**
	 * 
	 * @param terSending
	 * @param terReceiving
	 * @return boolean
	 */
	public boolean canFortify(Territory terSending, Territory terReceiving){
		boolean result = false;
		
		if (terSending.getNumArmies() >= 2){
			ArrayList<Territory> tempArray = terSending.getNeighbors();
			for (int i = 0; i < tempArray.size();  i++ ){
				if (tempArray.get(i).equals(terReceiving)){
					result = true; 
				}
			}
		} 
		return result; 	
		} // end of can Fortify
	/**
	 * Moving armies from one territory to the next. must be adjacent.
	 * @param terSending
	 * @param terReceiving
	 * @param numMoving
	 */
	public void fortifyTerritory( Territory terSending, Territory terReceiving, int numMoving){
		terSending.setNumArmies(terSending.getNumArmies() - numMoving);
		terReceiving.setNumArmies(terReceiving.getNumArmies() + numMoving);
	} // end of fortifyTerritory

} // end of Territory Class