# Pokemon-Program
##Jeremy Goals: 
####Separate all pokemon into their own classes
Finished
####Make attacks their own concept-class to hold types, power, name, etc
Finished
####Make Types their own concept-class to hold what it is strong and weak against
Finished and implemented
####Evolution
two new variables to determine when to evolve (the level it happens at and the pokemon to turn into)
-Letting pat take care of the actual process
####Items
TODO: Differentiate all items and create continuous item functioning
##Changelog
    Bug List:
    -Wild pokemon using non existent moves
    -Index out of bounds error when using ultra ball/when something reached 7
    -Empty slots can be used in battle
    -Stats are not accurate to games
    -Checking bag shuts down the game
    -Catching Pokemon is very broken
    -The misc empty exceptions will mostly likley be dealt with when gui is created
    -Trainer info doesnt want me to display my party
    -User being prompted to replace a new attack on the third attack learned
     
    Battle mechanics that still need to be added:
    -PP
    -Accuracy and Evasivness
    -Attack and other misc descriptions
    -Not losing till all available pokemon faint
    -Switching pokemon into the party from the pc (pc temporarily disabled)
    -Typing (implemented?)
    -Proper Exp calculations
    -Abilities
    -Switching pokemon around in the party
    -Proper movesets (similar to evolution)
    -Proper id assigning when catching pokemon and in all of the methods that currently have party[0] as placeholders (once items are fixed)
    -Status effects
    -Having less then 6 pokemon after more then 6 are caught (once items are fixed)
    -Double, Triple, Trainer battles
     
     
    Version History:

    Version 0.46.00 2/28/2017
    -Added a method that lets you teach Pokemon new moves and lets them automatically learn them if they do not have 4 attacks

    Version 0.45.00 2/27/2017
    -Added array to get initial Pokemon attacks to Pokemon class

    Version 0.44.00 2/22/2017
    -Began adding held items
    -Began adding proper move learning on level up
    -Added held item value in Pokemon class
    -Added arrays for levels that attacks are learned and all of the possible attacks that can be learned
    -Added the attacks Scratch, Growl (doesn't do anything), Smokescreen (doesn't do anything), Scary Face (doesn't do anything),
    Fire Spin, Inferno

    Version 0.43.00 2/17/2017
    -Improved Pokedex formatting
    -Fixed party being displayed twice sometimes outside of battle
    -Fixed types not being displayed correctly

    Version 0.42.00 2/16/2017
    -Fixed crash when displaying attack info outside of battle
    -Fixed attack names not being displayed outside of battle

    Version 0.41.00 2/15/2017
    -Added descriptions to attacks when viewed in battle
    -Added Pokemon viewing choice outside of battle to allow choice between viewing moves and summary
    -Fixed error when going back in the menus after checking Pokemon outside of battle

    Version 0.40.00 2/13/2017
    -Added Pokedex entries for Bulbasaur, Charmander, and Squirtle evolution lines
    -Added ability to view attack info during battle
    -Added descriptions, powerpoint values, and accuracy values to all attacks (currently do not function)
    -Misc code fixes and improvements

    Version 0.39.00 2/12/2017
    -Added exceptions for choosing beginner Pokemon
    -Added Pikachu as a secret fourth starter
    -Added placeholder description for all current Pokemon in Pokedex
    -Began adding ability to check a Pokemon's moves during battle
    -Fixed pokedex array sizes for new Pokemon
    -Misc cleaning of code
    -Misc improvements to the battle class

    Version 0.38.00 2/9/2017
    -Added the Pokemon Ekans, Arbok, Pikachu (termorarily evolves at level 30), and Raichu
    -Added correct base stats for the previous versions new Pokemon
    -Added the attacks Drill Run, Drill Peck, Acid, Acid Spray, Mud Bomb, Gunk Shot, Thunderbolt, Iron Tail, Volt Tackle, Discharge,
    and Thunder
    -Added amount variable for the amount of Pokemon in each rarity so it can vary
    -Added ability to find Rattata, Raticate, Spearow, and Fearow in the wild

    Version 0.37.00 2/8/2017
    -Added the Pokemon Rattata, Raticate, Spearow, and Fearow
    -Added the attacks Hyper Fang, Crunch, Assurance, Fury Attack (only hits once with 3x damage), and Aerial Ace

    Version 0.36.00 2/7/2017
    -Added Pokedex description for Charmander
    -Fixed Pokedex not displaying descriptions correctly
    -Fixed crash when going back in pokedex

    Version 0.35.00 2/3/2017
    -Added placeholders for beginner descriptions
    -Added description array to pokedex

    Version 0.34.00 2/2/2017
    -Added ability to check Pokedex in options menu
    -Added beginner evolved forms to Pokedex
    -Added Pokedex parameters to misc methods
    -Fixed amount of pokemon in Pokedex
    -Temporarily removed empty slot exception from Pokedex
    -Misc code improvements

    Version 0.33.00 2/1/2017
    -Added beginner being registered to the Pokedex
    -Added basic description functionality to Pokedex
    -Changed the Pokenum variable to an int
    -Fixed beginner pokemon choice being broken
    -Fixed crash when checking stats in battle
    -Temporarily removed check for empty slots as it was broken anyways

    Version 0.32.00 1/27/2017 - 1/31/2017
    -Added methods for getting additional values from pokemon including evs, ivs, and base stats
    -Added separate variables for base stats to make calculations easier
    -Added better evolution by making a new pokemon and setting the old pokemon values equal to
    -Added new calculations for leveling up (same as new ones in evolution)
    -Added the gaining of EVs whenever a Pokemon is defeated
    -Fixed evolved Pokemon having lower stats than its previous evolution
    -Misc cleaning of code

    Version 0.31.00 1/25/2017 - 1/26/2017
    -Added variables for base stats
    -Added ivs for each individual stat
    -Added final stat calculations in pokemon classes that include correct evs and ivs
    -Temporarily disabled all pc system features

    Version 0.30.00 1/24/2017
    -Added natures to level up calculations
    -Added natures to pokemon
    -Added evs given from defeating a pokemon
    -Added values to store a Pokemon's evs

    Version 0.29.00 1/22/2017-1/23/2017
    -Added a main nature class and classes for each nature
    -Added genders to all pokemon
    -Added gender to stats display
    -Added nature generator
    -Added natures to stat view
    -Added nature bonuses to stat calculations
    -Changed the way items work
    -Fixed stats not being displayed properly
    -Began implementing natures and EVs

    Version 0.28.00 1/13/2017
    -Added exception so that the stats of an empty slot cannot be viewed
    -Fixed crashes when checking party pokemon
    -Catch rate increased temporarily

    Version 0.27.00 1/11/2017
    -Further implementation of PC system
    -Crashes when trying to catch Pokemon found

    Version 0.26.00 1/2/2017
    -Mis reference fixes

    Version 0.25.00 12/14/2016
    -Began implementing PC System
     
    Version 0.24.00 12/13/2016
    -Added the ability to level up, gain experience, and evolve any pokemon in the party
    -Added the ability for pokemon to evolve
    -Fixed stats for wild Pokemon and beginner Pokemon
     
    Version 0.23.00 12/12/2016
    -Began implementing evolution

    Version 0.22.00 12/5/2016
    -Added pokemon switching and summaries in battle
    -Added pokemon summaries out of battle
    -Added Attack class
    -Added attacks for all current pokemon
    -Changed the method for displaying party pokemon
    -Removed getRunChance and getRandom methods in battle as getChance literally does the same thing
    -Removed stats class and moved all methods to Pokemon class
    -Fixed Critical Hits from being nearly impossible
    -Fixed and updated misc things in battle
    -Fixed checking stats not working
    -Fixed attack names being dumb
     
    Version 0.21.00 12/1/2016
    -Added loop to make sure you do not send out a Pokemon with no health in battle
    -Changed the methods in the battle class to use the current selected pokemon rather than just the beginner
     
    Version 0.20.00 11/30/2016
    -Added if statement to make sure you do not exceed 6 pokemon when capturing new ones
     
    Version 0.19.00 11/23/2016
    -Added change level method
    -Added a few nonfunctioning types
    -Changed Pokemon by putting them into rarity methods
    -Changed how new wild Pokemon are found
    -Removed parameters from Pokemon class
    -Removed the empty pokemon class
    -Fixed misc issues because of changes
     
    Version 0.18.00 11/22/2016
    -Added ability to shop at marts when found
     
    Version 0.17.00 11/21/2016
    -Added the EmptyPokemon to act as a default
    -Fixed pokemon.Pokemon wild not being created correctly
    -Fixed beginner pokemon.Pokemon classes so that proper beginners are made
    -Removed pokemon.Pokemon battling and other unnecessary code from battle
     
    Version 0.16.00 11/17/2016
    -Added ability to have all pokemon healed when finding a pokemon center
    -Added ability to find items at random locations
    -Added message when pokemon.Pokemon is captured
    -Added ability to go back when just checking items
    -Added classes for each pokemon
    -Changed the catching of a pokemon to be determined by an int rather than a boolean
    -Fixed potion messages saying health points instead of battle points
    -Fixed the battle not being ended after a pokemon.Pokemon is caught
    -Fixed Charizard's flamethrower typing
    -Fixed Butterfree's silverwind attack type
     
    Version 0.15.00 11/16/2016
    -Added method for catching pokemon
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
    -Added the Adventure, item.Item, pokemon.pokemon, Option, game.Player, pokemon.Stats,  and game.Battle Classes
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
     
      
    Test Charizard
        int typ = 1
        switch(typ) {
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
        }