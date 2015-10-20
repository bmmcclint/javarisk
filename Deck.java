/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Deck
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgamegui;


import java.util.ArrayList;

public class Deck {

	Card cards;
	public static ArrayList<Card> deck;


	public Deck(ArrayList<Card> deck) {
		deck = new ArrayList<Card>();
		}

	/**
	 * Issues one card to be given to a player
	 * @return Card from the front of the deck
	 **/
	public Card deal(){
		cards = deck.get(0);
		deck.remove(0);
		shuffle();
		return cards;
	} // end of Deal

	/**
	 * Used to add cards turned-in by players back to the deck
	 * @ensure boolean canTurnIn == true
	 * @param set an ArrayList of Cards turned-in by a player
	 **/
	public void acceptCards(ArrayList<Card> set) { 
		for (int i = set.size(); i > 0; i--){
			deck.add(set.get(0));
			set.remove(0);
		}
		shuffle();

	} //end of acceptCards

	/**
	 * Shuffles the deck
	 * @ensure random! 
	 **/
	public void shuffle(){
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		for (int i = 0; i < deck.size(); i++){
			int randomIndex = (((int)Math.random() * deck.size())+1);
			tempDeck.add(deck.get(randomIndex));
			deck.remove(randomIndex);
			i--;   //WHAT!? 
		}
		deck = tempDeck;

	} //end of shuffle

}// end of Deck class