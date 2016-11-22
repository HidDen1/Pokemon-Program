package pokemon;

import game.Player;

public class PokemonBeedrill extends Pokemon{

    public PokemonBeedrill(Player user){
        name = "Beedrill";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 10; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Bug/Poison";
        atk = (90 * 2 + iv) * lev / 100 + 5;
        def = (40 * 2 + iv) * lev / 100 + 5;
        spAtk = (45 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (75 * 2 + iv) * lev / 100 + 5;
        hp = (65 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Pursuit", "Bug Bite", "Poison Jab", "Fell Stinger"};
        attPower = new int[]{40, 60, 80, 30};
        attType1 = new String[]{"Dark", "Bug", "Poison", "Bug"};
        attType2 = new String[]{"Physical", "Physical", "Physical", "Physical"};
    }

}