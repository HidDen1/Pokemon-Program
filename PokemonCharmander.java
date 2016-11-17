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
        att = new String[]{"Ember", "Dragon Rage", "Fire Fang", "Flamethrower"};
        attPower = new int[]{40, 40, 65, 90};
        attType1 = new String[]{"Fire", "Dragon", "Fire", "Fire"};
        attType2 = new String[]{"Special", "Special", "Physical", "Special"};
    }
}