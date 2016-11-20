package pokemon;

public class PokemonButterfree extends Pokemon{

    public PokemonButterfree(Player user){
        name = "Butterfree";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 12; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Bug/Flying";
        atk = (45 * 2 + iv) * lev / 100 + 5;
        def = (50 * 2 + iv) * lev / 100 + 5;
        spAtk = (90 * 2 + iv) * lev / 100 + 5;
        spDef = (80 * 2 + iv) * lev / 100 + 5;
        spd = (70 * 2 + iv) * lev / 100 + 5;
        hp = (60 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Psybeam", "Bug Bite", "Silver Wind", "Bug Buzz"};
        attPower = new int[]{65, 60, 60, 90};
        attType1 = new String[]{"Psychic", "Bug", "Bug", "Bug"};
        attType2 = new String[]{"Special", "Physical", "Special", "Special"};
    }

}