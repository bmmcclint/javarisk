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
import javax.swing.JTextField;

/**
 *
 * @author Brother
 */
public class PlayerNamePanel extends JPanel{
    private final JLabel enterPlayerNamesLabel;
    private final JTextField player1TF;
    private final JTextField player2TF;
    private final JTextField player3TF;
    private JTextField player4TF;
    private JTextField player5TF;
    private JTextField player6TF;
    
    private final JButton nextButton;
    private final JButton backButton;
    
    private final RiskGameEngine model;
    
    private final ActionListener screenHandler;
       
    public PlayerNamePanel(RiskGameEngine gameEngine) {
        this.model = gameEngine;
        this.screenHandler = new PlayerNamePanelHandler(gameEngine);
        this.setLayout(new GridLayout(8,1));
        
        enterPlayerNamesLabel = new JLabel("Enter the names of the players:");
        this.add(this.enterPlayerNamesLabel);
        
        player1TF = new JTextField("Bob");
        player1TF.addActionListener(screenHandler);
        player1TF.setEditable(true);
        this.add(this.player1TF);
        
        player2TF = new JTextField("John");
        player2TF.setEditable(true);
        player2TF.addActionListener(screenHandler);
        this.add(this.player2TF);
        
        player3TF = new JTextField("Mary");
        player3TF.setEditable(true);
        player3TF.addActionListener(screenHandler);
        this.add(this.player3TF);
                 
        nextButton = new JButton("Continue");
        nextButton.addActionListener(screenHandler);
        nextButton.setActionCommand("Continue");
        this.add(this.nextButton);
        
        this.backButton = new JButton("Back");
        this.backButton.addActionListener(screenHandler);
        this.backButton.setActionCommand("Back");
        this.add(this.backButton);
    
    }
            
    class PlayerNamePanelHandler implements ActionListener {
        private final RiskGameEngine model;
        
   
        public PlayerNamePanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }
        
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for player name panel");
            String command = event.getActionCommand();
            System.out.println("Command received in player name handler: " + command);
//            
//            List<String> list = new ArrayList<String>();
//            
//            String playersName = player1TF.getText();
//            list.add(playersName);
//            System.out.println(playersName);
            
            if (command.equals("Back")) {
                this.model.createNewGame();
            }
            
            if (command.equals("Continue")) {
                this.model.initBoard();
            }
        }
        
    }
}


