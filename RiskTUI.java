//package riskgamegui;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class RiskTUI {
//      
//    public static void main (String[] args) {
//        int r = mainMenu();
//    }
//    
//    public static int mainMenu() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Welcome to Java Risk TUI!");
//        System.out.println("Choose an option: \n1) Start new game \n2) Load saved game \n3) Exit");
//        int r = in.nextInt();
//        if (r == 1) {
//            String gN = gameName();
//            int numPlayers = numOfPlayers();
//            
//        }
//        if (r == 2) {
//            
//        }
//        if (r == 3) {
//            System.out.println("I guess this game is to good for you, the game will no terminate and self-destruct... asshole!");
//            System.exit(0);
//        }
//        if (r >= 4) {
//            System.out.println("You've selected an option not listed, game will terminate!");
//            System.exit(0);
//        }
//        return r;
//    }
//    
//    public static String gameName() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a name for the game... \nThis will be used for saving/loading purposes:");
//        String gName = in.next();
//        System.out.println("You've chosen " + gName + " as your game's name.");
//        return gName;
//    }
//    
//    public static int numOfPlayers() {
//        Scanner in = new Scanner(System.in);
//        String players = ("Please enter the number of players you will (must be at least 3)");
//        System.out.println(players);
//        int numPlayers = in.nextInt(); 
//        return numPlayers;
//    }
//    
//    public static int playerNames() {
//        Scanner in = new Scanner(System.in);
//        String inst = ("Please enter the names of each player:");
//        System.out.println(inst);
//        for (int i = 0; i < numPlayers; i++) {
//            
//        }  
//    }
//}
