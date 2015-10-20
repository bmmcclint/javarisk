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
import javax.swing.JPanel;

/**
 *
 * @author Brother
 */
public class MenuPanel extends JPanel{
    private JButton saveButton;
    private JButton returnButton;
    private JButton quitButton;
    
    private final ActionListener screenHandler;
    
    public MenuPanel(RiskGameEngine gameEngine) {
        this.screenHandler = new MenuPanelHandler(gameEngine);
        this.setLayout(new GridLayout(3, 1));
        
        saveButton = new JButton("Save");
        saveButton.addActionListener(screenHandler);
        saveButton.setActionCommand("save");
        this.add(this.saveButton);
        
        returnButton = new JButton("Return to Game");
        returnButton.addActionListener(screenHandler);
        returnButton.setActionCommand("return");
        this.add(this.returnButton);
        
        quitButton = new JButton("Quit");
        quitButton.addActionListener(screenHandler);
        quitButton.setActionCommand("quit");
        this.add(this.quitButton);
    }
    
    class MenuPanelHandler implements ActionListener{
    private final RiskGameEngine model;
    
    public MenuPanelHandler(RiskGameEngine gameEngine) {
        this.model = gameEngine;
    }
    
    public void actionPerformed(ActionEvent event) {
        System.out.println("In action performed for menu panel");
        String command = event.getActionCommand();
        System.out.println("Command received at the menu panel handler: " + command);
        
        if (command.equals("save")) {
            JFileChooser saveGame = new JFileChooser();
            saveGame.showSaveDialog(saveGame);
        }
        
        if (command.equals("return")) {
            this.model.playerTurn();
        }
        
        if (command.equals("quit")) {
            System.exit(0);
        }
        
        else {
            System.out.println("Shit went wrong");
        }
    }
}
}
