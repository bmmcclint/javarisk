/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

import java.io.IOException;
import javax.swing.JFrame;
/**
 *
 * @author Brother
 */
public class Risk {
    
    public static void main(String[] args) throws IOException {
        RiskGameEngine gameEngine = new RiskGameEngine();
        RiskGameEngine model = gameEngine;
        RiskGameGUI gui = new RiskGameGUI(gameEngine, model);
        
        gameEngine.addObserver(gui);
        
        gui.setTitle("Risk");
        gui.setSize(1280, 720);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
    }
}
