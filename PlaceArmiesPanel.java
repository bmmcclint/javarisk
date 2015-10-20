/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Brother
 */
public class PlaceArmiesPanel extends JPanel{
   private JComboBox territoryList;
   
   private JRadioButton infantry;
   private JRadioButton cavalry;
   private JRadioButton artillery;
   
   private JButton placeArmyButton;
   private JButton returnButton;
   
   private ActionListener screenHandler;
   
   public PlaceArmiesPanel(RiskGameEngine gameEngine) {
      this.screenHandler = new PlaceArmiesPanelHandler(gameEngine);
      this.setLayout(new BorderLayout());
      
      territoryList = new JComboBox();
      this.add(this.territoryList, BorderLayout.BEFORE_FIRST_LINE);
      
      infantry = new JRadioButton("Infantry");
      this.add(this.infantry, BorderLayout.LINE_START);
      cavalry = new JRadioButton("Cavalry");
      this.add(this.cavalry, BorderLayout.CENTER);
      artillery = new JRadioButton("Artillery");
      this.add(this.artillery, BorderLayout.LINE_END);
      
      placeArmyButton = new JButton("Place Army");
      placeArmyButton.addActionListener(screenHandler);
      placeArmyButton.setActionCommand("place");
      this.add(this.placeArmyButton, BorderLayout.SOUTH);
      
      returnButton = new JButton("Return to Game");
      returnButton.addActionListener(screenHandler);
      returnButton.setActionCommand("return");
      this.add(this.returnButton, BorderLayout.AFTER_LAST_LINE);
   }
      
      class PlaceArmiesPanelHandler implements ActionListener{
        private RiskGameEngine model;
    
        public PlaceArmiesPanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }
    
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for place army panel handler");
            String command = event.getActionCommand();
            System.out.println("Command received at the place army panel handler: " + command);
        
            if (command.equals("place")) {
//              this.model.playerTurn();
            }
        
            if (command.equals("return")) {
                this.model.playerTurn();
            }
        
            else {
                System.out.println("Shit went wrong");
            }
        }
    }
}
