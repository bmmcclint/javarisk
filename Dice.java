package riskgamegui;
import java.util.Random;

/**
 * 	CSCI 2120 Fall 2014
 * 	Risk Game Class Dice
 * 	Authors: Andrew Bowden, Brandon McClinton
 * 	Date: October 21, 2014 .
 */


public class Dice {
	
	/** The dice. 
	 * 	@ensure Random int. 
	 */
	Random dice = new Random();
	

	/**
	 * Instantiates a new dice.
	 */
	public Dice(){
		
	} //end of Dice
	
	/**
	 * Roll.
	 *
	 * @return random int between 1 and 6 
	 */
	public int roll( ) {
		return (dice.nextInt(6) + 1);
	} //end of roll
	
} // end of Dice class