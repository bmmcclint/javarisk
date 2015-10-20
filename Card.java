
/** 
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Card
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgamegui;

/**
 * The Class Card.
 */
public class Card {


	String type;
	
	/** The territory. */
	Territory territory;

	/**
	 * Instantiates a new card.
	 *
	 * @param type 
	 * @param territory
	 */
	public Card (String type, Territory territory) {
		this.type = type;
		this.territory = territory;
	} // end of Card
	/**
	 * Instantiates a new card.
	 * 
	 * @param type
	 */
	public Card (String type){
		this.type = type;
		this.territory = null;
	}
	/**
	 * Get type on card. 
	 *
	 * @return the type (infantry, cavalry, artillery) of the card as a String
	 */
	public String getType() {
		return this.type;
	} // end of getType

	/**
	 * Gets the territory.
	 *
	 * @return a reference to the territory this card is matched to
	 */
	public Territory getTerritory() {
		return this.territory;
	} //end of getTerritory
	
	/**
	 * Gets the card string.
	 *
	 * @param card the card
	 * @return the card string
	 */
	public String getCardString(Card card){
		return (card.getType() + " " + card.getTerritory().getName());
	} //end of getCardString
	
	/**
	 *  Sets selected cards territory to newTerritory
	 *  
	 * @param newTerritory
	 */
	public void setTerritory(Territory newTerritory){
		this.territory = newTerritory;
	}// end of setTerritory.
	
} // end of class
