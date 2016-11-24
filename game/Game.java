package game;

import type.Type;
import type.TypeFire;
import type.TypeGrass;

import javax.swing.*;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int typ;
        String trainerName;

        //javax.swing.SwingUtilities.invokeLater(game.Game::startGUI);

        System.out.println("Welcome to Patrick's pokemon.pokemon game.Game!");
        System.out.println("Enter your name.");
        trainerName = scan.nextLine();
        System.out.println("Choose your beginner pokemon.pokemon.");
        System.out.println("1. Bulbasaur, 2. Charmander, 3. Squirtle");
        typ = scan.nextInt();
        Inventory inventory = new Inventory();
        Player user = new Player(trainerName, typ, inventory);
        Options option = new Options();
        Battle bat = new Battle();
        option.optionsMenu(user, option, inventory, bat);
    }

    public static void startGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);
        Game g = new Game();
    }
}

/*
    Bug List:
    -Wild pokemon using non existent moves

    Battle mechanics that still need to be added:
    -Switching Pokemon in battle
    -Not losing till all available pokemon faint
    -Switching pokemon into the party from the pc
    -Checking stats
    -Evolution
    -Typing
    -EVs
    -Proper IVs
    -Natures
    -Proper Exp calculations
    -Abilities
    -Switching pokemon around in the party
    -Proper movesets
    -Proper id assigning when catching pokemon and in all of the methods that currently have party[0] as placeholders


    Version History:

    Version 0.18.00 11/22/2016
    -Added ability to shop at marts when found

    Version 0.17.00 11/21/2016
    -Added the EmptyPokemon to act as a default
    -Fixed Pokemon wild not being created correctly
    -Fixed beginner Pokemon classes so that proper beginners are made
    -Removed Pokemon battling and other unnecessary code from battle

    Version 0.16.00 11/17/2016
    -Added ability to have all pokemon healed when finding a pokemon center
    -Added ability to find items at random locations
    -Added message when Pokemon is captured
    -Added ability to go back when just checking items
    -Added classes for each pokemon
    -Changed the catching of a pokemon to be determined by an int rather than a boolean
    -Fixed potion messages saying health points instead of battle points
    -Fixed the battle not being ended after a Pokemon is caught
    -Fixed Charizard's flamethrower typing
    -Fixed Butterfree's silverwind attack type

    Version 0.15.00 11/16/2016
    -Added method for catching Pokemon
    -Removed the evolution class

    Version 0.14.00 11/15/2016
    -Added exception to player attack phase to make sure an appropriate action is chosen
    -Added exception to player attack phase to make sure an appropriate attack is chosen
    -Fixed crash when using potions and health going over max
    -Fixed the issue of using an item ending the battle
    -Fixed items taking a users turn when not used
    -Fixed the text output when using any pokeball
    -Fixed the empty bag message not showing up after using an item and the bag being empty

    Version 0.13.00 11/14/2016
    -Changed the chance of getting an item to 70% instead of 30%
    -Changed the wild level cap to one temporary
    -Changed actions in battle to be done by an entered number rather than the name of the action
    -Fixed Potions not appearing
    -Fixed null items appearing

    Version 0.12.00 11/12/2016
    -Added ability to use potions
    -Misc cleaning of code

    Version 0.11.00 11/8/2016 - 11/10/2016
    -Began working on using items method
    -Removed comments about what each method does

    Version 0.10.00 11/7/2016
    -Fixed pokemon.pokemon's stats not increasing upon level up

    Version 0.09.00 11/6/2016
    -Added ability to find loot after battle
    -Added arrays for remaining health, level, and exp for each pokemon and updated each class for them to function
    -Added the Pokedex, Evolution, and Typing classes
    -Added Weedle, Kakuna, Beedrill, Pidgey, Pidgeotto, and Pidgeot to the pokemon.pokemon class
    -Added comments in player explaining the purpose of methods and any changes needed done to them
    -Changed the item array to an arraylist due to issues
    -Changed wild pokemon level range to be up to 5 levels higher than beginner pokemon
    -Fixed ability to check items
    -Fixed pokemon.pokemon not retaining their health after battle
    -Fixed exp not functioning correctly
    -Misc cleaning of code

    Version 0.08.00 11/4/2016
    -Added different locations that can be found
    -Added item array
    -Added method for getting a random item
    -Added method for viewing items
    -Changed the wild level cap to 7 for now

    Version 0.07.00 11/3/2016
    -Added Pokeball, Greatball, Ultraball, Potion, Super Potion, and Hyper Potion to item class
    -Added the game.Inventory class
    -Began adding pokemon.pokemon keeping health after a battle
    -Began working on player inventory
    -Fixed Charizard's only spawning at level 50
    -Misc cleaning up of code

    Version 0.06.00 11/2/2016
    -Added ability to check party pokemon.pokemon during battle
    -Added display of health and level during battle
    -Added rounding for HP and battle damage
    -Added if statements to prevent a pokemon.pokemon's current health from going below 0
    -Added Caterpie, Metapod, and Butterfree to pokemon.pokemon class
    -Added if statement to make sure player does not use non existent moves
    -Added method to make sure wild pokemon.pokemon do not use non existent moves
    -Changed Spawn rates. Common 60 to 70, Rare 71 to 90, Super Rare 91 to
    -Changed Spawn levels. Wild pokemon.pokemon cannot be higher than 5 levels above the beginner's level
    -Fixed beginner pokemon.pokemon not getting the proper stats for battle
    -Fixed program not quitting after losing a battle or manually quitting the program

    Version 0.05.00 11/1/2016
    -Added temporary way to check beginner stats for testing if the methods work when in arrays
    -Added ability to check party pokemon.pokemon
    -Added ability to go back from checking party pokemon and getting trainer info
    -Removed Adventure class

    Version 0.04.00 10/31/2016
    -Added ability to gain trainer experience
    -Added ability to gain pokedollars
    -Added ability to view your name (though currently shows Charizard), level, current exp and exp for next level, and Pokedollars
    -Added typing for each pokemon.pokemon
    -Added typing for moves
    -Added Critical Hit chance to damage
    -Added random to damage
    -Added ability to choose a beginner pokemon.pokemon
    -Misc cleaning up of code

    Version 0.03.00 10/30/2016:
    -Misc bug fixes for battling
    -Added the ability to run from a wild pokemon.pokemon
    -Added option to go back from fighting in battle
    -Fixed game.Battle damage
    -Fixed pokemon.pokemon not fainting

    Version 0.02.00 10/26/2016:
    -Added the Adventure, game.Item, pokemon.pokemon, Option, game.Player, pokemon.Stats,  and game.Battle Classes
    -Added a temporary Charizard to be used by the player until beginner pokemon.pokemon and catching are added
    -Added methods in the player class for gaining experience after a wild pokemon.pokemon is beaten
    -Added methods to the battle class for initializing the battle and the turns for players and wild pokemon
    -Added damage calculations in battle
    -Added Bulbasuar, Ivysaur, Venusaur, Charmander, Charmeleon, Charizard, Squirtle, Wartortle, and Blastoise to pokemon.pokemon class
    -Added random generators to the pokemon class for levels, ivs, and pokemon.pokemon selection
    -Added variables for all stats in the stats class and methods for getting those variables
    -Moved all contents of the Adventure class into the options class
    -Changed the if statement in options to a switch case
    -Disabled trainer stats as it was causing crashes
    -Disabled exp methods as they are not working properly
    -Removed all static methods

    Version 0.01.00 10/25/2016:
    -Added greeting
    -Added ability to add trainer name
    -Added options menu method
    -Added method that calls to other methods depending on the selected option


    //Test Charizard
        //int typ = 1
        /*switch(typ) {
            case 1:
                name = "Charizard";
                //gainedLevels =
                lev = 50 + gainedLevels;
                iv = 31;
                id = 1;
                exp = gainedExp;
                type = "Fire / Flying";
                atk = (84 * 2 + iv) * lev / 100 + 5;
                def = (78 * 2 + iv) * lev / 100 + 5;
                spAtk = (109 * 2 + iv) * lev / 100 + 5;
                spDef = (85 * 2 + iv) * lev / 100 + 5;
                spd = (100 * 2 + iv) * lev / 100 + 5;
                hp = (78 * 2 + iv) * lev / 100 + 10;
                att[0] = "Flare Blitz";
                attPower[0] = 120;
                attType1 [0] = "Fire";
                attType2[0] = "Physical";
                att[1] = "Fire Blast";
                attPower[1] = 120;
                attType1 [1] = "Fire";
                attType2[1] = "Special";
                att[2] = "Heat Wave";
                attPower[2] = 90;
                attType1 [2] = "Fire";
                attType2[2] = "Special";
                att[3] = "Flamethrower";
                attPower[3] = 90;
                attType1 [3] = "Grass";
                attType2[3] = "Special";
                break;
        }*/
