/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;

/**
 *
 * @author Brother
 */
public class FortifyPanel extends JPanel{
    private JLabel fortifyLabel;
    private JLabel armyNumberLabel;
    private JTable ownedTerritories;
    private JComboBox playerTerritoryList;
    private JComboBox adjTerritories;
    private JButton fortifyButton;
    private JButton endTurnButton;
    private JSlider armyNumberSlider;
    
    private ActionListener screenHandler;
    
    public FortifyPanel(RiskGameEngine gameEngine) {
        this.screenHandler = new FortifyPanelHandler(gameEngine);
        this.setLayout(new GridLayout(8,1));
        
        fortifyLabel = new JLabel("Select an adjacent territory to fortify");
        this.add(this.fortifyLabel);
        
        ownedTerritories = new JTable();
        this.add(this.ownedTerritories);
        
        playerTerritoryList = new JComboBox();
        this.add(this.playerTerritoryList);
        
        adjTerritories = new JComboBox();
        this.add(this.adjTerritories);
        
        armyNumberLabel = new JLabel("Select between 1 and 7 infantry to move");
        this.add(this.armyNumberLabel);
        
        armyNumberSlider = new JSlider(1, 7);
        this.add(this.armyNumberSlider);
        
        fortifyButton = new JButton("Fortify");
        fortifyButton.addActionListener(screenHandler);
        fortifyButton.setActionCommand("fortify");
        this.add(this.fortifyButton);        
        
        endTurnButton = new JButton("End Turn");
        endTurnButton.addActionListener(screenHandler);
        endTurnButton.setActionCommand("end");
        this.add(this.endTurnButton, BorderLayout.SOUTH);
    }
    
        class FortifyPanelHandler implements ActionListener {
            private RiskGameEngine model;
   
        public FortifyPanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }
    
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed of fortify panel handler in player turn screen.");
            String command = event.getActionCommand();
            System.out.println("Command received at fortify panel handler: " + command);
        
            if (command.equals("fortify")) {
                this.model.playerTurn();
            }
            
            if (command.equals("end")) {}
        }
    }
}
