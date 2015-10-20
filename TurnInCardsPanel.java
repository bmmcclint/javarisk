/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brother
 */
public class TurnInCardsPanel extends JPanel{
    private final JLabel turnInLabel;
    private final JButton turnInButton;
    private final JButton backButton;
    
    private final ActionListener screenHandler;
    
    public TurnInCardsPanel(RiskGameEngine gameEngine) {
        this.screenHandler = new TurnInCardsPanelHandler(gameEngine);
        this.setLayout(new GridLayout(3, 1));
        
        turnInLabel = new JLabel("Turn in any matched card sets");
        this.add(turnInLabel);
        
        turnInButton = new JButton("Turn-in Cards");
        turnInButton.addActionListener(screenHandler);
        turnInButton.setActionCommand("turnin");
        this.add(this.turnInButton);
        
        backButton = new JButton("Return to Game");
        backButton.addActionListener(screenHandler);
        backButton.setActionCommand("return");
        this.add(this.backButton);
    }
    
    class TurnInCardsPanelHandler implements ActionListener{
    private RiskGameEngine model;
    
    public TurnInCardsPanelHandler(RiskGameEngine gameEngine) {
        this.model = gameEngine;
    }
    
    public void actionPerformed(ActionEvent event) {
        System.out.println("In action performed for turn in card panel handler");
        String command = event.getActionCommand();
        System.out.println("Command received in turn in card handler: " + command);
        
        if (command.equals("turnin")) {
            
        }
        
        if (command.equals("return")) {
            this.model.playerTurn();
        }
    }
}
}
