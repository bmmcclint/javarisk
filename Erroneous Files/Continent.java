/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Continent
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;
import java.util.ArrayList;

public class Continent {
	Continent continent;
	String name;
	Player occupant;
	int numBonusArmies;
	ArrayList<Territory> territories;

	public Continent(String name, ArrayList<Territory> territories){
		name = this.name;
		territories = this.territories;


	}

	/**
	 * @return the name of the continent as a String
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * If no player owns all territories on a continent then this method should 
	 * return null
	 * @return a reference to the Player object that currently owns this continent
	 **/
	public Player getOccupant() {
		return this.occupant;
	}

	/**
	 * @return the number of additional armies a player gets for owning this continent
	 **/
	public int getNumBonusArmies() {
		return this.numBonusArmies;
	}

	/**
	 * Sets which player owns a continent, if any
	 * @param occupant a reference to the Player object that now owns this continent
	 **/
	public void setOccupant(Player occupant) {}

	/**
	 * @return true of there is a player that owns all the territories on this continent
	 **/
	public boolean isOccupied() {
		return true;
	}

	/**
	 * @return an ArrayList of all the territories on the continent
	 **/
	public ArrayList<Territory> getTerritories() {

		return territories;


	}


}