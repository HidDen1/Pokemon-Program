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
        //javax.swing.SwingUtilities.invokeLater(game.Game::startGUI);

        System.out.println("Welcome to Patrick's pokemon game!");
        System.out.println("Enter your name.");
        trainerName = scan.nextLine();
        System.out.println("Choose your beginner pokemon.");
        System.out.println("1. Bulbasaur, 2. Charmander, 3. Squirtle");
        typ = scan.nextInt();
        Inventory inventory = new Inventory();
        Player user = new Player(trainerName, typ);
        Options option = new Options();
        Battle bat = new Battle();
        option.options(option.optionsMenu(), user, inventory, bat);
    }

    public static void startGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);
        Game g = new Game();
    }
}
