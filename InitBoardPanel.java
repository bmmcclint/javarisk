/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brother
 */
public class InitBoardPanel extends JPanel{
    private final JLabel picLabel;
    
    private final JTextField playerName;
    
    private final ImageIcon riskBoard;
    private final JButton placeArmyButton;
    
    private final JPanel initBoard;
    
    private final JLabel territorySelection;
    
    private final JComboBox territoryList;
    
    private final ActionListener screenHandler;
 
    private final RiskGameEngine model;
    
    
    public InitBoardPanel(RiskGameEngine gameEngine) throws IOException {
        this.model = gameEngine;
        this.screenHandler = new InitBoardPanelHandler(gameEngine);
        this.initBoard = new JPanel();
        this.initBoard.setLayout(new BorderLayout());
        this.initBoard.setVisible(true);
        riskBoard = new ImageIcon("src/riskgamegui/RiskBoard3.jpeg");
        this.picLabel = new JLabel();
        this.picLabel.setIcon(riskBoard);
        this.add(this.picLabel, BorderLayout.CENTER);
        
        territorySelection = new JLabel("Select an territory you wish to own");
        this.add(territorySelection, BorderLayout.SOUTH);
   
        this.model.createTerritoryList();
        territoryList = new JComboBox(model.createTerritoryList());
        this.add(this.territoryList);
        
        
        playerName = new JTextField();
        playerName.setEditable(false);
        this.add(playerName);
        
        placeArmyButton = new JButton("Place Army");
        placeArmyButton.addActionListener(screenHandler);
        placeArmyButton.setActionCommand("next");
        this.add(placeArmyButton);
 
    }
       class InitBoardPanelHandler implements ActionListener{
                private final RiskGameEngine model;
    
            public InitBoardPanelHandler(RiskGameEngine gameEngine) {
                this.model = gameEngine;
            }
    
            public void actionPerformed(ActionEvent event) {
                System.out.println("In action performed for init board screen");
                String command = event.getActionCommand();

            if (command.equals("next")) {
                this.model.playerTurn();
            }
        }
    }
}
