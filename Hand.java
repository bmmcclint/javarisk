/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Hand
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgamegui;


import java.util.ArrayList;

/**
 * The Class Hand.
 */
public class Hand {

	/** The cards. */
	ArrayList<Card> cards;
	
	/** The turnin set. */
	ArrayList<Card> turninSet;
	
	/** The turn in count. */
	public int turnInCount = 1;



	/**
	 * Instantiates a new hand.
	 */
	public Hand(){
		this.cards = new ArrayList<Card>();
		this.turninSet = new ArrayList<Card>();
	}


	/**
	 * Used to receive a Card into a Player's hand.
	 *
	 * @param newCard the new Card being given to the player's Hand
	 */
	public void acceptCard(Card newCard) {
		this.cards.add(newCard);
	}

	/**
	 * Used to get a list of the cards currently in the player's hand.
	 *
	 * @return an ArrayList of the Cards in the player's hand
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * Used to remove a set of cards from the player's hand.
	 *
	 * @param turnInSet the turn in set
	 * @param deck the deck
	 * @param player the player
	 * @ensure check boolean canTurnInSet.
	 */
	public void turnInSet( ArrayList<Card> turnInSet, Deck deck, Player player) {
		int result = 0;

		for ( Card card : turnInSet){
			
			boolean bonus = card.getTerritory().getOccupant().equals(player);
			if (bonus){ result += 2; }
		
		if (turnInCount >=1 && turnInCount <= 6){
			switch (turnInCount){
				case 1:	{result += 4; break;}
				case 2: {result += 6; break;}
				case 3: {result += 8; break;}
				case 4: {result += 10; break;}
				case 5: {result += 12; break;}
				case 6: {result += 15; break;}
				default: { result += (15+((turnInCount-6)*5)); break;}
			}
		}
			turnInCount++;
			deck.acceptCards(turnInSet);
			player.addArmies(result);
		}

	}

	/**
	 * Can turn in set.
	 *
	 * @param turnInSet
	 * @return true, if successful
	 */
	public boolean canTurnInSet(ArrayList<Card> turnInSet){
		boolean result = false;
		if (turnInSet.get(0).getType().equals(turnInSet.get(1).getType()) && 
				(turnInSet.get(1).getType().equals(turnInSet.get(2).getType()))){
					result = true;
					}
		if (turnInSet.get(0).getTerritory().equals(turnInSet.get(1).getTerritory()) && 
				(turnInSet.get(1).getTerritory().equals(turnInSet.get(2).getTerritory()))){
					result = true;
					}
		if (turnInSet.get(0).getType() != turnInSet.get(1).getType() &&
				turnInSet.get(0).getType() != turnInSet.get(2).getType() && 
					turnInSet.get(2).getType() != turnInSet.get(3).getType()){
						result = true;
		}
		return result; 
	}
}