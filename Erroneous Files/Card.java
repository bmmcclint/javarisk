/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Card
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;

public class Card {
	private String type;
	private Territory territory;

	/**
	*	Creation of Card Object. 
	*/

	public Card(String type , Territory territory){
		// this.type = type; 
		// this.territory = territory;


	}
	
	/**
	 * @return the type (infantry, cavalry, artillery) of the card as a String
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 * @return a reference to the territory this card is matched to
	 **/
	public Territory getTerritory() {
		return this.territory;
	}
}