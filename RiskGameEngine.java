/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JTextField;

/**
 *
 * @author Brother
 */
public class RiskGameEngine extends Observable{
    private String state;
    private RiskGame game;
    private final String[] adjTerList;
    private final String name;

    private Player currentPlayer;
    private GameBoard board;
    private Hand playerHand;
    private Dice dice;
    private Card card;
    private Territory territory;
    private Continent continent;
    private Deck deck;

    private int playerCount;
    
    public RiskGameEngine() {
        this.state = state;
        this.game = null;
        this.adjTerList = null;
        this.name = "";
    }
    
    public void startScreen() {
        System.out.println("In start screen of RiskGameGUI");
        this.state = "startScreen";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void createNewGame() {
        System.out.println("In createGame of RiskGameEngine");
        this.state = "createGame";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void continueGame() {
        System.out.println("In continueGame of RiskGameEngine");
        this.state = "continueGame";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void initBoard() {
        System.out.println("In innitBoard of RiskGameEngine");
        this.state = "initBoard";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void playerTurn() {
        System.out.println("In playerTurn of RiskGameEngine");
        this.state = "playerTurn";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void placeArmies() {
        System.out.println("In placeArmies of RiskGameEngine");
        this.state = "placeArmies";
        this.setChanged();
        this.notifyObservers();
    }
    
    public String getState() {
        return this.state;
    }
    
    public RiskGame getGame() {
        return this.game;
    }
    
    public void makeGame(String gameName) {
        this.game = new RiskGame(gameName);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void menuPanel() {
        System.out.println("In menu dialog of player turn screen in RiskGameEngine");
        this.state = "menu";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void turnInCards() {
        System.out.println("In turn in cards in RiskGameEngine");
        this.state = "turnin";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void placeArmiesPanel() {
        System.out.println("In place armies dialog of player turn screen in RiskGameEngine");
        this.state = "place";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void attackPanel() {
        System.out.println("In attack panel of player turn screen in RiskGameEngine");
        this.state = "attack";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void fortifyPanel() {
        System.out.println("In fortify panel of player turrn screen in RiskGameEngine");
        this.state = "fortify";
        this.setChanged();
        this.notifyObservers();
        
    }
    public void namePanel() {
        System.out.println("In name panel of player turn screen in RiskGameEngine");
        this.state = "name";
        this.setChanged();
        this.notifyObservers();
    }
    
    public void playerNamePanel() {
        System.out.println("In player name panel in RiskGameEngine");
        this.state = "playerName";
        this.setChanged();
        this.notifyObservers();
    }
    
    public String[] createAdjTerrList() throws FileNotFoundException, IOException {
        System.out.println("shit happened");
        BufferedReader input = new BufferedReader(new FileReader("src/riskgamegui/adjacencies.txt"));
        ArrayList<String> strings = new ArrayList<>();
        try {
            String line = null;
            while ((line = input.readLine()) != null) {
                strings.add(line);
            }
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        finally {
            input.close();
        }

        String[] adjTerritories = strings.toArray(new String[]{});
        return adjTerritories;
    }
    
    public String[] createTerritoryList() throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader("src/riskgamegui/Continent.txt"));
        ArrayList<String> strings = new ArrayList<>();
        try {
            String line = null;
            while ((line = input.readLine()) != null) {
                strings.add(line);
            }
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        finally {
            input.close();
        }
        
        String[] territories = strings.toArray(new String[]{});
        return territories;
        
    }
    
    public void createPlayerTerrList() {
    }
      
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
    public int getPlayerCount() {
//        System.out.println(this.playerCount);
        return this.playerCount;
    }
    
    public void setPlayerCount(int numPlayers) {
        this.playerCount = numPlayers;
        System.out.print(this.playerCount);
        
    }
}