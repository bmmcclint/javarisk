/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author Brother
 */
public class PlayerTurnPanel extends JPanel{
    private final JLabel picLabel;
    private final ImageIcon riskBoard;
    
    private final JPanel playerTurn;
    
    private final JButton menuButton;
    private final JButton turnInCardsButton;
    private final JButton placeArmiesButton;
    private final JButton attackButton;
    private final JButton fortifyButton;
    private final ActionListener screenHandler;
    
    public PlayerTurnPanel(RiskGameEngine gameEngine) {
        this.screenHandler = new PlayerTurnPanelHandler(gameEngine);
        this.playerTurn = new JPanel();
        this.playerTurn.setLayout(new BorderLayout());
        riskBoard = new ImageIcon("src/riskgamegui/RiskBoard3.jpeg");
        picLabel = new JLabel();
        picLabel.setIcon(riskBoard);
        this.add(this.picLabel, BorderLayout.LINE_START);
        
        menuButton = new JButton("Menu");
        menuButton.addActionListener(screenHandler);
        menuButton.setActionCommand("menu");
        this.add(menuButton, BorderLayout.SOUTH);
        
        turnInCardsButton = new JButton("Turn-In Cards");
        turnInCardsButton.addActionListener(screenHandler);
        turnInCardsButton.setActionCommand("turnin");
        this.add(turnInCardsButton, BorderLayout.SOUTH);
        
        placeArmiesButton = new JButton("Place Armies");
        placeArmiesButton.addActionListener(screenHandler);
        placeArmiesButton.setActionCommand("place");
        this.add(placeArmiesButton, BorderLayout.SOUTH);
        
        attackButton = new JButton("ATTACK!");
        attackButton.addActionListener(screenHandler);
        attackButton.setActionCommand("attack");
        this.add(attackButton, BorderLayout.SOUTH);
        
        fortifyButton = new JButton("Fortify");
        fortifyButton.addActionListener(screenHandler);
        fortifyButton.setActionCommand("fortify");
        this.add(this.fortifyButton, BorderLayout.SOUTH);
        
    }
    
        class PlayerTurnPanelHandler implements ActionListener{
            private RiskGameEngine model;
    
        public PlayerTurnPanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }
    
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for player turn");
            String command = event.getActionCommand();
            System.out.println("Command received at the player turn handler: " + command);
        
            if (command.equals("menu")) {
                System.out.println("Inside menu if in player turn handler");
                this.model.menuPanel();
            }
        
            if (command.equals("turnin")) {
                System.out.println("Inside turnin cards if in player turn handler");
                this.model.turnInCards();
            }
        
            if (command.equals("place")) {
                System.out.println("In place armies if in player turn handler");
                this.model.placeArmiesPanel();
            }
        
            if (command.equals("attack")) {
                System.out.println("In attack if in player turn handler");
                this.model.attackPanel();
            }
            
            if (command.equals("fortify")) {
                System.out.println("in fortify if in player turn handler");
                this.model.fortifyPanel();
            }
                
            else {
                System.out.println("SHIT went wrong");
            }
        }
    }   
}
