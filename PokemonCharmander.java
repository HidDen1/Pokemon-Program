public class PokemonCharmander extends Pokemon{

    public PokemonCharmander(Player user){
        name = "Charmander";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 2;
        //pokeNum = 4;
        exp = Math.pow(lev * 10 , 2);
        type = "Fire";
        atk = (52 * 2 + iv) * lev / 100 + 5;
        def = (43 * 2 + iv) * lev / 100 + 5;
        spAtk = (60 * 2 + iv) * lev / 100 + 5;
        spDef = (50 * 2 + iv) * lev / 100 + 5;
        spd = (65 * 2 + iv) * lev / 100 + 5;
        hp = (39 * 2 + iv) * lev / 100 + 10;
        att[0] = "Ember";
        attPower[0] = 40;
        attType1 [0] = "Fire";
        attType2 [0] = "Special";
        att[1] = "Dragon Rage";
        attPower[1] = 40;
        attType1 [1] = "Dragon";
        attType2 [1] = "Special";
        att[2] = "Fire Fang";
        attPower[2] = 65;
        attType1 [2] = "Fire";
        attType2 [2] = "Physical";
        att[3] = "Flamethrower";
        attPower[3] = 90;
        attType1 [3] = "Fire";
        attType2 [3] = "Special";
    }
}