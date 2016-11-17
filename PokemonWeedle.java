public class PokemonWeedle extends Pokemon{

    public PokemonWeedle(Player user){
        name = "Weedle";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 4;
        //pokeNum = 13; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Bug/Poison";
        atk = (35 * 2 + iv) * lev / 100 + 5;
        def = (30 * 2 + iv) * lev / 100 + 5;
        spAtk = (20 * 2 + iv) * lev / 100 + 5;
        spDef = (20 * 2 + iv) * lev / 100 + 5;
        spd = (50 * 2 + iv) * lev / 100 + 5;
        hp = (40 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Poison String", "Bug Bite", "---", "---"};
        attPower = new int[]{15, 60, 0, 0};
        attType1 = new String[]{"Poison", "Bug", "", ""};
        attType2 = new String[]{"Physical", "Physical", "", ""};
    }

}