/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Hand
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;

import java.util.ArrayList;
/**
*	Creation of hand object. 
*/
public class Hand {
	private ArrayList<Card> cards; 


	public Hand(){
		this.cards = new ArrayList<Card>();

	}



	/**
	 * Used to receive a Card into a Player's hand
	 * @param newCard the new Card being given to the player's Hand
	 **/
	public void acceptCard(Card newCard) {}

	/**
	 * Used to get a list of the cards currently in the player's hand
	 * @return an ArrayList of the Cards in the player's hand
	 **/
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * Used to remove a set of cards from the player's hand
	 * @param set an array of integers indicating the indices of the cards to turn-in
	 * @return an ArrayList of the Cards being turned-in
	 **/
	public ArrayList<Card> turnInSet(ArrayList<Card> set) {
		return set;
	}
}