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
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Brother
 */
public class AttackPanel extends JPanel{
    private JComboBox playerTerrList;
    private JComboBox adjTerrList;
    
    private final JButton atkButton;
    private final JButton returnButton;
    
    private RiskGameEngine model = new RiskGameEngine();
    
    private final ActionListener screenHandler;
    
    public AttackPanel(RiskGameEngine gameEngine) throws IOException {
        this.screenHandler = new AttackPanelHandler(gameEngine);
        this.setLayout(new GridLayout(2,1));
        
        this.model.createAdjTerrList();
        adjTerrList = new JComboBox(model.createAdjTerrList());
        this.add(this.adjTerrList);
        
        atkButton = new JButton("Attack");
        atkButton.addActionListener(screenHandler);
        atkButton.setActionCommand("attack");
        this.add(this.atkButton);
        
        returnButton = new JButton("Return to Game");
        returnButton.addActionListener(screenHandler);
        returnButton.setActionCommand("return");
        this.add(this.returnButton);
    }
        class AttackPanelHandler implements ActionListener{
            private RiskGameEngine model;
    
        public AttackPanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }
    
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for attack panel handler");
            String command = event.getActionCommand();
            System.out.println("Command received in attack panel handler: " + command);
        
            if (command.equals("attack")) {
//              this.model.playerTurn();
            }
        
            if (command.equals("return")) {
                this.model.playerTurn();
            }
        }
    }
}
