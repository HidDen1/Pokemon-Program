public class PokemonCharmeleon extends Pokemon{

    public PokemonCharmeleon(Player user){
        name = "Charmeleon";
        lev = levelGenerator(user);
        iv = ivGenerator();
        //id = 2;
        //pokeNum = 5;
        exp = Math.pow(lev * 10 , 2);
        type = "Fire";
        atk = (64 * 2 + iv) * lev / 100 + 5;
        def = (58 * 2 + iv) * lev / 100 + 5;
        spAtk = (80 * 2 + iv) * lev / 100 + 5;
        spDef = (65 * 2 + iv) * lev / 100 + 5;
        spd = (80 * 2 + iv) * lev / 100 + 5;
        hp = (58 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Slash", "Dragon Rage", "Flame Burst", "Flamethrower"};
        attPower = new int[]{70, 40, 70, 50};
        attType1 = new String[]{"Normal", "Dragon", "Fire", "Fire"};
        attType2 = new String[]{"Physical", "special", "Special", "Special"};
    }

}