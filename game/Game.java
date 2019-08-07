package game;

import type.Type;

import javax.swing.*;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int typ;
        String trainerName;

        Type.initializeTypes();
        javax.swing.SwingUtilities.invokeLater(Game::startGUI);


        /*
        System.out.println("Welcome to Patrick's pokemon game!");
        System.out.println("Enter your name.");
        trainerName = scan.nextLine();
        System.out.println("Choose your beginner pokemon.");
        System.out.println("1. Bulbasaur, 2. Charmander, 3. Squirtle");
        typ = scan.nextInt();
        while (typ > 4 || typ < 1){
            System.out.print("Please enter a valid beginner Pokemon choice");
            typ = scan.nextInt();
        }
        Pokedex pokedex = new Pokedex();
        Player user = new Player(trainerName, typ, pokedex);
        Options option = new Options();
        //Battle bat = new Battle();
        //PCSystem cp = new PCSystem();
        option.options(option.optionsMenu(), user, pokedex);*/
    }

    public static void startGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);

        GUI g = new GUI();
    }
}
