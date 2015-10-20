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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Brother
 */
public class GameNamePanel extends JPanel{
    private final JLabel gameNameLabel;
    private final JTextField gameNameText;
    private final JButton nextScreen;
    private final JButton backButton;
    
    private final ActionListener screenHandler;
    
    public GameNamePanel(RiskGameEngine gameEngine) {
        
        
        this.screenHandler = new GameNamePanelHandler( gameEngine);
        this.setLayout(new GridLayout(4,1));
        
        gameNameLabel = new JLabel("Enter the name of the game:");
        this.add(gameNameLabel);
        gameNameText = new JTextField();
        gameNameText.setActionCommand(gameNameText.getText());
        this.add(gameNameText);
        
        nextScreen = new JButton("Continue");
        nextScreen.addActionListener(screenHandler);
        nextScreen.setActionCommand("Continue");
        this.add(this.nextScreen);
        
        this.backButton = new JButton("Cancel");
        this.backButton.addActionListener(screenHandler);
        this.backButton.setActionCommand("Back");
        this.add(this.backButton);
    }
    
    /**
     *  Start of Inner class GameNamePanelHandler
     * @param gameEngine 
     */
    class GameNamePanelHandler implements ActionListener{
        /** Model RiskGameEngine.*/
        private final RiskGameEngine model;
   
    public GameNamePanelHandler(RiskGameEngine gameEngine) {
        this.model = gameEngine;
    }
    
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            String gameName;
            System.out.println("In action performed for game name panel handler");
            System.out.println("Command received in name handler: " + gameNameText.getText());
            
            
            if (command.equals("Continue")){
                gameName = gameNameText.getText();
                
                model.makeGame(command);
                System.out.println(model.getName());
                //this.model.makeGame(command);
                this.model.createNewGame();
            }
            
            if (command.equals("Back")) {
                System.exit(0);
            }
            
        } // end actionPerformed
    } //end of inner class
} //end of class
