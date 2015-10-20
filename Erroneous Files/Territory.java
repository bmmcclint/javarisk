/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Territory
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;

import java.util.ArrayList;

public class Territory {

	public Territory(String name){
		this.name = name;
	}
	/**
	 * @reutrn the name of the territory
	 **/
	public String getName() {
		return name;
	}

	/**
	 *	@return an ArrayList of all territories it shares a border with
	 **/
	public ArrayList<Territory> getNeighbors() {
		return neighbors;
	}

	/**
	 *	@return a reference to the that currently owns this territory
	 **/
	public Player getOccupant() {
		return occupant;
	}

	/**
	 *	@return the number of armies the occupying player has in the territory
	 **/
	public int getNumArmies() {
		return numArmies;
	}

	/**
	 *	Used to set the new occupying player of the territory
	 *	@param occupant reference to the Player object who now occupies the territory
	 **/
	public void setOccupant(Player occupant) {


	}

	/**
	 *	Used by the occupying player to add armies to a territory
	 *	@param numArmies the number of armies to be placed into the territory
	 **/
	public void setNumArmies(int numArmies) {


	}


}