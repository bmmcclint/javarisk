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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Brother
 */
public class StartScreenPanel extends JPanel{
    private JButton newGameButton;
    private JButton continueGameButton;
    private JButton exitGameButton;
    
    private ActionListener screenHandler;
    
    public StartScreenPanel(RiskGameEngine gameEngine) {
        this.screenHandler = new StartScreenPanelHandler(gameEngine);
        this.setLayout(new GridLayout(3,1));
        
        newGameButton = new JButton("New Game");
        newGameButton.setActionCommand("createGame");
        newGameButton.addActionListener(screenHandler);
        this.add(newGameButton);
        
        continueGameButton = new JButton("Load Game");
        continueGameButton.setActionCommand("loadGame");
        continueGameButton.addActionListener(screenHandler);
        this.add(continueGameButton);
        
        exitGameButton = new JButton("Exit");
        exitGameButton.setActionCommand("Exit");
        exitGameButton.addActionListener(screenHandler);
        this.add(exitGameButton);
    }
    
    class StartScreenPanelHandler implements ActionListener {
        private final RiskGameEngine model;
        
        public StartScreenPanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine; 
        }
        
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for start screen");
            String command = event.getActionCommand();
            System.out.println("Command received at the start screen handler: " + command);
            
            if (command.equals("createGame")) {
                System.out.println("Inside create game if in start screen handler");
                this.model.namePanel();
            }
            
            if (command.equals("loadGame")) {
                System.out.println("Inside load game if in start screen handler");
                JFileChooser fChoice = new JFileChooser();
                fChoice.setDialogTitle("Choose a saved game");
                fChoice.showOpenDialog(fChoice);
            }
            
            if (command.equals("Exit")) {
                System.exit(0);
            }
            
//            else {
//                System.out.println("SHIT went wrong");
//            }
        }
    }

}



