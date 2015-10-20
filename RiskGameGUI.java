/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Brother
 */
public class RiskGameGUI extends JFrame implements Observer {
    private JPanel currentPanel;
    
    //Start Screen
    private final JPanel startScreenPanel;
    
    //Create Game Screen
    private final JPanel createGamePanel;
    
    //InitBoard Screen
    private final JPanel initBoardPanel;
    
    //Player Turn Screen
    private final JPanel playeTurnPanel;
    
    //Menu Screen
    private final JPanel menuPanel;
    
    //Turn-In Cards Screen
    private final JPanel turnInCardsPanel;
    
    //Place Army Screen
    private final JPanel placeArmiesPanel;
    
    //Attack Screen
    private final JPanel attackPanel;
    
    //Fortify Screen
    private final JPanel fortifyPanel;
    
    //Game Name screen
    private final JPanel gameNamePanel;
    
    //Player Name screen
    private final JPanel playerNamePanel;
    
    private final RiskGameEngine gameEngine;
    
    private RiskGame game;
    
    public RiskGameGUI(RiskGameEngine gameEngine, RiskGameEngine model) throws IOException {
        
        this.gameEngine = gameEngine;
        
        //Start Screen initialization);
        this.startScreenPanel = new StartScreenPanel(this.gameEngine);
        
        //Create Game Screen initialization
        this.createGamePanel = new CreateGamePanel(this.gameEngine);
       
        //InitBoard Screen initialization
        this.initBoardPanel = new InitBoardPanel(this.gameEngine);
        
        //Player Turn Screen initializer);
        this.playeTurnPanel = new PlayerTurnPanel(this.gameEngine);
        
        //Menu Screen initializer
        this.menuPanel = new MenuPanel(this.gameEngine);
        
        //Turn-In Cards Screen initialization.
        this.turnInCardsPanel = new TurnInCardsPanel(this.gameEngine);
        
        //Place Army Screen initialization
        this.placeArmiesPanel = new PlaceArmiesPanel(this.gameEngine);
        
        //Attack Screen inititalization
        this.attackPanel = new AttackPanel(this.gameEngine);
        
        //Fortify Screen initialization
        this.fortifyPanel = new FortifyPanel(this.gameEngine);
        
        //Game name screen initialization
        this.gameNamePanel = new GameNamePanel(this.gameEngine);
        
        //Player Name Screen initialization
        this.playerNamePanel = new PlayerNamePanel(this.gameEngine);
        
        this.currentPanel = this.startScreenPanel;
        this.getContentPane().add(this.currentPanel);
    }
    
    @Override
    public void update(Observable obs, Object obj) {
        System.out.println("In update of RiskGameGUI");
        String state = gameEngine.getState();
        
        System.out.println("New state of game engine: " + state);
        
        //Update the panel in JFrame to be same as current state
        if (state.equals("playerName")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.playerNamePanel;
            this.getContentPane().add(this.playerNamePanel);
            this.setSize(350, 600);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("createGame")) {
            //this.game = gameEngine.getGame();
            System.out.println("In create game if of RiskGameGUI update");
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.createGamePanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(210, 130);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("initBoard")) {
            //this.game = gameEngine.getGame();
            System.out.println("In init board if in RiskGameGUI update");
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.initBoardPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(1280, 720);
            this.revalidate();
            this.repaint();            
        }
        
        if (state.equals("playerTurn")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.playeTurnPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(1280, 720);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("menu")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.menuPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(150, 250);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("turnin")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.turnInCardsPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(100, 200);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("place")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.placeArmiesPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(300, 200);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("attack")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.attackPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(300, 200);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("name")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.gameNamePanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(200, 100);
            this.revalidate();
            this.repaint();
        }
        
        if (state.equals("fortify")) {
            this.getContentPane().remove(this.currentPanel);
            this.currentPanel = this.fortifyPanel;
            this.getContentPane().add(this.currentPanel);
            this.setSize(350, 300);
            this.revalidate();
            this.repaint();
        }
        
    }
 }

