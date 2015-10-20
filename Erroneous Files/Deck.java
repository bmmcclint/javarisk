/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Deck
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgame;
import java.util.ArrayList;

public class Deck {
	Card cards;
	Deck deck;

	public Deck(ArrayList<Card> deck){
		deck = this.deck;
	}

	/**
	 * Issues one card to be given to a player
	 * @return Card from the front of the deck
	 **/
	public Card deal() {
		return cards;

	}

	/**
	 * Used to add cards turned-in by players back to the deck
	 * @param set an ArrayList of Cards turned-in by a player
	 **/
	public void acceptCards(ArrayList<Card> set) {}

	/**
	 * Shuffles the deck
	 **/
	public void shuffle() {}

}