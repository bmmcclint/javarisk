/**
 *	CSCI 2120 Fall 2014
 *	Risk Game Class Player
 *	Authors: Andrew Bowden, Brandon McClinton
 *	Date: October 21, 2014 
 **/
package riskgamegui;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player {

	// Instance variables
	/** The name. */
	String name;
	
	/** The unplaced armies. */
	int unplacedArmies;
	
	/** The total armies. */
	int totalArmies;
	
	/** The territories list. */
	ArrayList<Territory> territoriesList = new ArrayList<Territory>();
	
	/** The continents list. */
	ArrayList<Continent> continentsList = new ArrayList<Continent>();
	
	/** The player hand. */
	Hand playerHand;
	
	/** The dice. */
	Dice dice; 
	
	/** The comparator. */
	Comparator<Integer> comparator = Collections.reverseOrder();

	/**
	 * Instantiates a new player.
	 *
	 * @param name the name
	 */
	public Player (String name) {
		this.name = name;
		this.unplacedArmies = 0;
		this.totalArmies = 0;
		this.playerHand = new Hand();
		this.territoriesList = new ArrayList<Territory>();
		this.continentsList = new ArrayList<Continent>();
		this.dice = new Dice();
		
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the Player's name
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * Gets the unplaced armies.
	 *
	 * @return integer representing the number of armies the player has that can be placed
	 */
	public int getUnplacedArmies() {
		return this.unplacedArmies;
	}


	/**
	 * Gets the total armies.
	 *
	 * @return integer representing the total number of armies a player has on the board
	 */
	public int getTotalArmies() {
		return this.totalArmies;
	}
	
	/**
	 * 
	 * Sets the total number of Armies.
	 * @param moreArmies
	 */
	public void setTotalArmies(int moreArmies) {
		this.totalArmies = moreArmies;
	}

	/**
	 * Gets the territories list.
	 *
	 * @return an ArrayList of the territories the player controls
	 */
	public ArrayList<Territory> getTerritoriesList() {
		return this.territoriesList;
	}

	/**
	 * Gets the continents list.
	 *
	 * @return a possibly empty ArrayList of continents the player controls
	 */
	public ArrayList<Continent> getContinentsList() {
		return this.continentsList;
	}

	/**
	 * Used to add territories to the player's list of controlled territories.
	 *
	 * @param newTerritory a reference to the Territory object the player now controls
	 */
	public void addTerritory(Territory newTerritory) {
		this.territoriesList.add(newTerritory);
		
	}

	/**
	 * Used to add a continent to the player's continent list, once all territories on
	 * that continent are controlled by the player.
	 *
	 * @param newArmies the new armies
	 */
	public void addArmies(int newArmies) {
		this.unplacedArmies += newArmies; 
	}

	/**
	 * Used to increase the number of armies the player has that need to be placed.
	 *
	 * @param newCard the new card
	 */
	public void addCard(Card newCard) {
		this.playerHand.acceptCard(newCard);
	} // end of addCard
	
	/**
	 *  Used to return Hand (ArrayList of card) 
	 *  
	 * @return playerHand
	 */
	public Hand getHand(){
		return this.playerHand; 
	} // end of getHand

	/**
	 * Used to give a player a new Card.
	 *
	 * @param attacker the attacker
	 * @param defender the defender
	 * @param numAttackingArmies the num attacking armies
	 */
	public void attack(Territory attacker, Territory defender, int numAttackingArmies) {
		ArrayList<Integer> attackArray = new ArrayList<Integer>();
		ArrayList<Integer> defendArray = new ArrayList<Integer>();
		int index = 0;
		for(int i = 0; i < numAttackingArmies; i++){
			int add = dice.roll();
			attackArray.add(add);
		}
		for (int i = 0; i < defender.getNumArmies() || i < 2; i++){
			int add = dice.roll();
			defendArray.add(add);
		}
		Collections.sort(attackArray, comparator); //adjust attack results
		Collections.sort(defendArray, comparator); //adjust defend results
		
		while (index < (numAttackingArmies-1)){
		 if (attackArray.get(index) > defendArray.get(index)){
			 defender.setNumArmies(defender.getNumArmies()-1);
			 index++;
		 }
		 if (attackArray.get(index) < defendArray.get(index)){
			 attacker.setNumArmies(attacker.getNumArmies()-1);
			 index++;
		 }
		 if ( defender.getNumArmies() == 0 ){
			 defender.setOccupant(attacker.getOccupant());
			 attacker.setNumArmies(attacker.getNumArmies() - numAttackingArmies ); //work in progress
			 defender.setNumArmies( numAttackingArmies );
			 
		 }
		 
		} //end while 
	} // end of Attack
	
	/**
	 * Can attack.
	 *
	 * @param ter
	 * @return true, if successful
	 */
	public boolean canAttack (Territory ter){
		boolean result = false;
		if (ter.getNumArmies() >= 2){
			result = true;
		}
		return result; 
	} // end of canAttack
	
	
}//end of Player Class 