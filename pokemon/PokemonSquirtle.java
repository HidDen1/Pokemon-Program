package pokemon;

public class PokemonSquirtle extends Pokemon{

    public PokemonSquirtle(){
        name = "Squirtle";
        iv = ivGenerator();
        //id = 3;
        //pokeNum = 7;
        exp = Math.pow(lev * 10 , 2);
        type = "Water";
        atk = (48 * 2 + iv) * lev / 100 + 5;
        def = (65 * 2 + iv) * lev / 100 + 5;
        spAtk = (50 * 2 + iv) * lev / 100 + 5;
        spDef = (64 * 2 + iv) * lev / 100 + 5;
        spd = (43 * 2 + iv) * lev / 100 + 5;
        hp = (44 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Water Gun", "Water Pulse", "Bite", "Brine"};
        attPower = new int[]{40, 60, 60, 65};
        attType1 = new String[]{"Water", "Water", "Dark", "Water"};
        attType2 = new String[]{"Special", "Special", "Physical", "Special"};
    }

}