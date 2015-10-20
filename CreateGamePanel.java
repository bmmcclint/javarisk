/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.awt.BorderLayout;
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
public class CreateGamePanel extends JPanel {
    
    private final JLabel numOfPlayers;
    private final JButton threeP;
    private final JButton fourP;
    private final JButton fiveP;
    private final JButton sixP;
    private final JButton backButton;
    
    private final RiskGameEngine model;
    
//    private int playerCount;
    
    private final ActionListener screenHandler;
    
    public CreateGamePanel(RiskGameEngine gameEngine) {
        this.model = gameEngine;
        this.screenHandler = new CreateGamePanelHandler(gameEngine);
        
        
        this.numOfPlayers = new JLabel("How many people will be playing?");
        add(this.numOfPlayers, BorderLayout.PAGE_START);

        this.threeP = new JButton("3");
        add(this.threeP, BorderLayout.BEFORE_LINE_BEGINS);
        this.threeP.addActionListener(screenHandler);
        this.threeP.setActionCommand("3");

        this.fourP = new JButton("4");
        add(this.fourP, BorderLayout.LINE_START);
        this.fourP.addActionListener(screenHandler);
        this.fourP.setActionCommand("4");

        this.fiveP = new JButton("5");
        add(this.fiveP, BorderLayout.LINE_END);
        this.fiveP.addActionListener(screenHandler);
        this.fiveP.setActionCommand("5");

        this.sixP = new JButton("6");
        add(this.sixP, BorderLayout.AFTER_LINE_ENDS);
        this.sixP.addActionListener(screenHandler);
        this.sixP.setActionCommand("6");

        this.backButton = new JButton("Back");
        add(this.backButton, BorderLayout.PAGE_END);
        this.backButton.addActionListener(screenHandler);
        this.backButton.setActionCommand("2");

    }


        class CreateGamePanelHandler implements ActionListener {
            private final RiskGameEngine model;

        public CreateGamePanelHandler(RiskGameEngine gameEngine) {
            this.model = gameEngine;
        }

            @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("In action performed for create game screen");
            String command = event.getActionCommand();
            System.out.println("Command received in create game handler: " + command);
                int pCount = model.getPlayerCount();

//            if (playerCount.getActionCommand() != null) {
//                data = playerCount.getItemAt(playerCount.getSelectedIndex()) + 
//                        " were selected.";
//            statusLabel.setText(data);
//            }
            /* for each numbered button, set specified number to setPlayer()
                use as continue button
            */
//                do {
//                for (int i = 3; i < pCount; i--) {
//                    for (int j = 0; j < pCount; j++) {
//                        JTextField pName = new JTextField();
//                        this.add(pName);
//                        }
//                    }
//                } while (command.contentEquals("3,4,5,6"));
        
        
            if (command.equals("3")) {
                model.setPlayerCount(3);
                model.playerNamePanel();
            }
            
            if (command.equals("4")) {
                model.setPlayerCount(4);
                model.playerNamePanel();
            }
            
            if (command.equals("5")) {
                model.setPlayerCount(5);
                model.playerNamePanel();
            }
            
            if (command.equals("6")) {
                model.setPlayerCount(6);
                model.playerNamePanel();
            }

            if (command.equals("2")) {
                System.out.println("In create game panel handler of create game");
                model.namePanel();
            }

//            int x = Integer.valueOf(command);
//            model.setPlayerCount(x);
//            System.out.println("~~~~~~~~~~2" + model.getPlayerCount());

//            this.model.playerNamePanel();
        }

     }
}

