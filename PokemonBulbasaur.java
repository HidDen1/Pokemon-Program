/**
 * Created by hidden on 11/16/16.
 */
public class PokemonBulbasaur extends Pokemon{

    public PokemonBulbasaur(Player user){
        name = "Bulbasaur";
        lev = levelGenerator(user);
        iv = ivGenerator(); //will need seperate generators for each stats IVs
        //id = 1;
        //pokeNum = 1; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Grass";
        atk = (49 * 2 + iv) * lev / 100 + 5;
        def = (49 * 2 + iv) * lev / 100 + 5;
        spAtk = (65 * 2 + iv) * lev / 100 + 5;
        spDef = (65 * 2 + iv) * lev / 100 + 5;
        spd = (45 * 2 + iv) * lev / 100 + 5;
        hp = (45 * 2 + iv) * lev / 100 + 10;
        att[0] = "Vine Whip";
        attPower[0] = 45;
        attType1 [0] = "Grass";
        attType2 [0] = "Physical";
        att[1] = "Razorleaf";
        attPower[1] = 55;
        attType1 [1] = "Grass";
        attType2 [1] = "Physical";
        att[2] = "Seed Bomb";
        attPower[2] = 80;
        attType1 [2] = "Grass";
        attType2 [2] = "Physical";
        att[3] = "Solarbeam";
        attPower[3] = 120;
        attType1 [3] = "Grass";
        attType2 [3] = "Special";
    }
}