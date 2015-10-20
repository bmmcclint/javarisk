/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskgamegui;

/**
 *
 * @author Brother
 */
public class NPlayers {
    
    private final String playersInGame;
        
        public NPlayers(String playersInGame) {
            this.playersInGame = playersInGame;
       }
            
        @Override
       public String toString() {
            return this.playersInGame;
       }
}
